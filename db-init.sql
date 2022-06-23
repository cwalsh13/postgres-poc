create database contacts;
\c contacts
create user test password 'admin1953';
grant all privileges on database contacts to test;
grant all privileges on all tables in schema public to test;
create table contact (id varchar(50) unique not null, first_name varchar(50) not null, last_name varchar(50) not null);
insert into contact(id, first_name, last_name) values ('1', 'John', 'Doe');
