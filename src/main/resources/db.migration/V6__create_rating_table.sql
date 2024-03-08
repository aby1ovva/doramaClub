CREATE TABLE IF NOT EXISTS Rating (
        id SERIAL PRIMARY KEY,
        user_id INT,
        rating DOUBLE PRECISION,
        FOREIGN KEY (user_id) REFERENCES Users(id)
    );
