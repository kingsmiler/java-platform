DROP USER `platform`;
DROP SCHEMA `platform`;

CREATE DATABASE IF NOT EXISTS `platform`
    CHARACTER SET utf8
    COLLATE utf8_general_ci;

CREATE USER 'platform'@'%'
    IDENTIFIED BY 'platform';
