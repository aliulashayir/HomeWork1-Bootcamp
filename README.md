# Real Estate Management System

## Overview

The Real Estate Management System is a Java application that manages different types of properties, such as houses, villas, and summer houses. The application follows a layered architecture, ensuring separation of concerns and adhering to clean code principles. The system calculates total prices, average square meters, and filters properties based on the number of rooms and living rooms.

## Table of Contents

- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Classes and Methods](#classes-and-methods)
- [Contributing](#contributing)
- [License](#license)

## Project Structure


### Model Layer

- **Property.java**: Abstract base class for all property types.
- **House.java**: Represents a house, extends `Property`.
- **Villa.java**: Represents a villa, extends `Property`.
- **SummerHouse.java**: Represents a summer house, extends `Property`.

### Repository Layer

- **PropertyRepository.java**: Manages collections of different property types.

### Service Layer

- **PropertyService.java**: Contains business logic for calculating total prices, average square meters, and filtering properties.

### Presentation Layer

- **Main.java**: Entry point of the application, demonstrating the functionality by calling methods from the `PropertyService` class.

## Classes and Methods

### `model.Property`

- **Attributes**:
  - `double price`
  - `double squareMeter`
  - `int numberOfRooms`
  - `int numberOfLivingRooms`
- **Methods**:
  - `double getPrice()`
  - `double getSquareMeter()`
  - `int getNumberOfRooms()`
  - `int getNumberOfLivingRooms()`

### `model.House`, `model.Villa`, `model.SummerHouse`

- Extend `Property` class and inherit its attributes and methods.

### `repository.PropertyRepository`

- **Attributes**:
  - `List<House> houses`
  - `List<Villa> villas`
  - `List<SummerHouse> summerHouses`
- **Methods**:
  - `List<House> getHouseList()`
  - `List<Villa> getVillaList()`
  - `List<SummerHouse> getSummerHouseList()`

### `service.PropertyService`

- **Attributes**:
  - `PropertyRepository propertyRepository`
- **Methods**:
  - `double getTotalPriceOfHouses()`
  - `double getTotalPriceOfVillas()`
  - `double getTotalPriceOfSummerHouses()`
  - `double getTotalPriceOfAllProperties()`
  - `double getAverageSquareMeterOfHouses()`
  - `double getAverageSquareMeterOfVillas()`
  - `double getAverageSquareMeterOfSummerHouses()`
  - `double getAverageSquareMeterOfAllProper
