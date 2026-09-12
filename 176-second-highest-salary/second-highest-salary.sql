select max(salary) as SecondHighestSalary from (
select DISTInct salary from Employee
order by salary desc limit 1 offset 1
) as q