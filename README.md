# Project Name

This is a simple Spring Boot project showcasing Spring Data REST automating API creation process.

## Features

- Create, Read, Update, and Delete operations for managing entities.
- Expose RESTful endpoints for interacting with the data.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Swagger


## Setup

1. **Prerequisites**:
    Java Development Kit (JDK) installed
    Postman (to check API end points)

2. **Installation**: 
    1. Clone the repository:
    2. Build the project and run it in your fav IDE (mine is IntelliJ)
   
3. **Usage**: 
    Swagger configuration is already included. Access the h2 console using this:http://localhost:8080/h2-console
    
    Insert data into h2 console and then check end points like in your Postman application
    Sample data:
   
    INSERT INTO EMPLOYEES (ID, FIRST_NAME, LAST_NAME, EMAIL)
       VALUES
       (1, 'Athul', 'Raj', 'athul@gmail.com'),
       (2, 'Aarathy', 'Nair', 'aarathy@gmail.com'),
       (3, 'Salisha', 'Jose', 'salisha@gmail.com');


## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.

## License

Released under the Apache License 2.0. 

