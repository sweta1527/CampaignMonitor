
Number of requirements fullfilled: 7
Requirements fullfilled: Requirement 1-4, Requirement 5 and Requirement 7-8

Notes
-----
1. A Maven project has been created(name: CampaignMonitor) containing source code for Requirement1-Requirement4.
2. Jasmine testing framework has been used to create and test the JavaScript Requirement5.
3. SQL.txt contains the answers to the Requirement 7-8


Requirement 1
-----------------
Language: Java
Java Version: 10
Unit Testing: JUnit 4.10
IDE: Eclipse
Maven project Name: CampaignMonitor
Package: requirement1
Main class: CampaignMonitor\src\main\java\requirement1\StringCheck.java
JUnit Test Class: CampaignMonitor\src\test\java\requirement1\StringCheckTest.java

What the program does:
When the main class is run, the 'Scanner' object requests the user to input a string. The input is accepted by the program and the string is validated for being null/empty. The program returns a boolean true/false depending upon the input.

The test class can be run via the JUnit testing framework.

Requirement 2
-----------------
Language: Java
Java Version: 10
Unit Testing: JUnit 4.10
IDE: Eclipse
Maven project Name: CampaignMonitor
Package: requirement2
Main class: CampaignMonitor\src\main\java\requirement1\DivisorPrint.java
JUnit Test Class: CampaignMonitor\src\test\java\requirement1\DivisorPrintTest.java

What the program does:
The main class contains a static input of value '60'. This program can be modified to use the scanner object and accept user input.
The class then validates the input integer and computes the divisors for the provided input.
An array of computed divisors is returned.

The test class can be run via the JUnit testing framework.


Requirement 3
-----------------
Language: Java
Java Version: 10
Unit Testing: JUnit 4.10
IDE: Eclipse
Maven project Name: CampaignMonitor
Package: requirement3
Main class: CampaignMonitor\src\main\java\requirement3\Shapes.java
JUnit Test Class: CampaignMonitor\src\test\java\requirement3\ValidateTriangleTest.java and TriangleAreaCalcTest.java

What the program does:
The main class contains a static input of value for the 3 sides of the triangle. This program can be modified to use the scanner object and accept user input and extend the appropriate Scanner utility validations.
The class then passes the inputs to TriangleAreaCalculator class to validate the inputs and compute the area of the triangle.
All of the classes and interfaces used to fulfill this requirement are under the folder: CampaignMonitor\src\main\java\requirement3.

The test class can be run via the JUnit testing framework.


Requirement 4
-----------------
Language: Java
Java Version: 10
Unit Testing: JUnit 4.10
IDE: Eclipse
Maven project Name: CampaignMonitor
Package: requirement4
Main class: CampaignMonitor\src\main\java\requirement4\CommonInArray.java
JUnit Test Class: CampaignMonitor\src\test\java\requirement4\CommonInArrayTest.java

What the program does:
The main class contains a static input. This program can be modified to use the scanner object and accept user input. The Scanner utilities can be used to validate the inputs.
The program then iterates through the input integers to derive the values that are most common.
An array of derived integers is returned.

The test class can be run via the JUnit testing framework.


Requirement 5
-----------------
Language: JavaScript
Unit Testing: Jasmine 3.2.1
Source JS file: campaignMonitor_Java\Requirement5\src\StringJS.js
Unit Test file: campaignMonitor_Java\Requirement5\spec\StringJSSpec.js

Details:

The JavaScript was developed and tested using the Jasmine JavaScript testing framework. 
Source file:
The StringJS.js file contains methods two methods, 'startsWith' and 'endsWith' that take in a single argument and returns true/false depending on whether the input string is a prefix or suffix of this.

Test File:
StringJSSpec.js file passes a series of inputs into the source java scripts and validates the output against the expected.

To execute the test file, please double click the file: campaignMonitor_Java\Requirement5\SpecRunner.html


Requirement 7-8
----------------
Database: MySQL 8.0
Query language: Standard form of SQL
Query location: SQL.txt

Please note: The requirement numbers on the provided SQL.txt file were a bit confusing. The numbers have been left unchanged, however, each section contains details of the 'question' that has been answered.


