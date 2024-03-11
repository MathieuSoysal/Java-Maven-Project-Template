[![Quality Gate](https://sonarcloud.io/api/project_badges/quality_gate?project=MathieuSoysal_Kata-Datanumia)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
# Kata - Datanumia

[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=coverage)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia) 
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=MathieuSoysal_Kata-Datanumia&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia)
[![Javadoc](https://img.shields.io/badge/JavaDoc-online-green)](https://mathieusoysal.github.io/Kata-Datanumia/javadoc/)
[![Mutation Testing Report](https://img.shields.io/badge/Mutation_testing_report-online-green?link=https%3A%2F%2Fmathieusoysal.github.io%2FKata-Datanumia%2Fpitest%2F)](https://mathieusoysal.github.io/Kata-Datanumia/pitest/)
[![Fuzzing Test Report](https://img.shields.io/badge/Fuzzing_test_report-online-green)](https://app.code-intelligence.com/dashboard/projects/Kata-Datanumia-769e1c34/campaign_runs/last_run/overview)


## Table of Contents

- [Introduction](#introduction)
- [DevOps](#devops)
  - [Devcontainer](#devcontainer)
  - [GitHub Actions - SonarCloud](#github-actions-sonarcloud)
- [Refactor](#refactor)
  - [Bad Practices in Test](#bad-practices-in-test)
    - [Name of the Tests](#name-of-the-tests)
    - [Content of the Tests](#content-of-the-tests)
  - [Solution to Refactor Test](#solution-to-refactor-test)
    - [Test Parameterization](#test-parameterization)
    - [Rename Test Methods](#rename-test-methods)
  - [Bad Practices in the Main Code](#bad-practices-in-the-main-code)
    - [Too Many Methods in the Same Class](#too-many-methods-in-the-same-class)
    - [Too Many Parameters in the Same Method](#too-many-parameters-in-the-same-method)
    - [Bad Scoping of the Methods](#bad-scoping-of-the-methods)
  - [Solution to Refactor the Main Code](#solution-to-refactor-the-main-code)
    - [Split the Main Class](#split-the-main-class)
    - [Handling Incorrect Dice Values](#handling-incorrect-dice-values)
    - [Reduce the Number of Parameters](#reduce-the-number-of-parameters)
    - [Reduce the Size of Methods](#reduce-the-size-of-methods)
- [Conclusion](#conclusion)

## Introduction

This README provides an overview of the Kata - Datanumia project, showcasing its quality, code coverage, and maintainability metrics. It also outlines DevOps practices, including the use of Devcontainer for a consistent development environment and GitHub Actions integrated with SonarCloud for continuous code quality monitoring.

## DevOps

### Devcontainer

I have implemented a Devcontainer setup to facilitate development on this project. Devcontainer allows developers to use Visual Studio Code in a containerized environment, ensuring a consistent development environment for all team members. It automates the installation of essential tools such as Java, Maven, and Sonar Scanner.

To use Devcontainer, please install the [Remote - Containers](https://marketplace.visualstudio.com/items?itemName=ms-vscode-remote.remote-containers) extension in Visual Studio Code.

### GitHub Actions - SonarCloud

I have integrated GitHub Actions with SonarCloud to run code analysis on each push to the master branch. This integration checks the code quality and code coverage of the project, providing valuable insights into code maintainability and reliability.

To view the analysis results, click on the badge at the top of this README or [here](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia).

## Refactor

### 🔴 Bad Practices in Test

#### Name of the Tests

In some instances, test names do not adhere to appropriate naming conventions or lack consistency with other tests.

#### Content of the Tests

Tests may exhibit redundancy or perform unnecessary work, making them less efficient.

### 🟢 Solution to Refactor Test

#### Test Parameterization

I have introduced parameterized tests to reduce code repetition and improve test readability.

#### Rename Test Methods

To ensure uniformity in test method naming, I have aligned them with Java naming conventions and consistent naming practices across the project.

### 🔴 Bad Practices in the Main Code

#### Too Many Methods in the Same Class

The main class, Yatzy, contains an excessive number of methods, some of which are overly lengthy or do not adhere to proper naming conventions. This violates the Single Responsibility Principle.

#### Too Many Parameters in the Same Method

Certain methods suffer from an overload of parameters, leading to readability and maintainability issues. Additionally, some parameter names do not follow naming conventions.

#### Bad Scoping of the Methods

Methods lack consistent scoping, with some being static while others are not.

### 🟢 Solution to Refactor the Main Code

#### Split the Main Class

I have refactored the Yatzy class into multiple smaller classes, each with a specific role. To split the class, I used the design pattern *command*. I created a class for each kind of score calculator, and I created a class *YatzyMod* to manage the score calculator. The class *Yatzy* is now a facade and the *Single responsibility principle* is respected.

#### Handling Incorrect Dice Values

I added a method to validate dice values, ensuring that incorrect values result in an exception.

#### Reduce the Number of Parameters

To enhance code readability, I reduced the number of parameters in certain methods by introducing a new class, "Dices," to manage dice-related operations.

#### Reduce the Size of Methods

I have reduced the size of methods to improve code comprehension and maintainability. To do that I used IntStream and Stream API.

## Conclusion

Thank you for exploring the Kata - Datanumia project. I have focused on enhancing code quality, maintainability, and test readability, as well as implementing DevOps practices for a smoother development experience, including the use of Devcontainer and [GitHub Actions integrated with SonarCloud](https://sonarcloud.io/summary/new_code?id=MathieuSoysal_Kata-Datanumia). Your feedback and contributions are greatly appreciated.
