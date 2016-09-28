/**
 * Created by favianalopez on 9/27/16.
 */
public class H2CreateStatemets {

   /* CREATE TABLE `user` (
	`use_id` INT NOT NULL,
	`use_name` varchar(255) NOT NULL,
	`use_lastName` varchar(255) NOT NULL,
	`use_email` varchar NOT NULL,
	`use_password` varchar NOT NULL,
	`use_login` varchar NOT NULL UNIQUE,
	PRIMARY KEY (`use_id`)
);

CREATE TABLE `blog` (
	`blo_id` INT NOT NULL,
	`blo_title` varchar NOT NULL,
	`blo_date` varchar NOT NULL,
	`blo_use_login` varchar NOT NULL,
	PRIMARY KEY (`blo_id`)
);

CREATE TABLE `entry` (
	`ent_id` INT NOT NULL,
	`ent_title` varchar NOT NULL,
	`ent_text` varchar NOT NULL,
	`ent_date` varchar NOT NULL,
	`ent_blo_id` INT NOT NULL,
	PRIMARY KEY (`ent_id`)
);

ALTER TABLE `blog` ADD CONSTRAINT `blog_fk0` FOREIGN KEY (`blo_use_login`) REFERENCES `user`(`use_id`);

ALTER TABLE `entry` ADD CONSTRAINT `entry_fk0` FOREIGN KEY (`ent_blo_id`) REFERENCES `blog`(`blo_id`);

    */

}


