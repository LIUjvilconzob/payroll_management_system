**EPMS — Employee's Payroll Management System
**A Java Swing desktop payroll management application developed for fast food called Bite Delight. EPMS provides administrators with a centralized system for managing employee records, deductions, overtime, bonuses, payroll information, and PDF payslip generation.
The application uses an embedded SQLite database (epms.db) that is created automatically on first launch. No external database server is required.




**Features**
Screen	Description
Login	Provides administrator authentication for accessing the system.
Add Employee	Register, update, delete, and view employee records.
Deduction	Record money loss, machinery/equipment damage, tardiness, SSS, and PhilHealth deductions with running totals.
Overtime	Calculate and record overtime pay for regular working days, holidays, and rest days.
Bonus	Search for an employee, calculate a yearly bonus based on years of service, and save the result.
Payment	Search for an employee using their ID and generate a PDF payslip.
Search	Perform real-time searching and viewing of employee records.


**Tech Stack
**Technology	Purpose
Java 17+	Core programming language and application logic
Java Swing	Desktop graphical user interface
SQLite	Embedded database for persistent data storage
Maven	Build automation and dependency management
PDF Generation	Generates employee payroll payslips in PDF format


**System Requirements
**- JDK 17 or later
- Apache Maven
- A Windows, macOS, or Linux environment capable of running Java desktop applications
No external database server is required. SQLite is embedded directly into the application.

**Getting Started
**1. Clone the Repository
git clone https://github.com/LIUjvilconzob/payroll_management_system.git
2. Navigate to the Project
cd payroll_management_system
3. Build the Application
mvn clean package
4. Run the Application
Run the generated JAR file:
java -jar target/<generated-jar-file>.jar
The generated JAR filename depends on the Maven configuration in pom.xml.

**Database
**EPMS uses SQLite for local data persistence.
The database file is:
epms.db
It is created automatically when the application starts if it does not already exist.
Stored Information
The database is used to manage:
- Employee records
- Employee payroll information
- Deduction records
- Overtime records
- Bonus records
- Other payroll-related data
Because SQLite is embedded, there is no need to install, configure, or maintain a separate database server.
Default Login
For initial access, the system provides the following administrator credentials:
Username	Password
admin	1234


Security Note: The default credentials are intended for development/testing. They should be changed before using the application in a production environment.

**Payroll Functions
****Employee Management
**Administrators can:
- Register employees
- Update employee information
- Delete employee records
- View employee records
- Search for employees
**Deduction Management
**The system supports recording and tracking:
- Money lost
- Machinery/equipment damage
- Tardiness
- SSS
- PhilHealth
The application maintains the corresponding deduction totals for payroll processing.
**Overtime Management
**The system calculates overtime compensation for:
- Regular working days
- Holidays
- Rest days
Calculated overtime information is stored for the corresponding employee.
**Bonus Management
**The system calculates yearly employee bonuses based on years of service and saves the resulting bonus information.
**Payslip Generation
**Administrators can search for an employee using their employee ID and generate a PDF payslip containing the employee's payroll information.
Bonus Management
The system calculates yearly employee bonuses based on years of service and saves the resulting bonus information.
**Project Objectives
**EPMS was developed to provide Bite Delight with a centralized desktop application for managing employee payroll operations.
The system aims to:
- Reduce manual payroll processing
- Organize employee information
- Simplify payroll calculations
- Track deductions, overtime, and bonuses
- Generate employee payslips efficiently
- Provide centralized database storage
**Learning Outcomes
**This project provided practical experience in:
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
Payslip Generation
Administrators can search for an employee using their employee ID and generate a PDF payslip containing the employee's payroll information.
