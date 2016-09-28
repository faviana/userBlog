/**
 * Created by favianalopez on 9/27/16.
 */
public class H2CreateStatemets {

   /*
   CREATE TABLE IF NOT EXIST user
   (
	use_id IDENTITY,
	use_name VARCHAR(255),
	use_lastName VARCHAR(255),
	use_email VARCHAR,
	use_password VARCHAR,
	use_login VARCHAR,
	PRIMARY KEY (use_id)
);

CREATE TABLE IF NOT EXIST blog
(
	blo_id INT,
	blo_title VARCHAR,
	blo_date VARCHAR,
	blo_use_login VARCHAR,
	PRIMARY KEY (blo_id)
);

CREATE TABLE IF NOT EXIST entry
(
	ent_id INT,
	ent_title VARCHAR,
	ent_text VARCHAR,
	ent_date VARCHAR,
	ent_blo_id VARCHAR,
	PRIMARY KEY (ent_id)
);

ALTER TABLE blog ADD CONSTRAINT blog_fk0 FOREIGN KEY (blo_use_login) REFERENCES user(use_id);

ALTER TABLE entry ADD CONSTRAINT entry_fk0 FOREIGN KEY (ent_blo_id) REFERENCES blog(blo_id);

    */

}


