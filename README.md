<div align="center">

# 🚀 CodeSoft Internship — Java Projects

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![CodeSoft](https://img.shields.io/badge/Internship-CodeSoft-0077B5?style=for-the-badge&logo=briefcase&logoColor=white)
![Status](https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge)
![Tasks](https://img.shields.io/badge/Tasks-3%2F3%20Done-blue?style=for-the-badge)

<br/>

> **A collection of Java projects built during my internship at CodeSoft.**  
> Each task demonstrates hands-on problem solving, core Java concepts, and real-world application development.

</div>

---

## 👨‍💻 About This Repository

This repository contains all the Java projects I developed as part of my **CodeSoft Internship**. These tasks were designed to progressively strengthen programming fundamentals — from basic game logic and data processing to real-time API integration.

---

## 📁 Project Overview

| # | Project | Description | Key Concepts |
|---|---------|-------------|--------------|
| 01 | [🎮 Number Game](#-task-1--number-game) | Random number guessing game with scoring | Loops, Conditionals, Random |
| 02 | [📊 Student Grade Calculator](#-task-2--student-grade-calculator) | Calculates total, average & grade from marks | Arrays, Arithmetic, Logic |
| 03 | [💱 Currency Converter](#-task-3--currency-converter) | Real-time currency conversion using live API | API Integration, JSON Parsing |

---

## 🎮 Task 1 — Number Game

### Overview
A fun, interactive number guessing game where the system generates a random number and challenges the user to guess it within the fewest attempts possible.

### Features
- 🎯 Generates a random number within a user-specified range (e.g., 1–100)
- 🔁 Provides real-time feedback — **Too High**, **Too Low**, or **Correct!**
- 🏆 Tracks the number of attempts per round
- 🔄 Supports multiple rounds with a play-again option
- 📈 Displays a final score based on performance

### Concepts Used
- `java.util.Random` for number generation
- `while` loops and `if-else` conditionals
- Scanner for user input
- Score tracking logic

### How to Run
```bash
cd Task1-NumberGame
javac NumberGame.java
java NumberGame
```

---

## 📊 Task 2 — Student Grade Calculator

### Overview
A utility tool that takes subject marks as input, calculates the total and average percentage, and assigns a corresponding letter grade.

### Features
- 📥 Accepts marks (out of 100) for multiple subjects
- ➕ Calculates the **total marks** across all subjects
- 📐 Computes the **average percentage**
- 🏅 Assigns a **letter grade** (A, B, C, D, F) based on average
- 📋 Displays a clean results summary

### Grade Scale

| Percentage | Grade |
|------------|-------|
| 90% – 100% | A |
| 80% – 89%  | B |
| 70% – 79%  | C |
| 60% – 69%  | D |
| Below 60%  | F |

### Concepts Used
- Arrays to store subject marks
- Loops for summation and iteration
- Arithmetic operations for percentage
- Conditional statements for grade classification

### How to Run
```bash
cd Task2-GradeCalculator
javac GradeCalculator.java
java GradeCalculator
```

---

## 💱 Task 3 — Currency Converter

### Overview
A real-time currency converter that fetches live exchange rates from an external API and converts a user-specified amount between any two currencies.

### Features
- 🌍 Supports multiple global currencies
- 📡 Fetches **live exchange rates** from a reliable API
- 🔢 Accepts any amount for conversion
- ⚡ Displays the **converted amount** with the target currency symbol
- 🛡️ Includes basic error handling for invalid inputs

### Concepts Used
- Java `HttpURLConnection` for API calls
- JSON parsing to extract exchange rate data
- `Scanner` for dynamic user input
- Exception handling (`try-catch`)
- OOP principles

### How to Run
```bash
cd Task3-CurrencyConverter
javac CurrencyConverter.java
java CurrencyConverter
```

> ⚠️ **Note:** Ensure you have a valid API key configured in the source file before running. You can get a free key from [ExchangeRate-API](https://www.exchangerate-api.com/) or [Open Exchange Rates](https://openexchangerates.org/).

---

## 🛠️ Tech Stack

| Tool | Purpose |
|------|---------|
| Java (JDK 8+) | Core programming language |
| IntelliJ IDEA / VS Code | Development IDE |
| ExchangeRate API | Live currency data (Task 3) |
| Git & GitHub | Version control & code hosting |

---

## ⚙️ Prerequisites

- **Java JDK 8 or higher** installed
- A terminal / command prompt
- Internet connection (required for Task 3 only)

To verify your Java installation:
```bash
java -version
```

---

## 📂 Repository Structure

```
CodeSoft-Internship/
│
├── Task1-NumberGame/
│   └── NumberGame.java
│
├── Task2-GradeCalculator/
│   └── GradeCalculator.java
│
├── Task3-CurrencyConverter/
│   └── CurrencyConverter.java
│
└── README.md
```

---

## 🌱 What I Learned

This internship helped me grow significantly as a developer. Here are my key takeaways:

- ✅ Strengthened core **Java programming fundamentals**
- ✅ Understood how to **integrate external APIs** in Java applications
- ✅ Practiced **clean code writing** and structured output design
- ✅ Improved **problem decomposition** — breaking complex tasks into logical steps
- ✅ Gained hands-on experience with **real-world project workflows**

---

## 🤝 Connect With Me

If you found these projects helpful or want to discuss Java, feel free to connect!

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/your-profile)
[![GitHub](https://img.shields.io/badge/GitHub-Follow-181717?style=for-the-badge&logo=github&logoColor=white)](https://github.com/your-username)

---

<div align="center">

**Made with ❤️ during my CodeSoft Internship**

⭐ *If you found this helpful, consider giving this repo a star!* ⭐

</div>
