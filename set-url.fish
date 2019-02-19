#!/usr/bin/env fish
set URL (ipconfig getifaddr en0)
set -x CONCOURSE_EXTERNAL_URL http://$URL:8080
