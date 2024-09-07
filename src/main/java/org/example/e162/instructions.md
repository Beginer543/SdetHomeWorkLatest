# Exercise: Overriding Methods with Different Access Levels in a Pet Management System

## Objective
Learn how to override methods in Java, understand the impact of access modifiers on method visibility in subclasses, and implement method overriding in a hierarchy of animal classes. This exercise will help you understand how to implement method overriding across a parent and multiple child classes, and how access modifiers influence which methods can be overridden and accessed.

## Instructions

**Step 1: Create the `Animal` Parent Class**

1. **Create the `Animal.java` class** with the following:
    - **Instance Variables:**
        - Declare an instance variable `type` to store the type of animal.
    - **Constructor:**
        - Create a constructor to initialize the `type` instance variable.
    - **Public Method:**
        - Create a public method named `eat` that prints `"I am an animal eating"`.
    - **Protected Method:**
        - Create a protected method named `sleep` that prints `"I am an animal sleeping"`.
    - **Default (Package-Private) Method:**
        - Create a default (package-private) method named `makeSound` that prints `"I am an animal making sound"`.
    - **Private Method:**
        - Create a private method named `roam` that prints `"I am an animal roaming"`.
    - **Explanation:**
        - These methods demonstrate different access levels and a basic method (`sleep`) that will be overridden in subclasses.

**Step 2: Create the `Cat` Subclass**

1. **Create the `Cat.java` class** as a subclass of `Animal`:
    - **Override the `sleep` Method:**
        - Override the `sleep` method to print `"Cat sleeps a lot"`.
    - **Override the `makeSound` and `eat` Methods:**
        - Override these methods to print `"Cat makes a sound"` and `"Cat eats"`.
    - **Explanation:**
        - This override shows how a specific animal type (`Cat`) can provide its own implementation of the parent class methods.

**Step 3: Create the `Kitten1`, `Kitten2`, and `Kitten3` Subclasses**

1. **Create the `Kitten1.java`, `Kitten2.java`, and `Kitten3.java` classes** as subclasses of `Cat`:
    - **Override the `eat` Method:**
        - In `Kitten1`, override the `eat` method to print `"kitten1 eats milk"`.
        - In `Kitten2`, override the `eat` method to print `"kitten2 eats snacks"`.
        - In `Kitten3`, override the `eat` method to print `"kitten3 eats everything"`.
    - **Explanation:**
        - These overrides show how each specific kitten type can have its unique implementation of the `eat` method.

**Step 4: Test the Methods in the `E162MethodOverriding` Class**

1. **In the `E162MethodOverriding.java` class:**
    - **Main Method:**
        - Create an object of the `Cat` class and objects of `Kitten1`, `Kitten2`, and `Kitten3` classes.
        - Store these objects in an array of `Animal` type.
        - Loop through the array and call the `eat` and `sleep` methods for each object to demonstrate method overriding.
        - Additionally, create an object of the `Cat` class and call the `makeSound` method to verify method access and overriding.

   **Expected Behavior:**
    - The output should show the results of each method call:
        - `"Cat eats"`
        - `"Cat sleeps a lot"`
        - `"kitten1 eats milk"`
        - `"kitten1 sleeps a lot"`
        - `"kitten2 eats snacks"`
        - `"kitten2 sleeps a lot"`
        - `"kitten3 eats everything"`
        - `"kitten3 sleeps a lot"`
        - `"Cat makes a sound"`

   **Example Implementation:**
    - The output sequence should clearly reflect the correct method overriding and access:
    - ```
      Cat eats
      Cat sleeps a lot
      kitten1 eats milk
      kitten1 sleeps a lot
      kitten2 eats snacks
      kitten2 sleeps a lot
      kitten3 eats everything
      kitten3 sleeps a lot
      Cat makes a sound
      ```

**Step 5: Run Your Application**

1. Execute your program to verify that the output matches the expected result.

## Tips:

- **Method Overriding:** Understand how method overriding allows subclasses to provide specific implementations of parent class methods.
- **Access Modifiers:** Remember that access modifiers control the visibility of methods and determine whether they can be overridden or accessed in child classes.

By completing this exercise, you will gain a clear understanding of method overriding in Java, focusing on how to override methods with different access levels and implement polymorphism in a pet management system. Happy coding!
