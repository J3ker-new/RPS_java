# Rock, Paper, Scissors Game

## Description
A simple yet fun **Rock, Paper, Scissors** game written in Java. This game follows Object-Oriented Programming (OOP) principles and includes a feature to **restart** or **quit** the game after each round.

### Features:
- **OOP Design**: 
  - The game is structured with two main classes: 
    - `ComputerChoice`: Handles the computer's random choice (rock, paper, or scissors).
    - `Userchoice`: Handles the user's input and the game logic, including the option to restart or quit.
  
- **Game Flow**: 
  - The user is prompted to choose between Rock, Paper, or Scissors.
  - The computer randomly selects its choice.
  - The game compares the user's choice with the computer's and determines the result (win, lose, or draw).
  
- **Restart/Close Option**: 
  - After each round, the user can choose to **restart** the game or **quit**.
  
## How to Play
1. **Run the Game**: Start the program to begin.
2. **Input Your Choice**: Choose **rock**, **paper**, or **scissors** when prompted.
3. **Game Result**: The program will display the result, telling you whether you win, lose, or draw.
4. **Restart or Quit**: After each round, you will be given the option to restart the game or quit.

## Code Structure

### `ComputerChoice` Class
This class handles the computer's choice. It generates a random number between 0 and 2 and maps that number to a corresponding choice (rock, paper, or scissors).

### `Userchoice` Class
This class handles the user's input, stores it, and compares it against the computer's choice. It also implements the game logic for determining the winner, loser, or draw. Additionally, it includes the functionality to restart or quit after each round.

### `Main` Class
The main class where the program begins. It initializes the `Userchoice` and `ComputerChoice` classes, collects the user input, and initiates the game loop.

## Installation

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/rock-paper-scissors.git
# Navigation
`cd` rock-paper-scissors

# Compiling and Running the Program
    javac Main.java
    java Main

## License
This project is open-source and available under the [MIT License](https://opensource.org/licenses/MIT).
