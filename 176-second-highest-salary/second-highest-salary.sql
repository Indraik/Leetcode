select max(salary) as SecondHighestSalary from (
    select salary,
    DENSE_RANK() over (order by salary desc) as rnk
    from Employee
) as rankedsalary
where rnk = 2;