import exception.CustomException;
import service.Calculator;

public class Main {
    public static void main(String[] args) {

        try {
            double result = Calculator.divine(6, 0);
            System.out.println("Результат деления: " + result);
        } catch (CustomException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }
}