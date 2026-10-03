-- select max(salary) as SecondHighestSalary
-- from employee
-- where salary < (select max(salary) from employee);

WITH RankedSalaries AS (
    SELECT 
        salary,
        DENSE_RANK() OVER (ORDER BY salary DESC) as rnk
    FROM Employee
)
SELECT 
    MAX(salary) AS SecondHighestSalary
FROM RankedSalaries
WHERE rnk = 2;