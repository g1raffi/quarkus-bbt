#/bin/bash
ENV=$1
./mvnw clean package
docker build -f data-transformer/src/main/docker/Dockerfile.${ENV} -t data-transformer:${ENV} data-transformer/.
docker build -f data-consumer/src/main/docker/Dockerfile.${ENV} -t data-consumer:${ENV} data-consumer/.
docker build -f data-producer/src/main/docker/Dockerfile.${ENV} -t data-producer:${ENV} data-producer/.
