select * from metadata;

select * from Note;


update metadata
set subject = "Economics"
where ID = 1;

update Note
set text = "Economics is the social science that studies the production, distribution, and consumption of goods and services."
where Note_ID = 1;

call SubmitContent("The circumference of a circle is found with the formula Pie * diameter = 2* Pie * R " ,"Geometry");

