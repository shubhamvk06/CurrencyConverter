# CurrencyConverter

Instructions to run Project



There are 2 files in the in the project 
1) currencyToText.java - Main java code for the assignment
2) currencyToTextTest.java - Test cases java file for running the test cases





1) If Running in Eclipse (Recommended)

A) Import this project as Import Git Project. open project in eclipse. you can open in vs code also but eclipse recommended here.

B) Add all  the reqired jars in the project.


Download the required jars from the given links
	https://repo1.maven.org/maven2/junit/junit/4.11/junit-4.11.jar
	https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar
	
	
Right click on the project name > Build Path > Configure Build Path > Libraries > Add External Jars
and select the 2 jar files provided with the project


C) Run currencyToText.java file and give desired input ( -1 < input < 1000000 )


D) Check the output on the console panel which is generally below the project window.


E) Open the currencyToTextTest.java to see the test cases


F) Run the currencyToTextTest.java as JUnit Test file to see the result of test cases














2) If Running on CMD	


1) Compile the currencyToText.java with javac command
		Ex. Javac currencyToText.java


2) Run the currencyToText.java with java command
		Ex. Java currencyToText  (Don’t need to give extension here)


3) Now Use this template to compile Test case file
		javac -cp <junit-jar-file>;. TestClass1.java TestClass2.java		

Give junit jar file path provided with the project
		Ex. javac -cp junit-4.11.jar; currencyToTextTest.java



4) Now, Use this template to run the test cases file

java -cp <junit-jar>;<hamcrest-jar>;. org.junit.runner.JUnitCore  TestClass1 TestClass2

Give jar files’ path provided with the project.

Ex. java -cp junit-4.11.jar; hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore  currencyToTextTest.java


