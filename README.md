# Test Project: Spring Boot Kotlin Configuration Properties

## Overview

This is a test project for verifying Spring Boot Configuration Properties Binding in a Kotlin-based Spring Boot application. The focus is on ensuring that properties defined via environment variables correctly map to a Kotlin data class

## Issue Description

When using Spring Boot 6 (Spring Boot 3.x) and Java 21, a property from Base class is not correctly bound when kotlin-reflect is present. Specifically, the type field in MyProperties.CustomA does not get assigned from environment variables.

## Running the Test

```
./gradlew test --tests MyPropertiesTest
```