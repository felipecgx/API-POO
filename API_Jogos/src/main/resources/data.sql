/*Quando executa o programa, ele procura este db.sql e executa ele dentro do banco de dados*/
/*não precisa criar database pois ela já cria sozinho*/

CREATE TABLE IF NOT EXISTS Users(
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Name VARCHAR (255) NOT NULL,
    Email VARCHAR (255) NOT NULL,
    Password VARCHAR (255) NOT NULL
);

CREATE TABLE IF NOT EXISTS Games(
    ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    Name VARCHAR (255) NOT NULL,
    ReleaseDate DATE NOT NULL,
    Description VARCHAR (255),
    Developer VARCHAR (255) NOT NULL,
    Score INT NOT NULL,
    Price INT NOT NULL,
    Requirements VARCHAR (255),
    Genre VARCHAR (255) NOT NULL ,
    Dlc VARCHAR (255),/*à mudar*/
    Rating INT NOT NULL
);

/*Para ver como ficou a tabela no banco de dados é só ir em View->Tool Windows->Database (no IntelliJ)*/
/*Fazer download dos drives quando for adicionar a db quando for ver a db no View->Tool Windows->Database */