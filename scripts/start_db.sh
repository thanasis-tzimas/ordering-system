#!/bin/bash

if ! command -v docker &> /dev/null
then
	echo "docker could not be found."
	echo "Ensure you have installed all dependencies!"
	exit
fi

# check if the postgres container is running
if docker ps | grep -q pg_container;
then
	echo "Starting postgres container"
	docker start pg_container
else
	echo "postgres is already running"
fi

# check if the pgadmin4 container is running
if docker ps | grep -q pgadmin4_container;
then
	echo "Starting pgadmin4 container"
	docker start pgadmin4_container
else
	echo "pgadmin4 is already running"
fi
