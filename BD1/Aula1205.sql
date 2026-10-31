create database CADASTRO
default character set utf8
default collate utf8_general_ci;

use cadastro;

create table pessoas(
id				int				not null			auto_increment,
nome			varchar(30) 	not null,			
nascimento		date,
sexo			enum('M', 'F'),
peso			decimal(5,2),
altura 			decimal(3,2),
nacionalidade 	varchar(20)		default 'BRASIL',
primary key(id)
) default charset = utf8;

describe pessoas;

insert into pessoas
(nome, nascimento, sexo, peso, altura, nacionalidade)
values
('Veronica', '1993-11-23', 'F', '80.8', '1.57', 'BRASIL');

select *from pessoas;

insert into pessoas
(id, nome, nascimento, sexo, peso, altura, nacionalidade)
values
(default,'Cleusa', '1998-11-02', 'F', '83.4', '1.65',default);

insert into pessoas values
(default,'Barbara','2003-09-08','F', '68.4', '1.58', default),
(default,'Mariana','1989-04-16','F', '67.6', '1.67', default),
(default,'Omar', '1990-12-25','M','59.9', '2.10', default); 


alter table pessoas
add column profissao varchar(10);

alter table pessoas
drop column profissao;