# Simple Calculator (Java AWT)

A basic **GUI Calculator** built using **Java AWT (Abstract Window Toolkit)**.  
This project performs common arithmetic operations and also includes **square** and **integer square root** calculations.

---

## Features

- Addition
- Subtraction
- Multiplication
- Division
- Square of a number
- Integer square root
- Clear all fields
- Error handling for:
  - Division by zero
  - Negative square roots
  - Entering values in both fields for square/root operations

---

## Technologies Used

- Java
- AWT (Abstract Window Toolkit)
- Event Handling (`ActionListener`, `WindowAdapter`)

---

## Project Structure

```

SimpleCalculator/
│
├── SimpleClaculater.java
└── README.md

```

---

## How to Run

### Compile

```bash
javac SimpleClaculater.java
```

### Run

```bash
java SimpleClaculater
```

---

## User Interface

The application contains:

- **Num 1** input field
- **Num 2** input field
- **Result** field (read-only)
- Operation buttons:
  - Add
  - Subtract
  - Multiply
  - Divide
  - Square
  - Root
  - Clear

---

## Square Operation

Enter a value in **only one field**.

Example:

- Num 1 = 5
- Num 2 = empty
- Result = 25

---

## Integer Square Root Operation

Calculates the square root only if it is a **perfect square**.

Examples:

- 25 → 5
- 36 → 6
- 20 → No Integral Square Root

---

## Error Messages

| Condition | Message |
|---|---|
| Division by zero | `Error: Division By Zero Detected` |
| Negative root | `Cannot Root A Negative Number` |
| Values in both fields for square/root | `Enter Value In Only one Field` |

---

## Sample Output

```

Num 1: 9
Num 2:

[Root]

Result: 3

```

---

## Future Improvements

- Use **Swing** instead of AWT
- Add decimal square root support using `Math.sqrt()`
- Improve button sizes and layout
- Add keyboard support
- Add scientific calculator functions

---

## Author

**Anup Sure**

- Java
- C++
- HTML, CSS, JavaScript

---

## License

This project is open source and available under the **MIT License**.