// NAME: Sam Vertlib

import java.util.Scanner;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String ADMIN_PASSWORD = "admin123";

        ArrayList<String> questionsA = new ArrayList<String>();
        ArrayList<String[]> optionsA = new ArrayList<String[]>();
        ArrayList<Integer> answersA = new ArrayList<Integer>();

        ArrayList<String> questionsB = new ArrayList<String>();
        ArrayList<String[]> optionsB = new ArrayList<String[]>();
        ArrayList<Integer> answersB = new ArrayList<Integer>();

        seedQuestionBanks(questionsA, optionsA, answersA, questionsB, optionsB, answersB);

        System.out.println("Welcome to the Ontario G1 Practice Test App!");

        boolean running = true;
        while (running) {

            System.out.println("\nMain Menu");
            System.out.println("1) Write a G1 test");
            System.out.println("2) Login as admin");
            System.out.println("3) Exit");
            System.out.print("Choose an option (1-3): ");

            int choice = readIntInRange(sc, 1, 3);

            if (choice == 1) {
                runTest(sc, questionsA, optionsA, answersA, questionsB, optionsB, answersB);
            } else if (choice == 2) {
                System.out.print("Enter admin password: ");
                String pass = sc.nextLine().trim();
                if (pass.equals(ADMIN_PASSWORD)) {
                    adminMenu(sc, questionsA, optionsA, answersA, questionsB, optionsB, answersB);
                } else {
                    System.out.println("Incorrect password.");
                }
            } else {
                running = false;
            }
        }

        System.out.println("Goodbye!");
        sc.close();
    }

    // Loads the initial 10 questions into each bank
    static void seedQuestionBanks(
            ArrayList<String> questionsA, ArrayList<String[]> optionsA, ArrayList<Integer> answersA,
            ArrayList<String> questionsB, ArrayList<String[]> optionsB, ArrayList<Integer> answersB) {

        addQuestion(questionsA, optionsA, answersA,
                "When turning right at a red traffic light (where allowed), what must you do first?",
                new String[] {
                        "Slow down and turn without stopping",
                        "Honk once and turn",
                        "Come to a complete stop, make sure it is safe, then turn",
                        "Turn only if a green arrow is also showing"
                },
                2);

        addQuestion(questionsA, optionsA, answersA,
                "At a stop sign, what does the law require before you enter the intersection?",
                new String[] {
                        "Stop and then go only when it is safe",
                        "Slow down and go if the road looks clear",
                        "Stop only if another car is coming",
                        "Stop, honk, then proceed"
                },
                0);

        addQuestion(questionsA, optionsA, answersA,
                "What should you do when the traffic light turns yellow?",
                new String[] {
                        "Speed up every time",
                        "Stop if you can do so safely",
                        "Stop immediately no matter what",
                        "Ignore it if no pedestrians are present"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "A green light means:",
                new String[] {
                        "Stop and wait",
                        "Proceed if safe and yield to pedestrians",
                        "Proceed only if no cars are behind you",
                        "Wait for police direction"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "Drivers should normally keep to:",
                new String[] {
                        "The left side of the road",
                        "The right side of the road",
                        "The shoulder",
                        "The centre of the road"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "If your wheels leave the paved roadway, you should:",
                new String[] {
                        "Brake hard immediately",
                        "Grip the wheel and steer back when safe",
                        "Turn sharply right away",
                        "Accelerate quickly"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "A safe following distance in good conditions is:",
                new String[] {
                        "One second",
                        "Two to three seconds",
                        "Five seconds",
                        "Ten seconds"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "If you cannot see clearly for 125 metres, you:",
                new String[] {
                        "May park with hazard lights",
                        "Must not park",
                        "May park briefly",
                        "May park if traffic is light"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "What should you do when an emergency vehicle approaches with siren and lights on?",
                new String[] {
                        "Maintain speed; they will go around you",
                        "Pull over safely and stop until it passes",
                        "Stop in the middle of the lane",
                        "Speed up to avoid blocking it"
                },
                1);

        addQuestion(questionsA, optionsA, answersA,
                "Before changing lanes you should:",
                new String[] {
                        "Signal, check mirrors, and do a shoulder check",
                        "Honk and move quickly",
                        "Slow down suddenly",
                        "Flash headlights only"
                },
                0);

        addQuestion(questionsB, optionsB, answersB,
                "A yellow diamond-shaped sign usually means:",
                new String[] {
                        "Regulatory",
                        "Information",
                        "Warning",
                        "Stop"
                },
                2);

        addQuestion(questionsB, optionsB, answersB,
                "A red octagonal sign means:",
                new String[] {
                        "Yield",
                        "Stop",
                        "Do not enter",
                        "Railway crossing"
                },
                1);

        addQuestion(questionsB, optionsB, answersB,
                "A sign with a red circle and slash means:",
                new String[] {
                        "Action is required",
                        "Action is permitted",
                        "Action is not allowed",
                        "Yield"
                },
                2);

        addQuestion(questionsB, optionsB, answersB,
                "A pedestrian symbol sign means:",
                new String[] {
                        "Pedestrians are not allowed",
                        "Pedestrian crossing ahead",
                        "School zone",
                        "Hospital zone"
                },
                1);

        addQuestion(questionsB, optionsB, answersB,
                "A sign showing a bicycle symbol warns of:",
                new String[] {
                        "Bike parking",
                        "Bike crossing",
                        "Bike lane ends",
                        "No bicycles"
                },
                1);

        addQuestion(questionsB, optionsB, answersB,
                "A school zone sign with flashing lights means:",
                new String[] {
                        "Reduced speed only on weekends",
                        "Reduced speed when lights are flashing",
                        "Reduced speed all day",
                        "No speed change"
                },
                1);

        addQuestion(questionsB, optionsB, answersB,
                "A sign that warns of reduced traction when wet means:",
                new String[] {
                        "Road narrows",
                        "Road curves",
                        "Road slippery when wet",
                        "Construction ahead"
                },
                2);

        addQuestion(questionsB, optionsB, answersB,
                "A sign warning of a steep hill means:",
                new String[] {
                        "Truck inspection ahead",
                        "Steep hill",
                        "Truck parking",
                        "Truck-only road"
                },
                1);

        addQuestion(questionsB, optionsB, answersB,
                "A sign warning of an underpass/overpass means:",
                new String[] {
                        "Tunnel ahead",
                        "Bridge ahead",
                        "Overpass or underpass ahead",
                        "No trucks allowed"
                },
                2);

        addQuestion(questionsB, optionsB, answersB,
                "An EDR route sign indicates:",
                new String[] {
                        "Emergency detour route",
                        "Hospital route",
                        "Police-only route",
                        "Fire station route"
                },
                0);
    }

    // Adds one question into a specific bank (keeps lists aligned by index)
    static void addQuestion(ArrayList<String> questions, ArrayList<String[]> options, ArrayList<Integer> answers,
                            String qText, String[] opts, int correctIndex) {
        questions.add(qText);
        options.add(opts);
        answers.add(correctIndex);
    }

    // Admin menu loop
    static void adminMenu(Scanner sc,
                          ArrayList<String> questionsA, ArrayList<String[]> optionsA, ArrayList<Integer> answersA,
                          ArrayList<String> questionsB, ArrayList<String[]> optionsB, ArrayList<Integer> answersB) {

        boolean inAdmin = true;
        while (inAdmin) {
            System.out.println("\nAdmin Menu");
            System.out.println("1) Add a question");
            System.out.println("2) Remove a question");
            System.out.println("3) List questions");
            System.out.println("4) Return to main menu");
            System.out.print("Choose an option (1-4): ");

            int choice = readIntInRange(sc, 1, 4);

            if (choice == 1) {
                adminAddQuestion(sc, questionsA, optionsA, answersA, questionsB, optionsB, answersB);
            } else if (choice == 2) {
                adminRemoveQuestion(sc, questionsA, optionsA, answersA, questionsB, optionsB, answersB);
            } else if (choice == 3) {
                adminListQuestions(questionsA, questionsB);
            } else {
                inAdmin = false;
            }
        }
    }

    // Adds a question to Part A or Part B
    static void adminAddQuestion(Scanner sc,
                                 ArrayList<String> questionsA, ArrayList<String[]> optionsA, ArrayList<Integer> answersA,
                                 ArrayList<String> questionsB, ArrayList<String[]> optionsB, ArrayList<Integer> answersB) {

        System.out.print("Which section? (A or B): ");
        String sec = readSection(sc);

        System.out.print("Enter question text: ");
        String qText = sc.nextLine().trim();

        String[] opts = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter option " + (char)('A' + i) + ": ");
            opts[i] = sc.nextLine().trim();
        }

        System.out.print("Correct answer (A-D or 1-4): ");
        int correctIndex = readAnswerIndex(sc);

        if (sec.equals("A")) {
            addQuestion(questionsA, optionsA, answersA, qText, opts, correctIndex);
        } else {
            addQuestion(questionsB, optionsB, answersB, qText, opts, correctIndex);
        }

        System.out.println("Question added.");
    }

    // Removes a question by number (index-based for simplicity)
    static void adminRemoveQuestion(Scanner sc,
                                    ArrayList<String> questionsA, ArrayList<String[]> optionsA, ArrayList<Integer> answersA,
                                    ArrayList<String> questionsB, ArrayList<String[]> optionsB, ArrayList<Integer> answersB) {

        System.out.print("Remove from which section? (A or B): ");
        String sec = readSection(sc);

        if (sec.equals("A")) {
            if (questionsA.size() == 0) {
                System.out.println("Part A has no questions.");
                return;
            }
            printNumberedQuestions(questionsA);
            System.out.print("Enter the question number to remove: ");
            int num = readIntInRange(sc, 1, questionsA.size());
            int idx = num - 1;

            questionsA.remove(idx);
            optionsA.remove(idx);
            answersA.remove(idx);

            System.out.println("Removed from Part A.");
        } else {
            if (questionsB.size() == 0) {
                System.out.println("Part B has no questions.");
                return;
            }
            printNumberedQuestions(questionsB);
            System.out.print("Enter the question number to remove: ");
            int num = readIntInRange(sc, 1, questionsB.size());
            int idx = num - 1;

            questionsB.remove(idx);
            optionsB.remove(idx);
            answersB.remove(idx);

            System.out.println("Removed from Part B.");
        }
    }

    // Lists questions in both banks
    static void adminListQuestions(ArrayList<String> questionsA, ArrayList<String> questionsB) {
        System.out.println("\nPart A Questions (" + questionsA.size() + "):");
        printNumberedQuestions(questionsA);

        System.out.println("\nPart B Questions (" + questionsB.size() + "):");
        printNumberedQuestions(questionsB);
    }

    // Prints a numbered list of questions
    static void printNumberedQuestions(ArrayList<String> questions) {
        for (int i = 0; i < questions.size(); i++) {
            System.out.println((i + 1) + ") " + questions.get(i));
        }
    }

    // Runs the test: 6 questions from A and 6 from B, no repeats
    static void runTest(Scanner sc,
                        ArrayList<String> questionsA, ArrayList<String[]> optionsA, ArrayList<Integer> answersA,
                        ArrayList<String> questionsB, ArrayList<String[]> optionsB, ArrayList<Integer> answersB) {

        if (questionsA.size() < 6 || questionsB.size() < 6) {
            System.out.println("Not enough questions to run the test (need at least 6 in each section).");
            return;
        }

        int[] pickedA = pickUniqueRandomIndexes(questionsA.size(), 6);
        int[] pickedB = pickUniqueRandomIndexes(questionsB.size(), 6);

        int correctA = 0;
        int correctB = 0;
        int askedA = 0;
        int askedB = 0;

        System.out.println("\nPart A (6 Questions)");
        for (int i = 0; i < 6; i++) {
            askedA++;
            boolean gotIt = askQuestion(sc, questionsA.get(pickedA[i]), optionsA.get(pickedA[i]), answersA.get(pickedA[i]));
            if (gotIt) correctA++;

            if (cannotStillPass(correctA, correctB, askedA, askedB)) {
                System.out.println("\nBased on your current results, you can no longer pass this test.");
                printFinalScores(correctA, correctB);
                return;
            }
        }

        System.out.println("\nPart B (6 Questions)");
        for (int i = 0; i < 6; i++) {
            askedB++;
            boolean gotIt = askQuestion(sc, questionsB.get(pickedB[i]), optionsB.get(pickedB[i]), answersB.get(pickedB[i]));
            if (gotIt) correctB++;

            if (cannotStillPass(correctA, correctB, askedA, askedB)) {
                System.out.println("\nBased on your current results, you can no longer pass this test.");
                printFinalScores(correctA, correctB);
                return;
            }
        }

        printFinalScores(correctA, correctB);
    }

    // Asks one question and returns true/false based on correctness
    static boolean askQuestion(Scanner sc, String qText, String[] opts, int correctIndex) {

        System.out.println("\n" + qText);
        System.out.println("A) " + opts[0]);
        System.out.println("B) " + opts[1]);
        System.out.println("C) " + opts[2]);
        System.out.println("D) " + opts[3]);
        System.out.print("Your answer (A-D or 1-4): ");

        int ansIndex = readAnswerIndex(sc);

        if (ansIndex == correctIndex) {
            System.out.println("Correct!");
            return true;
        } else {
            char correctLetter = (char)('A' + correctIndex);
            System.out.println("Incorrect. Correct answer: " + correctLetter);
            return false;
        }
    }

    // Checks whether the user can still pass based on remaining questions
    static boolean cannotStillPass(int correctA, int correctB, int askedA, int askedB) {

        int totalCorrect = correctA + correctB;

        int remainingA = 6 - askedA;
        int remainingB = 6 - askedB;
        int remainingTotal = remainingA + remainingB;

        if (totalCorrect + remainingTotal < 9) return true;
        if (correctA + remainingA < 4) return true;
        if (correctB + remainingB < 4) return true;

        return false;
    }

    // Prints the final scores and pass/fail result
    static void printFinalScores(int correctA, int correctB) {

        int totalCorrect = correctA + correctB;
        double percent = (totalCorrect / 12.0) * 100.0;

        System.out.println("\nResults");
        System.out.println("Part A: " + correctA + "/6");
        System.out.println("Part B: " + correctB + "/6");
        System.out.println(String.format("Final: %d/12 (%.1f%%)", totalCorrect, percent));

        if (totalCorrect >= 9 && correctA >= 4 && correctB >= 4) {
            System.out.println("Status: PASS");
        } else {
            System.out.println("Status: FAIL");
        }
    }

    // Picks unique random indexes from 0..size-1
    static int[] pickUniqueRandomIndexes(int size, int count) {

        int[] picks = new int[count];
        int filled = 0;

        while (filled < count) {
            int r = (int)(Math.random() * size);
            if (!containsInt(picks, filled, r)) {
                picks[filled] = r;
                filled++;
            }
        }

        return picks;
    }

    // Checks whether an int exists in an array up to a certain length
    static boolean containsInt(int[] arr, int usedLength, int value) {
        for (int i = 0; i < usedLength; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }

    // Reads an integer input that must be within a range
    static int readIntInRange(Scanner sc, int min, int max) {
        while (true) {
            String s = sc.nextLine().trim();
            if (isInteger(s)) {
                int v = Integer.parseInt(s);
                if (v >= min && v <= max) return v;
            }
            System.out.print("Enter a number between " + min + " and " + max + ": ");
        }
    }

    // Reads section letter A or B
    static String readSection(Scanner sc) {
        while (true) {
            String sec = sc.nextLine().trim().toUpperCase();
            if (sec.equals("A") || sec.equals("B")) return sec;
            System.out.print("Enter A or B: ");
        }
    }

    // Reads an answer choice and converts it to an index 0..3
    static int readAnswerIndex(Scanner sc) {
        while (true) {
            String s = sc.nextLine().trim().toUpperCase();

            if (s.equals("A")) return 0;
            if (s.equals("B")) return 1;
            if (s.equals("C")) return 2;
            if (s.equals("D")) return 3;

            if (isInteger(s)) {
                int v = Integer.parseInt(s);
                if (v >= 1 && v <= 4) return v - 1;
            }

            System.out.print("Enter A-D or 1-4: ");
        }
    }

    // Checks if a string contains only digits
    static boolean isInteger(String s) {
        if (s == null || s.length() == 0) return false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') return false;
        }
        return true;
    }
}