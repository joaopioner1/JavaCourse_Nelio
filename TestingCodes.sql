create database employees;
use employees;

create table employee ( 
	employeeID int default 1 primary KEY,
    firtsName varchar(50),
    lastName varchar(50),
	address varchar(50),
    city varchar(50)
);

select * from employee; 

insert into employee (employeeID, lastName, firstName, address, city)
values ("1", "Pioner", "João", "Aníbal Dambros", "Osório");


SET SQL_SAFE_UPDATES = 0;

delete from employee 
where employeeID = null;

select * from employee; 

ALTER TABLE employee
DROP COLUMN lastName;

ALTER TABLE employee
add column lastName varchar(50)
after firstName;

insert into employee (lastName, employeeID,firstName, address, city)
values ("Pioner", "3", "JOao", "Dambros", "Maquiné");

select * from employee; 

