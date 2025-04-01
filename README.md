# ADS Assignment 1

## Overview
This Java program allows users to choose one or more of 10 different problems and input required numbers to get results. Some of the problems (4-10) are solved using recursion.
## Project Structure
src/Main.java - Handles user interaction and program flow
src/ProblemSolver.java - Contains logic for checking conditions and solving problems
src/InputHandler.java - Contains input-related and utility methods

## Project's work
### Classes
#### Main 
Runs the program and manages user input.

Calls ProblemSolver.executeProblem(choice, scanner) based on user selection.

#### InputHandler
Handles input reading (readArray).

Includes helper functions like printExecutionTime.

#### ProblemController
Contains executeProblem method with if statements to check user choice.

Implements all 10 problem-solving methods. Some of them (4-10) use recursive. Methods contain different types of time complexities, like mostly linear, exponential and logarithmic



## Setup & Run
### Prerequisites

Install Java JDK 17+

### Compile the Program

Navigate to the src folder and compile:
javac Main.java

### Run the Program
java Main
