public class CalculatorLogics {

    int makeResult(int oprIndex, int a, int b) {
        switch (oprIndex) {
            case 0:
                return a + b;
            case 1:
                return a - b;
            case 2:
                return a * b;
            case 3:
                return a / b;
        }
       return -1;
    }
}
