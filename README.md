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

Most used Functional Interfaces:
Below are the predefined functional interfaces which are included in java.util package:

    - Predicate
    - Consumer
    - Function
    - Supplier
    - UnaryOperator
    - BinaryOperator
    - BiPredicate
    - BiConsumer
    - BiFunction

Predicate:
    - has a method test which returns boolean

Consumer:
    - it has method accept and returns nothing

Supplier:
    - it has method get and returns something

Function:
    - it has a method apply that takes something and returns something
    - it is used for transformation from one object to another                

UnaryOperator:
    - extends function interface
    - it takes argument of type T and returns the same type T

BiFunction:
    - takes two parameters and returns a value
    - also has apply method like function
    - extends function interface

BinaryOperator:
    - extends bifunction interface
    - it takes two arguments of type T and returns the same type T

Method reference in functional programming:
    - double colon operator is used for method reference.
    - there are different ways to use method reference:
        - object::instanceMethod: method reference to an instance method of an existing object.
        - Class::staticMethod: method reference to a static method of a class.
        - Class::instanceMethod: method reference to an instance method of an input object of a particular type
        - Class::new: constructor reference.  


