DROP TABLE IF EXISTS client;

CREATE TABLE client (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  date DATE NOT NULL,
  content TEXT NOT NULL,
  author_id INT NOT NULL,
  category_id INT NOT NULL
);

INSERT INTO client (title, content, author_id, category_id) VALUES
  ('Title1', "Lorem ipsum", 1, 1),
  ('Title2', "Lorem ipsum, lorem ispum", 2, 1);