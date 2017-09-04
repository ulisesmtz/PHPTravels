# PHPTravels
PHPTravels is a demo website where people can try out the software of an actual travel site. In this project, I have created test cases on the site that range from logging in to searching for hotels. Selenium Grid is used for test automation across different browsers, TestNG for report generation, and Maven handles all the dependencies.

# Compilation
To compile, at least one Selenium hub and node is required. The Selenium standalone server jar file can be downloaded <a href="http://www.seleniumhq.org/download/">here</a>. To start a hub in the command line, type 
```
java -jar selenium-server-standalone-x.x.x.jar -role hub
```
The hub should be up and running and can be double checked by going to: http://localhost:4444/grid/console. Once the hub is up, a node can be created by opening another command prompt and typing
```
java -jar selenium-server-standalone-x.x.x.jar -role webdriver -hub http://localhost:4444/grid/register
```
The Maven project can now be compiled and ran like any other Maven project.

# Output
All of the test results can be found in the folder test-output. The emailable-report.html displays the results formatted in tables with other useful information about the tests.
