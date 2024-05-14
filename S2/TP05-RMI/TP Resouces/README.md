# RMI Step by Step guide

RMI or Remote method invocation is an API that provides a mechanism to create distributed application in java, RMI allows an object residing in one Java Virtual Machine (JVM) to invoke methods on an object residing in another JVM This enables the development of distributed applications, where the components of the application can be distributed across multiple machines.

## Steps to Create RMI Application:
### *1. Create Remote Intreface:*

This interface enables both the server side and the client side to see the available remote methods. in our example the [Calculator.java](Calculator.java) is our remote interface.

### *2. Implement the Remote Interface:*

we provide an implementation for the interface that we created previously by creating a class that implement the remote method (Interface Calculator) and also extends the class UnicastRemoteObject. in our example the [CalculatorImp.java](CalculatorImp.java) is our implementation of the remote interface.

### *3. Create the Server Application:*
### *4. Create the Client Application:*

## Steps to Run the RMI Application:

### *1. Compile the Classes:*
### *2. Start the RMI registry:*
### *3. Start the Server:*
### *4. Start the Client:*   