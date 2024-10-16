use Pertemuan3

SELECT
    c.custid,
    COUNT(o.orderid) AS numorders,
    SUM(od.qty * od.unitprice) AS totalqty
FROM
    Sales.Customers AS c
INNER JOIN Sales.Orders AS o ON c.custid = o.custid
INNER JOIN Sales.OrderDetails  AS od ON o.orderid = od.orderid   

GROUP BY
    c.custid;

