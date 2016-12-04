/*
DROP TABLE venda;
DROP TABLE cliente;
DROP TABLE usuario;
DROP TABLE imovel;
DROP TABLE uf;
DROP TABLE forma_pagamento;
*/

CREATE TABLE uf(
  codigo_uf CHAR(2)     NOT NULL,
  nome      VARCHAR(40) NOT NULL,
  CONSTRAINT pk_uf
    PRIMARY KEY(codigo_uf)
);

CREATE TABLE cliente(
  nome    VARCHAR(40) NOT NULL,
  cpf     CHAR(11)    NOT NULL,
  email   VARCHAR(30) NOT NULL,
  rua     VARCHAR(50) NOT NULL,
  numero  INTEGER     NOT NULL,
  cep     CHAR(8)     NOT NULL,
  bairro  VARCHAR(50) NOT NULL,
  uf      CHAR(2)     NOT NULL,
  CONSTRAINT pk_cliente
    PRIMARY KEY(cpf),
  CONSTRAINT fk_cliente_uf
    FOREIGN KEY(uf)
    REFERENCES uf(codigo_uf)
);

CREATE TABLE forma_pagamento(
  id    SERIAL      NOT NULL,
  tipo  VARCHAR(20) NOT NULL,
  CONSTRAINT pk_forma_pagamento
    PRIMARY KEY(id)
);

CREATE TABLE usuario(
  id      SERIAL      NOT NULL,
  nome    VARCHAR(40) NOT NULL,
  email   VARCHAR(30) NOT NULL,
  senha   VARCHAR(40) NOT NULL,
  acesso  VARCHAR(5)  NOT NULL,
  cpf     CHAR(11)    NOT NULL,
  cargo   VARCHAR(40) NOT NULL,
  CONSTRAINT pk_usuario
    PRIMARY KEY(id),
  CONSTRAINT ck_acesso
    CHECK (acesso = 'admin' OR acesso = 'user')
);

CREATE TABLE imovel(
  id          SERIAL         NOT NULL,
  nome        VARCHAR(40)    NOT NULL,
  metros_quad VARCHAR(10)    NOT NULL,
  preco       VARCHAR(20)    NOT NULL,
  descricao   TEXT           NOT NULL,
  rua         VARCHAR(50)    NOT NULL,
  numero      INTEGER        NOT NULL,
  cep         CHAR(8)        NOT NULL,
  bairro      VARCHAR(50)    NOT NULL,
  uf          CHAR(2)        NOT NULL,
  CONSTRAINT pk_imovel
    PRIMARY KEY(id),
  CONSTRAINT fk_imovel_uf
    FOREIGN KEY(uf)
    REFERENCES uf(codigo_uf)
);

CREATE TABLE venda(
  id              SERIAL   NOT NULL,
  cliente         CHAR(11) NOT NULL,
  forma_pagamento INTEGER  NOT NULL,
  usuario         INTEGER  NOT NULL,
  imovel          INTEGER  NOT NULL,
  parcelas        INTEGER  NOT NULL,
  CONSTRAINT pk_venda
    PRIMARY KEY(id),
  CONSTRAINT fk_venda_cliente
    FOREIGN KEY(cliente)
    REFERENCES cliente(cpf),
  CONSTRAINT fk_venda_forma_pagamento
    FOREIGN KEY(forma_pagamento)
    REFERENCES forma_pagamento(id),
  CONSTRAINT fk_venda_usuario
    FOREIGN KEY(usuario)
    REFERENCES usuario(id),
  CONSTRAINT fk_venda_imovel
    FOREIGN KEY(imovel)
    REFERENCES imovel(id)
);
