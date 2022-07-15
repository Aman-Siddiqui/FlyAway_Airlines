CREATE DATABASE IF NOT EXISTS spring_mvc;

USE spring_mvc;

DROP TABLE IF EXISTS `spring_mvc`.`users`;

CREATE TABLE `spring_mvc`.`users` (
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `firstname` VARCHAR(45) NOT NULL,
  `lastname` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `address` VARCHAR(45) NULL,
  `phone` INT NULL,
  PRIMARY KEY (`username`));
  
  DROP TABLE IF EXISTS `spring_mvc`.`flight_master`;
  	
  CREATE TABLE `spring_mvc`.`flight_master` (
  `flightId` int NOT NULL auto_increment,
  `airlineName` VARCHAR(45) NOT NULL,
  `source` VARCHAR(45) NOT NULL,
  `destination` VARCHAR(45) NOT NULL,
  `departureTime` VARCHAR(45) NOT NULL,
  `departureDate` VARCHAR(45) NOT NULL,
  `arrivalTime` VARCHAR(45) NOT NULL,
  `fare` double NOT NULL,
  `availableSeats` INT NULL,
  PRIMARY KEY (`flightId`));
  
  INSERT INTO `spring_mvc`.`flight_master` VALUES (1,'Indigo','Jabalpur','Hyderabad','14:00','05/06/2021','21:30',3000,15),
  (2,'SpieceJet','Delhi','Chennai','12:00','06/06/2021','2:30',3500,11),
  (3,'Indigo','Bangalore','Kolkata','11:00','07/06/2021','13:30',2500,10),
  (4,'AirIndia','Pune','Jaipur','09:00','08/06/2021','12:30',4000,09),
  (5,'Kingfisher','jammu','manali','15:00','09/06/2021','20:30',5000,05);
  
 DROP TABLE IF EXISTS `spring_mvc`.`admin_master`;

 create table `spring_mvc`.`admin_master`
(
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45) NOT NULL,
PRIMARY KEY (`username`)
);

INSERT INTO `spring_mvc`.`admin_master` VALUES ('Darakhshan','Darakhshan');

