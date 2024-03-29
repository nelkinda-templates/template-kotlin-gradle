# template-kotlin-gradle <!-- TODO change title -->

<!-- TODO select and adjust badges -->
[![GitHub CI/CD](https://github.com/nelkinda-templates/template-kotlin-gradle/workflows/CI/CD/badge.svg)](https://github.com/nelkinda/template-kotlin-gradle/actions)
[![Travis CI/Cd](https://travis-ci.org/nelkinda/template-kotlin-gradle.svg)](https://travis-ci.org/nelkinda/template-kotlin-gradle)

<!-- TODO Replace this README -->

Template for single-module Kotlin projects at Nelkinda.

## Features
- `Makefile` as wrapper to make standard workflows as well as pipeline reproduction easier to access.
- Extensive **static code analysis** to ensure the quality of certain aspects of structure using _Detekt_, _KtLint_, and _SonarLint_.
- Extensive **dynamic code analysis** to ensure the quality of behavior using _JUnit 5_, _Cucumber_, _JaCoCo_, and _Pitest_.
- Tracking of analysis reports using _SonarQube_.
- Preconfigured CI/CD **pipelines** for _Bitbucket_, _GitHub_, _GitLab_, and _Travis_.
- Available on: Bitbucket, GitHub, GitLab.

## How to use

### GitHub Template
- Create a new repository based on this template: https://github.com/nelkinda-templates/template-kotlin-gradle/generate
- Open the repository in your favorite IDE, for example IntelliJ IDEA.
- Look for all the TODO comments and solve them to replace placeholders, including those in this file.

## Reports
The reports are available locally, after running a build using `make`.

* [SonarLint Report Main](build/reports/sonarlint/sonarlintMain/report.html)
* [SonarLint Report Test](build/reports/sonarlint/sonarlintTest/report.html)
* [Test Report](build/reports/test/test/html/index.html)
* [Jacoco Test Coverage Report](build/reports/jacoco/test/html/index.html)
* [PiTest Mutation Test Report](build/reports/pitest/index.html)
