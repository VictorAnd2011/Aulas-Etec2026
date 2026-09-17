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

alter table pessoas
add column profissao varchar(10) after nome;

alter table pessoas
add column codigo int first;

insert into pessoas values
(234, default, 'Juselina', 'analytic', '2003-06-24','F','54.09','1.60',default);

alter table pessoas
modify column profissao varchar(20);



alter table pessoas
change column profissao prof varchar(20);

alter table pessoas
rename to teste;

select * from teste;

create table if not exists cursos(
nome 		varchar(30) 			not null unique,
descricao 	text,
carga 		int unsigned,
totalaulas 	int unsigned,
ano			year 					default '2022'
) default charset = utf8;

desc cursos;

alter table cursos
add column idcurso int first;

alter table cursos
add primary key (idcurso);

insert into cursos values
('1','HTML5','Curso de HTML5','40','37','2014'),
('2','Algoritmos','Lógica de programação','20','15','2010'),
('3','Photoshop','Dicas de Photoshop','10','8','2018'),
('4','PGP','PHP para iniciantes','40','20','2019'),
('5','Jarva','Introdução na linguagem Java','10','29','2020'),
('6','MYSQL','Banco de Dados MySql','30','15','2010'),
('7','Word','Curso completo de Word','40','30','2018'),
('8','Sapateado','Danças Rítmicas','40','30','2014'),
('9','Cozinha Árabe','Aprenda a fazer kibe','40','39','2018'),
('10','Youtuber','Gerar polêmica e ganhar inscritos','40','37','2014');

select *from cursos;

update cursos
set nome = 'HTML6'
where idcurso = '1';

update cursos
set nome = 'PHP', ano = '2015'
where idcurso = '4';

update cursos
set nome = 'JAVA', carga = '40', ano = '2015'
where idcurso = '5'
limit 1;

update cursos
set ano = '2050', carga = '800'
where ano = '2018';

select *from cursos;

update cursos
set ano = '2018', carga = '0'
where ano = '2050'
limit 1;

delete from cursos
where idcurso = '8';

delete from cursos
where ano = '2050';

delete from cursos
where ano = '2050'
limit 2;

truncate table cursos;

select * from cursos;