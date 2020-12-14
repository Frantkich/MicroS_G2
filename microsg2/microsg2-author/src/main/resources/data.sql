DROP TABLE IF EXISTS author;
 
CREATE TABLE author (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL
);
 
INSERT INTO author (name, password, email) VALUES
  ("Pierre", "psd", "email"),
  ("Louis", "psd", "email");