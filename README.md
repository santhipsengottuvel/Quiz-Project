# 🧠 Java Console Quiz Application

A **simple Java-based console quiz** that allows users to **create and play interactive quizzes** directly from the terminal.  
Users can enter their own questions, choose options, and get a score at the end!

---

## 📁 Project Structure

```
├── Main.java
├── Question.java
└── QuestionService.java
```

---

## 🚀 How It Works

### 🧩 Step 1: Run the Program
```bash
javac Main.java Question.java QuestionService.java
java Main
```

### 🧠 Step 2: Enter Quiz Details
- Input how many questions you want to create.
- For each question, the program will ask:
  - Question ID  
  - Question text  
  - Four answer options  
  - The correct answer  

### 🧾 Step 3: Play the Quiz
- Each question is displayed one by one.  
- Enter your chosen answer for each.

### 🏁 Step 4: See Your Score
After the quiz, your final **percentage score** is displayed.

---

## 🧱 Class Overview

### `Main.java`
> Entry point of the application  
- Creates an instance of `QuestionService`  
- Calls:
  - `playQuiz()`
  - `printScore()`

---

### `Question.java`
> A model (POJO) that defines a quiz question  
**Attributes:**
- `id` — question number  
- `question` — the actual question text  
- `opt1`, `opt2`, `opt3`, `opt4` — four answer choices  
- `answer` — correct option  

Includes:
- Constructor  
- Getters and Setters  

---

### `QuestionService.java`
> Core logic that powers the quiz  
**Responsibilities:**
- Take user input to build `Question` objects  
- Store questions and answers in arrays  
- Ask the user to play the quiz  
- Calculate and display score percentage  

---

## 💻 Example Output

```
Enter number of questions:
3

Enter the 1th question
Enter the id of question :
1
Enter the question :
What is the capital of France?
Enter op1 :
Paris
Enter op2 :
London
Enter op3 :
Berlin
Enter op4 :
Rome
Enter ans :
Paris

===== Display Questions =====
ID : 1
Question : What is the capital of France?
1. Paris
2. London
3. Berlin
4. Rome
Answer : Paris

Give me the answer:
Paris

Your score is 100
```

---

## ⚙️ Requirements

- Java 17 or later  
- Any terminal or IDE console (VS Code, IntelliJ, Eclipse, etc.)

---

## 🌱 Future Improvements

- Load questions from files or database  
- Add countdown timer per question  
- Display correct/incorrect answers after each response  
- Implement GUI using Swing or JavaFX  
- Track player scores and histories  

---

## 🧑‍💻 Author

**Santhip Sengottuvel**  
💼 Chess coach & developer automating real-world systems  
💡 Passionate about Java, full-stack apps, and interactive learning tools

---

⭐ *If you like this project, feel free to fork or contribute!*
