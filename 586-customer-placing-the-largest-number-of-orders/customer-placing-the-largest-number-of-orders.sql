# Write your MySQL query statement below
with res as
(select customer_number, count(order_number) as cnt, max(count(order_number)) over() as max_cnt
from orders
group by customer_number)

select distinct customer_number
from res
where cnt = max_cnt;