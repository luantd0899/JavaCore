Drop DATABASE IF EXISTS railway59_chuade;

CREATE DATABASE railway59_chuade;

USE railway59_chuade;

Drop TABLE IF EXISTS `project`;
CREATE TABLE `project`(

                          projectId		INT PRIMARY key AUTO_INCREMENT,
                          projectName		varchar(100),
                          teamSize		int

);


Drop TABLE IF EXISTS `userss`;
CREATE TABLE `userss`(

                         id 				INT PRIMARY key AUTO_INCREMENT,
                         fullName		VARCHAR(70),
                         email			varchar(70) UNIQUE,
                         `password`		VARCHAR(70),
                         expInYear		int,
                         proSkill		VARCHAR(50),
                         `role`			ENUM('EMPLOYEE', 'MANAGER'),

                         projectId		int,
                         FOREIGN KEY(projectId) REFERENCES `project`(projectId)

);


-- INSERT DATA

-- Table `project`
INSERT INTO `railway59_chuade`.`project` (`projectName`, `teamSize`) VALUES ('Bai thuc hanh 1', '2');
INSERT INTO `railway59_chuade`.`project` (`projectName`, `teamSize`) VALUES ('Bai thuc hanh 2', '3');

-- table `userss`
INSERT INTO `railway59_chuade`.`userss` (`id`, `fullName`, `email`, `password`, `expInYear`, `role`, `projectId`) VALUES ('1', 'Nguyễn Văn A', 'nguyenvana@gmail.com', '123456', '5', 'MANAGER', '1');
INSERT INTO `railway59_chuade`.`userss` (`id`, `fullName`, `email`, `password`, `proSkill`, `role`, `projectId`) VALUES ('2', 'Nguyen Van B', 'nguyenvanb@gmail.com', '123456', 'Java', 'EMPLOYEE', '1');
INSERT INTO `railway59_chuade`.`userss` (`id`, `fullName`, `email`, `password`, `expInYear`, `proSkill`, `role`, `projectId`) VALUES ('3', 'nguyen van c', 'nguyenvanc@gmail.com', '123456', '6', '', 'MANAGER', '2');
INSERT INTO `railway59_chuade`.`userss` (`id`, `fullName`, `email`, `password`, `proSkill`, `role`, `projectId`) VALUES ('4', 'nguyenvand', 'nguyenvand@gmail.com', '123456', 'html', 'EMPLOYEE', '2');
INSERT INTO `railway59_chuade`.`userss` (`id`, `fullName`, `email`, `password`, `proSkill`, `role`, `projectId`) VALUES ('5', 'nguyenvane', 'nguyenvane@gmail.com', '123456', 'css js', 'EMPLOYEE', '2');
UPDATE `railway59_chuade`.`userss` SET `email` = 'nguyenvana@vti.com.vn' WHERE (`id` = '1');

-- cau2

SELECT * FROM `userss` WHERE projectId = '1';

SELECT * FROM `userss` WHERE `role` = 'MANAGER';

SELECT * FROM `userss` WHERE email = 'nguyenvana@gmail.com' AND `password` = '1234567';




