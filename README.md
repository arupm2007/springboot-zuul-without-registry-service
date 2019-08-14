# springboot-zuul-without-registry-service
This project code comprises of Spring Boot and Zuul. All the 3 projects are spring boot microservice projects. 

ZUUL is configured in one of the projects. Here is the detail below-  

1. api-gateway-zuul - How ZUUL is configured in a Spring boot project so that it can forward REST call to the appropriate service.  
2. customer-service - It's a Spring Boot microservice with some REST APIs  
3. account-service - It's a Spring Boot microservice with some REST APIs

How to run the sample projects?
  1. Download source code from the Github link source code
  2. Import all the three projects into Eclipse as Gradle project.
  2. Refresh Gradle project if any compilation error.
  4. Start microservice customer-service by running the class CustomerServiceApplication.java
  5. Run the class AccountServiceApplication.java of the microservice account-service and it will be started.
  6. Start microservice api-gateway-zuul by running the class ApiGatewayApplication.java
  7. Now all the services are up and running.
  8. You can access any service API using Zuul proxy.
  9. Example–
    A. account-service has a rest API called getCustomers().
    B. This service will return all the existing customer in a JSON array format.
    C. The URI of the service is /rest/customer/list.
    D. Call the service by using any of the REST clients, say web browser.       

    GET htttp://localhost:8080/customer-service/rest/customer/list

    Once a call is made on api-gateway-zuul service , it will check the routing path and forward it to the mapped destination. 
    In this case  routing path is /customer-service/** and the routing destination is http://localhost:8081/customer-   service/rest/customer/list 

    Similarly , you can access acount services. For example –
      GET htttp://localhost:8080/account-service/rest/account/list 
      It will return all the available accounts in a JSON format.
