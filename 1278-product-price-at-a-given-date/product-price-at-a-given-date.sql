# Write your MySQL query statement below 
(SELECT  product_id, 10 as price 
FROM products 
GROUP BY product_id 
HAVING MIN(change_date) > '2019-08-16')

UNION 

(SELECT p2.product_id, p2.new_price as price 
FROM products p2 
WHERE (p2.product_id, p2.change_date) IN 
    (SELECT  product_id, max(change_date) as change_date 
    FROM products where change_date <='2019-08-16' GROUP BY product_id)
);
-- select distinct product_id, 10 as price
-- from Products
-- group by product_id
-- having (min(change_date) > "2019-08-16")

-- union

-- select p2.product_id, new_price
-- from Products p2
-- where (p2.product_id, p2.change_date) in

-- (
-- select product_id, max(change_date) as recent_date
-- from Products
-- where change_date <= "2019-08-16"
-- group by product_id
-- )
