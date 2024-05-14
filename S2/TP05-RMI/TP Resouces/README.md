# RMI Step by Step guide

RMI or Remote method invocation is an API that provides a mechanism to create distributed application in java, RMI allows an object residing in one Java Virtual Machine (JVM) to invoke methods on an object residing in another JVM This enables the development of distributed applications, where the components of the application can be distributed across multiple machines.

## Steps to Create RMI Application:
### *1. Create Remote Intreface:*

This interface enables both the server side and the client side to see the available remote methods. in our example the [Calculator.java](Calculator.java) is our remote interface.

### *2. Implement the Remote Interface:*

We provide an implementation for the interface that we created previously by creating a class that implement the remote method (Interface Calculator) and also extends the class UnicastRemoteObject. in our example the [CalculatorImp.java](CalculatorImp.java) is our implementation of the remote interface.

### *3. Create the Server Application:*

Create a server application that will host the remote object. This involves creating a class that instantiates the remote object, binds it to a registry, and starts listening for client requests. The server application is responsible for managing the lifecycle of the remote object in our example the [MyServer.java](MyServer.java) is our Server Application 

### *4. Create the Client Application:*

Create a client application that will interact with the remote object hosted on the server. The client application should look up the remote object from the registry, obtain a reference to it, and then invoke remote methods as needed. in our example the [MyClient.java](MyServer.java) is our Client Application. 

<span style="color:red">*PS:*</span> The URL inside the lookup and rebind method should be identical to establish connection between the server and the client.

## Steps to Run the RMI Application:

### *1. Compile the Classes:*

Compile all the Java classes including the remote interface, its implementation, server, and client applications using the commend javac *.java
### *2. create the stub and skeleton objects using the rmic tool:*

Generate the stub and skeleton objects using the rmic tool. The stub and skeleton are necessary for RMI communication between the client and server. This step isn't necessary for all machines newer version of java created the proxies automatically.

### *3. Start the RMI registry:*

Start the RMI registry using the rmiregistry command. This command launches the registry service, which acts as a lookup service for remote objects.

### *4. Start the Server:*

In another terminal (command line) run the server application that hosts the remote object. This application should bind the remote object to the RMI registry, making it available for clients to look up and invoke its methods.

### *5. Start the Client:*

In a third terminal (command line) run the client application that interacts with the remote object. The client should look up the remote object from the RMI registry, obtain a reference to it, and then call its remote methods as required.

<span style="color:red">*PS:*</span> We're testing on the same machine, but each terminal we open creates a separate JVM instance.