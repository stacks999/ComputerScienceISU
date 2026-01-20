ICS3U – G1 Test Road Rules Application


This Java program is a practice application for the Ontario G1 knowledge test.
The program allows the user to write a test made up of multiple-choice questions.

The test has two sections:
Part A – Rules of the Road
Part B – Road Signs

The program stores 10 questions in Part A and 10 questions in Part B.
When the user writes the test, the program randomly selects 6 questions from each part.
Questions do not repeat during the same test.

To pass the test, the user must:

Get at least 9 correct answers out of 12 total

Get at least 4 correct answers in Part A

Get at least 4 correct answers in Part B

The program also includes an admin mode that allows questions to be added or removed.

Main Variables and Data Structures

The program uses ArrayLists to store the questions.

Part A:

questionsA stores the question text

optionsA stores the four answer choices for each question

answersA stores the correct answer index

Part B:

questionsB stores the question text

optionsB stores the four answer choices for each question

answersB stores the correct answer index

Each question, its options, and its correct answer use the same index so the data stays aligned.

Program Structure and Logic

The program starts by displaying a main menu where the user can:

Write a G1 test

Login as admin

Exit the program

When writing the test, the program uses random numbers to select questions and makes sure no question is repeated.

The program checks the user’s answers, displays whether each answer is correct or incorrect, and shows the final score and pass or fail result.

If it becomes impossible for the user to pass based on their current answers, the test ends early.

Admin Mode

Admin mode is protected by a password.

The admins password is admin123.

The admin can:

Add new questions to Part A or Part B

Remove existing questions

View all stored questions

Error Handling

The program checks user input to make sure:

Menu choices are valid numbers

Section choices are either A or B

Answer choices are valid

If the user enters invalid input, they are asked again.
