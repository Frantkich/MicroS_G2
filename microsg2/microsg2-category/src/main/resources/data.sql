DROP TABLE IF EXISTS category;
 
CREATE TABLE category (
  id INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);
 
INSERT INTO category (name) VALUES
  ('category1'),
  ('category2');