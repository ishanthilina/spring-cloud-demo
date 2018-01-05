# spring-cloud-demo

This is an implementation of the concepts discussed in https://www.youtube.com/watch?v=ZyK5QrKCbwM. The basic anatomy of the demo has the following folders.
 - config-service : Provides the configurations for all the services in the system. All the other systems read their configurations from this service.
 - MASTER : Contains the configurations that are used by the configuration server.
 - discovery-service : A service discovery service based on Netflix Eureka.
 - reservation-service : A basic implementation of a Table reservation system in a restaurant. Exposes a REST api for reservation related operations.
 - reservation-client : A Zuul based edge service which handles the connections from the external clients, aggregates data from the internal services and send the data back to the clients.
