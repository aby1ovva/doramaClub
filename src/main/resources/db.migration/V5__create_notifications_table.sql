CREATE TABLE IF NOT EXISTS Notifications (
        id SERIAL PRIMARY KEY,
        user_id INT,
        message TEXT,
        FOREIGN KEY (user_id) REFERENCES Users(id)
    );
