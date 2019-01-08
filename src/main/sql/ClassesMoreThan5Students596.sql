# Write your MySQL query statement below
# 注意学生选课可能会重复
select class from courses  group by class having count(distinct student) >= 5;