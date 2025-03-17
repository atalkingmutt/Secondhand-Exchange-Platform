This project is a Java-based peer-to-peer trading system designed for second-hand items. It features a user-friendly Swing GUI that allows users to register, log in, search for items, and perform secure exchanges using a points-based system.

Features
User Management:

User registration and login via a simple GUI.
Points system to manage user transactions.
Item Categories:

Items are divided into three main categories: Clothes, Shoes, and Accessories.
Each category is managed by specialized list classes (e.g., ClothesList, ShoesList, AccessoryList) for targeted operations.
Exchange Mechanism:

Seamless item search via ID or keyword.
Secure exchange process with point verification and confirmation dialogs.
Object-Oriented Design:

Uses abstraction, inheritance, interfaces, and polymorphism to create a modular and scalable architecture.
Core interfaces (Item_Manager, ItemList_Manager) ensure consistent handling of different item types.
Project Structure
Model Classes:

Item (base class) and its subclasses: Clothes, Shoes, Accessory
Management Classes:

ItemList and its specialized subclasses (ClothesList, ShoesList, AccessoryList)
Student and StudentList for user management
GUI Classes:

Login_Frame for user login and enrollment.
Home_Frame as the welcome screen.
Exchange_Frame for item search and exchange operations.
Main Entry:

Tester.java serves as the application entry point, initializing data and launching the GUI
