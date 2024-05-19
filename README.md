# Percentage Calculator

This Java program calculates the percentage of obtained marks based on different scenarios: 4 core subjects, 5 subjects, 6 subjects, and the top 5 subjects in a 6-subject scenario. The user provides the maximum marks (either 400, 500, or 600) and the obtained marks for each subject. The program then calculates and displays the appropriate percentages.

## Features

- Calculates the percentage for 4 core subjects if the maximum marks are 400.
- Calculates the percentage for all 5 subjects if the maximum marks are 500.
- Calculates the percentage for all 6 subjects and the top 5 subjects if the maximum marks are 600.
- Handles invalid input and displays appropriate error messages.

## Example Inputs and Outputs

### Scenario 1: 4 Core Subjects (Max Marks = 400)

Input:
```
400
85
90
80
70
```
Output:
4 core subjects percentage: 81.25%

### Scenario 2: All 5 Subjects (Max Marks = 500)

Input:
```
500
85
90
80
70
75
```
Output:
All 5 subjects percentage: 80.00%

### Scenario 3: All 6 Subjects (Max Marks = 600)

Input:
```
600
85
90
80
70
75
65
```
Output:
All 6 subjects percentage: 77.50%
Top 5 subjects percentage: 80.00%

### Scenario 4: Error Handling

Input:
```
300
85
90
80
```
Output:
Error: None of the parameters satisfied.
