# Ordering System

# Dependencies
|Package Name    |Version   |
|----------------|----------|
|`git`           |`2.38.1`  |
|`docker`        |`20.10.20`|
|`docker-compose`|`2.12.2`  |

# Database Installation
- Clone the repository .
- Execute `docker-compose run` to download and setup the `postgres` and `pgadmin4` docker images on your machine.
- After the setup, pgadmin has initialized a server. To login to the server follow the link `http://localhost:5050/login?next=%2Fbrowser%2F`.
- Login credentials are described in the `docker-compose.yaml` file. (username: `admin@admin.com` and password: `root`).
- To insert the required data, copy the contents of the file `db/create_db.sql` and run the queries in pgAdmin's Query Tool. This will create a new schema (`coffee_shop`) where all the tables and types are stored in.

