# GenericRepository Implementation with Spring Data JPA
## Introduction
This project demonstrates the implementation of a generic repository in a Java application using Spring Data JPA. The GenericRepository allows for CRUD (Create, Read, Update, Delete) operations to be performed in a generic manner for different entities, promoting code reuse and simplifying maintenance.
## Project Structure
### Classes
GenericRepository: A generic interface that extends JpaRepository, defining operations for different entities. <br>
Person: An abstract class that represents a person, serving as the base for other entities such as Client and Admin.<br>
Client: A subclass of Person that represents a client, with specific characteristics and behaviors.<br>
Admin: A subclass of Person that represents an administrator, also with specific characteristics and behaviors.<br>
ClientService: A service class that uses the GenericRepository to perform operations related to Client.<br>
AdminService: A service class that uses the GenericRepository to perform operations related to Admin.<br>
ProductService: A service class that uses a generic repository to manage products.<br>
GenericRepository: The GenericRepository is parameterized to allow any entity that extends GenericEntity to be manipulated. The interface provides basic methods for persisting, updating, deleting, and retrieving entities from the database.<br>
Entity Structure<br>
Abstract Class Person<br>
The Person class serves as the base for the Client and Admin entities.<br>
It is annotated to use the SINGLE_TABLE inheritance strategy, which stores all information in a single table in the database.<br>
Relationships Between Entities<br>
The Client and Admin entities inherit properties from the Person class, allowing for a unified data structure.<br>
The discrimination between the types of people is made through a specific column in the table, which indicates whether the entry is a Client or an Admin.<br>
Conclusion<br>
This project illustrates the creation of a generic repository that can be used for different entities, providing a clean and organized design. The service classes demonstrate how to operate with the GenericRepository to perform CRUD operations on multiple entities, making it easier to scale and maintain the code.
