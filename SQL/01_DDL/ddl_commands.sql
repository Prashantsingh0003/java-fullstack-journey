-- Creating a new table
CREATE TABLE Students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    city VARCHAR(50)
);

-- Altering the table to add a new column
ALTER TABLE Students
ADD email VARCHAR(100);

-- Renaming a column
ALTER TABLE Students
RENAME COLUMN city TO location;

-- Modifying data type
ALTER TABLE Students
MODIFY age SMALLINT;

-- Dropping a column
ALTER TABLE Students
DROP COLUMN email;

-- Dropping the table
DROP TABLE Students;
