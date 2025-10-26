# Restaurant Network System

A Java-based client-server application designed to manage a network of multiple restaurant branches, built as part of a Software Engineering course (Oct 2024 – Apr 2025).

## Project Overview

This project provides a distributed system that supports restaurant operations including order management, delivery services, and customer handling. The backend is built using Java with Hibernate ORM for database interaction, and the frontend uses JavaFX. Communication between client and server is implemented using OCSF framework with the Mediator design pattern to enable modular, event-driven interactions.

## Features

- Multi-restaurant branch management with branch-specific menu and delivery options.
- Order placement and delivery tracking including customer details and order items.
- Optimized SQL database schema design with efficient queries for improved performance.
- Robust concurrency and synchronization handling for supporting multiple users simultaneously.
- Event-driven UI communication with Mediator pattern using EventBus.

## Technologies Used

- Java 17+, JavaFX, OCSF Framework
- Hibernate ORM with SQL database (e.g., MySQL, PostgreSQL)
- Mediator Design Pattern for modular event handling
- Maven build tool
- Git version control

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven
- Database server (MySQL/PostgreSQL)
- IDE such as IntelliJ IDEA or Eclipse

### Installation

- Clone the repository.
- Configure the database connection in `hibernate.cfg.xml`.
- Build the project using Maven:
mvn clean install


- Run the server module first, then the client module.

## Usage

- The client application allows users to browse menus, place orders, and track deliveries.
- The server manages the business logic, database interactions, and multi-threaded user sessions.
