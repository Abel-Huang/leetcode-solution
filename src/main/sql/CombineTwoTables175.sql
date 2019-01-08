#
Write
your
MySQL
query
statement
below
#
Accept
100
%
select Person.FirstName, Person.LastName, Address.City, Address.State
from Person
       left join Address on Address.PersonId = Person.personId