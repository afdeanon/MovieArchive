# Movie Film Archive System

**A Java application demonstrating advanced object-oriented design patterns through a movie database with multiple data structure implementations and comprehensive sorting capabilities.**

## Project Overview

This project implements a complete movie archive system showcasing core software engineering principles including interface design, inheritance hierarchies, and algorithm optimization across different data structures.

## Project Timeline
October 2021 - September 2021

## 🛠Technical Implementation

### Core Architecture
- **Interface-Based Design**: `FilmArchive` interface ensures consistent behavior across implementations
- **Polymorphism**: Three distinct data structure implementations with identical external behavior
- **Comparable Interface**: Custom sorting logic prioritizing title then year
- **Hash-Based Optimization**: Compatible `equals()` and `hashCode()` methods for efficient lookups

### Data Structures Implemented
1. **ListFilmArchive** (ArrayList-based)
   - O(n) duplicate checking
   - TreeSet-assisted sorting
   
2. **HashFilmArchive** (HashSet-based)  
   - O(1) average duplicate prevention
   - Leverages hash-based uniqueness
   
3. **TreeFilmArchive** (TreeSet-based)
   - O(log n) operations
   - Maintains natural ordering automatically

## Key Features

- **Duplicate Prevention**: Robust duplicate detection across all implementations
- **Consistent Sorting**: Alphabetical by title, chronological by year as tiebreaker
- **Memory Efficient**: Each implementation optimized for its underlying data structure
- **Extensible Design**: Easy to add new archive types through interface implementation


## Testing & Validation

Comprehensive test suite validates:
- Duplicate movie rejection (same title + year)
- Proper sorting with edge cases (same titles, same years)
- Interface compliance across all implementations
- Memory efficiency and performance benchmarks

## Learning Outcomes

This project demonstrates:
- Object-oriented design and inheritance
- Java Collections Framework optimization
- Interface-driven development
- Algorithm complexity analysis
- Comprehensive testing methodologies

---

*Built with Java • Focused on clean architecture and performance optimization*
