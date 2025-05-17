# Tic-Tac-Toe

A simple Java Swing Tic Tac Toe game for two players with a 3x3 grid, turn-based play, and win/draw detection. Features real-time updates and game end notifications.

## Description

This program implements a simple Tic Tac Toe game with a graphical user interface (GUI) using Java Swing. It allows two players to play the classic game on a 3x3 grid by clicking buttons to place their marks (X or O).

## Features

- **Grid Layout:** The game board consists of 9 buttons arranged in a 3x3 grid, each representing a cell.
- **Two Players:** Players alternate turns, starting with "X".
- **Move Validation:** Players can only click empty cells, preventing overwriting.
- **Win Detection:** The game automatically checks for a winning combination (three identical marks in a row, column, or diagonal) after every move.
- **Draw Detection:** If all cells are filled without a winner, the game declares a draw.
- **Game End Notifications:** Displays a message dialog to congratulate the winner or announce a draw.
- **Game State Handling:** Once the game ends (win or draw), no further moves are allowed.

## How It Works

- The program uses an array of `JButton`s to represent each cell.
- When a button is clicked, it places the current player’s mark ("X" or "O") on the button.
- After each move, it checks if the current player has won by evaluating predefined winning positions.
- If no winner, it checks if the board is full (draw).
- Turns alternate automatically between players.
- The GUI updates in real-time, responding to user clicks and showing messages at game conclusion.

