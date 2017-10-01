#### Alter table

ALTER TABLE <tabelnaam> + één van de onderstaande opties:
- **ADD** = attributen of table constraints toe te voegen (achteraan in de tabel)

```
ALTER TABLE medewerkers ADD geslacht char(1);
```
```
ALTER TABLE medewerkers ADD adres VARCHAR2(50) CONSTRAINT c_adres CHECK(adres=UPPER(adres));
```
```
ALTER TABLE medewerkers ADD(plaats VARCHAR2(25), provincie CHAR(2));
´´´
```
ALTER TABLE opdrachten ADD CONSTRAINT pk_opdrachten PRIMARY KEY(sofi_nr,proj_nr);
´´´

- **MODIFY** = in bestaande attributen wijzigen aan te brengen
```
ALTER TABLE medewerkers MODIFY parkeerplaats CONSTRAINT nn_parkeerplaats NOT NULL;
´´´
```
MODIFY parkeerplaats NUMBER(5);
´´´
```
ALTER TABLE medewerkers MODIFY(achternaam constraint c_achternaam CHECK achternaam=UPPER(achternaam)), voornaam constraint c_voornaam CHECK(voornaam=UPPER voornaam)));
´´´
- **DROP** = attribuut of constraint verwijderen (naam van constraint nodig, in dictionary tabel USER_CONSTRAINTS)
```
ALTER TABLE medewerkers DROP CONSTRAINT nn_achternaam;
´´´
(!) indien je een PRIMARY KEY constraint wil verwijderen:
```
ALTER TABLE projecten DROP CONSTRAINT pk_project CASCADE;
´´´
OF
```
ALTER TABLE projecten DROP PRIMARY KEY CASCADE;
´´´
(!) GEVOLG: de FK constraints die verwijzen naar die PK worden mee verwijderd.
(!) een bestaande constraint kan je niet met de MODIFY optie wijzigen, eerst DROP dan MODIFY (column constraint) of ADD (table constraint).

vb. op het attribuut salaris uit de tabel MEDEWERKERS staat een check constraint: CHECK(salaris <= 85000) dewelke verhoogd moet worden naar 95000.
eerst de constraint droppen:
```
ALTER TABLE medewerkers DROP CONSTRAINT ck_salaris ;
´´´
daarna de aangepaste versie aanmaken:
```
ALTER TABLE medewerkers MODIFY salaris CONSTRAINT ck_salaris CHECK(salaris<=95000);
´´´

- **SET UNUSED COLUMN** = zet de weergegeven kolom op unused (alsof ze er niet meer is, is wel onomkeerbaar!!!) waarom op UNUSED zetten ipv meteen DROPPEN? bij grote tabellen is DROP tijdrovend + vraagt veel resources.
- **RENAME COLUMN** = om een kolom een nieuwe naam te geven
```
ALTER TABLE afdelingen RENAME COLUMN afd_naam TO naam_afd;
´´´
- **READ ONLY** = de inhoud kan niet gewijzigd worden, enkel gelezen worden. Kan terug aanpasbaar gemaakt worden met **READ WRITE**

Je kan een tabel maar verwijderen wanneer er geen foreign keys meer naar verwijzen, zelfs wanneer je bij de foreign key ON DELETE CASCADE/SET NULL definieerde. Enkel af te dwingen met:
```
DROP TABLE <tabelnaam> CASCADE CONSTRAINTS
´´´
Dit zorgt ervoor dat alle foreign key constraints die nog naar projecten verwijzen verwijderd worden.
