SELECT
    e.empid,
    e.FirstName,
    e.LastName
FROM
    HR.Employees e
LEFT JOIN Sales.Orders o ON e.empid = o.empid
WHERE
    o.orderid IS NULL OR o.orderdate < '2016-05-01';