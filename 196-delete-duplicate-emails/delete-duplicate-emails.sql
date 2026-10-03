# Write your MySQL query statement below
with res as(
    select id, email, row_number() over(partition by email order by id) as num
    from person
)
delete from person
where id in (select id from res where num > 1);