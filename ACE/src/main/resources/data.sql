DROP TABLE IF EXISTS questions;

CREATE TABLE `questions` (
  `q_id` int NOT NULL AUTO_INCREMENT,
  `q_number` int NOT NULL,
  `q_ans` int NOT NULL,
  `q_text` varchar(200) NOT NULL,
  `user_id` int
);


INSERT INTO `questions` (`q_number`, `q_ans`, `q_text`,`user_id`)
 VALUES (1, 2, 'question1', 1);
 
 INSERT INTO `questions` (`q_number`, `q_ans`, `q_text`,`user_id`)
 VALUES (1, 2, 'question2', 1);
 
 INSERT INTO `questions` (`q_number`, `q_ans`, `q_text`,`user_id`)
 VALUES (1, 2, 'question3', 1);

