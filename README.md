# 🎓 Quiz or Exam Management System

A Java-based desktop application to manage quizzes and exams, designed for educational institutions. It features **admin control** for adding and updating questions and **student access** to take quizzes and receive instant results.

# 📸 Screen Shots
# Interface
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/384bb4cd933694f6d3b7db672ee708980d25cbe0/Screenshot%202025-06-09%20145443.png)


# Student page
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/a2bda6e0d72f8692eb46b191ffed80d7c2d9c0c8/Screenshot%202025-06-09%20145500.png)

# Admin Home Page
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/9351dd9e24b2e1759637bf4ff1b1126cdd09f16f/Screenshot%202025-06-09%20145543.png)

# Navigation Bar
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/df72c20f4967eb71a1f80521793784ffbb1f43af/Screenshot%202025-06-09%20145558.png)

# Add New Question Page
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/86b589be5a2a7b5d9e140fba959b1c3a32fc3236/Screenshot%202025-06-09%20145609.png)

# Update Question
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/1e099b9d7a318e74c525f25576325440929c22c7/Screenshot%202025-06-09%20145633.png)

# Delete Question
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/485c83142adf6ebef4d573c5f84655e65b29d7ec/Screenshot%202025-06-09%20145720.png)

# Instruction
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/b181a7298ff2263bb13571c8fcf3d6a40d2a6cbf/Screenshot%202025-06-09%20150314.png)

# Start Quiz
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/8830be9473aa9ed6799faec53e6ad22f4511adf5/Screenshot%202025-06-09%20150344.png)

# Result
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/889e958e5c90856be30d27d68965ca94a6fe755e/Screenshot%202025-06-09%20150357.png)

# All Question
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/698d71da0e4bf9512279a2ea03a5c13f86eda794/Screenshot%202025-06-09%20153031.png)

# All Student Result
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/94fe1250e20cc89d5414b1c51034124baaec4320/Screenshot%202025-06-09%20153044.png)

# Pull the folder on github
![image alt](https://github.com/HappySaini001/Online-MCQ-System/blob/dfaeee8037cbb76923625cfe7e7200a27c95e323/Screenshot%202025-05-25%20174444.png)



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

# 🔑 Default Credentials
Role	Username	Password
Admin	admin	admin123
Student	student1	pass123

(Insert users into the users table manually for the first time.)

# 🎯 Sample Use Case
Admin logs in and adds new questions using a form.

Student logs in, starts quiz, selects answers, and submits.

System auto-evaluates and shows results.

Results are saved in the database with timestamp.

# 🔒 Security Notes
Passwords stored in plaintext (can be upgraded to hashed).

Role-based access to prevent unauthorized access.

# 💡 Future Enhancements
Add quiz categories (Math, Science, etc.)

Timer for quiz

Export results to PDF

Mobile version with JavaFX or Android

Email result notification

Password encryption and OTP

# 👨‍💻 Developer
Name: Happy Saini

License: MIT or Custom

Contact: youremail@example.com
