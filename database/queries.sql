SELECT s.tekst AS "Spørgsmål",v.tekst AS "Rigtig svar" FROM spoergsmaal AS s INNER JOIN svar AS v ON s.rigtigSvarId=v.id;
SELECT s.tekst AS "Spørgsmål",v.tekst AS "Rigtig svar" FROM spoergsmaal AS s INNER JOIN svar AS v ON s.rigtigSvarId=v.id WHERE s.id!=1;
UPDATE spoergsmaal SET tekst="Hvor mange types kan en Pokémon max have?" WHERE id=1;
DELETE FROM svar WHERE id=1;