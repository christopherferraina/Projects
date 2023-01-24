insert into FlashCard(card_ID, Front, Back)
values (0, "null", "null");

insert into cardstack(Card_ID,Stack_ID)
values(0,0);

insert into note ( Note_ID, text )
values (0, "null");

insert into notes ( Note_ID, Notes_ID )
values (0, 0);

insert into user(User_Number, Username, email, password, user_ID)
values (2, "jake", "blank@blank.gov", 1, 2 );

insert into content(Content_ID, User_Post, User_Number, Last_Update, Notes_ID, Stack_ID)
values (2,1,2,'2021-09-23',1, 0);

insert into metadata ( ID,Content_ID, Date, subject, school, Likes, Dislikes)
values (2, 2, '2021-09-23' , "math", "landmark",  0, 0);

select subject from metadata 
where subject like 'Computer%';	

update metadata 
set subject = "blood rituals 101"
where ID = 8