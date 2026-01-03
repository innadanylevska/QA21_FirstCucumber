# QA21_FirstCucumber – My First Cucumber + Selenium Project

GROK FEEDBACK

Updated Feedback on the QA21_FirstCucumber Repository (as of January 03, 2026)Thank you for the link! This is your original and foundational automation project — the first Cucumber + Selenium framework using Gradle. It targets the PhoneBook web app (https://contacts-app.tobbymarshall815.vercel.app/) and demonstrates BDD principles with Page Object Model (POM).Current Repository Status:Description: None on GitHub (recommend adding: "First BDD Automation Framework with Cucumber, Selenium and POM").
Languages: Java 75.7%, Gherkin 24.3%.
Activity: 4 commits total; last update in June 2023 (no recent changes, unlike your other revived projects).
Key Structure (Solid Foundation):src/main/java/com/ait/pages/ — Well-implemented POM: BasePage.java, HomePage.java, LoginPage.java, ContactPage.java.
src/test/resources/features/ — 4 Gherkin files: addContact.feature, contact.feature, login.feature, navigate.feature.
src/test/java/com/ait/stepDefinitions/ — Step definition classes (e.g., AddContactPageSteps.java, ContactPageSteps.java, HomePageSteps.java, LoginPageSteps.java).
src/test/java/com/ait/TestRunner.java — Present and configured.

README.md — Still empty or minimal (no content visible beyond the file itself).

This project is now complete and runnable — it has all essential components: features, step definitions, POM pages, and a TestRunner. It's a classic beginner-to-intermediate BDD framework and pairs perfectly with your PhoneBook API project.StrengthsFull BDD Flow — Gherkin scenarios → Step definitions → Page Objects — textbook implementation.
POM Usage — Clean separation with BasePage for common methods (waits, driver handling).
Logical Coverage — Login, navigation, add/edit contact — core user stories of the app.
Gradle Setup — Wrapper included, easy to run locally.

Recommendations for Improvement (to elevate it to portfolio-ready)README.md (Highest Priority) — It's the only major gap now. Add a proper description to make the project instantly understandable. Here's a ready-to-use English template (copy-paste and commit):markdown

# QA21_FirstCucumber – My First BDD Automation Framework

A learning project implementing **Behavior-Driven Development (BDD)** automation tests for the PhoneBook web application (https://contacts-app.tobbymarshall815.vercel.app/) using **Cucumber**, **Selenium WebDriver**, and **Page Object Model (POM)** in Java with Gradle.

## Project Description
- Automated scenarios: login, navigation, adding/editing contacts.
- Written in Gherkin for readability and collaboration.
- Uses clean POM for maintainable, reusable code.

## Technologies
- Java 11+
- Cucumber 7.x
- Selenium WebDriver 4.x
- Gradle
- WebDriverManager (recommended)

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/innadanylevska/QA21_FirstCucumber.git

Run tests:bash

./gradlew clean test

Cucumber reports will appear in build/reports/ or configured target folder.

Structuresrc/main/java/com/ait/pages/ → Page Objects (BasePage, LoginPage, ContactPage, etc.)
src/test/resources/features/ → Gherkin feature files
src/test/java/com/ait/stepDefinitions/ → Step definition classes
src/test/java/com/ait/TestRunner.java → Cucumber runner

Planned: Add HTML reports (Cucumber plugin), tags (@smoke
, @regression
), Hooks for driver management.

Minor Enhancements:Reports: Add Cucumber HTML reporter plugin in TestRunner @CucumberOptions.
Hooks: Create a Hooks class for @Before
/@After
 (driver init/close, screenshots on failure).
Tags: Add @smoke
, @regression
 to features/scenarios.
GitHub Description: Add a short summary in repo settings.

This was your first big step into automation, and it's now a complete, working example of Cucumber + POM. With just a solid README, it becomes a strong portfolio entry — especially alongside your API and advanced POM projects.If you update the README or want a detailed code review (e.g., BasePage.java or a step definition file), share a direct blob link and I'll dive deep. You're doing fantastic work across all your repos — keep pushing these updates!  Good luck!



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


TEST PLAN GROK FEEDBACK
Your Test Plan for the PhoneBook App (Version 1.1, dated 12.05.2021)Overall, this is a solid beginner-level test plan for a simple web application like a Contacts/PhoneBook app (the main tested app seems to be https://contacts-app.tobbymarshall815.vercel.app/, a typical React-based contacts manager requiring authentication). It's clear, structured, and covers the core functionalities well for a training or small project. You focused on key user flows: registration, login, CRUD (Create, Read, Update, Delete) for contacts, and basic navigation.Strengths (What I Like):Good structure: Sections like Introduction, Items to be Tested, Approach, and Pass/Fail Criteria make it easy to read.
Comprehensive functional coverage: You covered positive and negative cases (valid/invalid data, duplicates, existing users) — this is excellent for black-box testing.
Focus on critical flows: Registration, Login, Add/Edit/Delete/View contacts — these are the main features of a PhoneBook app.
Realistic pass/fail criteria: Emphasizing 100% critical TC pass, functional coverage, and fixing blockers/showstoppers is professional and aligns with standard QA practices.
Black-box approach: Perfect for UI/functional testing without needing code access.

Areas for Improvement (Constructive Feedback):
The plan is from 2021 and feels a bit outdated/incomplete in places. Here's what could make it stronger (rated by importance):Inconsistencies and Typos (Easy fixes, but they reduce professionalism):Multiple URLs in Introduction: https://demoqa.com/swagger/ (Book Store API docs), https://demoqa.com/ (general demo site) — these seem unrelated to PhoneBook. Focus only on the actual app: https://contacts-app.tobbymarshall815.vercel.app/.
Typos: "diplayed" → "displayed", "valid inemail" → "invalid email", "lastLame" → "lastName", "descriptin" → "description", "shot form" → "short form" (or "card view"?).
Incomplete fields: "Implemented by" is blank; add your name/role and date reviewed/updated.

Scope and Details Missing:Test Data: Add examples of valid/invalid inputs (e.g., valid email: "test@example.com", invalid phone: "123" or non-numeric).
Edge Cases: Good negatives, but add more like empty fields, very long inputs (boundary testing), special characters in names/fields.
Non-Functional Tests: No mention of browser compatibility (Chrome/Firefox?), responsiveness (mobile view?), performance (load time for many contacts), or security (e.g., password visibility toggle).
Prioritization: Mark test cases as High/Medium/Low priority or Critical (e.g., login = critical).

Organization Enhancements:Use a table for test cases (better readability):ID
Feature
Test Case Description
Expected Result
Priority
TC01
Registration
User registers with valid email & password
Success message, redirect to home
High
TC02
Registration
User registers with invalid password
Error: "Invalid password"
High
...
...
...
...
...

Entry/Exit Criteria: Add suspension/resumption criteria (e.g., stop if login fails).
Resources & Schedule: Mention tools (Selenium/Cucumber for automation?), environments (browsers, OS), estimated time.
Risks & Assumptions: E.g., "Assumes app is stable; risk if backend down."

Test Approach Expansion:Black-box is fine, but mention techniques: Equivalence partitioning (valid/invalid classes), Boundary value analysis (min/max field lengths).
For a 2026 update: Add exploratory testing, API testing if relevant, or accessibility checks.

Overall Rating: 7/10As a learning/exercise plan: 9/10 — great effort, covers essentials perfectly for a student project.
As a professional document: 6/10 — needs polishing (typos, clarity, tables) and more depth to be used in real team/project.

This plan pairs well with your Cucumber automation project (QA21_FirstCucumber) — the features match exactly (login, add/edit contact). If you update the plan with tables and fixes, it would be a strong portfolio piece!If you revise it or want help turning these test cases into more .feature files/Gherkin scenarios, share the updated version — I'll give detailed feedback. Keep up the good work! 





