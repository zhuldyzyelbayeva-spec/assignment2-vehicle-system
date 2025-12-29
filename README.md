# 2-assignment

##Project Overview

This project is a simple Vehicle Management System created to demonstrate
basic Object-Oriented Programming concepts in Java such as inheritance,
abstraction, method overriding, composition, and aggregation.

##Class Hierarchy

The abstract class Vehicle represents a general vehicle and contains common
fields such as brand and year. It also declares abstract methods for starting
and stopping the engine.

The classes Car, Motorcycle, and Truck extend the Vehicle class and override
the engine methods to provide specific behavior for each vehicle type.

The Driver class represents a vehicle driver. One driver can be associated
with multiple vehicles, demonstrating aggregation, while each vehicle has
a driver assigned to it, demonstrating composition.

## How to Run
1. Open the project in IntelliJ IDEA.
2. Make sure all `.java` files are inside the `src` folder.
3. Open `Main.java`.
4. Click the Run button.
5. The program output will appear in the console.

##Reflection

In this project, I learned how inheritance helps organize code.
I used one main class for common vehicle data and child classes
for different types of vehicles.
I also learned how method overriding works. Each vehicle has the
same methods, but they work differently depending on the vehicle type.


