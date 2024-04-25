# Write your MySQL query statement below
SELECT  w.id FROM Weather v , Weather w
WHERE DATEDIFF(w.recordDate, v.recordDate) = 1 AND v.temperature < w.temperature  ;