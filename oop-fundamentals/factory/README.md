# Project: Item Management System

This project involves creating an Item Management System with specific requirements and guidelines. The system will include the creation of various item classes, reading data from CSV files, implementing design patterns, and utilizing factory methods for object creation.

## Project Requirements
- Create an `Item` superclass to use as an API.
- Derive 3 classes from `Item`: `FoodItem`, `ElectronicItem`, and `ServiceItem`. Each class must override `toString()`.
- Create all objects from CSV files (`FoodItemCSV.txt`, `ElectronicItemCSV.txt`, `ServiceItemCSV.txt`).
- Create a `FileUtil` class for reading and writing text files.
- Add a `FoodItem` class constructor that accepts a CSV string as its sole parameter and is responsible for parsing the CSV string.
- Apply the Factory Design Pattern to abstract the creation of all objects.
  - `FoodItemFactory` implements the Factory Method pattern.
  - `ElectronicItemFactory` implements a Lazy Singleton and Factory Method patterns.
  - `ServiceItemFactory` implements an Eager Singleton and Factory Method patterns.
- Create an `AbstractStore` abstract class.
- Derive a `Store` class from `AbstractStore` and use the `Store`'s `demo()` method to create several objects using the Factories and sort them by:
  1. ID
  2. Name
  3. Price

## Additional Instructions
- Ensure that `Driver.java` only contains the call to the demo class and nothing else. Do not change the file structures.
- Submission: Push all the commits to GitHub and submit to Canvas on time. A 20 point deduction will be applied for late or incorrect submissions.

For more information, refer to the project guidelines and requirements.
