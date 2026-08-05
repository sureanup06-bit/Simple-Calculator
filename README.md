# Advanced Calculator (Java AWT)

A GUI-based **Advanced Calculator** built using **Java AWT (Abstract Window Toolkit)**.

This project performs both **basic arithmetic operations** and **advanced mathematical calculations** such as square, cube, roots, modulus, power, and percentage.

---

## Features

### Basic Operations

* Addition
* Subtraction
* Multiplication
* Division

### Advanced Operations

* Square of a number
* Integer square root
* Cube of a number
* Integer cube root
* Modulus (remainder)
* Power (`a^b`)
* Percentage calculation

### Utility

* Clear all fields

### Error Handling

* Division by zero
* Negative square roots
* Using both fields for single-input operations
* Non-perfect square roots
* Non-perfect cube roots

---

## Technologies Used

* **Java**
* **AWT (Abstract Window Toolkit)**
* **Event Handling**

  * `ActionListener`
  * `WindowAdapter`

---

## Project Structure

```text
AdvancedCalculator/
│
├── Advance_Calcuater.java
└── README.md
```

---

## How to Run

### Compile

```bash
javac Advance_Calcuater.java
```

### Run

```bash
java Advance_Calcuater
```

---

## User Interface

The application contains:

* **Num 1** input field
* **Num 2** input field
* **Result** field (read-only)

### Buttons

* Add
* Subtract
* Multiply
* Divide
* Square
* S.Root
* Cube
* C.Root
* Mod
* Power
* Percent
* Clear

---

## Addition

Example:

```text
Num 1 = 10
Num 2 = 5
Result = 15
```

---

## Division

Example:

```text
Num 1 = 20
Num 2 = 4
Result = 5
```

If the second number is zero:

```text
Error: Division By Zero Detected
```

---

## Square Operation

Enter a value in **only one field**.

Example:

```text
Num 1 = 5
Num 2 = empty
Result = 25
```

---

## Integer Square Root

Works only for **perfect squares**.

Examples:

```text
25 → 5
36 → 6
20 → No Intigral Squair Root
```

Negative numbers:

```text
Cannot Root A Negative Number
```

---

## Cube Operation

Example:

```text
Num 1 = 3
Result = 27
```

---

## Integer Cube Root

Works only for **perfect cubes**.

Examples:

```text
27 → 3
64 → 4
30 → No Intigral Cube Root
```

---

## Modulus Operation

Returns the remainder.

Example:

```text
10 % 3 = 1
```

---

## Power Operation

Calculates `a^b` using a loop.

Example:

```text
2^5 = 32
```

---

## Percentage Operation

Calculates what percentage **Num 1 is of Num 2**.

Formula:

```text
(a / b) × 100
```

Example:

```text
40 out of 50 = 80%
```

---

## Clear Operation

Removes all values from:

* Num 1
* Num 2
* Result

---

## Error Messages

| Condition                                        | Message                            |
| ------------------------------------------------ | ---------------------------------- |
| Division by zero                                 | `Error: Division By Zero Detected` |
| Negative square root                             | `Cannot Root A Negative Number`    |
| Both fields used for square/root/cube operations | `Enter Value In Only one Field`    |
| Non-perfect square                               | `No Intigral Squair Root`          |
| Non-perfect cube                                 | `No Intigral Cube Root`            |

---

## Sample Output

```text
Num 1: 9
Num 2:

[S.Root]

Result: 3
```

---

## Concepts Demonstrated

* AWT GUI programming
* Event-driven programming
* Conditional statements
* Loops
* Input validation
* Custom mathematical algorithms

---

## Future Improvements

* Use **Swing** or **JavaFX**
* Add decimal square root support using `Math.sqrt()`
* Add decimal cube root support
* Support negative exponents
* Improve button sizes and layout using `GridLayout`
* Add keyboard support
* Add scientific functions (`sin`, `cos`, `tan`, `log`)

---

## Author

**Anup Sure**

* Java
* C++
* HTML, CSS, JavaScript

---

## License

This project is open source and available under the **MIT License**.
