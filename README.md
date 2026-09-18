# Tic-Tac-Toe Game in Java

## Step1. Introduction

This project is a simple and easy-to-understand Tic-Tac-Toe game made using Java. It runs in the terminal and lets two players, X and O, take turns by entering positions from 0 to 8.

The goal of this project is to practice basic Java programming concepts while creating a small but complete working game. It uses simple logic, arrays, methods, loops, conditions, and the Scanner class.

## Step2. How the Game Works

- The game uses two arrays with 9 positions to represent the X and O moves.
- Players choose a number between 0 and 8 to place their symbol.
- After every move, the board is displayed.
- After every move, the program checks whether the current player has won.
- Turns switch automatically between Player X and Player O.
- A match is drawn when all 9 cells are filled and nobody has won.

### Board Positions

0 | 1 | 2
--|---|--
3 | 4 | 5
--|---|--
6 | 7 | 8

## Step3. Winner's Logic

There are 8 possible ways to win:

- 3 rows
- 3 columns
- 2 diagonals

A player wins when their symbol occupies all three positions in any one of these lines.

## Step4. Running the Game

1. Install Java JDK.
2. Save the file as `Project.java`.
3. Open Command Prompt or Terminal in the project folder.
4. Compile the program:

```text
javac Project.java
```

5. Run the program:

```text
java Project
```

## Step5. What You Learn From This Project

- How to store and update game data using arrays
- How to create and use methods in Java
- How loops and conditions control a program
- How to accept user input using Scanner
- How simple game logic is designed and implemented
- How to check rows, columns, and diagonals

## Step6. Conclusion

This small project is useful for anyone starting with Java. It shows how a simple game can be built from scratch using basic programming concepts.

The game can later be enhanced by adding a computer opponent, a graphical interface, input validation, or a scoring system.
