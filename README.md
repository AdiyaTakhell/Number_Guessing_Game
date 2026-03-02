# Number Guessing Game

A Java console application where you guess a randomly generated number. The game supports multiple difficulty levels, intelligent hints, and safe input handling.

## Features

- **Random number generation (1–100)**
- **Difficulty levels:** Easy, Medium, Hard
- **Attempt limits** based on difficulty
- **Intelligent hint system**
- **Timer tracking per round**
- **Safe input validation** (no crash on invalid input)
- **Replay system** (multi-round support)
- **Enum-based difficulty modeling**

## Folder Structure

```
src/
│
├── Main.java
├── game/
│   ├── GameEngine.java
│   └── DifficultyLevel.java
│
├── service/
│   ├── NumberGeneratorService.java
│   └── HintService.java
│
├── ui/
│   └── ConsoleUI.java
```

## How to Run

1. **Clone the repository:**
   ```sh
   git clone https://github.com/your-username/number-guessing-game.git
   cd number-guessing-game
   ```

2. **Compile the code:**
   ```sh
   javac src/**/*.java
   ```

3. **Run the game:**
   ```sh
   java -cp src Main
   ```
   *(Replace `Main` with your main class name if different.)*

## Project Links

- [GitHub Repository](https://github.com/AdiyaTakhell/Number_Guessing_Game.git)
- [Roadmap.sh Project Page](https://roadmap.sh/projects/number-guessing-game)

## Contributing

Contributions and feedback are welcome! Please submit issues or pull requests.
