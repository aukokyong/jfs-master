USE TEST;
-- JOIN
CREATE TABLE TABLE1(
ID INT,
VALUE VARCHAR(10)
);

CREATE TABLE TABLE2(
ID INT,
VALUE VARCHAR(10)
);

-- UNION ARE DIFFERENT FROM JOINS
SELECT 1, 'RED'
UNION 
SELECT 2,'GREEN'
UNION 
SELECT 3,'BLUE'
UNION ALL
SELECT 1,'RED';

INSERT INTO TABLE1 (ID, VALUE)
SELECT 1, 'RED'
UNION 
SELECT 2,'GREEN'
UNION 
SELECT 3,'BLUE';

SELECT * FROM TABLE1;
INSERT INTO TABLE2 (ID, VALUE)
SELECT 2,'BASKET'
UNION 
SELECT 3,'BASE'
UNION 
SELECT 4,'CRICKET';

SELECT * FROM TABLE2;

-- CROSS JOIN
SELECT * FROM TABLE1
CROSS JOIN TABLE2;

-- CROSS JOIN VARIATION
SELECT * FROM TABLE1
CROSS JOIN TABLE2
WHERE TABLE1.ID  = 1 OR TABLE1.ID =2;

SELECT CONCAT(TABLE2.VALUE, ' BALL IS ' , TABLE1.VALUE, ' IN COLOR ') AS 'BALL AND COLOR DETAILS' 
FROM TABLE1 CROSS JOIN TABLE2;


-- SUM(TABLE.ID) IS AN AGGREGATE COLUMN
-- TABLE2.VALUE IN A NON AGGREGATE COLUMN
SELECT SUM(TABLE1.ID), TABLE2.VALUE FROM TABLE1
CROSS JOIN TABLE2
WHERE TABLE1.ID = 1 OR TABLE1.ID = 2
GROUP BY TABLE2.VALUE;

-- BREAK THE CODE
SELECT SUM(TABLE1.ID), TABLE2.VALUE FROM TABLE1
CROSS JOIN TABLE2
WHERE TABLE1.ID = 1 OR TABLE1.ID = 2;
-- GROUP BY TABLE2.VALUE;

SELECT TABLE1.ID, TABLE1.VALUE FROM TABLE1
CROSS JOIN TABLE2
WHERE TABLE1.ID = 1 OR TABLE1.ID = 2;

SELECT * FROM TABLE2;

-- GOOD PRACTICE
-- WHENEVER YOU FIND A NON-AGGREGATE COLUMN WITH AN AGGREGATE COLUMN, GROUP BY ALL THE NON-AGGREGATE COLUMNS IN THE LIST
SELECT SUM(TABLE1.ID), MAX(TABLE1.ID), MIN(TABLE1.ID),AVG(TABLE1.ID),COUNT(TABLE1.ID) FROM TABLE1;
-- IP
-- DISPLAY THE TOTAL NUMBER OF CUSTOMER FOR EACH STAFF.
USE  SAKILA;
SELECT * FROM RENTAL;

SELECT INVENTORY_ID FROM RENTAL
ORDER BY INVENTORY_ID ASC;

SELECT staff_id, COUNT(staff_id) AS 'NUMBER OF CUSTOMERS PER STAFF'
FROM RENTAL
GROUP BY STAFF_ID;

-- IP
-- DISPLAY THE TOTAL NUMBER OF CUSTOMER FOR INVENTORY_ID.
-- TOTAL NUMBER OF CUSTOMERS SHOULD BE GREATER THAN 3.
SELECT INVENTORY_ID, COUNT(INVENTORY_ID) AS 'NUMBER OF CUSTOMERS'

FROM RENTAL
WHERE INVENTORY_ID < 20
GROUP BY INVENTORY_ID
HAVING COUNT(INVENTORY_ID) > 3;

-- INNER JOIN (ONLY MATCHING RECORDS FROM BOTH TABLES
USE TEST;
SELECT * FROM TABLE1
INNER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT * FROM TABLE1;
SELECT * FROM TABLE2;

SELECT TABLE1.VALUE AS 'COLOR', TABLE2. VALUE AS 'TYPE' FROM TABLE1
INNER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

-- USING ALIAS
SELECT LT.VALUE AS 'COLOR', RT.VALUE AS 'TYPE' FROM TABLE1 LT
INNER JOIN TABLE2 RT
ON LT.ID = RT.ID;

-- LEFT JOIN
SELECT * FROM TABLE1
LEFT JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT * FROM TABLE1
LEFT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

-- RIGHT JOIN
SELECT * FROM TABLE1
RIGHT JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

SELECT * FROM TABLE1
RIGHT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

CREATE TABLE TABLE3(
ID INT,
SIZE INT
);

INSERT INTO TABLE3(ID,SIZE)
SELECT 3,12
UNION 
SELECT 4,6
UNION 
SELECT 5,8;

-- JOINING 3 TABLES
SELECT * FROM TABLE1
INNER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID
INNER JOIN TABLE3
ON TABLE3.ID = TABLE1.ID;

SELECT * FROM TABLE1;
SELECT * FROM TABLE2;
SELECT * FROM TABLE3;

SELECT * FROM TABLE1 LEFT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;
-- IP IMPLEMENT A FULL OUTER JOIN ( KEYWORDS : FULL OUTER JOIN ) WITH TABLE1 AND TABLE 2
-- SELECT * FROM TABLE1
-- FULL OUTER JOIN TABLE2
-- ON TABLE1.ID = TABLE2.ID;
-- IP USE AN ALTERNATE APPROACH TO GET THE RESULTS AS OF FULL OUTER JOIN
SELECT * FROM TABLE1 LEFT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID
UNION
SELECT * FROM TABLE1 RIGHT OUTER JOIN TABLE2
ON TABLE1.ID = TABLE2.ID;

CREATE TABLE EMPLOYEE1(
EMPID INT PRIMARY KEY,
NAME VARCHAR(50),
MANID INT
);

SELECT 1, 'ALAN', NULL
UNION  ALL 
SELECT 2, 'BEN', 4 
UNION  ALL 
SELECT 3, 'JACK', 2
UNION ALL
SELECT 4 , 'BENNY', 1
UNION  ALL
SELECT 5, 'JILL', 4

-- IP 'EMPLOYEE WORKS FOR MANAGER'  ( BENNY WORKS FOR ALAN ) 
-- WITH ALAN AND WITHOUT ALAN
-- HINT (USE THE EMPLOYEE1 FOR BOTH THE LEFT AND RIGHT TABLES.)

