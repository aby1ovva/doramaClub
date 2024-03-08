CREATE TABLE IF NOT EXISTS Comments (
      id SERIAL PRIMARY KEY,
      user_id INT,
      comment TEXT,
      FOREIGN KEY (user_id) REFERENCES Users(id)
    );
