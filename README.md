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

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor of your choice (e.g., IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/real-estate-management-system.git
    ```
2. Navigate to the project directory:
    ```sh
    cd real-estate-management-system
    ```
3. Open the project in your preferred IDE.

## Usage

1. Open the `Main.java` file in your IDE.
2. Run the `Main` class.
3. The console will display the results of various operations, including total prices and average square meters of different property types, as well as filtered properties based on the number of rooms and living rooms.

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
