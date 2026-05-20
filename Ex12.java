import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in))
        int dividedend;
        int divisor;

        System.out.print("나뉨수를 입력하시오:");
        dividedend = scanner.nextInt();
        System.out.print("나눗수를 입력하시오:");
        divisor = scanner.nextInt();
        try {
        System.out.println(dividedend + "을 " + divisor + "로 나눈 몫은 " + (dividedend / divisor) + "입니다.");
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        finally {
        scanner.close();
    }
}
    }
}