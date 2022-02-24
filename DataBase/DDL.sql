-- DDL (data definition language) e.g. DR CAT
-- Q1. How to create a database in MySQL?
-- ans. Create database mydb;
-- Q2. How to select a database?
-- ans. use mydb;
-- Q3. How to create a table in mysql?
-- ans. create table <table name>(column1 datatype, column 2....);
-- DML (data manipulation language) select UID
-- Q4. How can you insert a record in table?
-- ans. insert into <table name> values(); this query is for insert value for all the columns.alter
-- insert into <table name>(specify column names) values()
-- Q5. How to select record from a table?
-- ans. select * from <table name>;
-- select <column names> from <table name>
-- Q6. What is the difference between drop and truncate?
-- ans. truncate deletes the data in the table whereas drop deletes the whole table.
-- truncate command : truncate table <tbl nmae>;
-- drop command : drop table <tbl name>;
-- Q7. How to rename a table?
-- ans. rename table <old table name> to <new table name>;
-- alter ccommand : 1. add a column to a existing table > alter table <table name> add column <column name> enum('F','M');
-- Q8. What is primary key?
-- ans. 
-- Q9. Difference between primary key and unquie key?
-- ans. 
-- Q10.What is a difference between Change and Modify?
-- ans.With the help of modify command you can not rename the column but with the help of change you can .
--  
Create database mydb;
use mydb;
CREATE TABLE student1 (
    sid 	INT,
    sname 	VARCHAR(50),
    dob 	DATE,
    city	VARCHAR(20)
);
insert into student1 values(1,'Yashvani','2002-10-30','Jabalpur');
insert into student values(1,'ankush','2002-01-12','bhopal','M',123);
insert into student(sid,sname,city,phone_no) values(1,'aadi','sitamarhi',456);
insert into student(sid,sname,city,dob,phone_no) values(2,'xyz','pune',1999-02-01,789);
select * from student;
select sname,dob from student;
insert into student1(sid,sname,city,phone_no) values(1,'aadi','sitamarhi',456);
-- insert into student(sid,gender)
SELECT 
    sname, dob
FROM
    student;
    select * from student;
truncate table student;
drop table student;
rename table student1 to student;
alter table student add column gender enum('F','M');
alter table student add primary key (sid);
alter table student add column phone_no int(11);
alter table student drop phone_number;
alter table student change phone_no phone_number int(10);
alter table student change phone_number phone_no  int(10);
