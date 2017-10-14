#### SQL & Oracle DB
_____

connect system/root

* **Informatiesysteem** = Is een vereenvoudigde, representatieve voorstelling van de werkelijkheid binnen een organisatie, wordt gebruikt om op het juiste moment over de juiste informatie te kunnen beschikken. Dit hoeft niet noodzakelijk geautomatiseerd te zijn (fiches per klant, Excel sheet, ...).

	* **Bestandsgerichte benadering** = alle informatie uit bv. Excel sheets, fiches en papieren contracten worden in *bestanden* geplaatst dewelke door programma's verwerkt worden.
	
		**NADELEN:**
		* **Redundantie:** meerdere afdelingen van een organisatie hebben dezelfde gegevens in eigen bestanden => gevaar voor inconsistentie, inefficiënt geheugengebruik en updates moeten op verschillende plaatsen doorgevoerd worden.

		* **Gescheiden geïsoleerde data:** vraagt een vrij complexe programmatie om verschillende bestanden in een programma te synchroniseren om een antwoord op een vraag te vinden.
		* **Data afhankelijkheid:** een wijziging doorvoeren in de structuur, betekent een programmatorische aanpassing.

		* **Incompatibele bestanden:** mogelijks geprogrammeerde met andere programmeertalen (andere bestandssctructuur).

	* **Databasegerichte benadering** = alle informatie wordt in een database beheerd dewelke door meerdere afdelingen simultaan gebruikt kan worden, verdeeld over verschillende groepen (entiteiten) dewelke de "objecten" van de DB vormen.
	
		**VOORDELEN:**
		* **Shared data:** alle applicaties kunnen gebruik maken van de gegevens uit de DB; simultaan lezen, voor aanpassingen dienen ze wel rekening te houden met elkaar.

		* **Geïntegreerd en samenhangend:** alle gegevens zitten gecentraliseerd en gerelateerd (Applicatie > DBMS > OS > DBMS > Applicatie)
		* **Geringe redundantie:** gegevens zitten niet meer dubbel gestockeerd.
		* **Data onafhankelijkheid:** de gegevens worden in de DB beschreven en niet in de applicatie. Een structuurwijziging van een DB object vraagt geen programmatorische aanpassing.
		* **Integriteit bewaking:** weinig inconsistenties, constraints (automatische ingebouwde controles) en triggers.
		* **Veiligheidsbewaking:** makkelijker te beveiligen door centralisatie.
		* **Vereenvoudigen van opleggen van standaarden:** omwille van de centralisatie is het makkelijker om afspraken te maken rond bv. benamingen (familienaam altijd uppercase, adres is altijd straat + huisnummer ...).
____

##### Definitie databank

* **Database** = Een geïntegreerde verzameling gegevens die eventueel door meerdere gebruikers simultaan kan gemanipuleerd worden en die voldoet aan de informatie behoeften van een organisatie. Bevat gegevens en metagegevens (zelf geen documentatie nodig, elke wijziging wordt automatisch bijgehouden).
	* **hiërarchisch model**
	* **netwerk model**
	* **relationeel model**

* **Database Management Systeem** = (DBMS) Is de de software dewelke nodig is om een database te beheren en te gebruiken.
    * **gebruiken:** opvragen van gegevens (queries), inhoud wijzigen (DML = Database Manipulation Language), onderhoud.
    * **beheren:** structuur definiëren en wijzigen (DDL = Database Definition Language), beveiliging, transactiebeheer.

Belangrijke gebruikersprofielen:
* de data administrator
* de database administrator
* toepassingsontwikkelaar
* eindgebruiker



###### Het relationele model
_____

Ontwikkeld door E.F. Codd. Gebaseerd op relationele algebra dewelke bestaat uit **relaties**, **operatoren om met relaties te werken** en **integriteitsregels om consistentie te garanderen**. Een relationele database wordt gebouwd volgens het relationele model.

De relationele database is een verzameling van relaties/tabellen waarbij verbanden gelegd worden met vreemde sleutels (FOREIGN KEYS).

Terminologie:
* **tabel**
* **kolom of attribuut**
* **rij op tuple**
* **attribuutwaarde**
* **populatie** = verzameling van concrete waarden van een attribuut
* **domein** = bij elk attribuut hoort een verzameling van mogelijke waarden
* **null waarde** = ontbrekende of onbekende waarden

* *Attribuut is atomair* = op het snijpunt van een kolom en een rij staat 1 waarde.
* *Elke rij binnen 1 tabel is uniek* = geen dubbele rijen.
* *Rijen hebben geen specifieke volgorde.*
* *Kolomnamen zijn uniek* en hebben tevens een volgorde zonder betekenis.

3 type sleutels:
* **Primaire sleutels** = attribuut of combinatie van attributie dewelke een rij uit een tabel op een unieke wijze gaat identificeren.
* **Alternatieve sleutels** = meerdere attributen (of combinaties van) zijn mogelijk primaire sleutels, zowel alternatieve om kandidaatsleutels genoemd.
* **Vreemde sleutels** = verband tussen twee tabellen, verwijzing naar een primaire sleutel (of unieke attribuutcombinatie) van een andere tabel.

___________SAMENVATTING!!!

Integreteitsregels opgelegd door het relationele model:

* **Key constraint** = primaire sleutel moet uniek zijn en uniek blijven.
* **Entity integrety constraint** = primaire sleutel moet geldige waarde hebben (!= NULL)
* **Referential integrity contraint** = populatie van de verwijssleutel moet een deelverzameling zijn van de populatie van de overeenkomstige primaire sleutel.

Types bewerkingen met relaties:
* **UNIE** = voegt rijen van 2 relaties samen tot 1 relatie (inputrelaties moeten dezelfde attributenlijst hebben).
* **INTERSECTIE** = gemeenschappelijke rijen nemen.
* **VERSCHIL** = het verschil van twee relaties is een 3de relatie die alle rijen uit de eerste bevat die niet in de 2de voorkomen.
* **PRODUCT** = Cartesiaans product; resulterende relatie bevat alle mogelijke rijen gevormd door de samenvoeging van een rij uit relatie 1 en een rij uit relatie 2.

![PRODUCT](img/product.png)
* **PROJECTIE** = vormt een nieuwe relatie door slechts een deel van de attributen van de input over te houden. Bij ontstaan van dubbele rijen worden overtollige rijen uit het resultaat verwijdert.

![PROJECTIE](img/projectie.png)
* **SELECTIE** = deelverzameling van een relatie op basis van een voorwaarde.
* **JOIN** = combinatie van twee relaties d.m.v. Cartesisch product + selectie, beide relaties moeten een attribuut bevatten waarop vergelijking mogelijk is.

![JOIN](img/join.png)

###### SQL
_____

**S**tructured **Q**uery **L**anguage, de taal om met een relationeel **DMBS** te communiceren.

Eigenschappen:
* **declaratieve taal:** WAT en niet HOE (tegenovergesteld van procedurale taal).
* **interactief gebruik:** instructie op het scherm, immediate response.
* **embedded gebruik:** ingebed in een programma.

Instructies:
* **Data retrieval:** ophalen van data uit de DB (**SELECT**)
* **Data Manipulation Language:** inhoud wijzigen (**UPDATE, DELETE, INSERT**)
* **Data Definition Language:** objecten creëren (**CREATE, ALTER, DROP**)
* **Data Control Language:** beveiliging (**GRANT, REVOKE**)
* **Transaction Controle:** wijzigingen dewelke zeker moeten slagen/falen groeperen (**COMMIT, ROLLBACK, SAVEPOINT**)


###### Database ontwerp
_____

Het eindresultaat van een DB ontwerp is een DB model. (goed DB model <-> goed DB systeem). Zo'n DB model moet:
* aan de noden van alle gebruikers voldoen,
* door de eindgebruiker begrepen worden,
* voldoende details bevatten zodat met die informatie de DB aangemaakt kan worden.

Twee benaderingen:

* **Bottom-up** = vertrekt vanuit attributen die door het analyseren van verbanden tussen die attributen in relaties gegroepeerd worden (bv. normalisatie).
* **Top-down** = vetrekt van algemeen naar specifiek.

Fases:
* **Conceptuele fase:** hierin bouwt men een model dat alle gegevens bevat die de organisatie gebruikt. Wat heeft de gebruiker nog nodig buiten een DBMS of een applicatie?
* **Logische fase:** hierin wordt het DB-model aangepast aan het onderliggend data model dat gebruikt zal worden (relationeel, hiërarchisch, netwerk, object georiënteerd ...). Regelmatige terugkoppeling aan de eindgebruiker om te toetsen of er aan zijn eisen wordt voldaan + opstellen business rules.
* **Fysische fase:** implementatie, beslissingen rond de performantie van het systeem.

**E**ntity **R**elationship **D**iagram = grafische voorstelling van zulk ontwerp. Het bevat de verschillende entiteiten van de te beschrijven realiteit, samen met de verbanden tussen deze entiteiten!

![ERD](img/erd.png)

Cardinaliteit:
* **0..n**: 0, 1 of meer
* **1..n**: 1 of meer
* **1**: exact 1
* **0..1**: 0 of één

De veel-kant staat altijd aan de kant van de enititeit met de vreemde sleutel. In een relationeel datamodel zijn veel op veel relaties niet toegelaten:

![VEEL OP VEEL](img/veelopveel.png)

Op te lossen met een tussentabel:

![TUSSENTABEL](img/tussentabel.png)

Databanken zijn complex geworden en moeten aanpasbaar zijn aan de nieuwe informatiebehoeften zoals: mobile development computing en cloud toepassingen.