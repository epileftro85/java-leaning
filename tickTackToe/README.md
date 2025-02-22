# Tic-Tac-Toe Game in Java

This document provides instructions for creating a Tic-Tac-Toe game in Java with input validation, winner/draw detection, a menu, exception handling, and a clear grid display.
The main idea is to start learning basics, try to do it your self before see code.

## 1. Project Setup

1.  **Create a new Java project:** Use your preferred IDE (e.g., IntelliJ IDEA, Eclipse, VS Code) or create a new project using command-line tools.
2.  **Create a Java class:** Name it `TicTacToe.java` (or something similar).

## 2. Game Logic

### 2.1. Game Board Representation

* Use a 2D array (e.g., `char[][] board = new char[3][3];`) to represent the Tic-Tac-Toe board.
* Initialize the board with empty spaces (e.g., `' '`).

### 2.2. Player Turns

* Use a variable to track the current player (e.g., `char currentPlayer = 'X';`).
* Alternate turns between 'X' and 'O'.

### 2.3. Input Handling

1.  **Get user input:** Use `java.util.Scanner` to get row and column input from the user.
2.  **Validate input:**
    * Ensure the input is within the valid range (0-2 for rows and columns).
    * Check if the chosen cell is empty.
3.  **Handle invalid input:** Display an error message and prompt the user to re-enter valid input.

### 2.4. Winner Detection

* Create a method to check for a winner.
* Check all possible winning combinations:
    * Rows
    * Columns
    * Diagonals
* If a winner is found, return the winning player ('X' or 'O').

### 2.5. Draw Detection

* Create a method to check for a draw.
* If all cells are filled and no winner is found, it's a draw.

## 3. Game Display

### 3.1. Render the Grid

* Create a method to display the Tic-Tac-Toe board.
* Use `System.out.println()` to print the board with clear separators.
