# tim-tam-time

![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

A simple Java utility for working with dates and times, including format conversions, random time generation, and testing utilities.

---

## Table of Contents

- [Description](#description)  
- [Features](#features)  
- [Getting Started](#getting-started)  
  - [Prerequisites](#prerequisites)  
  - [Installation](#installation)  
- [Usage](#usage)  
- [Project Structure](#project-structure)  
- [Contributing](#contributing)  
- [License](#license)  

---

## Description

**tim-tam-time** is a lightweight Java project for handling dates and times. It provides:

- Conversion between date-only, time-only, and combined date-time formats.  
- Generation of random time values.  
- A simple testing/demo environment via `DateTimeTester.java`.

This project is perfect for learning, testing, or small applications that need basic date/time operations without heavy dependencies.


## Features

- **Date and Time Conversion:** Parse, format, and convert date and time values easily.  
- **Random Time Generation:** Generate random times for testing or simulations.  
- **Lightweight Java Implementation:** No external libraries required.  
- **Test/Demo Ready:** The `DateTimeTester` class demonstrates functionality.  


## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or later.  
- (Optional) An IDE like IntelliJ IDEA or Eclipse.  

### Installation

1. Clone the repository:
```bash
git clone https://github.com/3m-6h7/tim-tam-time.git
```
2. Compile Java Files
```bash
cd tim-tam-time
javac *.java
```
3. Run Tester/Demo
```bash
java DateTimeTester
```

## Usage 
Converting Dates and Times
```bash
Date date = Date.fromLocalDate(2025, 11, 19);
Time time = Time.fromHMS(14, 30, 0);
DateWithTime dt = new DateWithTime(date, time);

System.out.println("Combined date-time: " + dt);
```
Generating Random Time
```bash
Time randomTime = Time.random();
System.out.println("Random time: " + randomTime);
```
## Project Structure

- `Date.java` — Handles date-only operations (parsing, formatting).  
- `Time.java` — Handles time-only operations, including random generation.  
- `DateWithTime.java` — Combines date and time for parsing, formatting, and conversions.  
- `DateTimeTester.java` — Demo/test class to showcase features.  

## Contributing

Contributions are welcome! To contribute:

1. Fork the repo.  
2. Create a new branch: `git checkout -b feature/my-feature`  
3. Make changes and commit: `git commit -am 'Add feature'`  
4. Push to your branch: `git push origin feature/my-feature`  
5. Open a Pull Request.


## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
