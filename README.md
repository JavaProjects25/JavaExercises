# JavaExercises

A comprehensive collection of Java programming exercises focused on Object-Oriented Programming (OOP) principles and Design Patterns. This repository contains practical implementations of various design patterns and demonstrates core OOP concepts like interfaces, inheritance, polymorphism, and abstraction.

## 📋 Table of Contents

- [Overview](#overview)
- [Technologies](#technologies)
- [Project Structure](#project-structure)
- [Assignments](#assignments)
- [How to Run](#how-to-run)
- [Learning Objectives](#learning-objectives)

## 🎯 Overview

This repository serves as a learning resource for mastering Java programming with a focus on:
- Object-Oriented Programming principles
- Design Pattern implementations
- Interface-based design
- Inheritance and Polymorphism
- Code organization and best practices

## 🛠 Technologies

- **Java**: Core programming language
- **IDE**: IntelliJ IDEA (project files included)
- **Build System**: Standard Java compilation

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- IntelliJ IDEA (recommended) or any Java IDE
- Basic understanding of Java and OOP concepts

## 📁 Project Structure

```
JavaExercises/
├── Assignment1/          # Interfaces, Inheritance, and Polymorphism
├── Assingment2/          # Factory/Strategy Pattern
├── Assignment3/          # Abstract Factory Pattern
├── Assignment4/          # (In Development)
├── Assignment5/          # State Pattern
├── .gitignore            # Git ignore configuration
└── README.md             # This file
```

## 📚 Assignments

### Assignment 1: Interfaces and Polymorphism

**Concepts**: Interface implementation, Inheritance, Downcasting, Polymorphism

This assignment demonstrates the power of interfaces in Java through a flight-tracking system. Multiple entities (Birds, Drones, Satellites, UFOs, etc.) implement various interfaces based on their capabilities.

**Key Interfaces**:
- `IFlightEnabled` - For entities that can fly
- `ITrackable` - For entities that can be tracked
- `INavigable` - For navigation capabilities
- `IAutopilot` - For autonomous control
- `ICameraEnabled` - For image capture
- `ISensorEquipped` - For sensor-equipped entities
- `IOrbitEarth` - For orbiting objects
- And more...

**Classes Implemented**:
- Animal hierarchy (Bird, Bee, Dolphin)
- Aircraft (Jet, Drone, ReconDrone, Glider)
- Space objects (Satellite, SpaceProbe, AlienShip, UFO)
- Vehicles (Truck, SelfDrivingCar, AutonomousBoat)
- Special entities (Missile, WeatherBalloon, DragonFly)

### Assignment 2: Factory/Strategy Pattern

**Concepts**: Factory Pattern, Strategy Pattern, Dependency Injection

A pizza ordering system demonstrating the Factory pattern where different types of pizzas (Italian, Spanish, Senegalese) are created and served by chefs.

**Implementation**:
- `Chef` - Factory class that creates pizzas
- `Pizza` - Abstract pizza class
- `PizzaItalian`, `PizzaSpanish`, `PizzaSenegal` - Concrete pizza implementations
- `IPizzaPizza` - Pizza interface

### Assignment 3: Abstract Factory Pattern

**Concepts**: Abstract Factory Pattern, Product Families

A vehicle manufacturing system demonstrating the Abstract Factory pattern with two brands (Mercedes and Volvo) and two vehicle types (Car and Truck).

**Implementation**:
- `AbstractFactory` - Main factory interface
- `CarFactory`, `TruckFactory` - Concrete factory implementations
- `Mercedes`, `Volvo` - Abstract product classes
- `MercedesCar`, `MercedesTruck`, `VolvoCar`, `VolvoTruck` - Concrete products

### Assignment 4: (In Development)

Currently under development. Check back for updates.

### Assignment 5: State Pattern

**Concepts**: State Pattern, Behavioral Design Patterns

Demonstrates the State pattern through a Lion's mood system. The assignment includes both "before" and "after" implementations to show the improvement gained by using the State pattern.

**Implementation**:
- **Before**: Direct state management within the Lion class
- **After**: Clean separation using state objects
  - `Lion` - Context class
  - `IState` - State interface
  - `Hungry`, `NotHungry`, `Angry` - Concrete state implementations

The lion changes states interactively based on user input, demonstrating how the State pattern encapsulates state-specific behavior.

## 🚀 How to Run

### Using IntelliJ IDEA (Recommended)

1. Clone the repository:
   ```bash
   git clone https://github.com/JavaProjects25/JavaExercises.git
   cd JavaExercises
   ```

2. Open the project in IntelliJ IDEA:
   - File → Open → Select the JavaExercises directory

3. Navigate to any assignment folder (e.g., Assignment1)

4. Locate the `Main.java` file in the `src` directory

5. Right-click on `Main.java` and select "Run Main.main()"

### Using Command Line

1. Navigate to the assignment directory:
   ```bash
   cd Assignment1/JavaClass\ -\ Assignment01/src
   ```

2. Compile the Java files:
   ```bash
   javac *.java
   ```

3. Run the Main class:
   ```bash
   java Main
   ```

### Running Specific Assignments

- **Assignment 1**: Run `Main.java` in `Assignment1/JavaClass - Assignment01/src/`
- **Assignment 2**: Run `Main.java` in `Assingment2/src/`
- **Assignment 3**: Run `Main.java` in `Assignment3/src/`
- **Assignment 5**: 
  - Before State: Run `Main.java` in `Assignment5/src/BeforeState/`
  - After State: Run `Main.java` in `Assignment5/src/AfterState/` (interactive)

## 🎓 Learning Objectives

By working through these assignments, you will learn:

1. **Interface-Based Design**
   - Creating and implementing multiple interfaces
   - Understanding interface segregation
   - Working with polymorphism through interfaces

2. **Design Patterns**
   - Factory Pattern: Creating objects without specifying exact classes
   - Abstract Factory Pattern: Creating families of related objects
   - State Pattern: Changing object behavior based on internal state

3. **OOP Principles**
   - Encapsulation: Hiding internal details
   - Inheritance: Building class hierarchies
   - Polymorphism: One interface, multiple implementations
   - Abstraction: Working with abstract concepts

4. **Best Practices**
   - Code organization and structure
   - Separation of concerns
   - Clean code principles
   - Design pattern application

## 📝 Notes

- Each assignment is self-contained and can be run independently
- Diagram files (`.drawio`) are included for visual representation of patterns
- The project uses IntelliJ IDEA project structure (`.iml` files)

## 🤝 Contributing

This is a learning repository. Feel free to:
- Report issues or bugs
- Suggest improvements
- Add more design pattern examples
- Enhance documentation

## 📄 License

This project is for educational purposes.

---

**Happy Learning! 🚀**
