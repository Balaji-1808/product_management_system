# Product Management System

A simple, robust product delivery management system built using a microservices architecture. 

## 🏗 Architecture & Services

This project is built using Java (100%) and is divided into distinct, loosely coupled microservices to ensure scalability and maintainability.

The system consists of the following core components:

* **`ServiceRegistry`**: Acts as a Eureka Server (or similar discovery server) to keep track of all available microservices and their instances, enabling dynamic service discovery.
* **`api-gateway`**: The single entry point for all clients. It routes requests to the appropriate backend microservices and can handle cross-cutting concerns like security, CORS, and rate limiting.
* **`product-servicee`**: Manages the product catalog, including creating, retrieving, updating, and deleting products.
* **`order-servicee`**: Handles customer orders, inventory checks, and coordinates with the payment service to complete the checkout flow.
* **`payment-servicee`**: Manages financial transactions and payment processing for the orders placed.

## 💻 Tech Stack

* **Language**: Java
* **Framework**: Spring Boot / Spring Cloud
* **Architecture**: Microservices
* **Service Discovery**: Netflix Eureka (`ServiceRegistry`)
* **API Gateway**: Spring Cloud Gateway (`api-gateway`)

## ✨ Key Features

* **Decoupled Architecture**: Each service can be developed, deployed, and scaled independently.
* **Centralized Routing**: The API Gateway hides the internal architecture from the client.
* **Dynamic Service Discovery**: Services register themselves to the Service Registry, allowing the API gateway to locate them without hardcoded URLs.
* **End-to-End E-commerce Flow**: Supports standard flows from browsing products to placing orders and processing payments.

## 🚀 Getting Started

### Prerequisites
* **Java Development Kit (JDK)**: Version 11 or 17 (depending on your configuration).
* **Maven or Gradle**: To build the application.
* **Database**: (e.g., MySQL or PostgreSQL) installed and running, based on your specific `application.properties` or `application.yml` configurations in each service.

### Running the Application

To run the application locally, you must start the services in a specific order to ensure they register correctly:

**1. Start the Service Registry**
Navigate to the `ServiceRegistry` directory and run the application:
```bash
cd ServiceRegistry
./mvnw spring-boot:run
