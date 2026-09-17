create database INVESTCLI;
use INVESTCLI;

create table investidor
(
id_cli 				int 					auto_increment			 	primary key,
nome_cli			varchar(50)			 	not null,
cpf					char(11)				not null,
representante		varchar(50)				null,
cidade				varchar(20),
uf					char(2),
cadastro			date					not null,
val_invest			decimal					not null
);

describe investidor;

insert into investidor values
(default,'Hélio de Almeida','96140432647',null,'São Paulo','SP', STR_TO_DATE('5/10/2005','%d/%m/%Y'),1500000),
(default,'Nícolas Fernandes','86957401892','Eduardo Fonseca','São Paulo','SP', STR_TO_DATE('5/06/2001','%d/%m/%Y'),8700000),
(default,'Natália Fernandes','92101957463','Diego Antunes','Campinas','SP',STR_TO_DATE('12/8/2005','%d/%m/%Y'),650000),
(default,'Rosangela Raquel','203947643',NULL,'Rio de Janeiro','RJ',STR_TO_DATE('30/5/2006','%d/%m/%Y'),2300000),
(default,'Simone Fernandes','62530697892','Marilene de Sá','Rio de Janeiro','RJ',STR_TO_DATE('15/04/2007','%d/%m/%Y'),230500),
(default,'José Brussi','12048374655','Fernanda Paiva','Belo Horizonte','MG',STR_TO_DATE('10/10/2008','%d/%m/%Y'),970550),
(default,'Priscila de Oliveira','22079685743',NULL,'Belo Horizonte','MG',STR_TO_DATE('20/03/2008','%d/%m/%Y'),1200000),
(default,'Paulo de Oliveira','33049586758',NULL,'Sao Paulo','SP',STR_TO_DATE('10/05/2002','%d/%m/%Y'),780000),
(default,'Evany Monteiro','45944832033','Nilmar Farias','São Paulo','SP',STR_TO_DATE('10/03/2004','%d/%m/%Y'),870000),
(default,'Girce de Almeida','00237462857','Emerson Teodóro','Belo Horizonte','MG',STR_TO_DATE('20/11/2006','%d/%m/%Y'),450000),
(default,'Antônio Paiva','58093748559','Luana Castilho','São Paulo','SP',STR_TO_DATE('23/07/2008','%d/%m/%Y'),3150000),
(default,'Marcos Ferreira','22019475869',NULL,'Belo Horizonte','MG',STR_TO_DATE('10/05/2009','%d/%m/%Y'),2100000),
(default,'Paula de Castro','20118574638','Francisco Moreira','Curitiba','PR',STR_TO_DATE('10/05/2002','%d/%m/%Y'),3150000),
(default,'Roberto Rodrigues','10928463787',NULL,'Curitiba','PR',STR_TO_DATE('10/05/2002','%d/%m/%Y'),650000),
(default,'Cibele Campana','64788392876','Gilberto Fonseca','São Paulo','SP',STR_TO_DATE('10/05/2009','%d/%m/%Y'),1100000),
(default,'Anahy de Paulo','99584730295',NULL,'Rio de Janeiro','RJ',STR_TO_DATE('20/12/2007','%d/%m/%Y'),2130000),
(default,'Márcio Diniz','00495827854','Lucas de Amaral','São Paulo','SP',STR_TO_DATE('23/08/2003','%d/%m/%Y'),890000),
(default,'Rubens Fonseca','00194637281',Null,'São Paulo','SP',STR_TO_DATE('22/02/2001','%d/%m/%Y'),370000),
(default,'Débora Porto','33029588290',NULL,'Sâo Paulo','SP',STR_TO_DATE('05/10/2004','%d/%m/%Y'),210000),
(default,'Francisco Júlio','10211954785','Maria Padilha','Curitiba','PR',STR_TO_DATE('17/09/2007','%d/%m/%Y'),240000),
(default,'Carlos Neto','10294772849','Rafael de Paula','São Paulo','SP',STR_TO_DATE('10/05/2006','%d/%m/%Y'),2400000),
(default,'Felipe Morais','19820933748','Leonardo Amoroso','Curitiba','PR',STR_TO_DATE('10/05/2005','%d/%m/%Y'),2400000),
(default,'Ana Cristinia','37728895001',Null,'Rio de Janeiro','RJ',STR_TO_DATE('14/05/2008','%d/%m/%Y'),1240000),
(default,'Gilberto Santana','39487500398',Null,'Campinas','SP',STR_TO_DATE('12/05/2008','%d/%m/%Y'),780000),
(default,'Maria Ataliba','19588694837','Manoel Pio','Porto Alegre','RS',STR_TO_DATE('10/01/2009','%d/%m/%Y'),450000),
(default,'Cláudio Farias','10928823758','Lindomar Ferrucci','Porto Alregre','RS',STR_TO_DATE('12/07/2007','%d/%m/%Y'),300000),
(default,'Silvia Montana','20559116577','Amélia do Santos','Porto Alegre','RS',STR_TO_DATE('10/01/2009','%d/%m/%Y'),180000),
(default,'Adalberto do Santos','10092648091',null,'Curitiba','PR',STR_TO_DATE('10/05/2006','%d/%m/%Y'),770000),
(default,'Rogérios dos Santos Piedade','22013137589',NULL,'Goiânia','GO',STR_TO_DATE('05/05/2005','%d/%m/%Y'),2760000),
(default,'Marcos Oliveira','04938576477','Juliana Moreno','Goiânia','GO',STR_TO_DATE('05/12/2008','%d/%m/%Y'),1650000);

select * from investidor;

select nome_cli, val_invest from investidor;

Select 
nome_cli,
uf,
cidade,
val_invest
from investidor;

Select
nome_cli 		as		Cliente,
uf,
cidade,
val_invest		as 		investimentos
from investidor;

SELECT 
nome_cli as 'Nome do Cliente',
uf,
cidade,
val_invest as investimento
from investidor
order by nome_cli asc;

select 
nome_cli as 'Nome do Cliente',
uf,
cidade,
val_invest as Investimento
from investidor
order by Investimento desc;

select
nome_cli,
uf,
cidade,
val_invest
from investidor
order by 1;

select 
nome_cli,
uf,
cidade,
cadastro,
val_invest
from investidor
order by 4 desc;

select * from investidor order by 1;

select
nome_cli,
uf,
cidade,
cadastro,
val_invest
from investidor
order by uf asc, cidade asc;

select 
nome_cli,
uf,
cidade,
cadastro,
val_invest
from investidor
order by 2 asc, 3 asc;

select
nome_cli,
uf,
cidade,
cadastro,
val_invest
from investidor
limit 10;

select 
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
order by Investimento desc
limit 10;

select
nome_cli as cliente,
uf,
cidade,
cadastro,
val_invest as investimento
from investidor
order by investimento asc
limit 5;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Invsetimento 
from investidor
order by 5 desc
limit 2;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento,
CAST(val_invest * 0.07 as decimal(10,2)) as juros
from investidor
order by 1
limit 4;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where uf = "SP"
order by 1;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where uf = "SP" or uf = "RJ"
order by 1;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where val_invest >= 1500000 and (uf = "SP" or uf = "RJ")
order by 1;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where nome_cli like "A%"
order by 1;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where nome_cli like "%Oliveira"
order by 1;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where nome_cli like "%Santos%"
order by 1;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where nome_cli like "A_A%";

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where cidade like "________"
order by cidade;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
val_invest as Investimento
from investidor
where char_length(cidade)=8;

select * from investidor;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
id_cli,
val_invest as Investimento
from investidor
where char_length(cidade)<=20;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
id_cli,
val_invest as Investimento
from investidor
where uf in("RJ","PR","MG");

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
id_cli,
val_invest as Investimento
from investidor
where uf not in("RJ","SP");

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
id_cli,
representante,
val_invest as Investimento
from investidor
where representante is null;

select
nome_cli as Cliente,
uf,
cidade,
cadastro,
id_cli,
ifnull(representante, '') as representante,
val_invest as Investimento
from investidor;

select
sum(val_invest) as "Total de investimentos"
from investidor;

select 
avg(val_invest) as "Média de investimentos"
from investidor;

select
sum(val_invest) as 'soma dos investimentos'
from investidor
order by 1;

select 
max(val_invest) as "Maior valor de investimentos"
from investidor
order by 1;

select 
count(val_invest) as "Quantidade de investidores"
from investidor;