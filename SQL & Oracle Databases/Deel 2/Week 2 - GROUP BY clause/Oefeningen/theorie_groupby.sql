SELECT proj_nr, count(*) aantal FROM opdrachten group by proj_nr;

SELECT round(avg(count(*))) "gem. aantal med/project" FROM opdrachten GROUP BY proj_nr;

SELECT afd_nr, count(*) "aantal medewerkers" FROM medewerkers WHERE upper(provincie)='LI' GROUP BY afd_nr;

SELECT mgr_sofi_nr, count(sofi_nr) aantal FROM medewerkers WHERE mgr_sofi_nr IS NOT NULL GROUP BY mgr_sofi_nr;

SELECT afd_nr,locatie,count(*) "aantal projecten" FROM projecten GROUP BY afd_nr,locatie;

SELECT sofi_nr,relatie,count(*) aantal FROM gezinsleden WHERE upper(relatie)!='PARTNER' GROUP BY sofi_nr,relatie;

SELECT afd_nr, count(*) aantal FROM medewerkers WHERE upper(geslacht)='V' AND salaris<33000 AND parkeerplaats IS NOT NULL GROUP BY afd_nr;