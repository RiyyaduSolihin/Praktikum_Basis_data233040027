SELECT [Name],[Salaries] 
FROM [dbo].[Employee] AS E
INNER JOIN [dbo].[Salaries] AS S ON S.[EmployeeID] = [Salaries].E_[EmployeeID];