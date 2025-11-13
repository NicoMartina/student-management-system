# 🎓 Student Management System (Java)

A simple **Object-Oriented Java console application** that manages students, their grades, and classroom performance.  
This project demonstrates core OOP principles such as **encapsulation**, **composition**, **abstraction**, and **message passing**.

---

## 🚀 Features

- Add and remove students from a classroom  
- Add grades for each student  
- Calculate individual student averages and letter grades  
- Determine if a student has passed or failed  
- Compute the overall class average  
- Identify the top-performing student  
- Display formatted student and class information  

---

## 🧠 Concepts Used

| Concept | Description |
|----------|--------------|
| **Classes & Objects** | Models real-world entities (`Student`, `Classroom`) |
| **Encapsulation** | Keeps student data private and exposes only safe methods |
| **Composition** | A classroom *contains* multiple student objects |
| **Polymorphism (basic)** | Uses method calls like `displayInfo()` across objects |
| **Aggregation** | The classroom computes results based on its student list |
| **Data Validation** | Prevents invalid grade entries and handles empty lists |

---

## 🗂️ Project Structure

studentgradecalculator/
├── Student.java
├── ClassroomPractice.java
└── Main.java


- **Student.java** → Handles individual student info and grade logic  
- **ClassroomPractice.java** → Manages a collection of students  
- **Main.java** → Entry point that creates a classroom, adds students, and displays results  

---

## 🧾 Sample Output



Grade 85.0 added successfully!
Grade 90.0 added successfully!
Grade 88.0 added successfully!
Student: Alice (ID: 1)
Grades: [85.0, 90.0, 88.0]
Final Average: 87.67
Final Grade: B+
Status: Passed ✅
Class Average: 83.78
Top student in Computer Science 101:
Student: Charlie (ID: 3)
Grades: [95.0, 92.0, 97.0]
Final Average: 94.67
Final Grade: A
Status: Passed ✅

# 🧩 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/NicoMartina/student-management-system.git
Open the project in IntelliJ IDEA (or your preferred IDE)
Run Main.java
Observe the output in the console

🧰 Tech Stack
Language: Java 17+
Tools: IntelliJ IDEA, JDK
Paradigm: Object-Oriented Programming


📘 Future Improvements
Add user input via Scanner
Save/load data from a file or database
Add UI or REST API using Spring Boot
Include automated unit tests


👨‍💻 Author
Nicolas Martina
Aspiring Backend Engineer | Java Developer
