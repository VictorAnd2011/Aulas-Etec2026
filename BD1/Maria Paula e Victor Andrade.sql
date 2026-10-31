/*Nomes: Victor Andrade e Maria Paula Teixeira de Castro
Turma: 1GT
Correção da prova de Banco de Dados 3° bimestre*/

create database biblioteca;
use biblioteca;

create table livros(
id int auto_increment primary key,
titulo varchar(100) not null,
autor varchar(100) not null,
ano_lancamento int,
preco decimal(5,2)
);

insert into livros(titulo, autor, ano_lancamento, preco)values
('Redes de Computadores', 'Andrew S. Tanenbaum', 2011, 99.90),
('MySQL para Iniciantes', 'Carlos Silva', 2014, 49.50),
('Segurança em Redes', 'Ana Paula', 2012, 75.00),
('Algoritmos e Lógica', 'J. Smith', 2010, 60.00);

-- 1)
select
titulo,
autor
from livros;

-- 2)
select
titulo,
ano_lancamento as 'Ano de Lançamento'
from livros
where ano_lancamento in (2011,2012);

-- 3)
select
titulo,
autor
from livros
where titulo like '%Redes%';

-- 4)
select
titulo,
autor,
preco as 'Preço'
from livros
order by preco desc
limit 1;

-- 5)
select
count(titulo) as 'Quantidade de livros depois de 2011'
from livros
where ano_lancamento > 2011;

-- 6)
select
titulo,
autor
from livros
where autor like '%Tanenbaum%';

-- 7)
select
titulo,
autor
from livros
where titulo like '%a';

-- 8)
select
max(preco) as 'Preço Máximo',
min(preco) as 'Preço Mínimo'
from livros;

-- 9)
select
count(titulo) as 'Quantidade de livros mais caros que 60,00'
from livros
where preco > 60.00;

-- 10)
select
sum(preco) 'Soma total dos preços'
from livros;

-- 11)
select
titulo,
ano_lancamento as 'Ano de lançamento',
count(ano_lancamento) as 'Quantidade de livros no ano'
from livros
group by ano_lancamento;

-- 12)
select
autor,
sum(preco) as 'Soma do preço dos livros'
from livros
group by autor;

-- 13)
select
titulo,
ano_lancamento as "Ano de lançamento"
from livros
where ano_lancamento < 2012;

-- 14)
select
titulo,
ano_lancamento as "Ano de lançamento",
preco as "preço"
from livros
where ano_lancamento >= 2014 and preco < 100.00;

-- 15)
select
titulo,
autor
from livros
where autor in ('Ana Paula', 'Carlos Silva');

-- 16)
select
titulo,
preco
from livros
where preco <= 100.00 and preco >=50.00;

-- 17)
select
titulo,
ano_lancamento as "Ano de lançamento"
from livros
where ano_lancamento in ('2009', '2010','2020');

-- 18)
select
titulo,
autor
from livros
where not autor ='J. Smith';