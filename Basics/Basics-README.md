# Basics Module - README

## Overview
This module contains all basic beginner-friendly programming problems and example solutions covering fundamental concepts in Java.

## Problems covered so far

### Number-based Problems

1. **Reverse a Number**
   - Description: Reverse the digits of an integer
   - Implementation: `problems.numbers.ReverseNumber.java`
   - Example: Input `12345` → Output `54321`
   - Time Complexity: O(log n) where n is the number
   - Space Complexity: O(1)

2. **Palindrome Number**
   - Description: Check if a number reads the same forwards and backwards
   - Implementation: `problems.numbers.PalindromeNumber.java`
   - Example: Input `121` → Output `true`, Input `123` → Output `false`
   - Time Complexity: O(log n)
   - Space Complexity: O(1)

3. **Sum and Count of Digits**
   - Description: Calculate the sum and count of digits in a number
   - Implementation: `problems.numbers.FindSumAndDigitCount.java`
   - Example: Input `12345` → Sum `15`, Count `5`
   - Time Complexity: O(log n)
   - Space Complexity: O(1)

4. **Armstrong Number**
   - Description: Check if a number equals the sum of its digits raised to the power of the number of digits
   - Implementation: `problems.numbers.ArmstrongNumber.java`
   - Example: `153 = 1³ + 5³ + 3³ = 153` (Armstrong), `123` (Not Armstrong)
   - Time Complexity: O(log n)
   - Space Complexity: O(1)

5. **Factorial**
   - Description: Calculate factorial using iterative and recursive approaches
   - Implementation: `problems.recursion.Factorial.java`
   - Example: Input `5` → Output `120`
   - Time Complexity: O(n)
   - Space Complexity: O(1) iterative, O(n) recursive

6. **Prime Check**
   - Description: Check if a number is prime (naive and optimized methods)
   - Implementation: `problems.numbers.PrimeNumber.java`
   - Example: Input `17` → Output `true`, Input `18` → Output `false`
   - Time Complexity: O(√n) optimized
   - Space Complexity: O(1)

7. **GCD and LCM**
   - Description: Find Greatest Common Divisor and Least Common Multiple using Euclidean algorithm
   - Implementation: `problems.operations.GcdLcm.java`
   - Example: GCD(12, 18) = 6, LCM(12, 18) = 36
   - Time Complexity: O(log min(a,b))
   - Space Complexity: O(1)

8. **Fibonacci Sequence**
   - Description: Generate Fibonacci numbers using iterative, recursive, and DP approaches
   - Implementation: `problems/Fibonacci.java`
   - Example: 0, 1, 1, 2, 3, 5, 8, 13, 21...
   - Time Complexity: O(n) iterative/DP, O(2ⁿ) naive recursive
   - Space Complexity: O(1) iterative, O(n) DP

9. **Power Check**
   - Description: Check if a number is a power of 2 or not
   - Implementation: `problems.operations.PowerCheck.java`
   - Example: `16` is power of 2, `27` is power of 3
   - Time Complexity: O(log n) or O(1) for power of 2 using bit tricks
   - Space Complexity: O(1)


## How to Run

### From IntelliJ IDEA
1. Navigate to the specific problem file under `src/problems/`
2. Right-click on the file and select "Run 'ClassName.main()'"
3. View output in the console

### From Command Line
```bash
# Compile
javac -d out src/problems/ClassName.java

# Run
java -cp out problems.ClassName
```

## Project Structure
```
Basics/
├── Basics-README.md
├── Basics.iml
└── src/
    ├── problems/
    │   ├── numbers/              # Number manipulation problems
    │   │   ├── ReverseNumber.java
    │   │   ├── PalindromeNumber.java
    │   │   ├── ArmstrongNumber.java
    │   │   ├── PrimeNumber.java
    │   │   └── FindSumAndDigitCount.java
    │   ├── operations/           # Mathematical operations
    │   │   ├── GcdLcm.java
    │   │   └── PowerCheck.java
    │   └── recursion/            # Recursion-based problems
    │       ├── Factorial.java
    │       └── FibonacciSequence.java
    └── samples/
        └── BasicSamples.java     # Helper utility methods
```

## Package Organization

- **`problems.numbers`** - Basic number manipulation and digit-based problems (reverse, palindrome, Armstrong, prime check, sum of digits)
- **`problems.operations`** - Mathematical operations and algorithms (GCD, LCM, power checks)
- **`problems.recursion`** - Recursion-based implementations (factorial, Fibonacci)
- **`samples`** - Utility helper methods and sample code


## Contributing
When adding new problems:
1. Create a new Java file in `src/problems/`
2. Include problem description, examples, and complexity analysis in comments
3. Implement multiple approaches when applicable
4. Add the problem to this README with proper documentation

