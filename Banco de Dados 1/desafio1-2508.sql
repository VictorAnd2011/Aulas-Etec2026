create database biblioteca;
use biblioteca;

create table livros
(
id int auto_increment primary key,
titulo varchar(40) not null,
autor varchar(20) not null,
preco decimal(10,2) not null,
ano int not null,
estoque int 
);

insert into livros value
(default, 'O Hobbit','J.R.R. Tolkien',45.90,1937,12),
(default, '1984','George Orwell', 39.90, 1949,5),
(default, 'Dom Casmurro', 'Machado de Assis', 29.90,1899,0),
(default, 'O Senhor dos Anéis','J.R.R. Tolkien',79.90,1954,8),
(default, 'Capitães da Areia','Jorge Amado',35.00,1937,15),
(default, 'A Revolução dos Bichos', 'George Orwell',25.50,1945,20);

select * from livros;

-- Exercicio 1 --
select
titulo,
autor,
preco
from livros
where preco = 39.90;

-- Exercicio 2 -- 
select
titulo,
autor,
preco
from livros
where preco > 40.00
order by preco;

-- Exercicio 3 --
select
titulo,
autor,
preco
from livros
where autor = "George Orwell";

-- Exercicio 4 --

select
titulo,
autor,
preco
from livros
where autor = "J.R.R. Tolkien" and preco > 50.00
order by preco;

-- Exercicio 5 --

select
titulo,
autor,
preco,
ano
from livros
where ano = 1899 or ano = 1949
order by ano;

-- Exercicio 6 --

select
titulo,
autor,
preco,
estoque
from livros
where estoque = 0;

-- Exercicio 7 --

select
titulo,
autor,
preco
from livros
where preco > 25.00 and preco < 40.00
order by preco;

-- Exercicio 8 --

select
titulo,
autor,
preco
from livros
where titulo like "O%";

-- Exercicio 9 --

select
titulo,
autor,
preco
from livros
where titulo like "%Revolução%";

-- Exercicio 10 --

select
titulo,
autor,
preco
from livros
where autor in("George Orwell","Machado de Assis");

-- Exercicio 11 -- 

select
titulo,
autor,
preco,
estoque
from livros
where not estoque = 0
order by estoque;

-- Exercicio 12 --
select
titulo,
autor,
preco,
estoque
from livros
where autor not like "J%"
order by 2;

-- Exercicio 13 --

select
titulo,
autor,
preco,
ano
from livros
where ano not in(1937,1945,1949);

-- Exercicio 14 --

select
count(titulo) as "Quantidade de livros cadastrados no sistema"
from livros;

-- Exercicio 15 -- 

select
count(titulo) as "Quantidade de livros que custam menos que 40.00"
from livros
where preco < 40.00;

-- Exercicio 16 --

select
sum(estoque) as "Total de livros no estoque"
from livros;

-- Exercicio 17 --


