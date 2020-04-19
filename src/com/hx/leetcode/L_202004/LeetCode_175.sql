-- noinspection SqlResolve

-- author: wenhx
-- since: 2020/04/19
-- level: simple
-- title: 175.组合两张表

SELECT p.FirstName, p.LastName, a.City, a.State
FROM Person p
         LEFT JOIN Address a ON p.PersonId = a.PersonId;