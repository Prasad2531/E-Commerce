# 🛍️ Microservices E-Commerce Platform

This project is a fully-featured e-commerce application built using a **microservices architecture**.  
Each core functionality of the platform is encapsulated within its own independent service, promoting **scalability, maintainability, and resilience**.

The system is designed to handle key e-commerce operations, including **product catalog management, inventory tracking, order processing, and user notifications**.

---

## 🏛️ Architecture Overview

The application follows a **classic microservices pattern** where services communicate via **REST APIs** or a **message broker**.

- **API Gateway**: Single entry point for all external client requests. Handles request routing, composition, and security.  
- **Service Discovery**: Discovery Server (e.g., Eureka) acts as a registry where all microservices register themselves, allowing dynamic service lookup.  
- **Service Communication**: Services interact as needed. For example, the `order-service` communicates with the `inventory-service` to check stock levels and with the `product-service` to fetch product details.
  <img width="812" height="579" alt="image" src="https://github.com/user-attachments/assets/213123f5-5aa6-4563-a7e1-f99d97800192" />

---

## ✨ Features

- **Product Management**: Add, update, and retrieve product information.  
- **Inventory Control**: Real-time tracking of product stock levels.  
- **Order Processing**: Create and manage customer orders.  
- **Service Discovery**: Dynamically discover and communicate between services.  
- **Centralized Entry Point**: A single API Gateway to manage and route all requests.  
- **Asynchronous Notifications**: Dedicated notification service (e.g., email, SMS).  
- **Containerized**: Fully containerized with **Docker** for easy setup and deployment.  

---

## 📦 Services

| Service             | Description                                                                 |
|---------------------|-----------------------------------------------------------------------------|
| **api-gateway**     | Routes client requests to the appropriate microservice.                     |
| **discovery-server**| Service registry (e.g., Eureka) for microservice registration and discovery. |
| **product-service** | Manages product information (name, description, price).                      |
| **inventory-service**| Manages stock quantity for products.                                        |
| **order-service**   | Handles customer order creation and management.                              |
| **notification-service** | Sends notifications (email, SMS) to users after order placement.        |

---

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot, Spring Cloud  
- **Build Tool**: Maven  
- **Containerization**: Docker, Docker Compose  
- **Database**: PostgreSQL 

---



