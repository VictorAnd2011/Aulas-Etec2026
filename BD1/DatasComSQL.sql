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


select
date_format(cadastro, '%d/%m/%Y') as 'data_formatada' 
from investidor;

select 
date_format(cadastro, '%d-%m às %H:%i') as 'data_formatada'
from investidor;

/* ID Descrição
%a nome da semana abreviado (Seg a Dom)
%b nome do mês abreviado(Jan a Dez)
%c mês de forma numérica(1 a 12)
%D dia do mês com o sufixo inglês (1st, 2nd, 3rd, ...)
%d dia do mês de forma numérica (01 a 31)
%e dia do mês de forma numérica (1 a 31)
%f micro segundos (000000..999999)
%H horas (00 a 23)
%h horas (01 a 12)
%I horas (01 a 12)
%i minutos de forma numérica (00 a 59)
%j dia do ano (001 a 366)
%k horas (00 a 23)
%l horas (1 a 12)
%M nome do mês (janeiro a dezembro)
%m mês em forma (01  a 12)
%p AM ou PM
%r horas, 12-horas (hh:mm:ss seguidos de AM ou PM)
%S segundos (00 a 59)
%s segundos (00 a 59)
%T horas, 24-horas (hh:mm:ss)
%U semana (00 a 53), onde domingo é o primeiro dia da semana
%u semana(00 a 53), onde segunda é o primeiro dia da semana
%V semana(00 a 53), onde domingo é o primeiro dia da semana; usado com %X %v semana(00 a 53),
onde segunda é o primeiro dia da semana; usado com %x %W nome do dia da semana (segunda a domingo)
%w dia da semana(0=domingo e 6=sabado)
%X dia da semana onde domingo é o primeiro dia da semana, de forma numérica com 4 digitos, usado com %V %x ano da semana, onde esgunda é o primeiro dia da semana
de forma numérica, com 4 dígitos, usado com %v %Y ano numérico com 4 digitos
%y ano numérico com 2 dígitos %% um simples caracter

*/
select* from investidor;

-- funções de data - data atual, extração de dia, mês e ano e diferença entre datas
-- funções mais comuns para trabalharmos com datas no MYSQL

-- curdate() - retorna a data atual no formato aaaa-mm-dd
select curdate();

-- curtime - retorna a hora atual o formato hh:mm:ss
select curtime();

-- now() - retorna data e hora
select now();

-- extrações de informações
-- date_format(D, <formato>) - retorna a data D no formato especificado
-- year(D) - retorna o ano de uma data D

select year('2021-08-01'); -- retorna o ano 2021

select year(curdate()); -- retorna o ano da data atual

select year(curdate()) as ano_atual; -- retorna o ano atual com alias

-- month(D) - retorna o mês de uma data

select month(curdate()) as mes_atual; -- retorna o mesda data atual com alias

-- ou 

select month(current_date) as mes_atual; -- retorna o mes atual com alias

-- day(D) - retorna o dia de uma data

select day(current_timestamp) as dia_atual; 

-- função timestamp traz a data e hora atual
-- weekday(D) - retorna o dia da semana que inicia com segunda-feira para uma data D
select weekday(current_timestamp) as semana_do_ano;

-- week(D) - retorna a semana do ano para a data D
select week(current_timestamp) as semana_do_ano;

-- operações com data

-- datediff - calcula a diferença entre duas datas
select datediff('2022-08-01', '2021-12-25') as 'DATEDIFF'; 
select datediff(current_date, '2010-04-19') as 'DATEDIFF';
select datediff(current_date, '2011-06-09') as 'DATEDIFF';
select datediff('2010-04-19', current_date) as 'DATEDIFF'; -- caso eu coloque uma data menor antes, vai retornar um número negativo

-- timestampdiff - calcula a qtde de dias da quarentena
select timestampdiff(day,'2020-03-20', current_date) as 'DIAS DE QUARENTENA';
select timestampdiff(month,'2020-03-20', current_date) as 'MESES DE QUARENTENA';
select timestampdiff(year,'2020-03-20', current_date) as 'ANOS DE QUARENTENA';
-- calculando a idade da pessoas
select timestampdiff(year,'1968-07-04', current_date) as idade;
select timestampdiff(month,'1968-07-04', current_date) as meses;

-- date_add(data,interval)
-- adiciona a data. a data pode ser uma data seguido por um horário
-- o intervalo a ser somado pode ser em dias, dias e horas e minutos, dias e segundos, minutos e segundos
select date_add('2017-06-15', interval 10 day);
select date_add(current_date, interval 10 day);
-- vamos melhorar essa query
select current_date as hoje, date_add(current_date, interval 10 week) as 'No futuro';

-- DATE_SUB(DATA, INTERVAL)
-- Subtrai um intervalo à data. a data pode ser uma data seguida de um horário.
-- o intervalo a ser subtraído pode ser em dias, dias e horas e minutos, dias e segundos, minutos e segundo
select date_sub('2009-09-22', interval 2 day) as 'DATESUB'; -- subtrai 2 dias da data colocada, dando o dia 20/09/2009
select date_sub(current_date, interval 90 day) as 'DATESUB'; -- calcula 90 dias atrás
select date_sub('2009-09-22', interval 2 month) as 'DATESUB'; -- subrai 2 meses
select date_sub('2009-09-22', interval 2 year) as 'DATESUB'; -- subtrai 2 anos

-- last_day(D) - essa função pega o último dia do mês desta data
select last_day('2020-02-22') as 'Ultimo dia do mês';
-- dá para extrair apenas o dia
select day(last_day('2020-02-22')) as 'Ultimo dia do mês';

-- FUNÇÕES PARA TRABALHAR COM HORA(TEMPO) HH:MM:SS

-- CURTIME() CURRENT_TIME() CURRENT_TIME, CURRENT_TIMESTAMP
-- FUNÇÕES DE EXTRAÇÃO
-- HOUR(), MINUTE() E SECOND()

select hour(current_time) as hora;
select minute(current_time) as minuto;
select second(current_time) as segundo;

-- TIME_FORMAT() - muda o formato da hora