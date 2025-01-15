create database MovieTime_DataBase;
use MovieTime_DataBase;

-- User Table
CREATE TABLE UserTable (
    user_Id int auto_increment primary key,
    user_Name varchar(255) not null,
    user_Email varchar(255) UNIQUE not null,
    user_Phone bigint(15) UNIQUE NOT NULL,
    user_Type ENUM('Admin', 'User') NOT NULL,
    user_Password varchar(255) NOT NULL,
    user_ConfirmPassword varchar(255) NOT NULL,
    user_Gender enum('Male', 'Female', 'Other')
);

insert into UserTable value(1,'vamsi','vamsi@gmail.com',9618753379,'Admin','vamsi123','vamsi123','male');
ALTER TABLE UserTable MODIFY COLUMN user_Gender ENUM ('Male', 'Female', 'Other') not null;
select * from  UserTable;
desc UserTable;



-- Movie Table
CREATE TABLE MovieTable (
    movie_Id INT AUTO_INCREMENT PRIMARY KEY,
    movie_Name varchar(255) NOT NULL,
    movie_ImagePath varchar(255),
    movie_Price DECIMAL(10, 2) NOT NULL,
    movie_LanguageCategory varchar(50) NOT NULL,
    movie_VideoPath varchar(255),
    movie_Content TEXT,
    movie_GenreCategory varchar(100) not null
);

insert into MovieTable value(1,'vamsi','imgpath',125.0,'telugu','videopath','this is a love store movie and comady','Love');
select * from  MovieTable;

-- Ticket Table
CREATE TABLE TicketTable (
    ticket_Id INT AUTO_INCREMENT PRIMARY KEY,
    ticket_Seats INT NOT NULL,
    ticket_TotalPrice DECIMAL(10, 2) NOT NULL,
    ticket_MovieTimeDate DATETIME NOT NULL,
    ticket_Movie_Id INT NOT NULL,
    ticket_Movie_Name varchar(255),
    ticket_TheaterName varchar(255),
    ticket_TheaterLocation varchar(255),
    FOREIGN KEY (ticket_Movie_Id) REFERENCES MovieTable(movie_Id)
    
);
-- alter table TicketTable add foreign key(ticket_Movie_Name) referencesMovieTable(movie_Name);

insert into TicketTable value(1,2,200.0,'2022-07-02 09:35:00',1,'vamsi','jothe','Rc puram');
select * from  TicketTable;


-- Booking Table
CREATE TABLE BookingTable (
    booking_Id INT AUTO_INCREMENT PRIMARY KEY,
    booking_PaymentType varchar(50) NOT NULL,
    booking_TotalAmount DECIMAL(10, 2) NOT NULL,
    booking_Ticket_Id INT NOT NULL,
    FOREIGN KEY (booking_Ticket_Id) REFERENCES TicketTable(ticket_Id)
);

insert into BookingTable value(1,'upi',200.6,1);
select * from  BookingTable;
describe BookingTable;















drop database MovieTime_DataBase;
show tables;
select *from usertable;
desc usertable;
