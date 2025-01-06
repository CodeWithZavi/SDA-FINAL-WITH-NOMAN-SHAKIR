# Layered Architecture System

## Overview
This project follows a **Layered Architecture** design, divided into distinct layers, each responsible for a specific functionality. The system is developed following key principles such as **Separation of Concerns**, **High Cohesion**, **Low Coupling**, and **Dependency Inversion** to ensure maintainability and scalability.

---

## System Layers

- **Presentation Layer**: Manages user interactions and UI components.
  - `MainApp.java`
  - `DoorLockUI.java`
  - `SecCamUI.java`
  - `TempServiceUI.java`
  
- **Business Layer**: Contains the core application logic.
  - `DoorLockService.java`
  - `SecCamService.java`
  - `TempService.java`

- **Data Layer**: Handles data persistence, storage, and retrieval.
  - `DoorLockRepository.java`
  - `SecCamRepository.java`
  - `TempRepository.java`

- **Model Layer**: Defines the data structures and states used across the system.
  - `DoorLockState.java`
  - `SecCamState.java`
  - `TempData.java`

---

## Key Design Principles

### 1. **Layered Architecture**
Each layer communicates only with adjacent layers, ensuring separation of concerns.
- **Code Example**: `DoorLockUI.java` interacts with `DoorLockService.java`, not directly with `DoorLockRepository.java`.

### 2. **High Cohesion**
Classes should focus on a single responsibility.
- **Code Example**: `TempRepository.java` only manages temperature data, nothing else.

### 3. **Low Coupling**
Classes should minimize dependencies on each other.
- **Code Example**: `MainApp.java` calls `TempService.java` without directly interacting with `TempRepository.java`.

### 4. **Dependency Inversion Principle (DIP)**
High-level modules should depend on abstractions, not low-level modules.
- **Code Example**: `DoorLockUI.java` interacts with `DoorLockService.java`, which abstracts the data layer.

### 5. **Separation of Concerns (SoC)**
Each layer has a distinct responsibility to handle.
- **Code Example**: `Business Layer` handles application logic, while the `Data Layer` manages data storage.

### 6. **Encapsulation**
Hide implementation details and expose only necessary functionality.
- **Code Example**: `TempData.java` uses getters and setters to encapsulate temperature data.

### 7. **Single Responsibility Principle (SRP)**
Each class should have one reason to change.
- **Code Example**: `SecCamService.java` handles only security camera logic, leaving other responsibilities to other classes.

---

## Version History

### Version 1 (V1)
- Matches the class diagram and represents the initial version.
- Structured in **four layers**: Presentation, Business, Data, and Model.

### Version 2 (V2)
- An enhanced version of V1, introducing additional UI components and services for better functionality.
- Updated **UI Layer** and **Business Layer** for enhanced interactivity and modularity.

---

## How to Run the Application

### Prerequisites:
- Java Development Kit (JDK) version 8 or higher.
- Any IDE (e.g., IntelliJ IDEA, Eclipse) or text editor (e.g., VS Code).
  
### Steps to Run:

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
2. Download 
git clone  or You can download a zup file

3. **Run the project**
   java presentation.MainApp
**Conclusion**
This system is designed using Layered Architecture, ensuring clear responsibilities across different layers,
 low coupling, and high cohesion. It's easily extensible and maintainable, with the core application logic separated from the user interface and data persistence logic.

**Why v2 **

In this version, I've added code examples for each principle in a single line to make the principles clearer. Let me know if you need any more modifications!

