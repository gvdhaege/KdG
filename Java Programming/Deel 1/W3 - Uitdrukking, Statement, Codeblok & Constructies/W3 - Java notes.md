#### Uitdrukking, statement, codeblok & constructies

* **Uitdrukking** is een geldige reeks van variabelen, operatoren en functieaanroepen dewelke resulteren in een enkelvoudige waarde. (expressies)
vb.: 
    * a = 15 * b + c;
    * (a < 120) in if statement

* **Scope** of bereik van een variable is het gebied in de code/programma waar de variable gekend is.

while (condition){
    statements;
}
1. de conditie wordt gecheckt
2. true -> statements, terug naar 1
3. false -> stop

(!) good practice: break niet gebruiken behalve in een switch statement

do {
    statements;
} while (condition);

1. de statements worden uitgevoerd
2. de condition wordt gecheckt
3. true => terug naar 1
4. false => stop

for (initialisation; condition; increment){
    statements;
}
1. initialisation
2. condition check
3. statements
4. increment
5. condition check

* **Sequentie** opeenvolding van statements

#### Constructies

if else - switch = condities
while - do while - for = iteraties