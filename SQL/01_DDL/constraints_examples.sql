CREATE TABLE Employees (
    emp_id INT PRIMARY KEY,               
    emp_name VARCHAR(100) NOT NULL,       -- NOT NULL ensures value must be present.
    email VARCHAR(100) UNIQUE,            -- UNIQUE ensures no duplicate values should be.
    salary DECIMAL(10, 2) CHECK (salary > 0),  
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES Departments(dept_id) -- FOREIGN KEY sets relation
);

--Creating Departments table for the foreign key to work
CREATE TABLE Departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(100) NOT NULL
);

-- Adding NOT NULL constraint to an existing column
ALTER TABLE Employees
MODIFY emp_name VARCHAR(100) NOT NULL;

-- Adding a CHECK constraint
ALTER TABLE Employees
ADD CONSTRAINT chk_salary CHECK (salary > 0);

-- Drop a constraint 
ALTER TABLE Employees
DROP INDEX email;  -- For UNIQUE

-- Or for CHECK/FOREIGN KEY (if name known)
ALTER TABLE Employees
DROP FOREIGN KEY fk_department;
