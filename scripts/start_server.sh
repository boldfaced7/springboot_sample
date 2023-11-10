#!/bin/bash
docker load -i /home/ec2-user/app/one-day-a-pill-be.tar
docker run -d -p 8080:8080 one-day-a-pill-be