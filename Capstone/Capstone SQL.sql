create table FlashCard(
Card_ID int not null,
Front varcharacter(250) not null,
Back varcharacter(250) not null,
primary key (Card_ID)
);
create table CardStack(
Card_ID int,
foreign key (Card_ID) References FlashCard(Card_ID),
Stack_ID int not null,
primary key (Stack_ID)
);
create table Note(
Note_ID int not null,
text varcharacter(1000) not null,
primary key (Note_ID)
);
create table Notes(
Notes_ID int not null,
Note_ID int,
foreign key (Note_ID) References Note(Note_ID),
primary key (Notes_ID)
);
create table User(

User_Number int not null,
name varcharacter (20) not null,
email varcharacter(40) not null,
password text not null,
userID int not null,
primary key (User_Number)
);
create table Content(
Content_ID  int not null,
User_Post int not null,
User_Number int not null,
Last_Update Date not null,
Notes_ID int not null,
Stack_ID int not null,
foreign key (User_Number) references User(User_Number),
foreign key (Notes_ID) References Notes(Notes_ID),
foreign key (Stack_ID) References CardStack(Stack_ID),
primary key (Content_ID)
);
create table metadata(
ID int not null,
Content_ID  int not null,
Date date not null,
subject text(10) not null,
school text (10) not null,

foreign key (Content_ID) References Content(Content_ID),
Likes int not null,
Dislikes int not null,
primary key (ID)
);
