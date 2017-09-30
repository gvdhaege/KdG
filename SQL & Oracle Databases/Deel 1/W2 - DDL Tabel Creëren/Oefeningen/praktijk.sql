CREATE TABLE afdelingen (
afdnr CHAR(5) CONSTRAINT pk_afdr PRIMARY KEY,
naam VARCHAR2(50) CONSTRAINT nn_naam NOT NULL,
kantoorlocatie VARCHAR2(25) CONSTRAINT nn_kantoorlocatie NOT NULL,
telnr CHAR(10)
);

CREATE TABLE bedtypes (
bedtypenr CHAR(2) CONSTRAINT pk_bedtypes PRIMARY KEY,
omschr VARCHAR2(50)
);

CREATE TABLE kamers (
kamernr CHAR(6) CONSTRAINT pk_kamers PRIMARY KEY,
omschr VARCHAR2(25)
);

CREATE TABLE bedden (
bednr NUMBER(4) CONSTRAINT pk_bedden PRIMARY KEY,
kamernr CHAR(6) CONSTRAINT fk_bed_kamer REFERENCES kamers(kamernr),
bedtypenr CHAR(2) CONSTRAINT fk_bed_bedtype REFERENCES bedtypes(bedtypenr) CONSTRAINT nn_bedtypenr NOT NULL,
beschikbaarheid CHAR(1) CONSTRAINT ch_beschikbaarheid CHECK (UPPER(beschikbaarheid) IN('J', 'N')),
lst_bijwerkdat DATE
);

CREATE TABLE patienten (
patientnr CHAR(6) CONSTRAINT pk_patientnr PRIMARY KEY,
sofi_nr CHAR(9) CONSTRAINT nn_sofi_nr NOT NULL CONSTRAINT u_sofi_nr UNIQUE,
achternaam VARCHAR2(50) CONSTRAINT nn_achternaam NOT NULL,
voornaam VARCHAR2(50) CONSTRAINT nn_voornaam NOT NULL,
tussenvoegsel VARCHAR2(50),
adres VARCHAR2(50),
plaats VARCHAR2(50),
provincie CHAR(2),
postcode VARCHAR2(7),
gebdatum DATE,
telnr CHAR(10),
lst_bijwerkdat DATE
);

CREATE TABLE patientopnames (
opnamenr NUMBER(5) CONSTRAINT pk_patientopnames PRIMARY KEY,
datum_opname DATE,
uur NUMBER(4),
patientnr CHAR(6) CONSTRAINT fk_patientopnames_patienten REFERENCES patienten(patientnr),
bednr NUMBER(4) CONSTRAINT fk_patientopnames_bedden REFERENCES bedden(bednr),
datum_ontslag DATE,
CONSTRAINT ch_datums CHECK (datum_ontslag >= datum_opname)
);

CREATE TABLE patientfiches (
opnamenr NUMBER(5) CONSTRAINT fk_patienf_patientopn REFERENCES patientopnames(opnamenr),
datum_opname DATE,
uur NUMBER(4),
commentaar VARCHAR2(4000),
CONSTRAINT pk_patientfiches PRIMARY KEY (opnamenr, datum_opname, uur)
);

CREATE TABLE personeel (
persnr CHAR(5) CONSTRAINT pk_personeel PRIMARY KEY,
sofi_nr CHAR(9) CONSTRAINT nn_pers_sofi_nr NOT NULL CONSTRAINT u_pers_sofi_nr UNIQUE,
achternaam VARCHAR2(50) CONSTRAINT nn_pers_achternaam NOT NULL,
voornaam VARCHAR2(50) CONSTRAINT nn_pers_voornaam NOT NULL,
tussenvoegsel VARCHAR2(50),
afd_toegewezen CHAR(5) CONSTRAINT fk_personeel_afdelingen REFERENCES afdelingen(afdnr),
kantoorlocatie CHAR(10),
datum_in_dienst DATE DEFAULT NULL,
ziekenhuistitel VARCHAR2(50) CONSTRAINT nn_pers_ziekenhuistitel NOT NULL,
telwerk CHAR(10),
teldoorkies VARCHAR2(4),
regnr VARCHAR2(20),
salaris NUMBER,
tarief NUMBER(5,2)
);

CREATE TABLE specialisaties (
code CHAR(4) CONSTRAINT pk_specialisatie PRIMARY KEY,
titel VARCHAR2(50) CONSTRAINT nntitel NOT NULL,
hoe_behaald VARCHAR2(100)
);

CREATE TABLE verrichting_categorieën (
cat_nr CHAR(3) CONSTRAINT pk_verrichting_categorieën PRIMARY KEY,
cat_omschrijving VARCHAR2(50) CONSTRAINT nn_cat_omschrijving NOT NULL
);

CREATE TABLE verrichtingen (
nr CHAR(5) CONSTRAINT pk_verrichtingen PRIMARY KEY,
omschrijving VARCHAR2(50) CONSTRAINT nn_omschrijving NOT NULL,
eenhpr_verr NUMBER(9,2) CONSTRAINT ch_eenhpr_verr CHECK(eenhpr_verr >= 0),
opmerking VARCHAR2(2000),
cat_nr CHAR(3) CONSTRAINT fk_verrichtingen_catnr REFERENCES verrichting_categorieën(cat_nr)
);

CREATE TABLE behandelingen (
behnr NUMBER(9),
datum DATE,
CONSTRAINT pk_behandelingen PRIMARY KEY (behnr, datum),
opnamenr NUMBER(5) CONSTRAINT nn_opnamenr NOT NULL CONSTRAINT fk_behan_patientop REFERENCES patientopnames(opnamenr),
persnr CHAR(5) CONSTRAINT fk_behandelingen_pers REFERENCES personeel(persnr),
verrichtingnr CHAR(5) CONSTRAINT fk_beha_verr REFERENCES verrichtingen(verrichtingnr),
prijs_beh NUMBER(9,2) CONSTRAINT ch_prijs_beh CHECK(prijs_beh >= 0),
opmerking VARCHAR2(2000)
);

CREATE TABLE behandelingen (
behnr NUMBER(9),
datum DATE,
opnamenr NUMBER(5) CONSTRAINT nn_behandeling_patientnr NOT NULL,
persnr CHAR(5) CONSTRAINT nn_behandeling_persnr NOT NULL,
verrichtingnr CHAR(5) CONSTRAINT nn_behandeling_verrichting_nr NOT NULL,
prijs_beh NUMBER(9,2) CONSTRAINT ck_beh_huidige_rek_totaal CHECK (prijs_beh >= 0),
opmerking VARCHAR2(2000),
CONSTRAINT fk_behandeling_opnamepatient FOREIGN KEY (opnamenr) REFERENCES patientopnames,
CONSTRAINT fk_behandeling_personeel FOREIGN KEY (persnr) REFERENCES personeel,
CONSTRAINT fk_behandeling_verrichtingen FOREIGN KEY (verrichtingnr) REFERENCES verrichtingen,
CONSTRAINT pk_behandeling PRIMARY KEY (behnr, datum) 
);

CREATE TABLE pers_specialisaties (
persnr CHAR(5),
code CHAR(4),
datum_behaald DATE DEFAULT SYSDATE,
CONSTRAINT fk_pers_spec_pers FOREIGN KEY (persnr)
REFERENCES personeel,
CONSTRAINT fk_pers_spec_spec FOREIGN KEY (code)
REFERENCES specialisaties,
CONSTRAINT pk_pers_spec PRIMARY KEY (persnr, code) 
);
 
 CREATE TABLE medicijnen (
medcode CHAR(7) CONSTRAINT pk_medicijn PRIMARY KEY,
wetnaam VARCHAR2(50) CONSTRAINT nn__wetnaam NOT NULL,
handelsnaam VARCHAR2(50) CONSTRAINT nn_handelsnaam NOT NULL,
normale_dos VARCHAR2(300) CONSTRAINT nn_medicijn_dosering NOT NULL,
opmerking VARCHAR2(500),
voorraad_hoev NUMBER(12) CONSTRAINT ck_voorraad_hoev CHECK (voorraad_hoev >= 0),
eenheid VARCHAR2(20)
);

CREATE TABLE voorschriften (
nr NUMBER(9) CONSTRAINT pk_voorschrift PRIMARY KEY,
datum DATE,
medcode CHAR(7) CONSTRAINT nn_medcode NOT NULL,
opnamenr NUMBER(5) CONSTRAINT nn_patientnr NOT NULL,
persnr CHAR(5) CONSTRAINT nn_persnr NOT NULL,
voorgeschr_dos VARCHAR2(50) CONSTRAINT nn_voorgeschr_dos NOT NULL,
dos_voorschr VARCHAR2(500),
CONSTRAINT fk_voorschrift_medicijn FOREIGN KEY (medcode) REFERENCES medicijnen,
CONSTRAINT fk_voorschrift_patientopname FOREIGN KEY (opnamenr) REFERENCES patientopnames,
CONSTRAINT fk_voorschrift_personeel FOREIGN KEY (persnr) REFERENCES personeel 
);




