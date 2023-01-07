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

Optional:
    
    - it was introduced to overcome Null Pointer Exception(NPE).
    
    - wrap the object in optional which will help overcome NPE.
    
    - it is similar to a box which keeps value in it.
    
    - it 16 bytes in length
    
    - it is object
    
    - it is immutable
    
    - the method ofNullable() will store empty optional when we store null in it. 
        + for eg.: Optional<String> emptyOptional = Optional.ofNullable(null);


    - To get value from Optional we use get().
    
    - get() is not reccomended to be used to get the value from optional as it might result in "NoSuchElementException" in case when the optional has empty value.
    
    - safer way is to use isPresent() before invoking get().
    
    - there are couple of more ways to get the value from optional
        + using orElse()
        + using orElseGet()
        + using orElseThrow()
    
    - operations in optional:
        + map
        + filter
        + flatMap
        + ifPresent
        + ifPresentOrElse
        + stream
        + or
        + equals: condition is to check if both the objects are optional, either both are empty or both contain same value.
        + hashcode


Functional Programming:
    
    - is program paradigm which is based on pure mathematical functions
    
    - is a declarative style
    
    - makes use of expressions
    
    - also based on Lambda calculus

    Key Concepts:
        - Function as first class citizens: meaning passing functions as arguments to methods.

        - Pure functions: output on pure functions depend only on it's input params and it's algorithm.
                          function that takes input, applies the algo and returns the result are pure functions.
                          functions that takes input, manipulates the input and changes the input value and returns a result based on algo are impure functions.

        - Higher order functions: takes functions as params, or returns lambda or does both
                                  

        - no side effects

        - referencial transparency: is a property of a function, variable or expression whereby the expression can be   replaced  by it's(evaluated) value without affecting the behaviour of the program.

Functional Programming Techniques:
            
    - Function Chaining:
            - chain one function to another.
    
    - Function Composition:
            - follows reverse chaining. for eg. calling another function will result in calling second function first and then the caller function.

    - Closures: 
            - is a function that refers to free variables in it's lexical context.

    - Currying:

    - Lazy Evaluation:
            - delays evaluation of expression.
            - saves computing resources

    - Tail Call Optimization:
            - 




