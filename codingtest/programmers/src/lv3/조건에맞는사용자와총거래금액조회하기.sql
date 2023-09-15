SELECT b.user_id, b.nickname, sum(a.price) AS total_sales FROM used_goods_board a JOIN used_goods_user b
ON a.writer_id=b.user_id WHERE a.status = 'DONE' GROUP BY b.user_id, b.nickname HAVING sum(a.price)>=700000
ORDER BY sum(a.price) asc;