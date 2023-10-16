DROP TABLE IF EXISTS personne;
CREATE TABLE personne
(
    id            SERIAL PRIMARY KEY,
    nom           varchar(255),
    prenome       varchar(255),
    dateNaissance date,
    telephone     varchar(255)
);
DROP TABLE IF EXISTS client;
CREATE TABLE client
(
    code     varchar(255) not null unique,
    adresse  varchar(255)
)  INHERITS (personne) ;
DROP TABLE IF EXISTS employe;
CREATE TABLE employe
(
    matricule       varchar(255) not null unique,
    dateRecrutement date         not null,
    email           varchar(255)
) INHERITS (personne) ;

CREATE TABLE IF NOT EXISTS Agence (
                                      code VARCHAR(255) PRIMARY KEY,
                                      nom VARCHAR(255),
                                      adresse VARCHAR(255),
                                      numero VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS Credit (
                                      numero SERIAL PRIMARY KEY,
                                      client VARCHAR(255),
                                      agence VARCHAR(255),
                                      date VARCHAR(255),
                                      DOUBLE VARCHAR(255),
                                      montant double precision,
                                      duree double precision,
                                      remarques VARCHAR(255)
);
