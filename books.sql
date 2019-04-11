use `bookManager`;

create table `Customer` (id INT NOT NULL AUTO_INCREMENT, 
`nume` VARCHAR(100) NOT NULL, `password` VARCHAR(100) NOT NULL,
`myPayment`VARCHAR(100) NOT NULL,
PRIMARY KEY (id));

create table `Book` (id INT NOT NULL AUTO_INCREMENT,
`isAvailable` BOOLEAN NOT NULL,
`genre` VARCHAR(100) NOT NULL,
`releaseDate` INT NOT NULL,
`author` VARCHAR(100) NOT NULL,
`title` VARCHAR(100) NOT NULL,
PRIMARY KEY(id));

create table `Staff` (idStaff INT NOT NULL AUTO_INCREMENT,
`name` VARCHAR(100) NOT NULL,
`password` VARCHAR(100) NOT NULL,
PRIMARY KEY(idStaff));

