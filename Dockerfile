FROM ubuntu:latest
LABEL authors="gbara"

ENTRYPOINT ["top", "-b"]