INSERT INTO cliente (nome, email,cpf) VALUES ('Jose da Silva','jose@letscode.com','97282579024');
INSERT INTO cliente (nome, email,cpf) VALUES ('Maria Silva','maria@letscode.com','28017377045');
INSERT INTO cliente (nome, email,cpf) VALUES ('Luiz Antonio Souza','luiz@letscode.com','35851528052');
INSERT INTO cliente (nome, email,cpf) VALUES ('Juliana Dias','juliana@letscode.com','34517594033');


INSERT INTO categoria (descricao) VALUES ('Comedia');
INSERT INTO categoria (descricao) VALUES ('Aventura');
INSERT INTO categoria (descricao) VALUES ('Drama');
INSERT INTO categoria (descricao) VALUES ('Terror');

INSERT INTO filme (sinopse,titulo,valor,categoria_descricao) VALUES ('Dois irmãos agentes do FBI, são forçados a escoltar um par de socialites nos Hamptons.','As Branquelas',5.00,1);
INSERT INTO filme (sinopse,titulo,valor,categoria_descricao) VALUES ('O confronto entre Superman e Zod em Metrópolis fez a população mundial se dividir sobre a presença de extraterrestres na Terra.','Batman v Superman',5.00,2);
INSERT INTO filme (sinopse,titulo,valor,categoria_descricao) VALUES ('Durante a Segunda Guerra Mundial, Bruno, um garoto de oito anos, e sua família saem de Berlim para residir próximo a um campo de concentração, onde seu pai acaba de se tornar comandante.','O Menino do Pijama Listrado',5.00,3);
INSERT INTO filme (sinopse,titulo,valor,categoria_descricao) VALUES ('Após roubar 40 mil dólares para se casar com o namorado, uma mulher foge durante uma tempestade e decide passar a noite em um hotel que encontra pelo caminho.','Psicose',5.00,4);


INSERT INTO locacao (data_Inicio_Locacao,data_Fim_Locacao,cliente_id,codigo_filme) VALUES ('12/11/2021','14/11/2021',1,1);
INSERT INTO locacao (data_Inicio_Locacao,data_Fim_Locacao,cliente_id,codigo_filme) VALUES ('13/11/2021','15/11/2021',2,2);
INSERT INTO locacao (data_Inicio_Locacao,data_Fim_Locacao,cliente_id,codigo_filme) VALUES ('14/11/2021','16/11/2021',3,3);
INSERT INTO locacao (data_Inicio_Locacao,data_Fim_Locacao,cliente_id,codigo_filme) VALUES ('15/11/2021','17/11/2021',4,4);

