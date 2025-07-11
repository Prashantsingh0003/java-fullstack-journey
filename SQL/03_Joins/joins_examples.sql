-- Departments table
CREATE TABLE Departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50)
);

-- Employees table
CREATE TABLE Employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(100),
    email VARCHAR(100),
    salary DECIMAL(10,2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(dept_id)
);

-- 1. INNER JOIN – Matching Records Only
-- Show employee name with their department name
SELECT e.emp_name, d.dept_name
FROM Employees e
INNER JOIN Departments d
ON e.department_id = d.dept_id;

-- 2. LEFT JOIN – All from Left + Matching from Right
-- Show all employees and their departments (even if no department assigned.)
SELECT e.emp_name, d.dept_name
FROM Employees e
LEFT JOIN Departments d
ON e.department_id = d.dept_id;

-- 3. RIGHT JOIN – All from Right + Matching from Left
-- Show all departments and the employees in them (even if no employees yet)
SELECT e.emp_name, d.dept_name
FROM Employees e
RIGHT JOIN Departments d
ON e.department_id = d.dept_id;

--4. FULL OUTER JOIN – All Records from Both Sides
-- Show all data from both Employees and Departments
SELECT e.emp_name, d.dept_name
FROM Employees e
LEFT JOIN Departments d
ON e.department_id = d.dept_id

UNION

SELECT e.emp_name, d.dept_name
FROM Employees e
RIGHT JOIN Departments d
ON e.department_id = d.dept_id;

--5. SELF JOIN – Join table with itself
-- Example: Show employees who have the same department
SELECT e1.emp_name AS Employee1, e2.emp_name AS Employee2, e1.department_id
FROM Employees e1, Employees e2
WHERE e1.department_id = e2.department_id AND e1.emp_id != e2.emp_id;
