import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input){

        int oprIndex = -1;
        for (int i = 0; i < Operations.operations.length; i++) {
            if (input.contains(Operations.operations[i]))
                oprIndex = i;
        }

        if (oprIndex < 0) {
            throw new IllegalArgumentException("Некорректный ввод.");
        }

        String[] variables = input.split(Operations.operationsForSplit[oprIndex]);
        String strA = variables[0];
        String strB = variables[1];

        boolean isArabianNumbers = ArabianNumbers.arabianNumbersForUser.contains(strA) &&
                ArabianNumbers.arabianNumbersForUser.contains(strB);
        boolean isRomaNumbers = RomaNumbers.romaNumbersForUser.contains(strA) &&
                RomaNumbers.romaNumbersForUser.contains(strB);

        if (!isArabianNumbers && !isRomaNumbers) {
            throw new IllegalArgumentException("Некорректный ввод.");
        }

        int a = 0;
        int b = 0;

        if (isArabianNumbers) {
            a = Integer.parseInt(strA);
            b = Integer.parseInt(strB);
        }
        if (isRomaNumbers) {
            RomaNumbers romaNumbers = new RomaNumbers();
            a = romaNumbers.findRomaNumberA(strA);
            b = romaNumbers.findRomaNumberB(strB);
        }

        CalculatorLogics calculatorLogics = new CalculatorLogics();
        int result = calculatorLogics.makeResult(oprIndex, a, b);

        String end = null;

        if (isArabianNumbers) {
            end = Integer.toString(result);
        }
        if (isRomaNumbers) {
            if (result - 1 < 0) {
                throw new IllegalArgumentException("В римской системе счисления не может быть отрицательных чисел и 0.");
            }
            end = RomaNumbers.romaNumbersForResult[result - 1];
        }

        return end;
    }
}