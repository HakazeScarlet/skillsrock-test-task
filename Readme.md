# Skillsrock test task

## Project objective ##

Need to write a REST API application that provides 
information about the user.

### Application functional: ###

- Adding a new *user* with the fields: *FIO, phone number,
  avatar* and *role*.
- Get user data.
- Update user data, i.e. change its main fields: *FIO, phone number,
  avatar* and *role*.
- Delete *user* by *UUID*. The *role* must also be deleted

### Technology stack: ###

- Java 17
- Spring Boot 3
- PostgreSQL

### Tables scheme:

![test task1](src/main/resources/readme_content/tables_scheme.jpg)

### API endpoints:

- *POST:* /api/createNewUser (JSON BODY)
- *GET:* /api/users?userID=anyUUID
- *PUT:* /api/userDetailsUpdate (JSON BODY или Params)
- *DELETE:* /api/users?userID=anyUUID

### Requirements:

- readable and structured code
- validation of incoming data
- SOLID, MVC

### Will be a plus:

- error handling via @ControllerAdvice
- adding caching
- using docker
- migrations from Liquibase

## Let's start

1. Docker is used to work with the project. To up the database, 
***docker-compose.yaml*** is used, which is located in the root 
of the project.

![docker file location](src/main/resources/readme_content/docker-compose_location.png)

2. Using a docker file, you need to up a container with a database and 
connect using the credentials specified in the file

![connect to db](src/main/resources/readme_content/db_connect.png)

3. After connecting to the database, I used the *Flyway* plugin to create a 
migration for the database. This is how I created the tables described in the 
task, taking into account the constraints, primaries and foreign keys. 

![add flyway to project](src/main/resources/readme_content/flyway_add.png)

4. *Flyway* is quick to set up and easily creates migrations for a database. The 
generated SQL files for the selected database describe the creation of tables 
with fields, constraints and keys.

![creating migration](src/main/resources/readme_content/add_new_migration.png)

5. But now all the necessary data is already there. Therefore, after 
connecting to the database and starting the application, the migrations will 
be loaded automatically, and you will immediately be able to work with data 
in the database

![migration_files](src/main/resources/readme_content/migrations_files.png)


## How it works

1. To interact with the database I used Postman, with which I worked with data
on the endpoints specified earlier in the task. By specifying the HTTP method 
and parameters in the endpoint, I manipulate the data in the database.
For example, I register a new user.

![create_new_user](src/main/resources/readme_content/postman_post.png)

2. The request was successful, code 200 was returned. If you access the 
database, you can see that the new user has been saved

![new user in db](src/main/resources/readme_content/new_user_db.png)

3. For other queries we can also take data such as *UUID* from the 
database and use it to *get* data, *put* or *delete*.

## My tech stack:

- Java 17
- Spring Boot 3
- PostgreSQL
- Docker
- Postman
- Flyway



