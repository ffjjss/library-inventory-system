# Library Inventory System

A console-based Java application for managing a simple inventory — built to practice core Java and OOP fundamentals.

## Features
- Add items (with duplicate ID check)
- Remove items by ID
- Search items by name
- List all items in the inventory

## Tech
- Java
- Built and run in IntelliJ IDEA

## What I learned
Handling input buffer issues with `Scanner` (the classic `nextInt()`/`nextLine()` leftover-newline bug) was the trickiest part — fixed it by clearing the buffer right after reading the menu choice.

## Next steps
- Persist data to a file so it survives between runs
- Add categories/tags to items
