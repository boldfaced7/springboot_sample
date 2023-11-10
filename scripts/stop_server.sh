#!/bin/bash
if docker ps | grep -q one-day-a-pill-be; then
  docker stop $(docker ps -q --filter ancestor=your-docker-image)
fi