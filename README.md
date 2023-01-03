# FunctionalProgramming
Repository to practice functional programming.

Reactive/Functional Programming Notes:

Function has 4 properties:
    1. name of the function
    2. parameter list
    3. body of function
    4. return type

Lambda has 3 properties:
     1. List of parameters
     2. an arrow -> which separates the list of parameters from body of lambda function.
     3. body of lambda

Functional Interface:
      - It is behind every lambda.
      - can only have one abstract method. <- this is important in order to remove ambiguity while writing a lambda expression
      - Post java 8 we can assume function as variable assignments.

- Lambda helps us pass behavior as parameter
- enables declarative programming.

How Lambda's work under the hood?
   java uses invokedynamic byte code instruction that facilitate implementation of dynamic languages through dynamic invocation.
   type inference and invokedynamic

Imperative vs Declarative vs Functional Programming:
    - Functional programming is subset of declarative programming.
    - using conventional for loop is imperative programming
    - using stream is declarative programming or functional programming.

