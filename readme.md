# State Design Pattern

This repository contains a Java implementation of the **State Design Pattern**, demonstrating how an object can alter its behavior when its internal state changes. 

## 🚦 Example: Traffic Light System
This project models a simple traffic light system where the light smoothly transitions between different states: **Red**, **Green**, and **Yellow**. Rather than using massive `if/else` statements, the pattern delegates the behavior and transition logic to dedicated state classes.

### Code Structure
- **`TrafficLightState.java`**: The core state interface defining the actions (`next()` and `showSignal()`).
- **`RedState.java`, `GreenState.java`, `YellowState.java`**: Concrete state classes implementing the behavior for each specific light color and defining the rules for transitioning to the next state.
- **`TrafficLight.java`**: The context class that maintains a reference to the current `TrafficLightState` and delegates state-specific behavior to it.
- **`Usage.java`**: The client code that demonstrates the automated state transitions in action.