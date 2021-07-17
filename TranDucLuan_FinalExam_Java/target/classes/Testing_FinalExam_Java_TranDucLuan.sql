
drop DATABASE IF EXISTS testingfinalexam;
create database testingfinalexam;
use testingfinalexam;


drop table IF EXISTS project;
create table project(

	projectId		INT AUTO_INCREMENT PRIMARY KEY,
    teamSize		INT UNSIGNED,
    idManager		INT UNSIGNED,
    idEmployee		INT UNSIGNED

);

INSERT INTO		project		(	teamSize	,	idManager	,	idEmployee	)
VALUE						(	'1'			,	'1'			,	'1'			),
							(	'1'			,	'1'			,	'2'			),
                            (	'1'			,	'1'			,	'3'			),
                            (	'1'			,	'1'			,	'4'			);
                            
SELECT * from project;


drop table IF EXISTS `user`;
create table `user`(
	id 				INT AUTO_INCREMENT PRIMARY KEY,
    fullName		NVARCHAR(50),
    email			NVARCHAR(50),
    `password`		NVARCHAR(50) CHECK(length(`password`) >= 6),
    `role`			ENUM('MANAGER', 'EMPLOYEE'),
    expInYear		INT,
    projectId		INT,
    proSkill		NVARCHAR(30),

    FOREIGN KEY(projectId)		REFERENCES 	project(projectId)
);

INSERT INTO 	`user` 		(	fullName				,	email				,	`password`		,	`role`		,	expInYear		,	projectId	,	proSkill	)
VALUE						(	'Tran Duc Luan'			,	'luantd@gmail.com'	,	'Luan123'		,	'MANAGER'	,	10				,	null		,	null		),
							(	'Bui Dinh Dat'			,	'datbd@gmail.com'	,	'Dat123'		,	'EMPLOYEE'	,	null			,	1			,	'Dev'		),
                            (	'Mai Thi Loan'			,	'loanmt@gmail.com'	,	'Loan123'		,	'EMPLOYEE'	,	null			,	2			,	'Dev'		),
                            (	'Hoang Thi Vui'			,	'vuiht@gmail.com'	,	'Vui123'		,	'EMPLOYEE'	,	null			,	3			,	'Dev'		),
                            (	'Nguyen Phuong Cuong'	,	'cuongnp@gmail.com'	,	'Cuong123'		,	'EMPLOYEE'	,	null			,	4			,	'Dev'		);


SELECT * FROM `user`;


SELECT * from `user` LEFT JOIN project On `user`.projectid = project.projectId WHERE `user`.`role` = 'MANAGER';

SELECT  a.id, a.fullName, a.email, a.`role`
FROM	`user` AS a
LEFT JOIN	project AS b
ON a.projectId = b.projectId;

