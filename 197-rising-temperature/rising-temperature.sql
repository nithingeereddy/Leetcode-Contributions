# Write your MySQL query statement below

SELECT a.id FROM 
    Weather a join Weather b on DATEDIFF(a.recordDate,b.recordDate)=1 and a.temperature>b.temperature;