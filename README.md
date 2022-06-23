# postgres-poc

Simple Spring Boot application that connects to a PostgreSQL database and queries some data.

## Running in Gitpod

https://gitpod.io/#https://github.com/cwalsh13/postgres-poc

The app should open in an IDE and execute the "bootRun" command in a terminal.  If the terminal output displays the line "Found 1 contacts in the DB" then the run is successful.

## Dev environment

The Gitpod workspace uses the "gitpod/workspace-postgres" Docker image, which installs and starts up a PostgreSQL DB.  It also pre-installs some VSCode extensions for Java and Kotlin.

## Execution

On workspace startup, Gitpod executes two tasks in separate terminals:
- Initialize the database from a SQL script (set up user permissions, create a table and insert some data)
- bootRun the application

The user has full control of these terminals after startup, ex. to stop/restart the application or run other gradle tasks.

(NOTE: Some of the compilation is done in a prebuild behind the scenes, so that the application starts more quickly in each workspace.  I'm not sure the current config is correct, but this is definitely a feature we would want to use.)
