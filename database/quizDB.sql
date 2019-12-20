CREATE DATABASE Quiz CHARACTER SET utf8 COLLATE utf8_general_ci;
USE Quiz;

CREATE TABLE svar(
	id INT(12) AUTO_INCREMENT PRIMARY KEY,
    tekst VARCHAR(100) NOT NULL,
    spoergsmaalId INT(11)
);

CREATE TABLE spoergsmaal(
	id INT(11) AUTO_INCREMENT PRIMARY KEY,
    tekst VARCHAR(100) NOT NULL,
    `value` INT(4),
    rigtigSvarId INT(12)
);

insert into svar(tekst,spoergsmaalid) VALUES("0",1);
insert into svar(tekst,spoergsmaalid) VALUES("1",1);
insert into svar(tekst,spoergsmaalid) VALUES("2",1);
insert into svar(tekst,spoergsmaalid) VALUES("3",1);

insert into svar(tekst,spoergsmaalid) VALUES("2",2);
insert into svar(tekst,spoergsmaalid) VALUES("4",2);
insert into svar(tekst,spoergsmaalid) VALUES("6",2);
insert into svar(tekst,spoergsmaalid) VALUES("8",2);

insert into svar(tekst,spoergsmaalid) VALUES("Rydon",3);
insert into svar(tekst,spoergsmaalid) VALUES("Pikachu",3);
insert into svar(tekst,spoergsmaalid) VALUES("Bulbasaur",3);
insert into svar(tekst,spoergsmaalid) VALUES("Mew",3);

insert into spoergsmaal(tekst,`value`,rigtigSvarId) VALUES("Hvor mange typer kan en Pokémon max have?",1,3);
insert into spoergsmaal(tekst,`value`,rigtigSvarId) VALUES("Hvor mange forskelige angreb kan en Pokémon max have?",1,6);
insert into spoergsmaal(tekst,`value`,rigtigSvarId) VALUES("Hvilken pokémon var den første der blev skabt",1,9);