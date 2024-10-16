use Pertemuan3

penjelasan :
kesalahan pada alias yang dimana di sana yang customer maupun orders nya seharusnya C karnas udah di as(alias) 

Alternatif :

SELECT C.custid, C.companyname, O.orderid, O.orderdate
FROM Sales.Customers AS C
INNER JOIN Sales.Orders AS O
ON C.custid = O.custid;