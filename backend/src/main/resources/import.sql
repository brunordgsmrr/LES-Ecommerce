INSERT INTO tb_clientes(nome, genero, data_nascimento, cpf, email, password) VALUES('Ana Silva','Feminino','1990-05-15','12345678900','ana.silva@email.com','senha123');
INSERT INTO tb_clientes(nome, genero, data_nascimento, cpf, email, password) VALUES('Carlos Oliveira','Masculino','1985-11-20','98765432199','c.oliveira@email.com','SenhaSegura!1');
INSERT INTO tb_clientes(nome, genero, data_nascimento, cpf, email, password) VALUES('Beatriz Costa','Feminino','1998-03-08','11122233344','beatriz.costa@email.com','bcos-123');
INSERT INTO tb_clientes(nome, genero, data_nascimento, cpf, email, password) VALUES('Roberto Santos','Masculino','1972-09-01','55566677788','r.santos@email.com','password');
INSERT INTO tb_clientes(nome, genero, data_nascimento, cpf, email, password) VALUES('Juliana Lima','Feminino','2001-07-25','44433322211','juh.lima@email.com','meu_senha_forte');

INSERT INTO tb_telefones(cliente_id, ddd, numero, tipo) VALUES(1, '11','987654321','Pessoal');
INSERT INTO tb_telefones(cliente_id, ddd, numero, tipo) VALUES(2, '21','912345678','Pessoal');
INSERT INTO tb_telefones(cliente_id, ddd, numero, tipo) VALUES(3, '31','998765432','Corporativo');
INSERT INTO tb_telefones(cliente_id, ddd, numero, tipo) VALUES(4, '51','954321098','Pessoal');
INSERT INTO tb_telefones(cliente_id, ddd, numero, tipo) VALUES(5, '81','911112222','Corporativo');

INSERT INTO tb_enderecos(cliente_id, tipo_endereco, tipo_residencia, tipo_logradouro, logradouro, numero, bairro, cep, cidade, estado, pais) VALUES(1, 'residencial','Apartamento','Avenida','Brasil','150','Jardim das Flores','10000000','São Paulo','SP','Brasil');
INSERT INTO tb_enderecos(cliente_id, tipo_endereco, tipo_residencia, tipo_logradouro, logradouro, numero, bairro, cep, cidade, estado, pais) VALUES(2, 'residencial','Casa','Rua','das Palmeiras','458','Vila Mariana','20000000','Rio de Janeiro','RJ','Brasil');
INSERT INTO tb_enderecos(cliente_id, tipo_endereco, tipo_residencia, tipo_logradouro, logradouro, numero, bairro, cep, cidade, estado, pais) VALUES(3, 'residencial','Casa','Rua','dos Lírios','200','Centro','30000000','Belo Horizonte','MG','Brasil');
INSERT INTO tb_enderecos(cliente_id, tipo_endereco, tipo_residencia, tipo_logradouro, logradouro, numero, bairro, cep, cidade, estado, pais) VALUES(4, 'residencial','Apartamento','Avenida','Independência','987','Moinhos de Vento','90000000','Porto Alegre','RS','Brasil');
INSERT INTO tb_enderecos(cliente_id, tipo_endereco, tipo_residencia, tipo_logradouro, logradouro, numero, bairro, cep, cidade, estado, pais) VALUES(5, 'residencial','Casa','Rua','da Saudade','54','Boa Viagem','50000000','Recife','PE','Brasil');
