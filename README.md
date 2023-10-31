# Spring_Cardapio_Back-End
Back-End de um projeto que estou estudando

# Configurações 
## application.properties

- spring.datasource.url=jdbc:postgresql://"Ip_Do_DB"/"Nome_Tabela"
- spring.datasource.username= "UserName do DB"
- spring.datasource.password="Senha_Do_DB"
- spring.jpa.hibernate.ddl-auto=update
- spring.jpa.show-sql=true

- spring.jpa.properties.hibernate.format_sql=true 


# SQL
## foods
Pela estrutura, ele já criaria a tabela com as colunas e linhas, mas, em todo caso, segue abaixo a estrutura
~~~sql
CREATE TABLE "foods" (
 "id" BIGINT NOT NULL DEFAULT 'nextval(''foods_id_seq''::regclass)',
 "image" VARCHAR(255) NULL DEFAULT NULL,
 "price" INTEGER NULL DEFAULT NULL,
 "title" VARCHAR(255) NULL DEFAULT NULL,
 PRIMARY KEY ("id")
);
~~~
