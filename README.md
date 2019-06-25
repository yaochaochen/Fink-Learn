# Fink-Learn
Java &amp; Scala
## Java
### Fink1.8 Of Java Build Project
$ mvn archetype:generate                               \
      -DarchetypeGroupId=org.apache.flink              \
      -DarchetypeArtifactId=flink-quickstart-java      \
      -DarchetypeVersion=1.8.0
### Inspect Project
tree quickstart/
"""quickstart/
├── pom.xml
└── src
    └── main
        ├── java
        │   └── org
        │       └── myorg
        │           └── quickstart
        │               ├── BatchJob.java
        │               └── StreamingJob.java
        └── resources
            └── log4j.properties"""      
      
## Scala
### Flink1.8 Of Scala Build Project
 $ mvn archetype:generate                               \
      -DarchetypeGroupId=org.apache.flink              \
      -DarchetypeArtifactId=flink-quickstart-scala     \
      -DarchetypeVersion=1.8.0
  ### Inspect Project
  tree quickstart/
quickstart/
├── pom.xml
└── src
    └── main
        ├── resources
        │   └── log4j.properties
        └── scala
            └── org
                └── myorg
                    └── quickstart
                        ├── BatchJob.scala
                        └── StreamingJob.scala
                        
 ## Build Project
 If you want to build/package your project, go to your project directory and run the ‘mvn clean package’ command. You will find a JAR file that contains your application, plus connectors and libraries that you may have added as dependencies to the application: target/<artifact-id>-<version>.jar.

Note: If you use a different class than StreamingJob as the application’s main class / entry point, we recommend you change the mainClass setting in the pom.xml file accordingly. That way, Flink can run the application from the JAR file without additionally specifying the main class.


