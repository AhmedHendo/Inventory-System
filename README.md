# Inventory Management System

A Java Swing application for managing employees, products, purchases, and returns in a small inventory system. The project is designed for a basic business workflow where an admin manages employee access and an employee manages product inventory and customer transactions.

## Project Overview

This application allows users to:

- Log in as an admin or as an employee
- Add and remove employees from the system
- Add new products to inventory
- View available products and their stock information
- Record product purchases
- Process product returns
- Store all records in local text files for persistence

## Key Features

### Admin features

- Manage employee records
- Add employee details such as ID, name, email, address, and phone number
- Remove employees from the employee database
- Save employee data to the file system

### Employee features

- View inventory records
- Add new products to stock
- Handle customer purchases
- Handle returns and refund calculations
- Track stock quantity after every transaction

### Data persistence

- Employee records are stored in `Employees.txt`
- Product records are stored in `Products.txt`
- Purchase records are stored in `CustomersProducts.txt`

## Tech Stack

- Java 17
- Swing (GUI)
- Maven
- Text file-based storage

## Project Structure

```text
Inventory system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── backend/
│   │   │   ├── constants/
│   │   │   └── frontend/
│   └── test/
├── Employees.txt
├── Products.txt
├── CustomersProducts.txt
├── pom.xml
├── README.md
└── target/
```

## Getting Started

### Prerequisites

- Java JDK 17 or newer
- Maven
- An IDE such as NetBeans or IntelliJ IDEA (optional)

### Run the project

1. Open the project in your Java IDE or navigate to the project folder.
2. Make sure Maven dependencies are resolved.
3. Run the main application class
   - `frontend.TheInventorySystemWindow`
   - or run from the project using your IDE's Java launcher

### Build with Maven

```bash
mvn clean compile
```

### Run the application

If the project is already built and your environment is configured correctly:

```bash
java -cp target/classes frontend.TheInventorySystemWindow
```

## How It Works

When the application starts, the main window offers two roles:

- Admin Role
- Employee Role

From there:

- Admins can manage employees
- Employees can manage products and customer purchase activity

The application uses Java classes to read and write data from text files, making it simple and easy to understand for educational and small-project use.

## Notes

This project is a great example of a Java desktop application using Swing, object-oriented programming, and file-based persistence. It is especially useful for learning how to structure a small inventory management system with role-based access.

## License

This project does not currently include a formal license file. If you plan to publish it publicly, you may want to add an open-source license such as MIT or Apache 2.0.

## Contributors

This project was developed as a college assignment / Java project and can be extended with features such as:

- user authentication
- product search and filtering
- stock alerts
- invoice generation
- database migration from text files to MySQL or SQLite
