
-- Create Database
Drop database if exists department_management;
Create database department_management;
use department_management;

-- ==========================================================================


-- Create table user_role
drop table if exists user_role;
create table user_role(
	role_id					int primary key auto_increment,
    role_name				varchar(50) unique		-- default sẽ là 1: employee

);



-- Create table department
drop table if exists department;
create table department(

	department_id			int primary key auto_increment,
    department_name			varchar(100) unique not null
    

);



-- Create table user_info
drop table if exists user_info;
create table user_info(
	user_id					int primary key auto_increment,
    username				varchar(50) unique not null,
    `password`				varchar(200) not null,
    id_card					varchar(20) unique not null,
    first_name				varchar(50) not null,
    last_name				varchar(50) not null,
    `position`				varchar(50) default 'chưa có vị trí',
    phone					varchar(15) unique not null,
    gender					enum('male', 'female', 'unknown'),
    address					varchar(100) default 'No Address!!!',
    age						varchar(10) default 'No Age!!!',
    department_id			int not null,
    role_id					int default 1,				-- default sẽ là 1: employee
    
    foreign key(role_id)		references user_role(role_id),
    foreign key(department_id)	references department(department_id)
     
);






-- ===================INSERT DATA=========================================================


-- table user_role
INSERT into user_role	(	role_name	)
values					(	'EMPLOYEE'	),
						(	'MANAGER'	);
 
 -- table department
INSERT into department	(	department_name		)
values					(	'phong giam doc'	),
						(	'phong nhan vien'	);
                        
-- table user_info
INSERT into user_info	(	username		,	`password`		,	id_card			,	first_name			,	last_name		,	phone			,	`position`		,	gender		,	address				,	age		,	role_id		,	department_id	)
values					(	'luantd1'		,	'123456'		,	'03500350'		,	'Tran'				,	'Duc Luan'		,	'0123456789'	,	'Giám đốc'		,	'male'		,	'Nam Dinh'			,	'20'	,	'2'			,	'1'				),
						(	'mrbean'		,	'123456'		,	'123456'		,	'Mr'				,	'Bean'			,	'2583691471'	,	'Nhân viên'		,	'female'	,	'Ha Noi'			,	'30'	,	'1'			,	'1'				);
                        
                        

