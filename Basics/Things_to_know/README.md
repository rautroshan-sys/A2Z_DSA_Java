# Striver's A2Z DSA Sheet — Java

This repository contains my **Data Structures and Algorithms (DSA)** practice based on **Striver's A2Z DSA Sheet**, implemented in **Java**.

The purpose of this repository is to build strong programming fundamentals and gradually improve problem-solving skills.

---

## 📚 A2Z — Learn the Basics

### 1. Things to Know in Java

Before starting DSA, understand these Java fundamentals:

- Java program structure
- `class` and `main()`
- Variables
- Data Types
- Operators
- Type Casting
- Conditional Statements
- Loops
- Methods
- Arrays
- Strings
- Basic Input / Output

---

## ⌨️ Input & Output

### Input using Scanner

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
System.out.println(n);
```

### Multiple Inputs

```java
int a = sc.nextInt();
int b = sc.nextInt();
```

### String Input

```java
String word = sc.next();
String line = sc.nextLine();
```

### Output

```java
System.out.print("Hello");
System.out.println("Hello");
```

---

## 📦 Arrays

### Declaration

```java
int[] arr = new int[5];
```

### Initialization

```java
int[] arr = {10, 20, 30, 40, 50};
```

### Taking Array Input

```java
int n = sc.nextInt();
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
    arr[i] = sc.nextInt();
}
```

### Traversing an Array

```java
for (int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
}
```

---

## 🔀 Conditionals

### if-else

```java
if (n > 0) {
    System.out.println("Positive");
} else {
    System.out.println("Negative");
}
```

### switch

```java
switch (choice) {
    case 1:
        System.out.println("One");
        break;

    case 2:
        System.out.println("Two");
        break;

    default:
        System.out.println("Invalid");
}
```

---

## 🔁 Loops

### for Loop

```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```

### while Loop

```java
while (i < n) {
    System.out.println(i);
    i++;
}
```

### do-while Loop

```java
do {
    System.out.println(i);
    i++;
} while (i < n);
```

---

## 🧩 Methods

Methods allow us to divide a program into reusable blocks.

```java
static int add(int a, int b) {
    return a + b;
}
```

Calling the method:

```java
int result = add(5, 10);
System.out.println(result);
```

Important concepts:

- Parameters
- Return type
- `return`
- `void`
- Method calling
- `static`

---

## 🔢 Important Data Types

| Type | Example | Use |
|---|---|---|
| `int` | `10` | Integers |
| `long` | `10000000000L` | Large integers |
| `double` | `10.5` | Decimal values |
| `char` | `'A'` | Characters |
| `boolean` | `true` | True / False |
| `String` | `"Hello"` | Text |

---

## 🧠 Problem-Solving Process

For every DSA problem:

```text
Understand the Problem
        ↓
Identify Input & Output
        ↓
Find the Logic
        ↓
Write the Code
        ↓
Test Edge Cases
        ↓
Analyze Time & Space Complexity
```

---

## 📂 Folder Structure

```text
A2Z-DSA-Java/
│
├── 01-Learn-the-Basics/
│   ├── 01-Things-to-Know/
│   ├── 02-Build-Up-Logical-Thinking/
│   ├── 03-Learn-Arrays/
│   └── 04-Learn-Strings/
│
├── 02-Sorting-Techniques/
├── 03-Arrays/
├── 04-Binary-Search/
├── 05-Strings/
├── 06-Linked-List/
├── 07-Recursion/
├── 08-Bit-Manipulation/
├── 09-Stack-and-Queue/
├── 10-Sliding-Window-Two-Pointer/
├── ...
│
└── README.md
```

---

## 📈 Progress

### Learn the Basics

- [ ] Things to Know in Java
- [ ] Input / Output
- [ ] Conditionals
- [ ] Loops
- [ ] Methods
- [ ] Arrays
- [ ] Strings
- [ ] Basic Mathematics
- [ ] Basic Recursion
- [ ] Basic Hashing

### Next

- [ ] Sorting Techniques
- [ ] Arrays
- [ ] Binary Search
- [ ] Strings
- [ ] Linked List
- [ ] Recursion
- [ ] Bit Manipulation
- [ ] Stack & Queue
- [ ] Sliding Window & Two Pointer

---

## 🎯 Goal

Build a strong foundation in **Java, DSA, problem-solving, and algorithmic thinking** by consistently solving problems from the A2Z sheet.

> **Learn → Understand → Code → Test → Optimize → Repeat**