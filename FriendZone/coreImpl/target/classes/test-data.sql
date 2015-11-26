insert into contact (id, first_name, last_name, birth_date) values (1, 'Elena', 'Bruyako', CURRENT_DATE);
insert into contact (id, first_name, last_name, birth_date) values (2, 'Anton', 'Valiuh', CURRENT_DATE);
insert into contact (id, first_name, last_name, birth_date) values (3, 'Inna', 'Bruyako', CURRENT_DATE);
insert into contact (id, first_name, last_name, birth_date) values (4, 'Eugene', 'Trostian', CURRENT_DATE);

insert into hobby (id, title, description) values (1,'Photo', 'Take a photo nature');
insert into hobby (id, title, description) values (2,'Science', 'Space and history');
insert into hobby (id, title, description) values (3,'Creation', 'Dancer');
insert into hobby (id, title, description) values (4,'Science', 'Programming');

insert into place (id, title, description, longitude, latitude) values (1,'Tbilisi', 'Sightseeing', 44.833680, 41.694110);
insert into place (id, title, description, longitude, latitude) values (2, 'Wien', 'Traveling', 16.372080, 48.208490);
insert into place (id, title, description, longitude, latitude) values (3, 'Kiev', 'Relaxing', 30.523800, 50.454660);
insert into place (id, title, description, longitude, latitude) values (4, 'Dnepropetrovsk', 'Working', 34.983330, 48.450000);

insert into post (id, contact_id, title, content, date_post) values (1, 1, 'Life', 'Do not worry, be happy', CURRENT_DATE);
insert into post (id, contact_id, title, content, date_post) values (2, 2, 'Sport', 'We are the champion', CURRENT_DATE);
insert into post (id, contact_id, title, content, date_post) values (3, 3, 'Music', 'Respect Nazareth', CURRENT_DATE);
insert into post (id, contact_id, title, content, date_post) values (4, 4, 'Science', 'The Big Bang Theory', CURRENT_DATE);

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

insert into message (id, message_time, contact_from_id, contact_to_id, content) values (1, CURRENT_TIMESTAMP , 1, 2, 'what is app');
insert into message (id, message_time, contact_from_id, contact_to_id, content) values (2, CURRENT_TIMESTAMP, 2, 1, 'hi baby',);
insert into message (id, message_time, contact_from_id, contact_to_id, content) values (3, CURRENT_TIMESTAMP, 1, 4, 'what the weather? ',);
insert into message (id, message_time, contact_from_id, contact_to_id, content) values (4, CURRENT_TIMESTAMP, 4, 1, 'It is cold',);

insert into contact_friendship (contact_id, friend_id) values (1, 2);
insert into contact_friendship (contact_id, friend_id) values (1, 4);
insert into contact_friendship (contact_id, friend_id) values (2, 4);
insert into contact_friendship (contact_id, friend_id) values (3, 4);
