#!/bin/bash
if docker ps | grep -q one-day-a-pill-be; then
  docker stop $(docker ps -q --filter ancestor=one-day-a-pill-be)
  docker rm $(docker ps -q --filter ancestor=one-day-a-pill-be)
fi