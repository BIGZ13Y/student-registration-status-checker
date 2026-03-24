# Student Registration Status Checker

## Purpose

This project implements a **Student Registration Status Checker** in four programming languages: **Python**, **Java**, **JavaScript (Node.js)**, and **C**. The program prompts the user for a student's name and the number of units they are registering, then evaluates and displays the registration status.

**Registration rules:**
- More than 7 units → `Overload - Approval Required`
- 7 units or fewer → `Registration Accepted`

A formatted summary is printed at the end showing the student's name, unit count, and final status.

---

## Project Structure

```
student-registration/
├── python/
│   └── student_registration.py
├── java/
│   └── StudentRegistration.java
├── javascript/
│   └── student_registration.js
├── c/
│   └── student_registration.c
├── README.md
└── comparison.md
```

---

## How to Run Each Version

### Python

**Requirements:** Python 3.x

```bash
cd python
python student_registration.py
```

---

### Java

**Requirements:** JDK 8 or higher

```bash
cd java
javac StudentRegistration.java
java StudentRegistration
```

---

### JavaScript (Node.js)

**Requirements:** Node.js v12 or higher

```bash
cd javascript
node student_registration.js
```

---

### C

**Requirements:** GCC compiler

```bash
cd c
gcc student_registration.c -o student_registration
./student_registration
```

On Windows using MinGW:
```bash
gcc student_registration.c -o student_registration.exe
student_registration.exe
```

---

## Sample Output

```
=============================================
   STUDENT REGISTRATION STATUS CHECKER
=============================================

Enter student name: Maria Santos
Enter number of registered units: 9

=============================================
           REGISTRATION SUMMARY
=============================================
  Student Name : Maria Santos
  Units        : 9
  Status       : Overload - Approval Required
=============================================
```

---

## What This Project Demonstrates

- **Cross-language implementation** of the same logic across four distinct programming paradigms
- **User input handling** and basic input validation in each language
- **Conditional logic** (if/else) and string formatting
- **Syntax and structural differences** between interpreted, compiled, and JVM-based languages
- **Console I/O patterns** unique to each language ecosystem

See `comparison.md` for a detailed analysis of the differences between all four implementations.
