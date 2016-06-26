-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema allura
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema allura
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `allura` DEFAULT CHARACTER SET utf8 ;
USE `allura` ;

-- -----------------------------------------------------
-- Table `allura`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `allura`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '		',
  `username` VARCHAR(100) NULL,
  `password` VARCHAR(30) NULL,
  `name` VARCHAR(100) NULL,
  `email` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `allura`.`book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `allura`.`book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `title` VARCHAR(100) NOT NULL,
  `year` YEAR NULL,
  `ISBN` VARCHAR(45) NULL,
  `subjects` TINYBLOB NULL,
  `path_img` VARCHAR(45) NULL,
  `isAvailable` TINYINT(1) NOT NULL DEFAULT 1,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `allura`.`borrowing`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `allura`.`borrowing` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `user_id` INT NOT NULL,
  `book_id` INT NOT NULL,
  `request` DATETIME NOT NULL,
  `renewal` DATETIME NOT NULL,
  `devolution` DATETIME NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_borrowing_user1_idx` (`user_id` ASC),
  INDEX `fk_borrowing_book1_idx` (`book_id` ASC),
  CONSTRAINT `fk_borrowing_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `allura`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_borrowing_book1`
    FOREIGN KEY (`book_id`)
    REFERENCES `allura`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `allura`.`author`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `allura`.`author` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `allura`.`author_book`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `allura`.`author_book` (
  `author_id` INT NOT NULL,
  `book_id` INT NOT NULL,
  PRIMARY KEY (`author_id`, `book_id`),
  INDEX `fk_book_has_author_author1_idx` (`author_id` ASC),
  INDEX `fk_book_has_author_book_idx` (`book_id` ASC),
  CONSTRAINT `fk_book_has_author_book`
    FOREIGN KEY (`book_id`)
    REFERENCES `allura`.`book` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_author_author1`
    FOREIGN KEY (`author_id`)
    REFERENCES `allura`.`author` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
