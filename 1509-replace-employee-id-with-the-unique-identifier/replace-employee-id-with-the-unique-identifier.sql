# Write your MySQL query statement below
SELECT eu.unique_id,e.name 
FROM Employees e left join  EmployeeUNI eu
ON e.id=eu.id ;