CREATE TABLE users (
    userName VARCHAR(50) NOT NULL,
    passWord VARCHAR(50) NOT NULL,
    firstName VARCHAR(50) NOT NULL,
    familyName VARCHAR(50) NOT NULL,
    userRole VARCHAR(50) NOT NULL,
    userTeam VARCHAR(50) NOT NULL,
    userID INT PRIMARY KEY
)

CREATE TABLE roles (
    roleID INT NOT NULL,
    memberRole VARCHAR(50) NOT NULL
)

CREATE TABLE teams (
    teamName VARCHAR(50) NOT NULL,
    teamProject VARCHAR(50) NOT NULL,
    teamDevelopers VARCHAR(50) NOT NULL,
    teamLeader VARCHAR(50) NOT NULL,
    teamID INT NOT NULL
)

CREATE TABLE project (
    projectName VARCHAR(50) NOT NULL,
    projectDescription VARCHAR(50) NOT NULL,
    projectTeams VARCHAR(50) NOT NULL,
    projectID INT NOT NULL
)

CREATE TABLE breaks (
    dateStart DATE NOT NULL,
    dateEnd DATE NOT NULL,
    dateCreated DATE NOT NULL,
    halfDayBreak TINYINT NOT NULL,
    breakAccepted TINYINT NOT NULL,
    dateApplicant VARCHAR(50) NOT NULL,
    breakID INT NOT NULL
)