# Second-Hand Exchange Platform

This project is a **Java-based peer-to-peer trading system** designed for second-hand items. It features a user-friendly **Swing GUI** that allows users to register, log in, search for items, and perform secure exchanges using a points-based system.

---

## Features

### User Management
- **User Registration & Login:** Simple GUI for user enrollment.
- **Points System:** Manage user transactions with a secure points mechanism.

### Item Categories
- **Categorization:** Items are divided into three main categories: *Clothes*, *Shoes*, and *Accessories*.
- **Specialized Management:** Each category is managed by dedicated list classes (e.g., `ClothesList`, `ShoesList`, `AccessoryList`) for targeted operations.

### Exchange Mechanism
- **Item Search:** Seamless search by ID or keyword.
- **Secure Exchange:** Confirmations and point verification ensure safe transactions.

### Object-Oriented Design
- **Modular Architecture:** Utilizes abstraction, inheritance, interfaces, and polymorphism.
- **Consistent Handling:** Core interfaces (`Item_Manager`, `ItemList_Manager`) provide a uniform method to handle different item types.

---

## Project Structure

### Model Classes
- **Item:** Base class for all items.
- **Subclasses:** `Clothes`, `Shoes`, `Accessory` extend the base class.

### Management Classes
- **ItemList:** Generic item list.
- **Specialized Lists:** `ClothesList`, `ShoesList`, `AccessoryList` for each item category.
- **User Management:** `Student` and `StudentList` manage user data.

### GUI Classes
- **Login_Frame:** For user login and enrollment.
- **Home_Frame:** Welcome screen post-login.
- **Exchange_Frame:** Main interface for item search and exchange operations.

### Main Entry
- **Tester.java:** Serves as the application entry point, initializing data and launching the GUI.

---

## How to Run

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your_username/Secondhand-Exchange-Platform.git
