#!/bin/bash
if docker-compose ps | grep -q one-day-a-pill; then
  docker-compose down
fi