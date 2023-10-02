select mcdp_cd as 진료과코드, count(apnt_ymd) as "5월예약건수" 
from appointment 
where to_char(apnt_ymd,'yyyy-mm')='2022-05' 
group by mcdp_cd 
order by count(apnt_ymd) asc, mcdp_cd asc;