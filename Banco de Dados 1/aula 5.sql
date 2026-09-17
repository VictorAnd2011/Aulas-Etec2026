create database if not exists Clinica;
use Clinica;

create table ambulatorios(
nroa int primary key,
andar numeric(3) not null,
capacidade smallint
);

describe ambulatorios;

create table medicos(
codm int primary key,
nome varchar(40) not null,
idade smallint not null,
especialidade char(20),
CPF numeric(11) unique,
cidade varchar(30),
foreign key
);