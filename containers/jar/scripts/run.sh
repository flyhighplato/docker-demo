#!/usr/bin/env bash

# set -o xtrace  # trace what gets executed
set -o errexit # exit when a command fails.
set -o nounset # exit when your script tries to use undeclared variables

java -Djava.security.egd=file:/dev/./urandom -jar app.jar