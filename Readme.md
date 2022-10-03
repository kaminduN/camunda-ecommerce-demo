# Camunda BPM example based on Spring Boot

Based on [Camunda Spring Boot starter app](https://github.com/camunda/camunda-bpm-examples/tree/master/spring-boot-starter/example-webapp?ref=7f807189b443c2f10e8cb192303a46b0fef7ac62)


## Prerequisites 

- Camunda 7.17
- Java 11+
- maven 3.6.3


## Building

Execute following:

```bash
mvn clean package
```

## Running

To run application at http://localhost:8080 execute:

```bash
mvn clean package spring-boot:run
```

# Workflows 


- Customer

!['Customer process workflow'](/docs/images/customer-process.png)


- Shop 

!['Customer process workflow'](/docs/images/shop-process.png)
