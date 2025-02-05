# React Native UI Test Automation

This repository contains automated UI tests for ***`React Native`*** Android application, utilizing Java, Appium, and JUnit 5.

## Overview

The automated tests validate various functionalities of the React Native application, focusing on components such as:
- Buttons
- Date pickers
- Input fields
- Modals
- Radio buttons

## Prerequisites

Before running the automated tests, ensure the following are installed:

- **Java Development Kit (JDK) 17**
- **Maven**
- **Appium Server**
- **Android Studio** with the Android SDK
- **Android emulator** or a physical device with the target application installed

## Setup
1. **Clone this repository:**
   ```bash
   git clone https://github.com/donatagrei/react-native-ui-tests.git
   
2. **Open the project in your preferred Java IDE** (e.g., IntelliJ IDEA, Eclipse, etc.).

3. **Install the required dependencies using Maven:**
   ```bash
   mvn clean install

## Configuration

- **Appium Server:** ensure the Appium server is running and accessible at 127.0.0.1 on any free port.
- **Device Capabilities:** the BaseTest.java file initializes the Appium driver with the following capabilities:
  ```bash
  udid: emulator-5554
  platformName: Android
  platformVersion: 12.0
  automationName: UiAutomator2
  appPackage: com.akul.reactnativeui
  appActivity: host.exp.exponent.MainActivity
  
Adjust these settings in **BaseTest** as needed to match your testing environment.

## Tests execution

### Using Maven
Run the following Maven command to execute all the tests:
  ```bash
  mvn test
  ```

### Using IDE
Tests can also be run directly from an IDE (such as IntelliJ IDEA or Eclipse) by selecting and executing the test classes (e.g., ButtonTest, DatePickerTest).

## Folder structure

- **/src/test/java/pages:** contains the utility classes, test pages.
- **/src/test/java/tests:** contains the test cases.

## Project structure

Tests are structured using POM (Page Object Model), allowing for easy readability and maintenance. The tests are organized as follows:
- **BaseTest**: sets up and tears down the Appium driver for each test.
- **ButtonTest**: tests related to button interactions.
- **DatePickerTest**: tests for date picker functionalities.
- **InputTest**: tests for input field interactions.
- **ModalTest**: tests for modal dialogs.
- **RadioButtonTest**: tests for radio button selections.

## Dependencies

The project relies on the following dependencies, as specified in the `pom.xml` file:

- **Appium Java Client**: version 9.3.0
- **JUnit Jupiter API**: version 5.10.2
- **JUnit Jupiter Params**: version 5.10.2

## Author

Donata Greičiūtė - donata.greiciute97@gmail.com
