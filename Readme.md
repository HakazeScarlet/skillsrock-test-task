# Skillsrock test task

REST API application that provides information about the user.
See details in the document:

[task_file](src/main/resources/readme_content/task.pdf)

### Technology stack: ###

- Java 17
- Spring Boot 3
- PostgreSQL
- Docker
- Postman
- Flyway

## How to run and how to create migrations via Flyway:

## How to run and how to create migrations via Flyway:

1. First of all run PostgreSQL docker container with
   ```docker-compose up```
2. The next step is to run the Spring Boot application.

3. If you want to create migrations in easy way, install *Flyway* plugin (see the screenshot below).

![add_flyway_to_project](src/main/resources/readme_content/flyway_add.png)

4. Then just create versioned migration via option below:

![creating_migration](src/main/resources/readme_content/add_new_migration.png)

As a result you will create a migration file (see ex. below):

![migration_files](src/main/resources/readme_content/migrations_files.png)

## How it works (just a small example)


1. Let's consider the POST request. You need to set URL and JSON request body.

![create_new_user](src/main/resources/readme_content/postman_post.png)

2. If the request was successful, you will see the new user and role saved in the database.

![new_user_in_db](src/main/resources/readme_content/new_user_db.png)
![new_role_in_db](src/main/resources/readme_content/new_role_db.png)

3. For other requests we can also take data such as *UUID* from a
   database/or response body (from POST request) and use it to *get*/*put*/*delete* data.



