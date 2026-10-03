# Write your MySQL query statement below
delete p from person p
join person p1
on p.email = p1.email and p.id > p1.id;
