-- Write your MySQL query statement below
-- slow sql
-- todo
select Name as Customers from Customers
where Id not in (select CustomerId from Orders)