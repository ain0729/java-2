# java-2
# 202530116송아인
2025.03.11 push test

2025.03.11 push test

2026.03.18
[기계어]
-0,1의 이진수로 구성된 언어
-컴퓨터의 CPU는 기계어만 이해하고 처리가 가능
[어셈블리어]
-가계어 명령을 DD,SUB,MOVE 등과 같은 표현하기 쉬운 상징적인 단어만 니모닉 기호로 일대일 대응시킨 언어
[고급언어]
-사람이 사용하는 언어로 이해하기 쉽고,쉽게 표현할수 있도록 고안됨
[절차 지향 언어]
-프로그램 절차,순서에 따라 실행 하는 방식
-데이터(입력)와 함수를 분리하여 작성
-코드이 유연성이 부족,재사용이 어러움
-전역 변수들 많이 사용하기때문에 코드의 가독성과 유지 보수가 어려움
C,Pacal,Fortna 등이 있다
[객체 지향 언어]
-현실의 객체를 모델링 하여 프로그램을 작성 하는 방식
-객체는 데이터와 데이터를 처리하는 메소드(함수)를 모두 포함
-상속,캡슐화,다형성등의 개념으 활요하여 유연하고 재사용 가능한 코드를 작성할수있음
[함수 지향 언어]
-함수형 언어는 함수를 일급 객체로 취급하고 상태 변경을 피하고 불변성을 지향하는  프로그래밍 패러다임 임
-함수형 언어에서 함수의 조합으로 복잡한 작업을 수행하며,상태 변경 대신에 데이터를 변환하는 방식을 프로그램 작성
-재귀,고차함수,순수 함수 등의 개념을 중요시하며,병렬 처리와 높은 수준의 추상화를 지원
-사무 지향 언어는 객체 지향 언어의 특성을 그대로 가져가되,함수 지향 적인기능을 추가함
-pyton,koliin,Hakell,Lisp,Scala
프로그래밍과 컴파일
소스:프로그래밍 언어로 작성된 텍스트 파일
컴파일:소스 파일을 컴퓨터가 이해할수 있는 기계어로 만드는 과정
자바:.java->.class
c:.c->,obj->.exe
c++:.cpp->.obj->.exe
자바의 태동
-1991년 그린 프로젝트
-신마이크로 시스템즈와 제임스 고슬링에 의해 시작
가전 제품에 들어갈 소프트웨어를 위해 개발
-1995년 자바 발표
-초기 이름은 오크였으며,인터넷과 웹의 발전과 함께 성장함
[목적]
-플랫폼 호환성 문제 해결
모든 플래폼에서 호환성을 갖는 프로그래밍 언어 필요
네트워크,특히 웹에 최적화된 프로그래밍 언어의 필요성 대두
-메모리 사용량이 적고 다양한 플랫퐁을 가지는 가전 제품에 적용
가전제품:작은 량의 
자바의 플랫폼 독립성,wora
wora
-한번 작성된 코드는 os,h/w 에 상관 없이 모든 플랫폼에서 바로 실행되는 자바의 특징
-c/c++등 기존 언어가 가진 플랫폼 중속성 극복
네트워크에 연결된 어느 클라이언트에서나 실행,웹 브라우저, 분산 환경 지원
wora를 가능하게 하는 자바 특징
[바이트 코드]
-자바 소스를 컴파일한 목적 코드
-cpu에 중속적이지 않은 중립적인 코드
-jvm에 의해 해석 되고 실행 됨
jvm
자바 바이트 코드를 실행하는 자바 jvm
자바 jvm과 실행 환경
[바이트 코드]
-자바 jvm에서 실행 간응한 바이너리 코드
-바이트 코드는 컴퓨터 cpu에 의해 직접 실행 되지 않음
-자바 jvm이 작동중인 플랫폼에서 실행
-자바 jvm이 인터프리터 방식으로 바이트 코드 해석
[jvm]
-각기 다른 플랫폼에 맞는 jvm을제공,jvm자체느 플랫폼에 종속적
-jvm이 각기 다른 플랫폼에서도 동일한 자바 실행 환경을 제공
-jvm은 가바 개발자인 오라클 외 ibm,ms 등 

자바 응용 프로그램 실행 환경
-실행 환경은 jvm + java API 로 구성
-응용 프로그램 실행
mian () 메소드를 가지 ㄴ클래스의 main()에서 실행 시작
jvm은 필요할때 클라스 파일을 로딩하기 때무에 적은 메모리로도 실행 가능

jdk 와 jre
jdk
public class Variables {
    public static void main(String[] args) {
        String name = "Java";
        int year = 2026;
        double version = 21.0;
        System.out.println(name + " " + year + " version: " + version);
    }
}

# Please enter the commit message for your changes. Lines starting
# with '#' will be ignored, and an empty message aborts the commit.
#
# On branch master
# Your branch is up to date with 'origin/master'.
#
# Changes to be committed:
#	new file:   bar.txt
#	new file:   foo.txt
#
# Changes not staged for commit:
#	modified:   README.md
#
슬라이드의 텍스트 내용은 다음과 같습니다:

---

# 소스 코드, 바이트 코드, 기계어

교재에 이 세단어가 혼란스럽게 사용되고 있어서 정리합니다.

1. **소스 코드 (Source Code)**

   * 우리가 작성하는 Java 코드 (.java 파일)
   * 사람이 읽을 수 있는 고수준 언어 (High-Level Language)

2. **바이트코드 (Bytecode, .class 파일)**

   * Java 컴파일러(javac)가 소스 코드를 변환한 중간 코드
   * CPU가 직접 실행할 수 없음 → JVM(Java Virtual Machine)이 실행해야 함
   * 기계어와 다른 플랫폼 독립적 (Windows, Mac, Linux에서 동일하게 실행 가능)
   * 어디에서 실행? 바이트코드는 JVM에 해석(인터프리터)하거나, JIT 컴파일러가 기계어로 변환 실행됨

---

슬라이드에 나타난 코드도 아래와 같습니다:

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```
슬라이드의 텍스트 내용은 다음과 같습니다:

---

# Temurin OpenJDK 24에서 jmods 디렉토리가 사라진 이유

* **Temurin OpenJDK 24**부터는 JEP 439 표준을 따르기 되어 **jmods 디렉토리**가 포함되지 않습니다.

* **JEP 493 기능**을 요약하면 다음과 같습니다:

  * **Temurin**의 `jlink` tool을 활성화 하면 JMOD 파일을 사용하지 않고도 사용자가 지정한 run-time 이미지를 생성할 수 있습니다.
  * JDK 크기를 약 25% 줄일 수 있습니다.
  * 이 기능은 JDK를 빌드할 때 활성화 해야 하며, 기본적으로 비활성화되어 있고 일부 JDK 공급업체는 이 기능을 활성화할 수 있습니다.

* 그러나 **Temurin OpenJDK 24**는 빌드할 때 기본 자동으로 활성화됩니다.

* 다음과 같이 버전을 확인해 보면 활성화된 것을 알 수 있습니다:

```bash
$ jlink --version
25.0.2
```

---
// 예제 2-1 : Hello.java
// Hello.java는 sum() 함수를 정의하고,
// main() 함수에서 sum()을 호출하여 결과를 출력하는 예제.
public class Hello {  // 클래스 정의 시작
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
슬라이드의 텍스트 내용은 다음과 같습니다:

---

# 식별자 (identifier) – 명명 규칙 (Naming Convention)

* **식별자란?** 클래스, 변수, 상수, 메소드 등에 붙이는 이름
* **식별자의 원칙**

  * `@`, `#`, `!`와 같은 특수 문자, 공백 또는 탭은 식별자로 사용불가. `.``, `$`는 사용 가능
  * 유니코드 문자 사용 가능. 한글 사용 가능.
  * 자바 언어의 키워드는 식별자로 사용불가.
  * 식별자의 첫 번째 문자로 숫자는 사용불가.
  * `.` 또는 `$`를 식별자 첫 번째 문자로 사용할 수 있으나 일반적으로 잘 사용하지 않는다.
  * 불린 리터럴 (`true`, `false`)과 널 리터럴 (`null`)은 식별자로 사용불가
  * 길이 제한 없음
  * 대소문자 구분: `barChart`와 `barchart`는 다른 식별자

---
Java의 데이터 타입
기본 자료형(Primitive Type) 8개: boolean, char, byte, short, int, long, float, double
기본 타입의 크기는 CPU나 운영체제에 따라 변하지 않음
논리 타입: boolean (1비트, true 또는 false)
문자 타입: char (2바이트, Unicode)
정수 타입:
byte (1바이트, -128~127)
short (2바이트, -32768~32767)
int (4바이트, -2³¹~2³¹-1)
long (8바이트, -2⁶³~2⁶³-1)
실수 타입:
float (4바이트, -3.4E38~3.4E38)
double (8바이트, -1.7E308~1.7E308)
레퍼런스형 1개이며 용도는 다음 3가지: 포인터와 유사한 개념이지만 메모리 주소는 아님.
클래스(class)에 대한 레퍼런스
인터페이스(interface)에 대한 레퍼런스
배열(array)에 대한 레퍼런스

상수 선언

* final 키워드 사용합니다.
* 선언할 때 초기값 지정합니다.
* 실행 중 값의 변경은 불가능합니다.

```
final double PI = 3.141592;
```

* final : 상수 선언
* double : 데이터 타입
* PI : 상수 이름
* 3.141592 : 초기화

```
final int LENGTH = 20;
static final double PI = 3.141592;  // static으로 선언하는 것이 좋습니다. (5장 참조)
```


var 키워드

* Java 10부터 도입 되었습니다.
* var 키워드는 타입을 생략하고 변수 선언을 할 수 있습니다.
* 컴파일러가 추론하여 변수 타입을 결정합니다.
* 변수 선언할 때 초기값이 주지 않으면 컴파일 오류가 발생합니다.
* var는 지역 변수 선언에만 사용이 가능하고 클래스 필드에서는 사용할 수 없습니다.
  💡 지역 변수 : 메소드 내부에 선언되는 변수.
  💡 클래스 필드 : 클래스 내부에 선언되는 변수. 객체가 생성될 때 함께 만들어지는 변수.

⚠️ 다음과 같이 사용하는 것이 좋습니다.

* 기본적으로는 명시적 자료형(int, String, double 등)을 사용하는 것이 좋습니다.
* 가독성이 유지될 수 있는 경우에 한해서 var를 적절히 활용하는 것이 좋습니다.
* 특히, 상수를 적극적으로 활용해서 코드의 안정성을 높이는 것이 중요합니다.

예제2-2 : Foo.java
Foo.java는 var 키워드를 사용하여 변수를 선언하는 예제.

public class Foo {
    public static void main(String[] args) {
        var price = 200;        // price는 int 타입으로 결정
        var name = "신 동욱";     // name은 String 타입으로 결정
        var pi = 0.14;          // pi는 double 타입으로 결정

        System.out.println("price = " + (price + 1000));
        System.out.println("name = " + name);
        System.out.println("pi = " + pi*10);
    }
}
메모리의 구조

힙(heap - FIFO) 영역은 프로그래머가 직접 공간을 할당, 해제하는 메모리 공간입니다.
Java의 경우 JVM이 담당합니다.
스택(stack - LIFO) 영역은 프로그램이 자동으로 사용하는 임시 메모리 영역입니다.
힙이 스택을 침범하는 경우를 힙 오버플로우라 하고,
스택이 힙을 침범하는 경우를 스택 오버플로우라고 합니다.
상수 선언

final 키워드 사용합니다.
선언할 때 초기값 지정합니다.
실행 중 값의 변경은 불가능합니다.
final double PI = 3.141592;
상수 선언
데이터 타입
상수 이름
초기화
final int LENGTH = 20;
static final double PI = 3.141592; // static으로 선언하는 것이 좋습니다.(5장 참조)

 * 예제2-3 : Constant23.java
 * Bar.java는 상수를 사용하여 원의 면적을 계산하는 예제.
 */

public class Bar {

    public static void main(String[] args) {
        final double PI = 3.14;  // 원주율을 상수로 선언
        double radius = 10.2;    // 원의 반지름
        double circleArea = radius * radius * PI;  // 원의 면적 계산

        // 원의 면적을 화면에 출력한다.
        System.out.print("반지름 = " + radius + ", ");
        System.out.println("원의 면적 = " + circleArea);
    }
}
