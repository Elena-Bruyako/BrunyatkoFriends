insert into FriendZone.Contact (Contact_id, Login, Password, first_name, last_name, birth_date) values (1, null , null, 'Elena', 'Bruyako', CURRENT_DATE);
insert into FriendZone.Contact (Contact_id, Login, Password, first_name, last_name, birth_date) values (2, null , null, 'Anton', 'Valiuh', CURRENT_DATE);
insert into FriendZone.Contact (Contact_id, Login, Password, first_name, last_name, birth_date) values (3, null , null, 'Inna', 'Bruyako', CURRENT_DATE);
insert into FriendZone.Contact (Contact_id, Login, Password, first_name, last_name, birth_date) values (4, null , null, 'Julia', 'Oleksenko', CURRENT_DATE);

insert into FriendZone.Hobby(Hobby_id, Title, Description) values (1, 'Photo', 'Take a photo');
insert into FriendZone.Hobby(Hobby_id, Title, Description) values (2, 'Science', 'Math, Space');
insert into FriendZone.Hobby(Hobby_id, Title, Description) values (3, 'Dance', 'Hip-Hop, Tango');
insert into FriendZone.Hobby(Hobby_id, Title, Description) values (4, 'Music', 'Rock, Jazz, Classic');
insert into FriendZone.Hobby(Hobby_id, Title, Description) values (5, 'Movie', 'Drama, Fantasy');

insert into FriendZone.Place(Place_id, Title, Longitude, Latitude, Description) values (1, 'Georgia', 44.83368, 41.69411, 'Tbilisi, Batumi');
insert into FriendZone.Place(Place_id, Title, Longitude, Latitude, Description) values (2, 'Brussels', 4.34878, 50.85045, 'Brugge, Gent');
insert into FriendZone.Place(Place_id, Title, Longitude, Latitude, Description) values (3, 'Ukraine', 30.5238, 50.45466, 'Kiev, Lviv, Dnepr, Odessa');
insert into FriendZone.Place(Place_id, Title, Longitude, Latitude, Description) values (4, 'Netherlands', 4.88969, 52.37403, 'Amsterdam');

insert into FriendZone.Post(Post_id, Title, Content, Date_Post, Contact_id) values (1, 'Happy', 'I am Happy!',null, 1);
insert into FriendZone.Post(Post_id, Title, Content, Date_Post, Contact_id) values (2, 'Travel', 'We were in Europe!', null, 2);
insert into FriendZone.Post(Post_id, Title, Content, Date_Post, Contact_id) values (3, 'World and Space', 'Space X', null, 3);
insert into FriendZone.Post(Post_id, Title, Content, Date_Post, Contact_id) values (4, 'Auto', 'Tesla',null, 2);
insert into FriendZone.Post(Post_id, Title, Content, Date_Post, Contact_id) values (5, 'Music', 'Rock - the best!',null, 1);

insert into FriendZone.Contact_Hobby(Contact_id, Hobby_id) values (1, 2);
insert into FriendZone.Contact_Hobby(Contact_id, Hobby_id) values (1, 1);
insert into FriendZone.Contact_Hobby(Contact_id, Hobby_id) values (2, 3);
insert into FriendZone.Contact_Hobby(Contact_id, Hobby_id) values (1, 3);
insert into FriendZone.Contact_Hobby(Contact_id, Hobby_id) values (3, 1);
insert into FriendZone.Contact_Hobby(Contact_id, Hobby_id) values (2, 1);

insert into FriendZone.Contact_Place(Contact_id, Place_id) values (1, 1);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (1, 2);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (1, 3);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (1, 4);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (2, 1);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (3, 2);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (2, 4);
insert into FriendZone.Contact_Place(Contact_id, Place_id) values (4, 2);

insert into FriendZone.Contact_Friendship(Contact_id, Friend_id) values (1, 2);
insert into FriendZone.Contact_Friendship(Contact_id, Friend_id) values (1, 3);
insert into FriendZone.Contact_Friendship(Contact_id, Friend_id) values (1, 4);
insert into FriendZone.Contact_Friendship(Contact_id, Friend_id) values (2, 3);
insert into FriendZone.Contact_Friendship(Contact_id, Friend_id) values (3, 4);