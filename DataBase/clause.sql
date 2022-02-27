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
select * from employees having hire_date >= '2000-01-01';
select first_name from employees where count(first_name)>10;
# you cannot use aggregate function (count ,max , min , sum, avg) with where clause.
select count(first_name) from employees;
select  distinct first_name from employees;
select count(distinct first_name) from employees;  
select first_name from employees group by first_name;
# select names and their frequency(names_count) of employees table.
select first_name, count(first_name) from employees group by first_name;
# select names of the employees whose names are repeated more than 250 times.
select first_name, count(first_name) as names_count from employees group by first_name having count(first_name)>250 order by names_count;
/*
Q.1 Create a table having attributes sid and branch and insert below records.
1,CS
2,IT
3,CS
4,ME
5,IT
6,EC
7,IT
8,CS
9,ME
10,CS
a. Fetch all distinct branch
b. count total no of students 
c. select branch and their total no of students 
  ex: CS 4, IT 3
d. arrange output of Qc based on student count in descending order
Q2 Create a table student_names and insert below records.
Amit,Anushka,Yashvani,Anu,Amit,Aadi,Anushka,Anamika,Anu,Aadi,Ankush,Anushka
a. Select distinct_names
b. Select duplicate names 
c. Select duplicate names and count
d. Select names and their count.  


*/
