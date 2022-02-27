use employees;
select * from employees;
select * from employees where gender ='F';
#select all from employees where first_name is Saniya.
select * from employees where first_name='Saniya';
#select from employees where first name is saniya and gender is F.
select * from employees where first_name='Saniya' and gender='F';
#select from employees where first name is saniya and gender is M.
select * from employees where first_name='Saniya' and gender='M';
#select all from employees where first name is saniya and hire date is 1988-12-12.
select * from employees where first_name ='Saniya' and hire_date='1988-12-12';
#select from employees where firt name is Georgi,Parto,Saniya,Sumant.
select * from employees where first_name in('Georgi','Parto','Saniya','Sumant');
select * from employees where first_name  not in('Georgi','Parto','Saniya','Sumant');
#select from employees where hire date is between 1978-01-01 to 2000-01-01
select * from employees where hire_date  between '1978-01-01' and '2000-01-01';
#select from employees where first name starts with Ma.
select* from employees where first_name like 'Ma%';
#select from employees where first name ends with Ma.
select* from employees where first_name like '%Ma';
#select from employees where first name consist Ma.
select* from employees where first_name like '%Ma%';
select * from employees where first_name like 'Ma___';
select * from salaries;
#show salary in accending order.
select * from salaries order by salary asc;
select * from salaries order by salary desc;
#select top 10 highest paid from salaries
select * from salaries order by salary desc limit 10;
#select highest paid employee from salaries.
select * from salaries order by salary desc limit 1;
select * from employees where hire_date >= '2000-01-01';