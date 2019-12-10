### To Run
- Terminal-1
```bash
cd order-service
sudo mvn clean package
cd ..
sudo docker-compose up
```
This will start Elasticsearch, Kibana, APM server and the Spring Boot app at the same time in their own containers.

- Terminal-2
```bash
cd artillery-load-testing
sudo npm install
sudo npm run test
```
This runs a test for the Spring Boot app that sends a lot of requests back and forth over the open port. Then we can see different things like response times, amount of requests, run time and if there are any errors that occur during the test.
