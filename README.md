# 🏧 ATM Interface System

**Java Console-Based Banking Transaction Simulator**

> Perform secure banking operations including withdrawals, deposits, and balance inquiries through an interactive ATM simulation.

---

## 📖 Overview

ATM Interface System is a **console-based Java banking application** that simulates real-world ATM operations.

The system allows users to perform essential banking tasks such as:

- Withdrawing money
- Depositing money
- Checking account balance
- Exiting the ATM system

The project demonstrates object-oriented programming concepts including **classes, constructors, encapsulation, method interaction, and user-driven menu systems**.

---

## 🗂️ Repository Structure

```plaintext
ATM-System/
├── ATM.java          # Main ATM interface and logic
├── BankAcct.java     # Bank account operations
└── README.md         # Project documentation
```

---

## 🚀 Quick Start

### Compile the program

```bash
javac ATM.java
```

### Run the program

```bash
java ATM
```

---

## ⚙️ Features

- 💸 Withdraw money securely
- 💰 Deposit funds instantly
- 📊 Check current account balance
- 🧾 Interactive ATM menu
- ⚡ Real-time balance updates
- 🚫 Insufficient balance validation
- ☕ Beginner-friendly Java implementation

---

## 📝 How It Works

### **[ ATM START ]**

The system initializes with a default account balance:

1000

---

### **[ DISPLAY MENU ]**

The ATM shows:

- Withdraw
- Deposit
- Check Balance
- Exit

---

### **[ USER TRANSACTION ]**

User selects an operation.

---

### **[ PROCESS REQUEST ]**

The system validates and executes:

- Successful withdrawal
- Deposit confirmation
- Balance inquiry
- Insufficient funds alert

---

### **[ REPEAT / EXIT ]**

Returns to menu until the user exits.

---

## 📊 Menu Options

| Option | Function |
|--------|----------|
| **1** | Withdraw Money |
| **2** | Deposit Money |
| **3** | Check Balance |
| **4** | Exit ATM |

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|------------|
| Language | Java |
| Input Handling | Scanner Class |
| OOP Concepts | Classes & Encapsulation |
| Logic | Conditional Statements & Loops |
| Execution | Console-based |

---

## 🌟 Sample Output

```plaintext
ATM MENU
1. Withdraw
2. Deposit
3. Check Balance
4. Exit

Enter your choice: 3

Your current balance is: 1000.0
```

### Withdrawal Example

```plaintext
Enter your choice: 1
Enter amount to withdraw: 500

Withdrawal successful. New balance: 500.0
```

### Deposit Example

```plaintext
Enter your choice: 2
Enter amount to deposit: 200

Deposit successful. New balance: 700.0
```

### Insufficient Funds Example

```plaintext
Enter amount to withdraw: 2000

Insufficient funds.
```

---

## 🤝 Contributing

Contributions are welcome.

Possible improvements:

- PIN authentication system
- Transaction history tracking
- Multiple user accounts
- File-based data persistence
- Graphical ATM interface
- Input validation enhancements
