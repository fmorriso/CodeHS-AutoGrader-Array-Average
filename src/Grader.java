/**
 * You can write autograded tests here.
 * Test format:
 *  * Autograder grader = new Autograder();
 * grader.assertEqual(String testName, T studentOutput,
 *     T solutionOutput, String messagePass, String messageFail)
 * Alternative test format:
 *  * boolean test = false;
 * grader.addTest(String testName, boolean testStatus,
 *     T studentOutput, T solutionOutput, String message);
 *
 * The autograder will automatically track and store all output from println and
 * print. This can be done with the following Autograder functions:
 *  * grader.getOutput(String className);
 * grader.getOutputArrayList(String className);
 *
 * If the main class extends ConsoleProgram, you can also set inputs as well.
 * This can be done with any class instance that extends ConsoleProgram:
 *  * MyProgram p1;
 * p1 = new MyProgram();
 * p1.setInputs(String[] inputs);
 *
 * Something of note, files in the autograder will overwrite files of the
 * same name in the student code. This can be useful if you want an alterantive
 * version of the master code for a particular file.
 *
 * You can find some example tests in the code below.
 * See documentation for further information.
 */
public class Grader
{
    public static void main(String [] args)
    {
        Autograder grader = new Autograder();

        int[] testArray = {78, 80, 82, 85, 91};

        ArrayAverage student = new ArrayAverage(testArray);
        ArrayAverageSol solution = new ArrayAverageSol(testArray);

        final String studentClassName = "ArrayAverage";
        final String solutionClassName = "ArrayAverageSol";

        // Test 1 - Test Method
        grader.assertEqual("Testing the average method",
                student.getAverage(), solution.getAverage(),
                "Great!", "Check your getAverage() method. Did you calculate as a double?");

        // Test 2 - Test Output.

        ArrayAverageTester studentSol = new ArrayAverageTester();
        studentSol.run();
        String studentOutput = grader.getOutput(studentClassName);

        MainSolution mainSol = new MainSolution();
        String mainSolClassName = mainSol.getClass().getName();
        System.out.format("mainSol.getClass().getName()= %s%n", mainSol.getClass().getName());
        mainSol.run();

        ;
        String solutionOutput = grader.getOutput(mainSolClassName);

        grader.assertEqual("Checking the output of your console.",
                studentOutput, solutionOutput,
                "Perfect!", "Check your output. Make sure you are matching the example.");

        // Test 3
        // boolean test = false;
        // grader.addTest("Asserts something",
        //     test, "1", "0", "Please, try again.");

        // Test 4
        // MyProgram p1;
        // MyProgramSolution p2;
        // p1 = new MyProgram();
        // p2 = new MyProgramSolution();
        // p1.setInputs(new String[]{"Zach", "Jeremy"});
        // p2.setInputs(new String[]{"Zach"});
        // p2.addInput("Jeremy");
        // p1.run();
        // p2.run();
        // String studentOutput = grader.getOutput("MyProgram");
        // String solutionOutput = grader.getOutput("MyProgramSolution");
        // grader.assertEqual("Test output", studentOutput, solutionOutput, "Woop!", "Nooooope.");

        System.out.println(grader);
    }
}
