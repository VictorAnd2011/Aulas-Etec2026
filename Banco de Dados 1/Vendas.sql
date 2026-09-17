CREATE DATABASE vendas;
USE vendas;

#Criando a tabela Produto
CREATE TABLE Produto
(
	Codigo_Produto INTEGER,
    Descricao_Produto varchar(30),
    Preco_Produto float
);

#Criando a tabela Nota_Fiscal
CREATE TABLE Nota_Fiscal
(
	Numero_NF INTEGER,
    Data_NF DATE,
    Valor_NF FLOAT
);

#Criando a tabela Itens
CREATE TABLE Itens
(
	Produto_Codigo_Produto INTEGER,
    Nota_Fiscal_Numero_NF INTEGER,
    Num_Item INTEGER,
    Qtde_Item INTEGER
);

#Alterar o campo Descricao_Produto da tabela Produto para o tipo VARCHAR(50)
ALTER TABLE Produto MODIFY COLUMN Descricao_Produto VARCHAR(50);
DESCRIBE Produto;

#Alterar a tabela Nota_Fiscal, adicionando o campo ICMS, do tipo FLOAT depois do campo Numero_NF
ALTER TABLE Nota_Fiscal
ADD COLUMN ICMS FLOAT AFTER Numero_NF;
DESCRIBE Nota_Fiscal;

#Alterar a tabela Produto, adicionando o campo Peso, do tipo FLOAT
ALTER TABLE Produto
ADD COLUMN Peso FLOAT;
DESCRIBE Produto;

create table duplicata (
nome char(40),
numero integer not null primary key,
valor decimal(10,2),
vencimento date,
banco char(10)
);

DESCRIBE duplicata;

insert into duplicata(nome, numero, valor, vencimento, banco)
values('abc papelaria', 100100, 5000.00, '2017/01/20','itau');
insert into duplicata(nome, numero, valor, vencimento, banco)
values('livraria fernandes', 100110, 2500.00, '2017/01/22','itau');
insert into duplicata(nome, numero, valor, vencimento, banco)
values('livraria fernandes', 100120, 1500.00, '2016/10/15','bradesco');
insert into duplicata(nome, numero, valor, vencimento, banco)
values('abc papelaria', 100130, 8000.00, '2016/10/15','santander');

select *from duplicata;

alter table duplicata modify column banco varchar(40);
describe duplicata;

insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('ler e saber', 200120, 10500.00, '2018/04/26', 'banco do brasil');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('ler e cia', 200125, 2000.00, '2018/04/26', 'banco do brasil');

select *from duplicata;

update duplicata
set Nome = 'livros e cia'
where Numero = 200125;

insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('ler e saber', 200130, 11000.00, '2018/09/26' , 'itau');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('papelaria silva', 250350, 1500.00, '2018/01/26', 'bradesco');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('livros mn', 250360, 500.00, '2018/12/18', 'santander');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('livros mn', 250370, 3400.00, '2018/04/26', 'santander');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('papelaria silva', 250380, 3500.00, '2018/04/26', 'banco do brasil');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('livros e cia', 453360, 1500.00, '2018/06/15', 'itau');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('livros mn', 453365, 5400.00, '2018/06/15', 'bradesco');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('papelaria silva', 453370, 2350.00, '2017/12/27', 'itau');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('livros e cia', 453380, 1550.00, '2017/12/27', 'banco do brasil');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('abc papelaria', 980130, 4000.00, '2016/12/11', 'itau');
insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('papel e afins', 985502, 2500.00, '2016/03/12', 'itau');

update duplicata
set Numero = 985001
where Numero = 980130;

insert into duplicata(Nome, Numero, Valor, Vencimento, Banco)
values('ler e saber', 888132, 2500.00, '2017/03/05', 'itau');

update duplicata
set banco = 'santander'
where numero = 985502;

delete from duplicata
where Numero = 888132;
delete from duplicata
where Numero = 985001;
delete from duplicata
where Numero = 985502;