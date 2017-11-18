SELECT proj_nr,uren FROM opdrachten WHERE sofi_nr=999222222 AND uren<10;

SELECT voornaam||' '||achternaam "naam",afd_nr,salaris FROM medewerkers WHERE afd_nr=7 AND salaris<40000 OR sofi_nr=999666666;

SELECT DISTINCT INITCAP(plaats) FROM medewerkers WHERE LOWER(plaats) LIKE '___s%';

SELECT afd_nr,voornaam FROM medewerkers WHERE INITCAP(voornaam) IN('Suzan','Martina','Henk','Douglas') ORDER BY afd_nr DESC,voornaam;

SELECT achternaam,afd_nr FROM medewerkers WHERE plaats NOT IN('Maarssen','Eindhoven');

SELECT sofi_nr FROM opdrachten WHERE uren IS NULL;

SELECT sofi_nr FROM opdrachten WHERE uren IS NOT NULL;

SELECT achternaam FROM medewerkers WHERE lower(achternaam) LIKE '%o%o%';

SELECT achternaam, voornaam, geb_datum FROM medewerkers WHERE UPPER(achternaam) LIKE '%OO%';

SELECT * FROM gezinsleden WHERE sofi_nr='&sofi_nr';

SELECT * FROM opdrachten WHERE uren<&bovengrens AND uren>&ondergrens;

SELECT DISTINCT initcap(plaats) "Plaats" FROM medewerkers WHERE lower(substr(plaats,&positie,1)) = 's';

SELECT sysdate-geb_datum FROM gezinsleden;

SELECT naam, TRUNC((sysdate-geb_datum)/365) leeftijd FROM gezinsleden;

SELECT DISTINCT sofi_nr FROM gezinsleden WHERE TRUNC((sysdate-geb_datum)/365)<18;

SELECT sofi_nr, achternaam FROM medewerkers WHERE TRUNC((sysdate-geb_datum)/365)>30 AND upper(plaats) IN('EINDHOVEN','MAARSSEN');

SELECT sofi_nr medewerkers, trunc(months_between(sysdate,geb_datum)/12) "LEEFTIJD PARTNER" FROM gezinsleden WHERE upper(relatie)='PARTNER' AND trunc((sysdate-geb_datum)/365) BETWEEN 30 AND 40;

SELECT achternaam,voornaam, TO_CHAR(ADD_MONTHS(geb_datum,12*65),'dd-mon-yyyy') datum_pensioen FROM medewerkers;

SELECT voornaam||' '||tussenvoegsel||' '|| achternaam naam FROM medewerkers ORDER BY 1;

SELECT CONCAT(voornaam, CONCAT(' ',CONCAT(tussenvoegsel, CONCAT(' ',achternaam)))) naam FROM medewerkers ORDER BY 1;

SELECT sofi_nr medewerker,naam NAAM_KIND, geslacht "geslacht_kind",
CASE WHEN(TRUNC(sysdate-geb_datum)/365)<18 THEN 'kind' 
WHEN (TRUNC(sysdate-geb_datum)/365)>18 THEN 'volwassene' 
END leeftijdscategorie_kind 
FROM gezinsleden 
WHERE upper(relatie) IN('ZOON','DOCHTER');

SELECT sofi_nr, provincie FROM medewerkers WHERE upper(provincie) IN ('GR','ZH','UT','NB','LI');

SELECT sofi_nr ,decode(provincie,
'NB','Noord Brabant',
'LI','Limburg',
'GR','Groningen',
'ZH','Zuid Holland',
'UT','Utrecht') provincie
  FROM medewerkers ;
  
SELECT voornaam, nvl(tussenvoegsel,' ') tussenvoegsel, achternaam,geb_datum FROM medewerkers;

SELECT naam,TO_CHAR(geb_datum,'day dd Month yyyy') geboortedatum FROM gezinsleden;

SELECT naam,rpad(TO_CHAR(geb_datum,'fmday dd Month yyyy'),30,'.') geboortedatum FROM gezinsleden;
