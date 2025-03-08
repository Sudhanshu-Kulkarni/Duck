This project demonstrates the use of the Strategy design pattern to model various duck behaviors, such as flying, swimming, and quacking. Each behavior is encapsulated in its own class, allowing for flexible and interchangeable behavior assignments.

## Table of Contents

- [Overview](#overview)
- [Class Structure](#class-structure)
- [Getting Started](#getting-started)


## Overview

This project showcases how different types of ducks can exhibit varying behaviors by assigning specific strategies for flying, swimming, and quacking.

## Class Structure

- **Main.java**: Contains the `Main` class, which initializes and demonstrates different duck behaviors.
- **Duck.java**: Abstract base class representing a duck, with references to `FlyBehaviour`, `SwimBehaviour`, and `QuackBehaviour` interfaces.
- **FlyBehaviour.java**: Interface defining the `fly()` method for flying behaviors.
- **SwimBehaviour.java**: Interface defining the `swim()` method for swimming behaviors.
- **QuackBehaviour.java**: Interface defining the `quack()` method for quacking behaviors.
- **Fly.java**: Implements `FlyBehaviour` for ducks that can fly.
- **NotFly.java**: Implements `FlyBehaviour` for ducks that cannot fly.
- **Swim.java**: Implements `SwimBehaviour` for ducks that swim.
- **Float.java**: Implements `SwimBehaviour` for ducks that float.
- **Drown.java**: Implements `SwimBehaviour` for ducks that drown.
- **Quack.java**: Implements `QuackBehaviour` for ducks that quack.
- **Squeak.java**: Implements `QuackBehaviour` for ducks that squeak.
- **MuteQuack.java**: Implements `QuackBehaviour` for ducks that are mute.
- **MallardDuck.java**: Extends `Duck`, representing a mallard duck with specific behaviors.
- **RedheadDuck.java**: Extends `Duck`, representing a redhead duck with specific behaviors.
- **RubberDuck.java**: Extends `Duck`, representing a rubber duck with specific behaviors.
- **DecoyDuck.java**: Extends `Duck`, representing a decoy duck with specific behaviors.

## Getting Started

To run the Program:

1. **Clone the repository**:
   ```bash
   git clone https://github.com/Sudhanshu-Kulkarni/Duck.git
   ```
2. **Compile the Java files**:
   ```bash
   javac *.java
   ```
3. **Run the simulation**:
   ```bash
   java Main
   ```
