FROM gitpod/workspace-postgres

COPY db-init.sql /docker-entrypoint-initdb.d/