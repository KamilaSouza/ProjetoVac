INSERT INTO VACINA(nome) VALUES('BCG');
INSERT INTO VACINA(nome) VALUES('HPV');
INSERT INTO VACINA(nome) VALUES('Influenza (Gripe)');

INSERT INTO USUARIO(nome, email, cpf, datanascimento) VALUES ('Teste01', 'teste01@teste01.com','37683046043', '01/01/2000');
INSERT INTO USUARIO(nome, email, cpf, datanascimento) VALUES ('Teste02', 'teste02@teste02.com','03758111099', '01/01/2000');

INSERT INTO APLICACAO(vacina_id, datavacina, usuario_id) VALUES(1, '01/03/2021', 1);