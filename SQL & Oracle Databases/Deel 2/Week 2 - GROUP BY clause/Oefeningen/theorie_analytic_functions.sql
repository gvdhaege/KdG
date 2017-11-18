SELECT uren
FROM opdrachten
WHERE sofi_nr='999444444';

SELECT count(uren)FROM opdrachten
WHERE sofi_nr='999444444';

SELECT SUM(uren)
FROM opdrachten
WHERE sofi_nr='999444444';

SELECT COUNT(*)
FROM opdrachten;

SELECT COUNT(uren)
FROM opdrachten;

SELECT count(distinct(proj_nr)) aantal FROM opdrachten;

SELECT round(avg(uren)) aantal_uren FROM opdrachten WHERE proj_nr=30;

SELECT count(distinct(sofi_nr)) medewerkers_met_kinderen FROM gezinsleden WHERE upper(relatie)!='PARTNER';

SELECT max(uren) "hoogste aantal uren" FROM opdrachten WHERE proj_nr=20;

SELECT max(geb_datum) "jongste kind" FROM gezinsleden WHERE sofi_nr='999111111' AND upper(relatie)!='PARTNER';

SELECT round(avg(length(achternaam))) "Gemiddelde lengte achternaam" FROM medewerkers;