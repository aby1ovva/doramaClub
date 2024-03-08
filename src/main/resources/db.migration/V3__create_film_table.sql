CREATE TABLE IF NOT EXISTS Film (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    production_year INT,
    description TEXT,
    genre_id INT,
    FOREIGN KEY (genre_id) REFERENCES Genre(id)
    );
