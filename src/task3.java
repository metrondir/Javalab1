import java.util.Random;
    public class task3 {

        public static void main(String[] args) {
            int[][] array = new int[10][10];

            // Fill the array randomly with integers between -100 and 100
            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(110) - 100; // generate random integer between -100 and 100

                }
            }


            int positiveCount=0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (i == 0 || i == array.length - 1 || j == 0 || j == array[i].length - 1) {
                        if (array[i][j] > 0) {
                            positiveCount++;
                            System.out.println(array[i][j]);
                        }
                        System.out.println();
                    }
                }
            }
            double factorial = 1;
            for (int i = 1; i <= positiveCount; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }


    }
