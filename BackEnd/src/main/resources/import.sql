insert into tb_clients (nome, telefone) values ('JJ Comércio ME', '(19) 9999-9999');
insert into tb_clients (nome, telefone) values ('Américo de Campos', '(19) 1234-5678');
insert into tb_clients (nome, telefone) values ('Bueno Brandão', '(19) 9876-5432');

insert into tb_materiais(descricao, largura, valorM2, marca, fornecedor) values ('Adesivo Branco', 127, 35, 'Ritrama', 'Serilon');
insert into tb_materiais(descricao, largura, valorM2, marca, fornecedor) values ('Adesivo Transparente', 150, 35, 'Ritrama', 'Serilon');
insert into tb_materiais(descricao, largura, valorM2, marca, fornecedor) values ('Lona Front', 200, 30, 'Ritrama', 'Serilon');

insert into tb_impressao(id_Cliente, id_Material, comprimento, largura, quantidade, motivo, data) values (1,1,40,40,300,'Adesivo Branco', now());
insert into tb_impressao(id_Cliente, id_Material, comprimento, largura, quantidade, motivo, data) values (2,3,100,1000,1,'Fachada', now());
insert into tb_impressao(id_Cliente, id_Material, comprimento, largura, quantidade, motivo, data) values (3,2,100,100,2,'Adesivo Transparente', now());