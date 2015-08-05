create database if not exists simplebookstore;
use simplebookstore;
drop table if exists books;

create table books (
  bookid     int not null auto_increment,
  yearpub int,
  title  varchar(50),
  author varchar(50),
  price  float,
  quantity    int,
  primary key (bookid));


  

insert into books (title, yearpub, author, price, quantity) values ('Java for dummies', 2000, 'Tan Ah Teck', 11.11, 11);
insert into books (title, yearpub, author, price, quantity) values ('More Java for dummies', 2001, 'Tan Ah Teck', 22.22, 22);
insert into books (title, yearpub, author, price, quantity) values ('More Java for more dummies', 2002,'Mohammad Ali', 33.33, 33);
insert into books (title, yearpub, author, price, quantity) values ('A Cup of Java', 2005, 'Kumar', 44.44, 44);
insert into books (title, yearpub, author, price, quantity) values ('A Teaspoon of Java', 2009, 'Kevin Jones', 55.55, 55);
insert into books (title, yearpub, author, price, quantity) values ('Where is it?', 1997, 'Mohammad Ali', 65.29, 22);
insert into books (title, yearpub, author, price, quantity) values ('MVC', 2002, 'Mohammad Ali', 65.29, 22);
insert into books (title, yearpub, author, price, quantity) values ('Mysql, Java, and You', 2005, 'Tan Ah Teck', 74.29, 22);
insert into books (title, yearpub, author, price, quantity) values ('Two Cups of Java?', 2010, 'Kumar', 65.29, 22);


