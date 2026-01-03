# QA21_FirstCucumber – My First Cucumber + Selenium Project

GROK FEEDBACK

This is a learning project focused on automating web application testing using **Cucumber (BDD)**, **Selenium WebDriver**, and the **Page Object Model (POM)** in Java with Gradle.

## Project Description
- Automated scenarios: login, site navigation, adding/editing contacts.
- Uses Page Object Model for better code maintainability.
- Tests are written in Ukrainian/English using Gherkin syntax.

## Technologies
- Java 11+
- Cucumber 7.x
- Selenium 4.x
- Gradle
- WebDriverManager (for automatic driver management)

## Project Structure
src/main/java/com/ait/pages/                  → Page Objects (BasePage, HomePage, LoginPage, ContactPage)
src/test/resources/features/                  → Gherkin feature files (.feature)
src/test/java/com/ait/stepDefinitions/        → Step definitions
src/test/java/com/ait/TestRunner.java         → Test runner

 
## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/innadanylevska/QA21_FirstCucumber.git
   
   Navigate to the project folder.
Run the tests:bash

./gradlew clean test

(or gradlew.bat clean test on Windows)
Cucumber reports will be generated in build/reports/tests/ or target/cucumber-reports/.

Planned Improvements

Add Hooks for WebDriver initialization and cleanup.
Enhance Cucumber HTML reports.
Add tags (@smoke
, @regression
).
Set up GitHub Actions for CI/CD.

Thank you for checking out my project! This is my first automation framework 





