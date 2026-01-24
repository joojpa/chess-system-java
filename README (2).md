# ♟️ Chess System Java

A **console-based chess game developed in Java**, designed to apply and practice **Object-Oriented Programming (OOP)** concepts.  
The project simulates a full chess match following official rules and allows two players to play turn by turn via the terminal.

---

## 📌 Features

- Complete chessboard representation
- All standard chess pieces with correct movements
- Turn-based system for two players
- Move validation
- Check and checkmate detection
- Special moves:
  - Castling
  - En passant
  - Pawn promotion
- Console-based interface with board visualization
- Exception handling for invalid moves

---

## 🛠️ Technologies Used

- **Java**
- Object-Oriented Programming (OOP)
- Java Collections
- Exception handling

---

## 📂 Project Structure

The project is organized using a clean separation of responsibilities:

- `boardgame` – Generic board and piece logic
- `chess` – Chess-specific rules and entities
- `application` – Main application and user interaction

---

## ▶️ How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/joojpa/chess-system-java.git
   ```

2. Navigate to the project folder:
   ```bash
   cd chess-system-java
   ```

3. Compile the project:
   ```bash
   javac application/Program.java
   ```

4. Run the game:
   ```bash
   java application.Program
   ```

---

## 🎮 How to Play

- The game runs entirely in the console.
- Players input moves using standard chess coordinates (e.g., `e2 e4`).
- The board updates after each valid move.
- The game ends when a checkmate condition is reached.

---

## 🎯 Learning Goals

This project was created to practice and demonstrate:

- Object-Oriented Programming concepts
- Encapsulation, inheritance, and polymorphism
- Clean code and project organization
- Game logic implementation
- Handling user input and exceptions

---

## 📄 License

This project is for **educational purposes**.

---

## 🙌 Author

Developed by **João Pedro**  
GitHub: https://github.com/joojpa
