SELECT dr_name, dr_id, mcdp_cd, TO_CHAR(hire_ymd,'yyyy-mm-dd') AS hire_ymd
FROM docotr WHERE mcdp_cd='CS' OR mcdp_cd='GS'
ORDER BY hire_ymd desc, dr_name asc;