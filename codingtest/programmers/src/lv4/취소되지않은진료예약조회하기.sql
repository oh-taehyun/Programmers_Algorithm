SELECT c.apnt_no, a.pt_name, a.pt_no, c.mcdp_cd, b.dr_name, c.apnt_ymd FROM appointment c JOIN patient a ON c.pt_no = a.pt_no
JOIN doctor b ON c.mcdp_cd = b.mcdp_cd AND c.mddr_id = b.dr_id
WHERE c.apnt_cncl_yn = 'N' and b.mcdp_cd = 'CS' and to_char(c.apnt_ymd, 'YYYY-MM-DD')='2022-04-13' ORDER BY c.apnt_ymd;