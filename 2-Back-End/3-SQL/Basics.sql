-- CREATE COMMAND --
CREATE database firstdatabase;
USE firstdatabase;
CREATE TABLE firsttable(id int, name varchar(10));

-- INSERT COMMAND --
INSERT INTO firsttable values(1, 'A');
INSERT INTO firsttable values(2, 'B'), (3, 'C'), (4, 'D');

-- SELECT COMMAND --
SELECT * FROM Firsttable;