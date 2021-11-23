DROP TABLE IF EXISTS TBL_EMPLOYEES;


CREATE TABLE TBL_USER
(
    id            INT AUTO_INCREMENT PRIMARY KEY,
    user_age      INT         NOT NULL,
    user_cpf      VARCHAR(11) NOT NULL,
    user_email    VARCHAR(45) NOT NULL,
    user_password VARCHAR(45) NOT NULL,
    user_active   BIT         NOT NULL

);

CREATE TABLE TBL_ADRESS
(
    id              INT AUTO_INCREMENT PRIMARY KEY,
    adress_street   VARCHAR(45) NOT NULL,
    adress_number   INT         NOT NULL,
    adress_district VARCHAR(45) NOT NULL,
    adress_state    VARCHAR(45) NOT NULL,
    adress_city     VARCHAR(45) NOT NULL,
    user_id         INT         NOT NULL,
        FOREIGN KEY (user_id) REFERENCES TBL_USER(id)
);

CREATE TABLE TBL_ROOM
(
    id        INT AUTO_INCREMENT PRIMARY KEY,
    gener     VARCHAR(45) NOT NULL,
    height    VARCHAR(45) NOT NULL,
    width     VARCHAR(45) NOT NULL,
    value     VARCHAR(45) NOT NULL,
    adress_id INT         NOT NULL,
    user_id   INT         NOT NULL,
    active    BIT         NOT NULL,
    price     VARCHAR(45) NOT NULL,
        FOREIGN KEY (adress_id) REFERENCES TBL_ADRESS(id),
        FOREIGN KEY (user_id) REFERENCES TBL_ADRESS(user_id)
);





