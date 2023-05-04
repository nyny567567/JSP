CREATE TABLE my_user (
			user_id VARCHAR2(30) PRIMARY KEY,
			user_pw VARCHAR2(30) NOT NULL,
			user_name VARCHAR2(20) NOT NULL,
			user_email VARCHAR2(100),
			user_address VARCHAR2(100)
		);
        
        
SELECT * FROM my_user;

commit;