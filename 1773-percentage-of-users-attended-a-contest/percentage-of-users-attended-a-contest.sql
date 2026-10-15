# Write your MySQL query statement below
-- select *
with res as (select r.contest_id, count(distinct r.user_id) as num_user, (select count(user_id) as cnt from users) as tot_user
from users u
join register r
using(user_id)
group by r.contest_id)

select contest_id, round((num_user / tot_user) * 100, 2) as percentage
from res
order by percentage desc, contest_id asc;