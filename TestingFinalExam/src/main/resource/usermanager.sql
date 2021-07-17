Drop TABLE IF EXISTS `user`;
CREATE TABLE `user`(

	id 				INT AUTO_INCREMENT PRIMARY KEY,
    fullName		NVARCHAR(100),
    email			NVARCHAR(100),
    `password`		NVARCHAR(30) CHECK(length(`password`) >= 6),
    `role`			ENUM('EMPLOYEE', 'ADMIN'),
    expInYear		INT,
    proSkill		NVARCHAR(30)
);

INSERT	INTO		`user`	(	id	,	fullName			,	 email				,	`password`		,	`role`			,	expInYear		, proSkill	)
VALUE						(	'1' ,	'Tran Duc Luan'		, 'luantd@gmail.com'	,	'Luan123'		,	'ADMIN'			, 	10				,	null	),
							(	'2' ,	'Nguyen Van Chung'	, 'chungnv@gmail.com'	,	'ChungNV99'		,	'EMPLOYEE'		, 	null			,	'Dev'	),
                            (	'3' ,	'Tran Thi Mai'		, 'maitt@gmail.com'		,	'MaiTran99'		,	'EMPLOYEE'		, 	null			,	'Test'	),
                            (	'4' ,	'Tran Ngoc Tung'	, 'tungtn@gmail.com'	,	'TungTran123'	,	'EMPLOYEE'		, 	null			,	'HR'	),
                            (	'5' ,	'Mai Van Tai'		, 'taimv@gmail.com'		,	'No123456'		,	'EMPLOYEE'		, 	null			,	'BA'	),
                            (	'6' ,	'Ha Thi Thu Uyen'	, 'uyenhtt@gmail.com'	,	'Uyen99'		,	'EMPLOYEE'		, 	null			,	'BM'	);
                            
SELECT 	* FROM `user`;

INSERT	INTO		`user`	(	fullName			,	 email				,	`password`		,	`role`			,	expInYear		,	proSkill	) 
VALUE						(	'Mi Van Lu'			, 	'milu@gmail.com'	, 	'Milu123'		, 	'EMPLOYEE'		, 	null			,	'Dev'		);	