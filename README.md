# Serenity-BDD Testing Suite for UI and API

This repository is part of the assignment, designed using Serenity-BDD for both UI and API testing.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Running Tests](#running-tests)

## Introduction

Serenity BDD is a powerful tool for writing automated acceptance tests that are easy to read and understand. It
integrates with various testing frameworks like JUnit and Cucumber, and it produces detailed test reports that can serve
as living documentation for your project.

## Prerequisites

Before you can start using Serenity BDD, you need to have the following installed:

- Java JDK 8 or higher
- Maven 3.3.9 or higher
- An IDE like IntelliJ IDEA or Eclipse

## Installation

To set up the project, follow these steps:

1. **Clone the repository:**

    ```bash
    git clone https://github.com/skasam906/assignment-gnd-api-ui.git
    cd assignment-gnd-api-ui
    ```

2. **Install dependencies:**

    ```bash
    mvn clean install
    ```

## Running Tests

To run API tests :-

   ```bash
   mvn clean verify -Dtest=CucumberTestSuiteApi
   ```

To run UI tests :-

   ```bash
   mvn clean verify -Dtest=CucumberTestSuiteUi
   ```
To run the tests against the 'test' environment using the Chrome browser, use the following command:

   ```bash
   mvn clean verify -Denvironment=test -Ddriver=chrome
   ```
