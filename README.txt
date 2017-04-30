TO Run :
Required : JDK 8 and above
clean your project 
1. Go to ../springBootWeb directory where main pom.xml is located and run below command"
	mvn clean:clean
2. convert to eclipse project"
	mvn eclipse:eclipse
3. build without jUnit test
	mvn clean install -Dmaven.test
4. run application
	java -jar target/bootWeb-0.0.1-SNAPSHOT.jar --server.port=8181
5. open browser and run below URL
	http://localhost:8181/hello
6. output would be:
	{value : hello World}
Note: I am running at port 8181 as you might find that 8080 port is already used