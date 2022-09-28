/* 
In a new script on your database, your goal for this training exercise is to create a simple database for a school. This school should have students, teachers, courses and topics. 
Students should have some sort of PRIMARY KEY, along with some basic information regarding them (name, phone number, email etc.)
Courses should have some sort of PRIMARY KEY, as well as basic information about the course (title, course number, etc.)
Teachers should have some sort of PRIMARY KEY as well as basic information about themselves (name, phone number, email etc.)
Topics should have two columns, some primary key and some topic.
In addition to the fields above we should have some relationships between our entities. There should be a one to one relationship between teachers and courses (i.e. one course should have one teacher and one teacher can only teach one course), a many to many relationship between students and courses (many students can be enrolled in one course and one student can be enrolled in many courses) and a many to many relationship between courses and topics (one course can have many topics and many courses can have one topic).
Remember to look at the notes on how to construct a 1:1 relationship and a M:M relationship, for the latter you will need some junction tables.
After the tables are constructed, try to add information into the tables, for example, maybe 5 students, 3 courses for them to enroll in, 3 teachers to teach them, and a few topics for those courses to cover.
Helpful hint, start with your tables that shouldn't have information from other tables in them (topics, students, and teachers) then construct your table that reference one other table (course referencing teacher) and finally construct your junction table
*/

CREATE TABLE students (
	id int PRIMARY KEY,
	"first" varchar(25) NOT NULL,
	"last" varchar(25) NOT NULL,
	email varchar(25),
	phone int UNIQUE
)

CREATE TABLE teachers (
	id int PRIMARY KEY,
	"first" varchar(25) NOT NULL,
	"last" varchar(25) NOT NULL,
	email varchar(25),
	phone int UNIQUE
)

CREATE TABLE courses (
	courseID int PRIMARY KEY,
	subject varchar(20),
	teacherID int REFERENCES teachers UNIQUE
)

CREATE TABLE topics (
	classID int PRIMARY KEY,
	title varchar(255)
)

ALTER TABLE teachers ADD COLUMN course int REFERENCES courses UNIQUE;

INSERT INTO students 
VALUES
		(1, 'Lilith', 'Ryder', 'lilry@rev.edu'),
		(2, 'Tiffany', 'Zellner', 'tifze@rev.edu'),
		(3, 'Ajani', 'Levy', 'ajale@rev.edu'),
		(4, 'Zachary', 'Estes', 'zaces@rev.edu');


ALTER TABLE students DROP COLUMN phone;

ALTER TABLE teachers DROP COLUMN phone;

INSERT INTO teachers 
VALUES 
	(1, 'Bryan', 'Serfozo', 'bryse@rev.edu'),
	(2, 'Kevin', 'Tran', 'kevtr@rev.edu');
	
INSERT INTO courses 
VALUES 
	(1, 'Physics', 1),
	(2, 'Biology', 2);