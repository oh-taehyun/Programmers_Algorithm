/*
 * 조건에 맞는 도서 리스트 출력하기
 * book 테이블에서 2021년에 출판된 '인문'카테고리에 속하는 도서리스트
 * 출판일을 기준으로 오름차순
 * 
 */
SELECT book_id,to_char(published_date,'yyyy-mm-dd') as published_date from book where to_char(published_date,'yyyy')='2021'and category ='인문' order by published_date;