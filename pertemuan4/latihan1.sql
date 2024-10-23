SELECT *
FROM 
HR.Employees;

SELECT city
FROM 
HR.Employees;

SELECT DISTINCT city
FROM 
HR.Employees;

SELECT firstname , COUNT(*)AS Nomor
FROM HR.Employees
GROUP BY  firstname;

SELECT TOP(5) lastname
FROM HR.Employees;

SELECT firstname
FROM HR.Employees
WHERE birthdate
BETWEEN '1958-12-08' AND '1962-03-04';

SELECT firstname
FROM HR.Employees
WHERE firstname LIKE 'S%';

