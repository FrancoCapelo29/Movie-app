CREATE TABLE IF NOT EXISTS movies (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    time_movies VARCHAR(50),
    director VARCHAR(50)
    );

CREATE TABLE IF NOT EXISTS scenes (
    id SERIAL PRIMARY KEY,
    name_scene VARCHAR(255),
    budget INT,
    minutes INT,
    movie_id INT,
    FOREIGN KEY (movie_id) REFERENCES movies(id) ON DELETE CASCADE
    );

CREATE TABLE IF NOT EXISTS characters (
    id SERIAL PRIMARY KEY,
    name_character VARCHAR(100) NOT NULL,
    cost INT,
    actor VARCHAR(100),
    scene_id INT,
    FOREIGN KEY (scene_id) REFERENCES scenes(id) ON DELETE CASCADE
    );
CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    username VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100)NOT NULL
    );
