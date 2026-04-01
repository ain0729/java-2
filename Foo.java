// 예제 2-1 : Hello.java
// Hello.java는 sum() 함수를 정의하고,
// main() 함수에서 sum()을 호출하여 결과를 출력하는 예제.
public class Foo {  // 클래스 정의 시작
    public static int sum(int n, int m) {  // 메소드 정의
        return n + m;
    }

    public static void main(String[] args) {  // main() 메소드에서 실행 시작
        int i = 20;
        int s;
        char a;

        s = sum(i, 10);  // sum() 메소드 호출
        a = 'a'; 
        System.out.println(a);  // 문자 출력
        System.out.println("Hello");  // 문자열 출력
        System.out.println(s);  // 계산된 합 출력
    }
}