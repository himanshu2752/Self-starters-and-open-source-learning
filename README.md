#REST api for CRUD operations using jersey library and http protocols

####Developed on Eclipse and Java version jdk1.8.0_102
####I have used Jersey libraries to develop the REST api. you can check them in libraries
####I have created dynamic web project in Eclipse
####I ran this project on Apache Tomcat V6.0

- ###Model - There is a Vehicle class which has class, model, make, year and Id. Other java file contains the resources for CRUD operations and URI (paths for GET requests).

- ###Business - The Rest api through GET (http requests) can create a vehicle, delete a vehicle and update a vehicle. you can check the path for these operations and can create a URI for these operations.

- ###Future scope - can be integrated with a database, where a schema for this can be created. Or to create the persistant objects, Serializable can be implemented and the binary file for vehicle objects can be created (using ObjectOutputStream) which can accessed later with ObjectInputStream.

