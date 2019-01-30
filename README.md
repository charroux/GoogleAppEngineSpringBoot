# GoogleAppEngineSpringBoot

Build du projet : https://github.com/GoogleCloudPlatform/getting-started-java/tree/master/appengine-standard-java8/springboot-appengine-standard

Welcome page : http://localhost:8080/static/index.html

Add the dependency into pom.xml :

	<dependency>
	    <groupId>com.google.appengine</groupId>
	    <artifactId>appengine-api-1.0-sdk</artifactId>
	    <version>1.9.71</version>
	</dependency>

## Lab 1: NoSQL in the Cloud

The web form: https://github.com/charroux/GoogleAppEngineSpringBoot/blob/master/src/main/webapp/static/createPerson.html

The Web Service : https://github.com/charroux/GoogleAppEngineSpringBoot/blob/master/src/main/java/com/example/appengine/demos/springboot/HelloworldController.java

## Lab 2: decloupling and scalling up an app, fault tolerance with a queue int the Cloud

The backend Task begin the queue: 

The front end task writing into the queue

## Lab 3:  share the same running app with your custumers with a multi-tenany architecture

 
