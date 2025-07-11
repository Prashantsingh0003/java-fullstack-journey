-- Subquery Sample
--1. Subquery in WHERE clause
-- Get employees who work in the 'IT' department
SELECT emp_name
FROM Employees
WHERE department_id = (
    SELECT dept_id
    FROM Departments
    WHERE dept_name = 'IT'
);

--2. Subquery using IN
-- Get employees from departments located in ['HR', 'Finance']
SELECT emp_name
FROM Employees
WHERE department_id IN (
    SELECT dept_id
    FROM Departments
    WHERE dept_name IN ('HR', 'Finance')
);

--3. Subquery using EXISTS
-- List departments that have at least one employee
SELECT dept_name
FROM Departments d
WHERE EXISTS (
    SELECT 1
    FROM Employees e
    WHERE e.department_id = d.dept_id
);

--4. Subquery in SELECT (scalar subquery)
-- Show each employee along with their department name
SELECT emp_name,
       (SELECT dept_name
        FROM Departments
        WHERE dept_id = e.department_id) AS department
FROM Employees e;
