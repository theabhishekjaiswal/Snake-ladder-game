# Snake and Ladder Game

This is a simple Snake and Ladder game implemented in Java. The game is designed for two players, where each player takes turns to roll a dice and move across the board from position 0 to 100. The goal is to be the first player to reach position 100. However, there are snakes and ladders placed at specific positions on the board that can either push players down or boost them up.

## How to Play
1. **Start the game**: Two players will be prompted to enter their names.
2. **Roll the dice**: On each player's turn, they are required to roll a dice by entering `1` when prompted.
3. **Movement on the board**:
   - If a player lands on the head of a snake, they will be moved down to the snake's tail.
   - If a player lands on the base of a ladder, they will climb up to the top of the ladder.
   - The first player to reach position `100` wins the game.
4. **End game**: The game continues until one player reaches position 100.

## Board Setup
- **Snakes**: 
  - 32 → 10
  - 36 → 6
  - 48 → 26
  - 62 → 18
  - 88 → 24
  - 95 → 56
  - 97 → 78

- **Ladders**: 
  - 1 → 38
  - 4 → 14
  - 8 → 30
  - 21 → 42
  - 28 → 76
  - 50 → 68
  - 71 → 92
  - 80 → 99

## Board Reference

Here is a visual reference for the Snake and Ladder board used in this game:

![Board Reference](https://cdn.shopify.com/s/files/1/0876/1176/files/i984_pimgpsh_fullsize_distr.png?v=1525140332)

## Dice Rules
The dice used in this game generates a random number between 1 and 6. Each player moves forward by the number rolled on the dice.

## Running the Game
To run this game on your local machine:
1. Clone this repository:
    ```bash
    git clone https://github.com/your-username/snake-ladder-game.git
    ```
2. Compile and run the Java program:
    ```bash
    javac SnakeLadder.java
    java SnakeLadder
    ```
