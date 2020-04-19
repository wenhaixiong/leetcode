-- noinspection SqlResolve

-- author: wenhx
-- since: 2020/04/19
-- level: simple
-- title: 176.第二高薪水
SELECT (SELECT DISTINCT Salary FROM Employee ORDER BY Salary DESC LIMIT 1 OFFSET 1) AS SecondHighestSalary;