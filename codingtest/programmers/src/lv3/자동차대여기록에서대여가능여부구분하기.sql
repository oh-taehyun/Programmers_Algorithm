SELECT car_id,
MAX(CASE WHEN '2022-10-16' BETWEEN TO_CHAR(start_date,'yyyy-mm-dd') AND TO_CHAR(end_date,'yyyy-mm-dd')THEN '대여중'
ELSE '대여 가능' END) AS AVAILABILITY
FROM car_rental_company_rental_history
GROUP BY car_id
order by car_id desc;