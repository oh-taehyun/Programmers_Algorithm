SELECT a.book_id AS book_id, b.author_name AS author_name, to_char(a.published_date, 'yyyy-mm-dd') AS published_date
FROM book a JOIN author b ON a.author_id=b.author_id
WHERE a.category = '경제'
ORDER BY a.published_date asc;