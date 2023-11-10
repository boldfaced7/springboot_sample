#!/bin/bash
cd /home/ec2-user/app
docker build -t one-day-a-pill-be --build-arg test_1=hello --build-arg test_2=kang .