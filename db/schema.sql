create database db1;

use db1;

CREATE TABLE `connection` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `hostname` varchar(45) NOT NULL,
  `port` smallint(5) unsigned NOT NULL,
  `database_name` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `user` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `surname` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);


INSERT INTO `db1`.`connection` (`name`, `hostname`, `port`, `database_name`, `username`, `password`) VALUES ('sakila@localhost', 'localhost', 3306, 'sakila', 'user', 'pa$$');
INSERT INTO `db1`.`connection` (`name`, `hostname`, `port`, `database_name`, `username`, `password`) VALUES ('db1@localhost', 'localhost', 3306, 'db1', 'user', 'pa$$');

INSERT INTO `db1`.`user` (`name`, `surname`) VALUES ('geo', 'mih');