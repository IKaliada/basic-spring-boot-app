docker build -f docker/Dockerfile -t ikaliada/basic-spring-boot-app:0.0.2 .
docker push ikaliada/basic-spring-boot-app:0.0.2
kubectl set image deployment/app app=ikaliada/basic-spring-boot-app:0.0.2