# Mysql container

FROM library/mysql
MAINTAINER Morvana Bonin <@morvanabonin>

LABEL Description="Imagem com docker" Version="1.0.0"

VOLUMES:
	- ./data/sql/:/docker-entrypoint-initdb.d/generate-db-allura.sql
