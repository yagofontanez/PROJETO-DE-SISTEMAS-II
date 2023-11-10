CREATE TABLE cliente 
( 
 cli_id INT PRIMARY KEY,  
 cli_nome VARCHAR(40),  
 cli_enderešo VARCHAR(40),  
 cli_saldocontaloja INT,  
); 

CREATE TABLE produtos 
( 
 prod_id INT PRIMARY KEY,  
 prod_nome VARCHAR(40),  
 prod_qtde INT,  
 prod_categoria INT,  
); 

CREATE TABLE categoria 
( 
 cat_id INT PRIMARY KEY,  
 cat_console INT,  
 cat_jogo INT,  
 cat_hardware INT,  
 cat_pešaunica INT,  
 cat_outros INT,  
); 

