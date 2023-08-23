SELECT animal_type, CASE WHEN name IS NULL THEN 'No name' ELSE name END AS "name", 
sex_upon_intake FROM ANIMAL_INS ORDER BY animal_id;