-- -----------------------------------------------------
-- Table groups
-- -----------------------------------------------------
DROP TABLE IF EXISTS groups ;
go
CREATE  TABLE IF NOT EXISTS groups (
  id BIGINT NOT NULL AUTO_INCREMENT ,
  account VARCHAR(100) NULL ,
  name VARCHAR(45) NULL ,
  create_time TIMESTAMP NULL DEFAULT current_timestamp,
  PRIMARY KEY (id) )
ENGINE = InnoDB
go

-- -----------------------------------------------------
-- Table users_group
-- -----------------------------------------------------
DROP TABLE IF EXISTS users_group ;
go
CREATE  TABLE IF NOT EXISTS users_group (
  id BIGINT NOT NULL AUTO_INCREMENT ,
  id_groups BIGINT NULL ,
  src_account VARCHAR(100) NULL ,
  account VARCHAR(100) NULL ,
  status INT NULL ,
  update_time TIMESTAMP NULL DEFAULT current_timestamp ,
  PRIMARY KEY (id) ,
  INDEX I_GROUP (id_groups ASC) )
ENGINE = InnoDB
go

-- -----------------------------------------------------
-- Table follows
-- -----------------------------------------------------
DROP TABLE IF EXISTS follows ;
go
CREATE  TABLE IF NOT EXISTS follows (
  id BIGINT NOT NULL AUTO_INCREMENT ,
  follow VARCHAR(100) NULL ,
  followed VARCHAR(100) NULL ,
  function VARCHAR(45) NULL ,
  status INT NULL ,
  update_time TIMESTAMP NULL DEFAULT current_timestamp ,
  PRIMARY KEY (id) )
ENGINE = InnoDB
go

