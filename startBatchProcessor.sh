#!/bin/sh

if [ "$3" = "rebuild" ];
then
  mvn clean install
fi
cd target || exit
java -jar pal-training-1.0-SNAPSHOT.jar "$1" "$2"