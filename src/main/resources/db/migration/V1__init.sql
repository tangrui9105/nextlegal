CREATE TABLE user (
  id bigint NOT NULL AUTO_INCREMENT,
	email varchar(255) not null,
	password_hash varchar(255) not null,
	role varchar(255) not null,
  PRIMARY KEY (id)
);

INSERT INTO user (email, password_hash, role)
VALUES ('demo@localhost', '$2a$10$ebyC4Z5WtCXXc.HGDc1Yoe6CLFzcntFmfse6/pTj7CeDY5I05w16C', 'ADMIN');