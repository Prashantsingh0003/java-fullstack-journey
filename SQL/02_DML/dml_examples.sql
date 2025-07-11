--INSERT INTO – Add Records

-- Insert into Departments table
INSERT INTO Departments (dept_id, dept_name) VALUES
(1, 'HR'),
(2, 'Finance'),
(3, 'IT');

-- Insert into Employees table
INSERT INTO Employees (emp_id, emp_name, email, salary, department_id) VALUES
(101, 'Ravi Kumar', 'ravi@example.com', 45000, 2),
(102, 'Anita Desai', 'anita@example.com', 55000, 1),
(103, 'Rohit Sharma', 'rohit@example.com', 60000, 3);

--UPDATE – Modify Records

-- Increase salary of employee with emp_id = 103
UPDATE Employees
SET salary = salary + 5000
WHERE emp_id = 103;

-- Change department of emp_id = 101
UPDATE Employees
SET department_id = 1
WHERE emp_id = 101;

--DELETE – Remove Records

-- Delete one employee
DELETE FROM Employees
WHERE emp_id = 102;

