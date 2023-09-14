--주의사항
--CREATED_DATE의 포맷이 예시의 포맷과 일치해야 정답처리 됩니다.
SELECT a.title, a.board_id, b.reply_id, b.writer_id, b.contents, to_char(b.created_date,'yyyy-mm-dd' )AS created_date
FROM used_goods_board a JOIN used_goods_reply b ON a.board_id=b.board_id
WHERE to_char(a.created_date, 'yyyy-mm') = '2022-10'
ORDER BY b.created_date asc, a.title asc;