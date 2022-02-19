# Mysql Constraints 
# 1. Primary Key ,Foreign Key ,Unique Key ,Default ,Not Null  
# H.W. Add foreign key using alter command 
# H.W. Add unique key , default,not null to the column using alter command and in create table command itself. 
use mydb;

CREATE TABLE course (
    cid INT  auto_increment primary key,
    cname VARCHAR(255),
    fee INT,
    duration INT
);
CREATE TABLE course (
    cid INT ,
    cname VARCHAR(255),
    fee INT,
    duration  INT,

    primary key (cid)

);
insert into course values(1,'Java',5000,3);
insert into course values(2,'Advance Java',10000,3);
insert into course values(3,'Spring',15000,4);
insert into course values(4,'Mysql',5000,2);
select * from course;



# alter table course add primary key (cid);
create table student1(
sid int,
sname varchar(50) not null,
dob date default '9999-11-22',
phone_no int unique key,
address varchar(255),
cid int,
foreign key(cid) references course(cid) on  delete cascade 
);
alter table student1 change phone_no phone_no int(11);
insert into student1 values(101,'Yashvani','2000-10-30',902546990,'Jabalpur',1);
insert into student1 values(102,'Anamika','2001-11-20',902546990,'Sadar',2);
insert into student1 values(103,'Addi','2002-10-30',902546990,'Ayodhya_Bypass',3);
insert into student1 values(104,'Anushka','1999-10-30',902546990,'Bhopal',4);
select * from student1;

# update command 
update student1 set phone_no=912546990 ;
delete from student1 where sid=101;
delete from student1 ;
create table test(
id int auto_increment primary key,
name varchar(10)
);







drop table student1;


