Initialize maven:
mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false -DgroupId=com.haingue -DartifactId=check-list-rest -Dpackage=com.haingue.checklist

Build Project:
mvn package

Build test:
mvn test

Compile Project:
mvn compile

Generate Site:
mvn site

Exemple:
mvn clean compile testpackage
