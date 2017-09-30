CREATE TABLE afdelingen (
afd_nr NUMBER(2) CONSTRAINT pk_afdelingen PRIMARY KEY, 
afd_naam VARCHAR2(20) CONSTRAINT nn_afd_naam NOT NULL,
mgr_sofi_nr CHAR(9),
mgr_start_datum DATE
);

CREATE TABLE medewerkers (
sofi_nr CHAR(9) CONSTRAINT pk_medewerkers PRIMARY KEY,
achternaam VARCHAR2(25) CONSTRAINT nn_achternaam NOT NULL,
voornaam VARCHAR2(25) CONSTRAINT nn_voornaam NOT NULL,
tussenvoegsel VARCHAR2(25),
adres VARCHAR2(50),
plaats VARCHAR2(25),
provincie CHAR(2),
postcode VARCHAR2(7),
geb_datum DATE,
salaris NUMBER(7,2) CONSTRAINT ck_salaris CHECK (salaris <= 85000),
parkeerplaats NUMBER(4) CONSTRAINT un_parkeerplaats UNIQUE,
geslacht CHAR(1),
afd_nr NUMBER(2) CONSTRAINT fk_med_afd REFERENCES afdelingen(afd_nr),
mgr_sofi_nr CHAR(9) CONSTRAINT mrg_sofi_nr REFERENCES medewerkers (sofi_nr)
);

CREATE TABLE projecten (
proj_nr NUMBER(2) CONSTRAINT pk_projecten PRIMARY KEY,
proj_naam VARCHAR2(25) CONSTRAINT nn_proj_naam NOT NULL,
locatie VARCHAR2(25),
afd_nr NUMBER(2) CONSTRAINT fk_pro_afd REFERENCES afdelingen(afd_nr)
);

CREATE TABLE locaties (
afd_nr NUMBER(2) CONSTRAINT fk_loc_afd REFERENCES afdelingen(afd_nr),
plaats VARCHAR2(20) CONSTRAINT nn_plaats NOT NULL,
CONSTRAINT pk_locaties PRIMARY KEY (afd_nr, plaats)
);

CREATE TABLE opdrachten (
sofi_nr CHAR(9) CONSTRAINT fk_opd_med REFERENCES medewerkers(sofi_nr),
proj_nr NUMBER(2) CONSTRAINT fk_opd_pro REFERENCES projecten(proj_nr),
uren NUMBER(5,1),
CONSTRAINT pk_opdrachten PRIMARY KEY(sofi_nr, proj_nr)
);

CREATE TABLE gezinsleden (
sofi_nr CHAR(9) CONSTRAINT fk_gez_med REFERENCES medewerkers(sofi_nr) CONSTRAINT nn_sofi_nr NOT NULL,
naam VARCHAR2(50) CONSTRAINT nn_naam NOT NULL,
geslacht CHAR(1) CONSTRAINT ch_geslacht CHECK (geslacht IN('M', 'V')) CONSTRAINT nn_geslacht NOT NULL,
geb_datum DATE CONSTRAINT ch_geb_datum CHECK (geb_datum BETWEEN '26-MAR-1950' AND '01-JAN-2017' ) CONSTRAINT nn_geb_datum NOT NULL,
relatie VARCHAR2(10) CONSTRAINT nn_relatie NOT NULL,
CONSTRAINT pk_gezinsleden PRIMARY KEY (sofi_nr, naam)
);

CREATE TABLE DEPT (
DEPTNO NUMBER(2,0) CONSTRAINT pk_dept PRIMARY KEY,
DNAME VARCHAR2(14) CONSTRAINT u_name UNIQUE,
LOC VARCHAR2(13)
);

CREATE TABLE EMP (
EMPNO NUMBER(4,0) CONSTRAINT pk_emp PRIMARY KEY,
ENAME VARCHAR2(10) CONSTRAINT ch_ename CHECK (ename = UPPER(ename)),
JOB VARCHAR2(9),
MGR NUMBER(4,0) CONSTRAINT fk_emp_emp REFERENCES EMP(EMPNO),
HIREDATE DATE,
SAL NUMBER(7,2) CONSTRAINT ch_sal CHECK (SAL BETWEEN 500 AND 5000),
COMM NUMBER(7,2),
DEPTNO NUMBER(2,0) CONSTRAINT nn_deptno NOT NULL CONSTRAINT fk_emp_dep REFERENCES DEPT(DEPTNO)
);
