SELECT product_id, product_name, product_cd, category, price
FROM food_product where price IN(select MAX(price) FROM food_product);