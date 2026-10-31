create database vendas;
use vendas;

#criando a tabela produto
create table Produto
(
cod_produto integer,
Descricao_produto varchar(30),
preco_produto float
);

#criando a tabela nota fiscal
create table nota_fiscal
(
numero_NF integer,
data_NF date,
valor_NF float
);

#criando a tabela itens
create table itens
(
produto_cod_produto integer,
nota_fiscal_numero_NF integer,
num_item integer,
Qtde_item integer
);

#alterar o campo descricao_produto da tabela Produto para varchar(50)
alter table Produto modify column Descricao_produto varchar(50);
describe Produto;

#alterar a tabela Nota_fiscal, adicionando o adicionando o campo ICMS, do tipo float depois do campo numero_NF
alter table nota_fiscal add column ICMS float after numero_NF;
describe nota_fiscal;

#alterar a tabela produto, adicionando o campo peso, do tipo float
alter table Produto add column peso float;
describe Produto;