-- DATE AND TIME --
CREATE TABLE firsttable(getdate date, gettime time);
INSERT INTO firsttable values('2025-10-12', '12:14');
SELECT * FROM firsttable;

-- DATETIME AND TEXT --
CREATE TABLE secondtable(getdatetime datatime, address text);
INSERT INTO secondtable values('2023-12-29 10:30', 'Chennai');
SELECT * FROM secondtable;