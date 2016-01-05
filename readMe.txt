For DB connectivity, execute the following queries manually.

create table election(Name varchar2(50),votes int);
insert into election values('Amar Chavan',0);
insert into election values('Rita Mehta',0);
insert into election values('Shivaji Deshmukh',0);
insert into election values('Priyanka Bhosale',0);
select * from election;

This sets the initial vote count of all candidates to 0

If the java code returns a nullPointerException, open the project in eclipse and run it again.

	