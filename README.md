# Stream Benchmarking Results

## Description
This repository contains benchmarking results for different types of file streams in terms of their efficiency when reading and writing binary and text data. The performance was measured for both buffered and non-buffered streams. You can find the results and the conclusions based on the benchmarks below.

## Results

### Binary File Operations

| Operation                                                | Time (ms) |
| -------------------------------------------------------- | --------- |
| Reading byte by byte a small binary file                 | 105       |
| Writing byte by byte a smallest (1B) binary file         | 105       |
| Writing byte by byte a smaller (1kB) binary file         | 115       |
| Writing byte by byte a (1MB) binary file                 | 1510      |
| Writing byte by byte a (5MBs) binary file                | 7690      |
| Buffered reading byte by byte of a small binary file     | 105       |
| Buffered writing byte by byte a smallest (1B) binary file| 105       |
| Buffered writing byte by byte a smaller (1kB) binary file| 110       |
| Buffered writing byte by byte a (1MB) binary file        | 130       |
| Buffered writing byte by byte a (5MBs) binary file       | 190       |

### Text File Operations

| Operation                                                | Time (ms) |
| -------------------------------------------------------- | --------- |
| Reading byte by byte a small text file                   | 105       |
| Writing byte by byte a smallest (1B) text file           | 105       |
| Writing byte by byte a smaller (1kB) text file           | 115       |
| Writing byte by byte a (1MB) text file                   | 215       |
| Writing byte by byte a (5MBs) text file                  | 440       |
| Buffered reading byte by byte of a small text file       | 103       |
| Buffered writing byte by byte a smallest (1B) text file  | 110       |
| Buffered writing byte by byte a smaller (1kB) text file  | 110       |
| Buffered writing byte by byte a (1MB) text file          | 150       |
| Buffered writing byte by byte a (5MBs) text file         | 240       |

## Conclusions

### Which type of stream is the most efficient for each use case?
- **Buffered streams** are the most efficient for both binary and text file operations, particularly when writing larger files. The time difference is significant when working with larger files (1MB and 5MB), where the performance improvement is especially notable for buffered streams.

### Why is it more efficient than the other types of streams?
- **Buffered streams** are more efficient because they reduce the number of I/O operations by storing data in a buffer before writing it to disk or reading from the disk. Instead of making multiple small, frequent accesses to the file, buffered streams perform fewer but larger operations, reducing overhead and improving speed.

### What is the difference between binary data and text data?
- **Binary data** refers to raw byte sequences, which may represent any type of data, such as images, executable code, or audio files. 
- **Text data**, on the other hand, represents human-readable characters that are typically encoded using a specific character encoding (like ASCII or UTF-8). Text files are processed in terms of characters, whereas binary files are processed in terms of raw bytes.

### What is a character encoding?
- **Character encoding** is a system that maps characters (like letters, numbers, symbols) to their binary equivalents. Popular encodings include ASCII, UTF-8, and UTF-16. It is essential for reading and writing text data, as it ensures the correct interpretation and storage of character data in different environments.

### Why is this benchmark methodology important?
- This benchmarking methodology is important because it provides insight into the performance characteristics of different stream types, particularly in terms of how they handle various file sizes and types (binary vs text). By understanding which stream type is more efficient for specific tasks, developers can make informed choices to optimize file handling operations in their applications.
