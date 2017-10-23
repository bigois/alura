create table funcionarios (
id number(11) not null primary key,
nome varchar2(20),
salario number(10,2),
pct_comissao number(10,2),
setor_id number(11)
);


insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (1,'Felipe',3000,0.1,1);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (2,'Davi',2200,0.1,2);
insert into funcionarios (id,nome,salario,setor_id) values (3,'Gustavo',2200,3);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (4,'Dorval',1800,0.1,2);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (5,'Tereza',2600,0.1,1);
insert into funcionarios (id,nome,salario,setor_id) values (6,'Kunika',6200,1);
insert into funcionarios (id,nome,salario,setor_id) values (7,'Joselir',5300,2);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (8,'Joseane',2000,0.1,2);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (9,'Isabel',1500,0.1,1);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (10,'Alexandre',2400,0.1,3);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (11,'Jennifer',2100,0.1,3);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (12,'Hilda',2200,0.1,2);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (13,'Joselita',3450,0.1,3);
insert into funcionarios (id,nome,salario,pct_comissao,setor_id) values (14,'Edson',4200,0.1,1);
