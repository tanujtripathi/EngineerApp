DROP table IF EXISTS `ENGINEER`;

create table ENGINEER(ID INT PRIMARY KEY, EIN INT, REFERENCE_NUMBER INT, AVAILABLE VARCHAR(10));

insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(1, 612415803, 12341, 'yes' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(2, 612345678, 12342, 'yes' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(3, 612345678, 12343, 'yes' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(4, 612345678, 12344, 'yes' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(5, 612345678, 12345, 'yes' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(6, 612345678, 12346, 'yes' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(7, 612345678, 12347, 'no' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(8, 612345678, 12348, 'no' );
insert into ENGINEER(ID, EIN, REFERENCE_NUMBER, AVAILABLE) values(9, 612345678, 12349, 'yes' );