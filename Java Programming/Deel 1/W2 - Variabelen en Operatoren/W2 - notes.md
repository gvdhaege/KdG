#### Variabelen

 * **Variabele** = stukje geheugen waar je gegevens in kan stoppen (heeft naam, type en een bereik (scope))
 * **Initialiseren** = een variabele een waarde toekennen
 * **Declareren** = voordat je een variabele kan gebruiken deze een naam en type (soort data) toekennen. Regels voor naamgeving:
 	 * enkel letters, cijfers, _ en $
	 * naam mag niet met een cijfer beginnen
	 * naam mag geen gereserveerd keyword zijn
	 * naam moet uniek zijn binnen de scope van de variabele (unieke naam = identifier)

	Je kan meerdere variabelen van *hetzelfde* type op één regel declareren (af te raden!): int getalEen, getalTwee;

reserved keywords:

![keywords](img/keywords.png)

* **literals** = letterlijke waarden in de code

![char_escapecodes](img/char_escapecodes.png)

 * **final** = gebruiken om een variable niet meer te laten wijzigen na initialisatie. final int MAXIMUM_TEMPERATUUR = 100; Tevens constante genoemd.
* **casten** = specifiek een type converteren naar een ander type (bv. double naar int) met mogelijks verlies van precisie

#### Operatoren

* **Modulo operator** = op1 % op2, de rest van de deling van op1 door de absolute waarde van op2
* **promoveren** = +op, promoveert een byte, short of char naar int
* **Increment & Decrement** = pre ++i => eerst verhogen/verlagen, dan toekennen; post i++ => eerst toekennen, dan verhogen/verlagen

![increment_decrement](img/increment.png)

* **Relationele binaire operatoren** = >, <=, !=, ...
* **Logische binaire operatoren** = &&, ||
* **Logische unaire operator** = ! (inverse)
* **Toekenningsoperatoren binair** =  =, +=, *=, %=, /+, ... (eerst berekenen, dan toewijzen)
* **Conditionele ternaire operatoren** = ?: op1 ? op2 : op3 (als op1 true is, waarde op2 anders waarde op3 - altijd boolean!). vb.: (bmi > 25) ? "te hoog" : "ok"

overige operatoren:
	* . = Object.property (qualified names)
	* [] = array[]
	* (params) = lijst van parameters, comma separated
	* (type) = (type) value (casting)
	* new = new Object()
	* instanceof = op instanceof class




