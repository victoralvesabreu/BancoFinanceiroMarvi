DELETE FROM uf;
DELETE FROM forma_pagamento;
DELETE FROM usuario;
DELETE FROM cliente;
DELETE FROM imovel;
DELETE FROM venda;

INSERT INTO forma_pagamento(tipo) VALUES ('Dinheiro');
INSERT INTO forma_pagamento(tipo) VALUES ('Cartão de Credito');
INSERT INTO forma_pagamento(tipo) VALUES ('Crediario');

/*
 Cadastro do Administrador
 */
INSERT INTO usuario(nome, email, senha, acesso, cpf, cargo) VALUES ('admin', 'admin@marvi.edu.br', MD5('123456'), 'admin', '00000000000', 'Administrador');

/*
Cadastro Uf's
 */
INSERT INTO uf (codigo_uf, nome) VALUES ('AC', 'Acre');
INSERT INTO uf (codigo_uf, nome) VALUES ('AL', 'Alagoas');
INSERT INTO uf (codigo_uf, nome) VALUES ('AP', 'Amapá');
INSERT INTO uf (codigo_uf, nome) VALUES ('AM', 'Amazonas');
INSERT INTO uf (codigo_uf, nome) VALUES ('BA', 'Bahia');
INSERT INTO uf (codigo_uf, nome) VALUES ('CE', 'Ceará');
INSERT INTO uf (codigo_uf, nome) VALUES ('DF', 'Distrito Federal');
INSERT INTO uf (codigo_uf, nome) VALUES ('ES', 'Espírito Santo');
INSERT INTO uf (codigo_uf, nome) VALUES ('GO', 'Goiás');
INSERT INTO uf (codigo_uf, nome) VALUES ('MA', 'Maranhão');
INSERT INTO uf (codigo_uf, nome) VALUES ('MT', 'Mato Grosso');
INSERT INTO uf (codigo_uf, nome) VALUES ('MS', 'Mato Grosso do Sul');
INSERT INTO uf (codigo_uf, nome) VALUES ('MG', 'Minas Gerais');
INSERT INTO uf (codigo_uf, nome) VALUES ('PA', 'Pará');
INSERT INTO uf (codigo_uf, nome) VALUES ('PB', 'Paraíba');
INSERT INTO uf (codigo_uf, nome) VALUES ('PR', 'Paraná');
INSERT INTO uf (codigo_uf, nome) VALUES ('PE', 'Pernambuco');
INSERT INTO uf (codigo_uf, nome) VALUES ('PI', 'Piauí');
INSERT INTO uf (codigo_uf, nome) VALUES ('RJ', 'Rio de Janeiro');
INSERT INTO uf (codigo_uf, nome) VALUES ('RN', 'Rio Grande do Norte');
INSERT INTO uf (codigo_uf, nome) VALUES ('RS', 'Rio Grande do Sul');
INSERT INTO uf (codigo_uf, nome) VALUES ('RO', 'Rondônia');
INSERT INTO uf (codigo_uf, nome) VALUES ('RR', 'Roraima');
INSERT INTO uf (codigo_uf, nome) VALUES ('SC', 'Santa Catarina');
INSERT INTO uf (codigo_uf, nome) VALUES ('SP', 'São Paulo');
INSERT INTO uf (codigo_uf, nome) VALUES ('SE', 'Sergipe');
INSERT INTO uf (codigo_uf, nome) VALUES ('TO', 'Tocantins');
