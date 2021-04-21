USE TEST;

-- DDL (DATA DEFINITION LANGUAGE)
-- CREATE THE STRUCTURES (CREATE TABLE, COLUMNS AND SPECIFY THE DATA TYPE)
-- THE UNIQUE CONSTRAINT
CREATE TABLE BOOKS
(
	BOOK_ID VARCHAR(15) UNIQUE
);
-- ALLOWS ONE OR MORE NULL VALUES
-- DOES NOT ALLOW DUPLICATES
-- MORE THAN ONE UNIQUE CONSTRAINT CAN BE THERE IN A TABLE
INSERT INTO BOOKS VALUES(NULL);
INSERT INTO BOOKS VALUES('TEST');
INSERT INTO BOOKS VALUES(NULL);
INSERT INTO BOOKS VALUES('TEST');
SELECT * FROM BOOKS;
SELECT * FROM BOOKS1;
DELETE FROM BOOKS1;
CREATE TABLE BOOKS1
(
	BOOK_ID VARCHAR(15) UNIQUE,
    BOOK_NAME VARCHAR(15) UNIQUE
);
-- IP identify the queries that will be successful 
INSERT INTO BOOKS1 VALUES ('test', 'test1');
INSERT INTO BOOKS1 VALUES ('test', 'test2');
INSERT INTO BOOKS1 VALUES ('test1', 'test1');
INSERT INTO BOOKS1 VALUES ('test2', 'test2');

-- PRIMARY KEY (NO NULL, NO DUPLIATES)
CREATE TABLE BOOKS2
(
-- DEFINING THE PRIMARY KEY ALONG WITH THE COLUMN DEFINITION
	BOOK_ID VARCHAR(15) PRIMARY KEY
);
-- IDENTIFY THE ROWS THAT WILL GET INSERTED
INSERT INTO BOOKS2 VALUES(NULL);
INSERT INTO BOOKS2 VALUES('TEST');
INSERT INTO BOOKS2 VALUES(NULL);
INSERT INTO BOOKS2 VALUES('TEST');

CREATE TABLE BOOKS3
(
--  MULTIPLE PRIMARY KEYS ARE NOT ALLOWED
	BOOK_ID VARCHAR(15) PRIMARY KEY,
    BOOK_NAME VARCHAR(15) PRIMARY KEY
);

-- CHECK CONSTRAINT - DOMAIN INTEGRITY
CREATE TABLE COUNTRIES (
C_ID CHAR(5) NOT NULL,
C_NAME VARCHAR(25) NOT NULL CHECK (C_NAME IN ('SP','IN','UK'))
);
-- PREDICT
INSERT INTO COUNTRIES VALUES (NULL, 'SP');
INSERT INTO COUNTRIES VALUES (1, 'SP');
INSERT INTO COUNTRIES VALUES (1, 'NZ');
INSERT INTO COUNTRIES VALUES (1, NULL);
INSERT INTO COUNTRIES VALUES (NULL, NULL);

DROP TABLE BOOKS4;
CREATE TABLE BOOKS4
(
BOOK_ID VARCHAR(15),
BOOK_NAME VARCHAR(15)
);
SELECT * FROM BOOKS4;
DELETE FROM BOOKS4;
INSERT INTO BOOKS4 VALUES(1, 'Start with why');
INSERT INTO BOOKS4 VALUES(1, 'Start with why');
-- ADD PRIMARY KEY BY MODIFYING THE COLUMN
ALTER TABLE BOOKS4
MODIFY BOOK_ID INT PRIMARY KEY;
INSERT INTO BOOKS4 VALUES(1, 'Start with why');
-- IP
-- DROP THE PRIMARY KEY BY ALTERING THE TABLE.
ALTER TABLE BOOKS4
DROP PRIMARY KEY;
-- DROP THE COLUMN ALONG WITH THE PRIMARY KEY
ALTER TABLE BOOKS4
DROP BOOK_NAME;
-- ADDING A COLUMN AFTER TABLE CREATION
ALTER TABLE BOOKS4 
ADD COLUMN BOOK_NAME VARCHAR(15);

-- MAKE THE BOOK NAME AS THE PRIMARY KEY
ALTER TABLE BOOKS4 
ADD COLUMN BOOK_NAME VARCHAR(15) PRIMARY KEY;
-- IP
INSERT INTO BOOKS4 VALUES (1,'MONK');
INSERT INTO BOOKS4 VALUES (1,'MONKS');
INSERT INTO BOOKS4 VALUES (2,'MONK');

-- DISPLAY THE CONSTRAINT DETAILS
-- METHOD 1
SHOW CREATE TABLE BOOKS4;
-- METHOD 2
SELECT * FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE;
SELECT * FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'BOOKS4';
SELECT * FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'ACTOR';
SELECT TABLE_NAME, COLUMN_NAME, CONSTRAINT_NAME, CONSTRAINT_SCHEMA FROM INFORMATION_SCHEMA.KEY_COLUMN_USAGE
WHERE TABLE_NAME = 'ACTOR';
CREATE TABLE BOOKS33
(
--  MULTIPLE PRIMARY KEYS ARE NOT ALLOWED
	BOOK_ID VARCHAR(15) ,
    BOOK_NAME VARCHAR(15),
    PRIMARY KEY(BOOK_ID)
);

CREATE TABLE AUTHOR1
(
  -- AUTHOR_ID PRIMARY KEY
	AUTHOR_ID CHAR(10) NOT NULL PRIMARY KEY,
    AUTHOR_NAME VARCHAR(20) NOT NULL
);
SELECT * FROM AUTHOR1;
INSERT INTO AUTHOR1 VALUES(1, 'DAVID');
INSERT INTO AUTHOR1 VALUES(2, 'VIKTOR'); 
CREATE TABLE BOOK5 (
BOOK_ID CHAR(10) NOT NULL PRIMARY KEY,
BOOK_NAME VARCHAR(50) NOT NULL,
AUTHOR_ID CHAR(10),
-- FOREIGN KEY IS THE AUTHOR ID
FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR1 (AUTHOR_ID)
);

INSERT INTO BOOK5 VALUE(1, 'CANT HURT ME',1);
INSERT INTO BOOK5 VALUE(2, 'MANS SEARCH', 2);
INSERT INTO BOOK5 VALUE(3, 'AWAKEN', 3);
-- FFT
INSERT INTO BOOK5 VALUE(3, 'AWAKEN', NULL);
SELECT * FROM BOOK5;
INSERT INTO AUTHOR1 VALUES(3, 'ANTHONY'); 
-- IP UPDATE THE BOOK5 TABLE TO REFLECT THE AUTHOR.
UPDATE BOOK5 SET AUTHOR_ID=3 WHERE BOOK_ID=3;
UPDATE BOOK5 SET AUTHOR_ID = '3' WHERE BOOK_ID = '3';
UPDATE BOOK5 SET AUTHOR_ID =  NULL WHERE BOOK_ID = '3';

-- IP SCENARIO : SCHEMA : VLSYS
-- AUTHOR (AUTHOR_ID,AUTHOR_NAME), COURSE (COURSE_ID, COURSE_NAME), TRAINING (TRAININGID, AUTHOR_ID, COURSE_ID)
-- OBJECTIVE : MULTIPLE PRIMARY & FOREIGN KEYS.
-- 2 WHICH FAIL & 2 INSERTS WHICH PASS 

CREATE TABLE AUTHOR
(
AUTHOR_ID VARCHAR(15),
AUTHOR_NAME VARCHAR(15) NOT NULL,
primary KEY(AUTHOR_ID)
);

CREATE TABLE COURSE
(
COURSE_ID INT NOT NULL PRIMARY KEY,
COURSE_NAME VARCHAR(15)
);

CREATE TABLE TRAINING
(
TRAININGID INT NOT NULL PRIMARY KEY,
AUTHOR_ID VARCHAR(15),
COURSE_ID INT,
FOREIGN KEY (COURSE_ID) REFERENCES COURSE(COURSE_ID),
FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(AUTHOR_ID)
);

INSERT INTO AUTHOR VALUES('1','JAMES');
INSERT INTO COURSE VALUES(1,'ROCK CLIMBING');
INSERT INTO TRAINING VALUES (1,1,1);
-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails (`test`.`training`, CONSTRAINT `training_ibfk_1` FOREIGN KEY (`COURSE_ID`) REFERENCES `course` (`COURSE_ID`))	0.015 sec
INSERT INTO TRAINING VALUES (2,1,2);
-- Cannot add or update a child row: a foreign key constraint fails (`test`.`training`, CONSTRAINT `training_ibfk_2` FOREIGN KEY (`AUTHOR_ID`) REFERENCES `author` (`AUTHOR_ID`))	0.000 sec
INSERT INTO TRAINING VALUES (3,2,1);

-- IP WHAT HAPPEN'S IF WE TRY TO DELETE AN AUTHOR RECORD WHICH IS REFERENCED IN THE TRAINING TABLE.
DELETE FROM AUTHOR WHERE AUTHOR_ID = 1;
-- Cannot delete or update a parent row: a foreign key constraint fails (`test`.`training`, CONSTRAINT `training_ibfk_2` FOREIGN KEY (`AUTHOR_ID`) REFERENCES `author` (`AUTHOR_ID`))
DROP TABLE AUTHOR;
DROP TABLE COURSE;
DROP TABLE TRAINING;

CREATE TABLE AUTHOR
(
AUTHOR_ID VARCHAR(15),
AUTHOR_NAME VARCHAR(15) NOT NULL,
primary KEY(AUTHOR_ID)
);

CREATE TABLE COURSE
(
COURSE_ID INT NOT NULL PRIMARY KEY,
COURSE_NAME VARCHAR(15)
);

CREATE TABLE TRAINING
(
TRAININGID INT NOT NULL PRIMARY KEY,
AUTHOR_ID VARCHAR(15),
COURSE_ID INT,
FOREIGN KEY (COURSE_ID) REFERENCES COURSE(COURSE_ID) ON DELETE SET NULL,
FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(AUTHOR_ID)
);

INSERT INTO AUTHOR VALUES('1','JAMES');
INSERT INTO COURSE VALUES(1,'ROCK CLIMBING');
INSERT INTO TRAINING VALUES (1,1,1);
SELECT * FROM TRAINING;
DELETE FROM COURSE WHERE COURSE_ID = 1;
-- DELETE FROM AUTHOR WHERE AUTHOR_ID = 1	Error Code: 1451. Cannot delete or update a parent row: a foreign key constraint fails (`test`.`training`, CONSTRAINT `training_ibfk_2` FOREIGN KEY (`AUTHOR_ID`) REFERENCES `author` (`AUTHOR_ID`))	0.000 sec
DELETE FROM AUTHOR WHERE AUTHOR_ID = 1;

-- IP FIX THE BUG ABOVE
-- DELETING A ROW IN THE PARENT TABLE (AUTHOR) SHOULD DELETE THE ROW IN THE CHILD TABLE.
-- CREATE TABLE AUTHOR TEMP
CREATE TABLE AUTHORTEMP
(
AUTHOR_ID VARCHAR(15),
AUTHOR_NAME VARCHAR(15) NOT NULL,
primary KEY(AUTHOR_ID)
);
CREATE TABLE TRAININGTEMP
(
TRAININGID INT NOT NULL PRIMARY KEY,
AUTHOR_ID VARCHAR(15),
FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(AUTHOR_ID) -- CHANGES HERE
);
-- SOLUTION
CREATE TABLE TRAININGTEMP
(
TRAININGID INT NOT NULL PRIMARY KEY,
AUTHOR_ID VARCHAR(15),
FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHOR(AUTHOR_ID) ON DELETE CASCADE-- CHANGES HERE
);

DROP TABLE AUTHORTEMP;
DROP TABLE TRAININGTEMP;
-- IP SCENARIO: NO AUTHOR_ID. INSTEAD WE HAVE (FIRST_NAME, LAST_NAME) IN THE AUTHOR TABLE.
-- MODIFY THE AUTHOR AND TRAINING TABLE TO USE (FIRST_NAME + LAST_NAME) AS PK AND FK.
-- USE AUTHORTEMP AND TRAININGTEMP




