#!/bin/bash
if docker ps | grep -q 'your-docker-image'; then
  docker stop $(docker ps -q --filter ancestor=your-docker-image)
fi