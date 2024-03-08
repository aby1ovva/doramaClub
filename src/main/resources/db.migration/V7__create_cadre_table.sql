CREATE TABLE IF NOT EXISTS Cadre (
      id SERIAL PRIMARY KEY,
      film_id INT,
      FOREIGN KEY (film_id) REFERENCES Film(id)
    );
