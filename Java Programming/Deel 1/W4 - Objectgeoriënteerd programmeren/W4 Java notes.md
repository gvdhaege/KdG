#### Objectgeoriënteerd programmeren


Object heeft attributen/eigenschappen/variabelen en methoden

Een object is een groepering van eigenschappen (attributen) en gerelateerde codeblokken (methoden).

Een programma bestaat meestal uit verschillende objecten die onderling boodschappen naar elkaar sturen. Deze boodschappen noemen methoden.

richting = auto.draaien(hoek)
resultaat = bestemmeling.methode(parameter)

Een klasse is een blauwdruk die de eigenschappen en methoden van objecten van dezelfde soort bepaalt. 

Een object is een unieke instantie van een klasse.
bv. Klasse AUTO, instantie1 = BMW1serie, instantie2 FordFiesta, ...

Hoe object maken? Klasse nodig, bv. String, Scanner, ...
Scanner keyboard = new Scanner(System.in);
String tekst = new String();

new operator + naam klasse = reservatie geheugen object, resultaat is een verwijzing (reference) naar het object.
Initialisatie gebeurt door eventuele parameters tussen de haakjes, hierdoor wordt de constructor opgeroepen. constructor ALTIJD dezelfde naam als de klasse en wordt eenmalig aangeroepen om het object tijdens de creatie te initialiseren.

Random generator = new Random();

hetzelfde als:
Random generator; declaratie
generator = new Random(); initialisatie

generator = verwijzing/reference naar Random object
Een object kan meerdere referenties hebben:

Random randomEen;
Random randomTwee;

randomTwee = randomEen;

#### Pakket/package

Elke klasse behoort tot een package:

Random tot java.util (volledige naam van deze klasse is java.util.Random)
(!) altijd met kleine letters
om een korte naam te kunnen gebruiken (Random ipv java.util.Random) heb je een import statement nodig.

import java.util.Random;
import java.util.*; //alle klassen in de package java.util

Hoe zoekt de compiler naar de juiste klasse?
1. expliciete imports
2. klassen huidige pakket
3. klassen uit geïmporteerde pakketten

automatische imports voor:
default package (klasse zonder pakket)
huidige package (klassen in hetzelfde pakket)
package java.lang (basisklassen van java)

met import

import java.util.Random;

Random generator = new Random();

zonder import

java.util.Random generator = new java.util.Random();


#### Random

Klasse voor willekeurige getallen te genereren, 2 constructors:
Random() --> telkens andere getallen
Random(long seed) --> telkens dezelfde opeenvolging van getallen afhankelijk van waarde seed
(!) telkens maar één Random constructor in programma

.nextInt(int n) --> willekeurig geheel getal van 0 tot waarde van n 0 <= resultaat < n
.nextDouble() --> willekeurig getal van 0 tot 1 0 <= resultaat < 1
.nextBoolean() --> willekeurige boolean true of false

#### Objecten gebruiken
Van een object kan je alleen de publieke attributen(variabelen) en methoden gebruiken
Random random = new Random();
int getal = random.nextInt(5);
vb. ogen dobbelsteen
int dobbelsteen = random.nextInt(6) + 1; // +1 om nul te vermijden waarden 1 tem 6
vb. muntstuk
boolean muntstuk = random.nextBoolean();
int muntstuk = random.nextInt(2); //waarden 0 en 1

#### Geheugen

Garbage collection zorgt voor het opruimen van objecten waar geen enkele referentie meer naar is.
-referentiewaarde bestaat niet meer (out of scope)
- als de waarde null aan de referentiewaarde wordt toegekend

gebeurt automatisch maar nooit onmiddellijk (afzonderlijke thread met lage prio)

#### String
String = klasse = object (java.lang -_> geen import nodig) na creatie kan de inhoud niet meer gewijzigd worden, dus elke verandering resultaat in de creatie van een nieuw String object

String tekst = new String("Hello Shizzel");
String tkest = "Hello Shizzel";
inlezen via .next() (tot spatie of enter) of .nextLine(); (tot enter)

(!)vergelijk Strings nooit met == 
bestaande String literals worden slechts éénmaal in het geheugen geplaatst


#### StringBuilder

alternatief voor String (mutable = aanpasbaar) : chars toevoegen, tussenvoegen, verwijderen zonder telkens nieuw object te moeten maken
Daardoor sneller en zuiniger met geheugenruimte als er veel aan een string moet gewijzigd worden.
Enkel te maken met constructor:
StringBuilder emptyBuilder = new StringBuilder();
StringBuilder emptyBuilder = new StringBuilder("For shizzel");


#### gegevens formatteren

System.out.printf("%d appels kosten €%.2f.\n", aantal, prijs);
hetzelfde als String:
String str : String.format("%d appels kosten €%.2f.\n", aantal, prijs);

%d = int/long (geheel getal)
%f = float.double (decimaal getal)
%s = string
%c = char
%b = boolean
%n = newline, beter dan \n ! (platform onafhankelijk)

extra aanduidingen 
n = totaal min aantal posities (%20s)
- = links uitlijnen (%-20s)
n.d geeft bij %f het totaal aantal posities en het aantal decimalen met automatische afronding (%6.2f)

(!) voor elke formaataanduidig moet er met het type overeenstemmende variabele of literal aanwezig zijn

System.out.printf("De %dde letter is %d\n", 5, 'e'); // de 5de letter is e

