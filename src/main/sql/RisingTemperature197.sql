# Write your MySQL query statement below
select w2.Id
from Weather w1, Weather w2
where w1.Temperature < w2.Temperature
and DATEDIFF(w2.RecordDate,w1.RecordDate) =1;