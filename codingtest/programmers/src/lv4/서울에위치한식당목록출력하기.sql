SELECT  a.rest_id, a.rest_name, a.food_type, a.favorites,a.address, round(avg(b.review_score),2)AS SCORE
FROM rest_info a INNER JOIN rest_review b ON a.rest_id=b.rest_id 
GROUP BY a.rest_id, a.rest_name, a.food_type, a.favorites,a.address
HAVING a.address LIKE '서울%'
ORDER BY score desc, a.favorites desc;