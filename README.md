# quarkus-dynamic-bean-injection project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `quarkus-dynamic-bean-injection-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-dynamic-bean-injection-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/quarkus-dynamic-bean-injection-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.

## Purpose of this sample

With this sample project we demonstrate how we can inject at runtime a specific implementation.

We have two different services (ServiceAImpl and ServiceBImpl) implementing a service interface IService.
both implement a greetings method. 
Now we want to produce an instanciation of this interface with the desired implementation 
defined in the configuration file *application.properties*.

Start the application and go to http://localhost:8080/hello in your favorite browser
you will see

```Hello World from Service A !```

Then go to the application.properties file and change 
```inject.service.impl=servicea``` 
by 
```inject.service.impl=serviceb```

Refresh your browser, you will see 

```Hello World from service B !```

The live reload works! And Voilà.