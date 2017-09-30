#### Inleiding DDL (Data Definition Language) Statements

https://docs.oracle.com/cd/B14117_01/server.101/b10759/statements_1001.htm#i2099120

* **Definitie databank** = een geïntegreerde verzameling gegevens die eventueel door meerdere gebruikers tegelijkertijd gemanipuleerd kan worden en die voldoet aan de informatiebehoeften van de organisatie. Een databank bevat gegevens en meta-gegevens (zelf geen documentatie nodig, elke wijziging wordt automatisch bijgehouden).

Relationele databank = {relaties}, eigenschappen:

    * rijen zijn uniek
    * rijen zitten in willekeurige volgorde
    * kolomnamen zijn uniek
    * attribuutwaarden zijn atomair (op het snijpunt van een kolom en een rij staat 1 waarde)

Sleutelattributen:

    * **primaire sleutel** = attribuut of combinatie van attributen dat een rij op unieke wijze defineert
    * **vreemde sleutel** = attribuut of combinatie van attributen dat de link legt naar de primaire sleutel van een andere tabel

Integriteitsregels:

 * **Key contraint** = een primaire sleutel is en blijft uniek
 * **Entity Integrity Constraint** = de primaire sleutel moet steeds een geldige waarde krijgen (!= NULL)
 * **Referential Integrity Constraint** = voor elke waarde van een vreemde sleutel bestaat er een overeenkomstige waarde van de primaire sleutel in de tabel waarnaar verwezen wordt.

Deze integriteitsregels inbouwen in het CREATE TABLE statement zodat de controle automatisch door het DBMS gebeurt.

**DMBS** is de software die nodig is om de databank te kunnen beheren er ermee te kunnen werken.
**SQL** is de taal die we gebruiken om met het DBMS te kunnen communiceren.
**USER** is iemand die aan de database kan connecteren.
**schema** is een container van objecten waarvan een gebruiker eigenaar is. Bij creatie van een gebruiker wordt het schema gecreërd, aanvankelijk leeg. Het schema kan leeg blijven als de gebruiker geen rechten heeft om objecten te creëren. In verschillende schema's kunnen objecten dezelfde naam hebben, telkens met een naam: naam schema.naam object
**namespace** defineert een groep van object types (alle objecten behorend tot een bepaalde namespace horen binnen eenzelfde schema een unieke naam te hebben)

Regels voor objecten:

- een naam mag van 1 tot 30 karakters bevatten
- gereserveerde woorden zijn niet toegelaten
- alle namen beginnen met een letter
- geen spaties toegelaten
- de toegelaten tekens zijn: letters, cijfers, $, _, #
(!) als een naam tussen "" staat mogen al deze regels overtreden worden (af te raden!)

#### Create table

Voor elk van de entiteiten uit het ERD moeten we bepalen:
- hoe we die gaan noemen
- hoe we de attributen gaan noemen
- hoe groot elk van de attributen moet zijn
- welke informatie deze attributen mogen bevatten
- nadenken over beperkingen die we attributen van de entiteiten gaan opleggen

Om een tabel te kunnen creëren moet je over volgende informatie beschikken:
- een naam voor de tabel (meervoudsvorm)
- namen voor de attributen uit de tabel
- voor elk attribuut het gegevenstype + grootte
- eventuele default waarde voor een attribuut
- eventuele beperkingen die je de attributen oplegt (CONTRAINTS)

(!) tabelnaam moet uniek zijn binnen één schema

SYNTAX:
CREATE TABLE tabelnaam
(attribuutnaam gegevenstype [DEFAULT WAARDE][COLUMN CONSTRAINT], ..., [TABLE CONSTRAINT],...);

Gegevenstype:

**ALFANUMERIEK** 
* **CHAR(n)** wordt gebruikt voor alfanumerieke attributen waarvan de inhoud een vaste lengte heeft (bv. telefoonnummer, artikelnr., nummerplaat, ...). bv. CHAR(9) wordt achteraan aangevuld met blanco indien slechts 8 karakters opgegeven
* **VARCHAR2(n)** wordt gebruikt voor alfanumerieke attributen met variable lengte (bv. straat, achternaam, ...) bv. VARCHAR2(50) als een attribuutwaarde slechts 40 posities groot is worden er effectief maar 40 posities gebruikt.
* **CLOB (CHARACTER LARGE OBJECT)** wordt gebruikt voor grote documenten (tot 4GB * database blokgrootte)
* **LONG** kan tot 2GB aan karakters bevatten, verouderd!

**NUMERIEK**
* **NUMBER(n)** wordt gebruikt voor attributen dewelke enkel gehele getallen zullen bevatten (als deze toch decimalen bevat worden deze afgerond)
* **NUMBER(n,m)** wordt gebruikt voor attributen dewelke ook decimalen kunnen bevatten (n = totaal aantal tekens, m = aantal decimalen)
* **NUMBER** wordt gebruikt als met de grootte van de attribuutwaarde niet kan inschatten (onbeperkt aantal gehelen, 38 decimalen max)

vb. 1234.567

NUMBER(8) - 1235
NUMBER(4) - 1235
NUMBER(3) - FOUTMELDING
NUMBER - 1234.567
NUMBER(5,2) - FOUTMELDING
NUMBER(6,2) - 1234.57
NUMBER(6,-2) - 1200

**DATUMATTRIBUTEN**
* **DATE** standaard notitie DD-MON-YYYY, bevat: eeuw, jaar, maand, dag, uur, minuten en seconden. Indien geen tijd opgegeven is dit default 0 (middernacht)
* **SYSDATE** standaard datum van vandaag
* **TIMESTAMP** tevens ook fracties van seconden (tot 6 decimale posities voor seconden)
* **INTERVAL YEAR TO MONTH** & **INTERVAL DAY TO SECOND** tonen verschil tussen 2 datums

**BINAIRE DATATYPES**
Deze worden gebruikt om binaire gegevens te stockeren (audio, video, foto, ...)
* **BFILE** bevat een pointer naar een binaire file in het OS van de DB server
* **ROWID** bevat fysieke adres van die rij in de DB (pseudokolom)

**CONSTRAINTS**
Door middel van constraints kan je extra beperkingen opleggen aan attributen (1 attribuut = column constraint, combinatie = table constraint) 

Soorten constraints:

- **PRIMARY KEY constraint** key constraint (unieke index) + entity integrity constraint (NOT NULL)
- **NOT NULL constraint**
- **CHECK constraint** bereik van attribuutwaarden (= domein) CONSTRAINT constraintnaam CHECK (conditie)
- **UNIQUE constraint**
- **FOREIGN KEY constraint** referential integrity constraint (door deze constraint op te leggen zal het DBMS automatisch controleren of de waarden van de FK als PK waarden voorkomen in de tabel waarnaar men verwijst).

CONSTRAINT constraintnaam REFERENCES tabel (attribuut) [ON DELETE CASCADE/SET NULL]
afd_nr NUMBER(2) CONSTRAINT fk_med_afd REFERENCES afdelingen(afd_nr) -> hierbij verwijst afd_nr uit de tabel medewerkers naar afd_nr uit de tabel AFDELINGEN

* **TABLE CONSTRAINTS** is een beperking waarbij meer dan één attribuut uit eenzelfde tabel betrokken is, deze constraints worden niet op attribuut niveau gedefineerd maar worden pas op het einde van de tabeldefinitie gedefineerd.

**CHECK CONSTRAINT**
Vb. Stel dat commissieloon en salaris 2 attributen zijn uit dezelfde tabel. Als we de beperking opleggen dat commissieloon + salaris < 6000 dan is dat een table constraint omdat bij de constraint 2 attributen betrokken zijn! SYNTAX: constraint c_sal_comm CHECK(salaris+commissieloon<6000)

**PRIMARY KEY CONSTRAINT**3
Vb. de primaire sleutel van de tabel OPDRACHTEN:
CONSTRAINT pk_opdracht PRIMARY KEY(sofi_nr, proj_nr)

**UNIQUE CONSTRAINT**
Vb. de combinatie sofi_nr en parkeerplaats is uniek
CONSTRAINT u_sofi_nr_parkeerplaats UNIQUE(sofi_nr , parkeerplaats)

**FOREIGN KEY CONSTRAINT**
*column constraint:*
CONSTRAINT constraintnaam
REFERENCES tabel (attribuut)
[ON DELETE CASCADE /SET NULL]

*table constraint:*
CONSTRAINT constraintnaam
FOREIGN KEY(attr1,attr2,…)
REFERENCES tabel (attri,attrj…)
[ON DELETE CASCADE/SET NULL ]

DEFAULT --> ON DELETE RESTRICT --> checkt op afhankelijke rijen, indien so DELETE geweigerd
ON DELETE CASCADE --> afhankelijke rijen worden mee verwijderd
ON DELETE SET NULL --> de waarden van de verwijssleutels in de betrokken afhankelijke rijen worden NULL

tussen meerdere CONSTRAINTS **GEEN** komma gezien een komma een attribuutbeschrijving weergeeft:
achternaam VARCHAR2(20)
CONSTRAINT c_achternaam CHECK(achternaam=UPPER(achternaam)
CONSTRAINT nn_achternaam NOT NULL,













