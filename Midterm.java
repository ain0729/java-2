import java.util.Scanner;

public class Midterm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("시작수를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("끝수를 입력하세요: ");
        int num3 = scanner.nextInt();

        System.out.print("찾고자 하는 배수를 입력하세요: ");
        int num2 = scanner.nextInt();

        // 시작 수가 끝 수보다 크면 서로 교환
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // 배수 개수 계산
        int count = 0;
        for (int i = num1; i <= num3; i++) {
            if (i % num2 == 0) {
                count++;
            }
        }

        // 배열 생성
        int[] multiples = new int[count];

        // 배열에 배수 저장
        int index = 0;
        for (int i = num1; i <= num3; i++) {
            if (i % num2 == 0) {
                multiples[index] = i;
                index++;
            }
        }

        // 결과 출력
        System.out.println(num1 + "에서 " + num3 + "까지 사이의 " + num2 + "의 배수는 " + count + "개 입니다");
        System.out.print("그 수는 다음과 같습니다: [");

        for (int i = 0; i < multiples.length; i++) {
            System.out.print(multiples[i]);
            if (i < multiples.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        scanner.close();
       
    }
 # 202530116송아인