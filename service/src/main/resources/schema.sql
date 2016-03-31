DROP TABLE IF EXISTS Album;
DROP TABLE IF EXISTS Contact;
DROP TABLE IF EXISTS Contact_Friendship;
DROP TABLE IF EXISTS Contact_Hobby;
DROP TABLE IF EXISTS Contact_Place;
DROP TABLE IF EXISTS Hobby;
DROP TABLE IF EXISTS LikePhoto;
DROP TABLE IF EXISTS LikePost;
DROP TABLE IF EXISTS Message;
DROP TABLE IF EXISTS Photo;
DROP TABLE IF EXISTS Place;
DROP TABLE IF EXISTS Post;

CREATE TABLE `Album` (
  `Album_id` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) DEFAULT NULL,
  `Contact_id` int(11) NOT NULL,
  PRIMARY KEY (`Album_id`),
  KEY `fk_Album_1_idx` (`Contact_id`),
  CONSTRAINT `fk_Album_1` FOREIGN KEY (`Contact_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `Contact` (
  `Contact_id` int(11) NOT NULL AUTO_INCREMENT,
  `Login` varchar(45) DEFAULT NULL,
  `Password` varchar(45) DEFAULT NULL,
  `First_Name` varchar(45) DEFAULT NULL,
  `Last_Name` varchar(45) DEFAULT NULL,
  `Birth_Date` date DEFAULT NULL,
  PRIMARY KEY (`Contact_id`)
);

CREATE TABLE `Contact_Friendship` (
  `Contact_id` int(11) NOT NULL,
  `Friend_id` int(11) NOT NULL,
  KEY `fk_Contact_Friendship_1_idx` (`Contact_id`),
  KEY `fk_Contact_Friendship_2_idx` (`Friend_id`),
  CONSTRAINT `fk_Contact_Friendship_1` FOREIGN KEY (`Contact_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Contact_Friendship_2` FOREIGN KEY (`Friend_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `Contact_Hobby` (
  `Contact_id` int(11) NOT NULL,
  `Hobby_id` int(11) NOT NULL,
  KEY `fk_Contact_Hobby_1_idx` (`Contact_id`),
  KEY `fk_Contact_Hobby_2_idx` (`Hobby_id`),
  CONSTRAINT `fk_Contact_Hobby_1` FOREIGN KEY (`Contact_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Contact_Hobby_2` FOREIGN KEY (`Hobby_id`) REFERENCES `Hobby` (`Hobby_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `Contact_Place` (
  `Contact_id` int(11) NOT NULL,
  `Place_id` int(11) NOT NULL,
  KEY `fk_Contact_Place_1_idx` (`Contact_id`),
  KEY `fk_Contact_Place_2_idx` (`Place_id`),
  CONSTRAINT `fk_Contact_Place_1` FOREIGN KEY (`Contact_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Contact_Place_2` FOREIGN KEY (`Place_id`) REFERENCES `Place` (`Place_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `Hobby` (
  `Hobby_id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) NOT NULL,
  `Description` varchar(45) NOT NULL,
  PRIMARY KEY (`Hobby_id`)
);

CREATE TABLE `LikePhoto` (
  `LikePhoto_id` int(11) NOT NULL AUTO_INCREMENT,
  `Photo_id` int(11) NOT NULL,
  PRIMARY KEY (`LikePhoto_id`),
  KEY `fk_LikePhoto_1_idx` (`Photo_id`),
  CONSTRAINT `fk_LikePhoto_1` FOREIGN KEY (`Photo_id`) REFERENCES `Photo` (`Photo_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `LikePost` (
  `LikePost_id` int(11) NOT NULL AUTO_INCREMENT,
  `Post_id` int(11) NOT NULL,
  PRIMARY KEY (`LikePost_id`),
  KEY `fk_LikePost_1_idx` (`Post_id`),
  CONSTRAINT `fk_LikePost_1` FOREIGN KEY (`Post_id`) REFERENCES `Post` (`Post_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `Message` (
  `Message_id` int(11) NOT NULL AUTO_INCREMENT,
  `Message_Time` timestamp(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
  `Contact_From_id` int(11) NOT NULL,
  `Contact_To_id` int(11) NOT NULL,
  `Content` varchar(99) NOT NULL,
  PRIMARY KEY (`Message_id`)
);

CREATE TABLE `Photo` (
  `Photo_id` int(11) NOT NULL AUTO_INCREMENT,
  `Img` varchar(45) DEFAULT NULL,
  `Contact_id` int(11) NOT NULL,
  `Album_id` int(11) NOT NULL,
  PRIMARY KEY (`Photo_id`),
  KEY `fk_Photo_2_idx` (`Album_id`),
  KEY `fk_Photo_1_idx` (`Contact_id`),
  CONSTRAINT `fk_Photo_1` FOREIGN KEY (`Contact_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_Photo_2` FOREIGN KEY (`Album_id`) REFERENCES `Album` (`Album_id`) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE `Place` (
  `Place_id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) DEFAULT NULL,
  `Longitude` double DEFAULT NULL,
  `Latitude` double DEFAULT NULL,
  `Description` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Place_id`)
);

CREATE TABLE `Post` (
  `Post_id` int(11) NOT NULL AUTO_INCREMENT,
  `Title` varchar(45) NOT NULL,
  `Content` varchar(45) NOT NULL,
  `Date_Post` timestamp(6) NULL DEFAULT NULL,
  `Contact_id` int(11) NOT NULL,
  PRIMARY KEY (`Post_id`),
  KEY `fk_Post_1_idx` (`Contact_id`),
  CONSTRAINT `fk_Post_1` FOREIGN KEY (`Contact_id`) REFERENCES `Contact` (`Contact_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
);
