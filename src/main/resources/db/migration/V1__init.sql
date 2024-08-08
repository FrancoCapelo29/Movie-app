CREATE TABLE TEAM (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    country VARCHAR(100) NOT NULL
);
CREATE TABLE PLAYER (
    id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    position VARCHAR(50) NOT NULL,
    team_id INT,
    CONSTRAINT fk_team
    FOREIGN KEY(team_id)
    REFERENCES TEAM(id)
);
CREATE TABLE ROLE (
    id SERIAL PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);
CREATE TABLE "USER" (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL
);
CREATE TABLE user_roles (
    user_id INT,
    role_id INT,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES "USER"(id),
    FOREIGN KEY (role_id) REFERENCES ROLE(id)
);
