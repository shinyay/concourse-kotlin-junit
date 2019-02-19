#!/usr/bin/env fish

docker-compose down
set -e CONCOURSE_EXTERNAL_URL
docker ps -a
