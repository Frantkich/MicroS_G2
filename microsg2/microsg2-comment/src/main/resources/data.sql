DROP TABLE IF EXISTS comment;
 
CREATE TABLE comment (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  date DATE NOT NULL,
  content TEXT NOT NULL,
  author_id INT NOT NULL,
  article_id INT NOT NULL
);
 
INSERT INTO comment (content, author_id, article_id) VALUES
  ("Lorem ipsum", 1, 1),
  ("Lorem ipsum, lorem ispum", 2, 1);