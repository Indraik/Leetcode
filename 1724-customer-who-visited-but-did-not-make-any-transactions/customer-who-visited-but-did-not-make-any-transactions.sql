# Write your MySQL query statement below
select distinct v.customer_id, sum(t.transaction_id is null) as count_no_trans
from visits v
left join transactions t
on v.visit_id = t.visit_id
group by v.customer_id having count_no_trans > 0;