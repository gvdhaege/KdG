SELECT achternaam FROM medewerkers WHERE REGEXP_LIKE(achternaam,'a|u');

SELECT achternaam, REGEXP_REPLACE(achternaam,'o|a','e',1,2,'i') " " FROM MEDEWERKERS;

SELECT proj_naam FROM projecten WHERE regexp_like(proj_naam,'[aeiou][^aeiou][aeiou]','i');

SELECT proj_naam 
FROM projecten
WHERE REGEXP_LIKE(proj_naam,
'^[^aeiou]*[aeiou][^aeiou][aeiou]','i');	

SELECT REGEXP_SUBSTR(proj_naam,'[aeiuo]',1,2,'i') "Tweede klinker" FROM projecten;

SELECT proj_naam FROM projecten WHERE REGEXP_SUBSTR(proj_naam,'[aeiuo]',1,1,'i')=REGEXP_SUBSTR(proj_naam,'[aeiuo]',1,2,'i');
