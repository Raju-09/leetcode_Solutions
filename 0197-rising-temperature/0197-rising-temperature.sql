# Write your MySQL query statement below
#SELECT today.id
#FROM Weather yesterday 
#CROSS JOIN Weather today

#WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
 #   AND today.temperature > yesterday.temperature
#;
# Write your MySQL query statement below

select a.id
from Weather a
left join Weather b
on a.recordDate = DATE_ADD(b.recordDate, INTERVAL 1 DAY)
where a.temperature > b.temperature