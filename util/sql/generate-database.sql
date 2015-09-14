-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema matelibrary
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema matelibrary
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `matelibrary` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `matelibrary` ;

-- -----------------------------------------------------
-- Table `matelibrary`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `matelibrary`.`users` ;

CREATE TABLE IF NOT EXISTS `matelibrary`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `created` TIMESTAMP NOT NULL,
  `deleted` TINYINT(1) NULL,
  `blocked` TINYINT(1) NULL,
  `modified` DATETIME NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
