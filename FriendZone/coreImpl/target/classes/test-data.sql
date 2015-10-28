insert into contact (id, first_name, last_name, birth_date) values (1, 'Elena', 'Bruyako', '1990-08-02');
insert into contact (id, first_name, last_name, birth_date) values (2, 'Anton', 'Valiuh', '1987-05-11');
insert into contact (id, first_name, last_name, birth_date) values (3, 'Inna', 'Bruyako', '1987-02-23');
insert into contact (id, first_name, last_name, birth_date) values (4, 'Eugene', 'Trostian', '1987-01-06');

insert into hobby (id, title, description) values (1,'Photo', 'Take a photo nature');
insert into hobby (id, title, description) values (2,'Science', 'Space and history');
insert into hobby (id, title, description) values (3,'Creation', 'Dancer');
insert into hobby (id, title, description) values (4,'Science', 'Programming');

insert into place (id, title, description, longitude, latitude) values (1,'Tbilisi', 'Sightseeing', 44.833680, 41.694110);
insert into place (id, title, description, longitude, latitude) values (2, 'Wien', 'Traveling', 16.372080, 48.208490);
insert into place (id, title, description, longitude, latitude) values (3, 'Kiev', 'Relaxing', 30.523800, 50.454660);
insert into place (id, title, description, longitude, latitude) values (4, 'Dnepropetrovsk', 'Working', 34.983330, 48.450000);

insert into post (id, title, content, date_post) values (1,'Life', 'Do not worry, be happy', '2015-05-24');
insert into post (id, title, content, date_post) values (2, 'Sport', 'We are the champion', '2014-03-08');
insert into post (id, title, content, date_post) values (3, 'Music', 'Respect Nazareth', '2015-08-02');
insert into post (id, title, content, date_post) values (4, 'Science', 'The Big Bang Theory', '2015-09-25');

insert into contact_hobby (contact_id, hobby_id) values (1, 2);
insert into contact_hobby (contact_id, hobby_id) values (2, 3);
insert into contact_hobby (contact_id, hobby_id) values (2, 4);
insert into contact_hobby (contact_id, hobby_id) values (3, 2);
insert into contact_hobby (contact_id, hobby_id) values (4, 1);
insert into contact_hobby (contact_id, hobby_id) values (4, 4);

insert into contact_place (contact_id, place_id) values (1, 2);
insert into contact_place (contact_id, place_id) values (1, 1);
insert into contact_place (contact_id, place_id) values (2, 3);
insert into contact_place (contact_id, place_id) values (3, 3);
insert into contact_place (contact_id, place_id) values (2, 1);

insert into contact_post (contact_id, post_id) values (1, 2);
insert into contact_post (contact_id, post_id) values (1, 1);
insert into contact_post (contact_id, post_id) values (2, 3);
insert into contact_post (contact_id, post_id) values (3, 3);
insert into contact_post (contact_id, post_id) values (2, 1);

insert into contact_friendship (contact_id, friend_id) values (1, 2);
insert into contact_friendship (contact_id, friend_id) values (1, 4);
insert into contact_friendship (contact_id, friend_id) values (2, 4);
insert into contact_friendship (contact_id, friend_id) values (3, 4);

insert into message (message_time, content, contact_from_id, contact_to_id) values (CURRENT_TIMESTAMP , 'what is app', 1, 2);
insert into message (message_time, content, contact_from_id, contact_to_id) values (CURRENT_TIMESTAMP, 'hi baby', 2, 1);
insert into message (message_time, content, contact_from_id, contact_to_id) values (CURRENT_TIMESTAMP, 'what the weather? ', 1, 4);
insert into message (message_time, content, contact_from_id, contact_to_id) values (CURRENT_TIMESTAMP, 'It is cold', 4, 1);