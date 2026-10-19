/*
 * Student Mark Tracker application
 * Used to calculate average student marks and print out the classifications
 */

/**
 * @author silinse
 */
public class StudentMarkTracker {
    private static final int[][] MARKS =
            {
                    {2, 5, 2, 2, 5, 5, 3, 2, 1, 2},
                    {10, 9, 9, 10, 8, 9, 8, 10},
                    {6, 8, 9, 6, 9, 9, 2},
                    {4, 5, 2, 2, 5, 5, 3, 7},
            };

    public static void main(String[] args) {
        double[] averageMarks = calculateAverageMarks(MARKS);
        printResults(averageMarks);
    }

    public static double[] calculateAverageMarks(int[][] marks) {
        double[] averageMarks = new double[marks.length];
        for (int i = 0; i < marks.length; i++ ) {
            double marksTotal = 0;

            for (int j = 0; j < marks[i].length; j++) {
                marksTotal += marks[i][j];
            }
            averageMarks[i] = marksTotal / marks[i].length;
        }
        return averageMarks;
    }

    public static void printResults(double[] averageMarks) {
        for (int i = 0; i < averageMarks.length; i++) {
            if (averageMarks[i] < 4) {
                System.out.println("Student Nr. " + (i + 1) + " did not pass! (" + averageMarks[i] + ")");
            } else if (averageMarks[i] < 7) {
                System.out.println("Student Nr. " + (i + 1) + " had decent results! (" + averageMarks[i] + ")");
            } else if (averageMarks[i] < 9) {
                System.out.println("Student Nr. " + (i + 1) + " had great results! (" + averageMarks[i] + ")");
            } else {
                System.out.println("Student Nr. " + (i + 1) + " had excellent results! (" + averageMarks[i] + ")");
            }
        }
    }
}