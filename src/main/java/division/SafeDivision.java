package division;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SafeDivision {
    public static String inputReader() {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bufferedReader != null) {
            try {
                input.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public void divide() {
        int result;
        boolean loop = true;

        while(loop) {
            System.out.print("Enter number A: ");
            int a = Integer.parseInt(inputReader());

            System.out.print("Enter number B: ");
            int b = Integer.parseInt(inputReader());

            try {
                result = a / b;
            } catch(ArithmeticException e) {
                System.out.println("\nYou can't divide by 0! \nEnter another numbers\n");
                continue;
            }
            System.out.println("Result a/b = " + result);
            loop = false;
        }
    }
}
