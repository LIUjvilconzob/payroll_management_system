# EPMS — Employee's Payroll Management System

A Java Swing desktop payroll management application developed for the fast-food restaurant **Bite Delight**. EPMS provides administrators with a centralized system for managing employee records, deductions, overtime, bonuses, payroll information, and PDF payslip generation.

The application uses **MySQL** for persistent data storage, with **XAMPP** providing the local MySQL development environment.

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Build](https://img.shields.io/badge/Build-Maven-blue)
![Database](https://img.shields.io/badge/Database-MySQL-blue)
![Server](https://img.shields.io/badge/Server-XAMPP-orange)
![Application](https://img.shields.io/badge/Type-Desktop%20Application-informational)

---

## Features

| Screen | Description |
|---|---|
| **Login** | Provides administrator authentication for accessing the system. |
| **Add Employee** | Register, update, delete, and view employee records. |
| **Deduction** | Record money loss, machinery/equipment damage, tardiness, SSS, and PhilHealth deductions with running totals. |
| **Overtime** | Calculate and record overtime pay for regular working days, holidays, and rest days. |
| **Bonus** | Search for an employee, calculate a yearly bonus based on years of service, and save the result. |
| **Payment** | Search for an employee using their ID and generate a PDF payslip. |
| **Search** | Perform real-time searching and viewing of employee records. |

---

## Tech Stack

| Technology | Purpose |
|---|---|
| **Java 17+** | Core programming language and application logic |
| **Java Swing** | Desktop graphical user interface |
| **MySQL** | Relational database for employee and payroll data |
| **XAMPP** | Local development environment used to run MySQL |
| **phpMyAdmin** | Database administration and management |
| **Maven** | Build automation and dependency management |
| **PDF Generation** | Generates employee payroll payslips in PDF format |

---

## System Requirements

- **JDK 17 or later**
- **Apache Maven**
- **XAMPP**
- **MySQL** (included with XAMPP)
- **phpMyAdmin** (included with XAMPP)
- A Windows, macOS, or Linux environment capable of running Java desktop applications

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/payroll_management_system.git
```

### 2. Navigate to the Project

```bash
cd payroll_management_system
```

### 3. Set Up XAMPP

Open the **XAMPP Control Panel** and start:

- **Apache**
- **MySQL**

Then open **phpMyAdmin** and create or import the database required by the application.

> Make sure the database name, username, password, host, and port match the database configuration used by the application.

### 4. Configure the Database Connection

Update the application's database configuration with your local MySQL credentials if necessary.

Typical XAMPP configuration:

```text
Host:     localhost
Port:     3306
Username: root
Password: [your MySQL password]
Database: [your database name]
```

### 5. Build the Application

```bash
mvn clean package
```

### 6. Run the Application

Run the generated JAR file:

```bash
java -jar target/<generated-jar-file>.jar
```

> The generated JAR filename depends on the Maven configuration in `pom.xml`.

---

## Database

EPMS uses **MySQL** for persistent data storage.

The MySQL server is hosted locally through **XAMPP**, while **phpMyAdmin** can be used to manage the database.

### Database Management

The database can be managed through phpMyAdmin for:

- Creating the database
- Importing database tables
- Viewing records
- Managing employee information
- Managing payroll records
- Performing database administration tasks

> The database schema or SQL file should be included in the repository if other users need to recreate the database locally.

---

## Default Login

For initial access, the system provides the following administrator credentials:

| Username | Password |
|---|---|
| `admin` | `1234` |

> **Security Note:** The default credentials are intended for development and testing. They should be changed before using the application in a production environment.

---

## Payroll Functions

### Employee Management

Administrators can:

- Register employees
- Update employee information
- Delete employee records
- View employee records
- Search for employees

### Deduction Management

The system supports recording and tracking:

- Money lost
- Machinery/equipment damage
- Tardiness
- SSS
- PhilHealth

The application maintains deduction totals for payroll processing.

### Overtime Management

The system calculates overtime compensation for:

- Regular working days
- Holidays
- Rest days

Calculated overtime information is saved for the corresponding employee.

### Bonus Management

The system calculates yearly employee bonuses based on **years of service** and saves the resulting bonus information.

### Payslip Generation

Administrators can search for an employee using their employee ID and generate a **PDF payslip** containing the employee's payroll information.

---

## Application Workflow

```text
                    ┌───────────────┐
                    │     Login     │
                    └───────┬───────┘
                            │
                            ▼
                 ┌─────────────────────┐
                 │ Employee Management │
                 └──────────┬──────────┘
                            │
              ┌─────────────┼─────────────┐
              ▼             ▼             ▼
        ┌──────────┐   ┌──────────┐   ┌──────────┐
        │Deduction │   │ Overtime │   │  Bonus   │
        └────┬─────┘   └────┬─────┘   └────┬─────┘
             │              │              │
             └──────────────┼──────────────┘
                            ▼
                   ┌────────────────┐
                   │    Payment     │
                   └───────┬────────┘
                           │
                           ▼
                   ┌────────────────┐
                   │  PDF Payslip   │
                   └────────────────┘
```

---

## Project Structure

```text
payroll_management_system/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── ...
│       │
│       └── resources/
│           └── ...
│
├── pom.xml
├── README.md
└── ...
```

> The exact structure may vary depending on the implementation and Maven configuration.

---

## Project Objectives

EPMS was developed to provide **Bite Delight** with a centralized desktop application for managing employee payroll operations.

The system aims to:

- Reduce manual payroll processing
- Organize employee information
- Simplify payroll calculations
- Track deductions, overtime, and bonuses
- Generate employee payslips efficiently
- Provide centralized database storage

---

## Learning Outcomes

This project provided practical experience in:

- Java application development
- Object-Oriented Programming (OOP)
- Java Swing GUI development
- Event-driven programming
- MySQL database integration
- CRUD operations
- Payroll calculation logic
- Input validation and exception handling
- Maven project management
- PDF document generation
- XAMPP and phpMyAdmin
- Software project organization

---

## Author

**John Marlo Liu**

**Bachelor of Science in Computer Science**  
University of Mindanao

---

## License

This project was developed for **educational purposes**.
