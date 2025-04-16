/*
 * create table Employee (empid int NOT NULL, empname varchar (50) NOT NULL,
  salary int NOT NULL, primary key(empid));
 
 *  Insert into Employee (empid, empname, salary) values(101,’srinu’,50000);
  
 * Update Employee set empname=’Naresh’, salary=45000, where empid=101;
  
 * Delete from Employee where empid=101;
 
 * Alter table Employee add age int not  null
  
 * Alter table Employee drop age;

 * Select * from Employee; 
 
 * select empname,salary from Employee;//only particular records print
 
 * select *from employee where salary= (select max(salary) from employee);
 * 
 * select *from employee where salary= (select min(salary) from employee);
 * 
 * select * from employee limit 1, 3; //first three records will print.
 * 
 * select * from employee group by salary order by salary asc limit 0, 4//first 4 salaries asc order print.
 
 * select * from employee group by salary order by  salary desc limit 0, 4
 
 * select * from employee group by empname order by empname asc limit 0, 4//ascending names
 
 * select * from employee group by empname order by empname asc//all records print
 
 *  SELECT salary from employee order by salary desc limit 1,1//second highest salary 
 
 * SELECT empname, salary, COUNT(salary) AS NumberOfTimes FROM
 * employee GROUP BY salary HAVING COUNT(salary) > 1//duplicate salary
 
 * SELECT empname, salary, COUNT(empname) AS NumberOfTimes FROM employee GROUP BY empname HAVING COUNT(empname) > 1//duplicate empname
  
 * update Employee set salary=salary +(salary *5.0/100.0) where empid=820; (Increase Salary of Employee by 5% in Table?)
   
 * select empname from employee where empname like 'a%';  (find Names of Employee starting with ‘A’?)
    
 * SELECT COUNT(*) from Employee;   find the number of employees in our company? //8
  
 *  SELECT COUNT(*) from Employee where salary='2550';//2 
    
 *  select * from employee where empname like '______a' find Employees of Employee ends with ‘A’ 
 
 *   select * from employee where salary between 10000 and 90000;  Print Details of Employee whose salaries between 10000 and 90000.
  
 */
