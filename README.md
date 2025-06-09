# 🎓 Quiz or Exam Management System

A Java-based desktop application to manage quizzes and exams, designed for educational institutions. It features **admin control** for adding and updating questions and **student access** to take quizzes and receive instant results.

---

## 📌 Features

### 👩‍💼 Admin Panel
- Secure login
- Add new quiz questions
- Edit existing questions
- Delete questions
- View all questions in table format

### 👨‍🎓 Student Panel
- Secure login
- Take quiz with multiple-choice questions (MCQs)
- Auto-evaluated results
- Result storage with date and time

---

## 🛠️ Tech Stack

| Layer        | Technology             |
|--------------|------------------------|
| Frontend     | Java Swing (GUI)       |
| Backend      | Java, JDBC             |
| Database     | MySQL / SQLite         |
| IDE          | NetBeans / IntelliJ    |
| Build Tool   | Manual / Maven (optional) |

---

## 🗃️ Project Structure
QuizSystem
├── src/
│ ├── ui/ // UI Components (LoginUI, AdminDashboard, etc.)
│ ├── dao/ // Data Access Objects (UserDAO, QuestionDAO)
│ ├── model/ // Model classes (User.java, Question.java)
│ └── util/ // Utility (DBConnection.java)
├── database/
│ └── quiz_db.sql // SQL to create tables
└── README.md

