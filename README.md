React Native UI Test Automation
This repository contains automated UI tests for a React Native application, utilizing Java, Appium, and JUnit 5.

Overview
The automated tests validate various functionalities of the React Native application, focusing on components such as buttons, date pickers, input fields, modals, and radio buttons.

Prerequisites
Before running the automated tests, ensure the following are installed:

Java Development Kit (JDK) 17
Maven
Appium Server
Android Studio with the Android SDK
An Android emulator or a physical device with the target application installed
Setup
Clone the repository:

bash
Kopijuoti
Redaguoti
git clone https://github.com/yourusername/react-native-ui-tests.git
cd react-native-ui-tests
Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

Install the required dependencies using Maven:

bash
Kopijuoti
Redaguoti
mvn clean install
Configuration
Appium Server: Ensure the Appium server is running and accessible at 127.0.0.1 on any free port.

Device Capabilities: The BaseTest.java file initializes the Appium driver with the following capabilities:

udid: emulator-5554
platformName: Android
platformVersion: 12.0
automationName: UiAutomator2
appPackage: com.akul.reactnativeui
appActivity: host.exp.exponent.MainActivity
Adjust these settings in BaseTest.java as needed to match your testing environment.

Running the Tests
To execute the tests, use the following Maven command:

bash
Kopijuoti
Redaguoti
mvn test
Test Structure
The tests are organized as follows:

BaseTest.java: Sets up and tears down the Appium driver for each test.
ButtonTest.java: Tests related to button interactions.
DatePickerTest.java: Tests for date picker functionalities.
InputTest.java: Tests for input field interactions.
ModalTest.java: Tests for modal dialogs.
RadioButtonTest.java: Tests for radio button selections.
Dependencies
The project relies on the following dependencies, as specified in the pom.xml file:

Appium Java Client: Version 9.3.0
JUnit Jupiter API: Version 5.10.2
JUnit Jupiter Params: Version 5.10.2
Author
Your Name – your.email@example.com
