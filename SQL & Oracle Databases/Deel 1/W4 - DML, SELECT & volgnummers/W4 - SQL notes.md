#### Data Manipulation Language
_____

**DDL** => Data Definition Language (objecten creëren, verwijderen, wijzigen)
**DML** => Data Manipulation Language (gegevens in DB manipuleren, instructies select, insert, delete, update)
**DCL** => Data Control Language (instructies commit, rollback, grant, connect)

DML
**INSERT** => nieuwe rijen toe te voegen aan een tabel
**UPDATE** => de inhoud van bestaande tabellen te wijzigen
**DELETE** => rijen een een tabel te verwijderen

Bij het geven van DML instructies horen ook 2 transaction management instructies:
**COMMIT** => om een wijziging definitief te maken
**ROLLBACK** => om wijzigen tot aan de laatst gegeven commit opnieuw ongedaan te maken
**TRUNCATE** => om alle rijen defintief uit een tabel te verwijderen (DDL instructie, no rollback possible)

INSERT
INSERT INTO tabelnaam(attr1,attr2,…)
VALUES (waarde1, waarde2,…);

standaard volgorde van de kolommen!
INSERT INTO afdelingen
VALUES (5, ‘Verkoop’,’999444444’,’22-MEI-1998’);

OF

eigen volgorde van de kolommen!
INSERT INTO
afdelingen(afd_naam,afd_nr,mgr_sofi_nr,
mgr_start_datum)
VALUES(‘Verkoop’,5, ‘999444444’,’22-MEI-1998’);

als je niet alle attributen (kolommen) een waarde toekent, zorgt dan dan minstens alle NOT NULL attributen opgenomen worden in het INSERT statement!

substitutievariabele & 
INSERT INTO afdelingen(afd_naam,afd_nr)
VALUES(‘&afd_naam’,&afd_nr);

UPDATE
Er komt in afdeling 1 vanaf 1 april 2017 een nieuwe manager
(met sofi_nr 999111111)
UPDATE afdelingen
SET mgr_sofi_nr=’999111111’,
 mgr_start_datum=’1-apr-2017’
WHERE afd_nr=1;

Medewerker 999111111 krijgt een loonsverhoging van 10%.
UPDATE medewerkers
SET salaris= salaris*1.1
WHERE sofi_nr=’999111111’;


DELETE
enkel de rijen waar de conditie voldaan is
DELETE FROM tabelnaam
 WHERE condition;

alle rijen worden verwijdered
DELETE FROM tabelnaam;

COMMIT => wijziging definitief
ROLLBACK => ongedaan maken

Voor de uitvoering van een dml instructie (update,delete, insert) wordt de oude inhoud van de te wijzigen rijen in rollback segmenten gestockeerd.

TRUNCATE
Verwijdert onherroepelijk alle rijen uit een tabel, kan niet ongedaan worden (!!!) omwille van het feit dat de oude situatie niet in rollback segmenten gestockeerd worden.

Waarom gebruiken? om een zeer grote tabel snel definitief leeg te maken
Waarom sneller? omdat de grote hoeveelheid informatie niet eerst naar rollback segmenten moet gekopieerd worden.

TRUNCATE TABLE medewerkers;

Als er bij het willen uitvoeren van een DML instructie gezondigd wordt tegen een constraint zal het DBMS deze instructie weigeren.

![DML constraints](img/DMLconstraints.png)

![ERD ondernemingen](img/ERDondernemingen.png)


#### SELECT
____
Doel: informatie uit de DB halen en in een resultatentabel presenteren

SELECT [DISTINCT] select list
FROM tabelnaam
[WHERE conditie]
[ORDER BY clausule]

select list => welke kolommen willen we tonen in de resultatentabel? (attributen uit de tafel FROM, constante, rekenkundige bewerkingen, *, || (concatenation), functies)

* ==> alle kolommen
SELECT sofi_nr,achternaam||' '||voornaam FROM medewerkers;
geef een hernoeming van achternaam en voornaam naar "achternaam||''||voornaam"

SELECT sofi_nr,achternaam||' '||voornaam naam FROM medewerkers;
geeft een nieuwe kolomnaam "naam" waarom achternaam en voornam geconcateneerd zijn

kolomhoofding zelf bepalen:
SELECT sofi_nr medewerkersnr,achternaam Medewerker_achternaam, voornaam medewerker_voornaam FROM medewerkers;

zonder dubbele quotes ==> naam naar uppercase
met dubbele quotes ==> alle tekens + exact zoals getypt

rekenkundige bewerkingen:
SELECT sofi_nr,achternaam,salaris*1.1 jaartal
FROM medewerkers;

SELECT SUM(salaris) tot_loonkost
FROM medewerkers;

DISTINCT => haalt dubbele rijen uit de resultatentabel
SELECT DISTINCT afd_nr
FROM medewerkers;

WHERE => toont enkel de rijen die aan de conditie in de WHERE clausule voldoen
SELECT sofi_nr, achternaam, voornaam, afd_nr
FROM medewerkers
WHERE afd_nr=3;

SELECT sofi_nr, achternaam, voornaam, salaris
FROM medewerkers
WHERE salaris BETWEEN 25000 AND 40000;

SELECT sofi_nr
FROM medewerkers
WHERE UPPER(voornaam)=‘WILLEM’;
of
SELECT sofi_nr
FROM medewerkers
WHERE LOWER(voornaam)=‘willem’;
Maakt je zoekopdracht voor een bepaald atrribuut case insensitive

SELECT sofi_nr
FROM medewerkers
WHERE InitCap (voornaam)=‘Willem’;


SELECT sofi_nr, achternaam, salaris, afd_nr
FROM medewerkers
WHERE salaris>30000 AND (afd_nr=1 OR afd_nr=3 );
Zonder haakjes zou de zoekopdracht een ander resultaat geven!

ORDER BY dwingt een sortering in de resultatentabel af

SELECT *
FROM afdelingen
ORDER BY afd_nr ASC;
ASC => ascending is default, weglaten = hetzelfde effect

gesorteerd op afd_nr en binnen afd_nr op
achternaam.
SELECT sofi_nr, achternaam, voornaam, afd_nr
FROM medewerkers
ORDER BY afd_nr, achternaam;

gesorteerd op afd_nr (dalend) en binnen
afd_nr op achternaam(alfabetisch).
SELECT sofi_nr, achternaam, voornaam, afd_nr
FROM medewerkers
ORDER BY 4 DESC,2 ASC;

bij sorteren worden NULL waarden altijd als grootste waarden beschouwd (dus bij ASC onderaan, bij DESC bovenaan). Deze volgorde kan overruled worden door NULLS FIRST of NULLS LAST

SELECT *
FROM opdrachten
ORDER BY opd_uren ASC NULLS FIRST;

Voor een char en date kolom kan je de hoofding default niet groter zijn dan de lengte van de kolom.
IN Run SQL command line kan je kolommen verbreden/versmallen door commando's:

Column achternaam format a12
Column parkeerplaats format 999

#### Volgnummers
_____

Sequences kunnen gebruikt worden om automatische volgnummers te laten genereren, deze kan je een naam, startwaarde en ophoogwaarde toekennen. Tevens kan je bepalen of de volgnummers cyclisch gebruikt kunnen worden, wanneer je deze niet cyclisch gebruikt ben je zeker dat de sequence steeds unieke waarde zal geven en dus gebruikt kan worden als PRIMARY KEY values. Sequences kunnen door meerdere gebruikers gebruikt worden.

CREATE SEQUENCE seq_ordnr
START WITH 1
INCREMENT BY 1;

naam sequence.NEXTVAL => volgende value in de sequence
naam sequence.CURRVAL => laatst opgehaalde volgnummer opnieuw gebruiken

wijzigen van een sequence: ALTER SEQUENCE seq_ordnr NOMAXVALUE;
verwijderen van een sequence: DROP SEQUENCE seq_ordnr; gegeneerde volgnummers blijven daarbij wel behouden!

Select seq_afd_nr.nextval from dual; => laatst gebruikt volgnummer zoeken (currval kan ook)


