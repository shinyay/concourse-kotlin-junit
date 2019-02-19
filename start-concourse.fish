#!/usr/bin/env fish

#./generate-keys.sh

set URL (ipconfig getifaddr en0)
set -x CONCOURSE_EXTERNAL_URL http://$URL:8080

docker-compose up -d

echo $CONCOURSE_EXTERNAL_URL
