SELECT pt_name, pt_no, gend_cd, age,CASE WHEN tlno IS NULL then 'NONE'
ELSE tlno END AS TLNO
FROM patient
where age < = 12 AND gend_cd = 'W'
ORDER BY age desc, pt_name asc;