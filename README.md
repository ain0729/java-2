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
이미지 내용 텍스트로 정리해줄게!

---

**비교 연산, 논리 연산**

* **비교연산자** : 두 개의 값을 비교하여 true / false 결과
* **논리연산자** : 두 개의 논리 값에 논리 연산. 논리 결과

---

### [비교 연산자]

| 비교 연산자 | 내용                  |
| ------ | ------------------- |
| a < b  | a가 b보다 작으면 true     |
| a > b  | a가 b보다 크면 true      |
| a <= b | a가 b보다 작거나 같으면 true |
| a >= b | a가 b보다 크거나 같으면 true |
| a == b | a가 b와 같으면 true      |
| a != b | a가 b와 같지 않으면 true   |

---

### [논리 연산자]

| 논리 연산자 | 내용                                    |
| ------ | ------------------------------------- |
| !a     | a가 true이면 false, false이면 true         |
| a ^ b  | a와 b의 XOR 연산. a, b가 같으면 false         |
| a || b | a와 b의 OR 연산. a와 b 모두 false인 경우만 false |
| a && b | a와 b의 AND 연산. a와 b 모두 true인 경우만 true  |


### [예시]

(age >= 20) && (age < 30)   // 나이(int age)가 20대인 경우
(c >= 'A') && (c <= 'Z')    // 문자(char c)가 대문자인 경우
(x >= 0) && (y >= 0) && (x <= 50) && (y <= 50)   // (x,y)가 (0,0)과 (50,50)의 사각형 내에 있음

### [오류 예시]
20 <= age < 30   // 조건식 문법 오류
## 조건 연산
3개의 피연산자로 구성된 삼항(ternary) 연산자
opr1 ? opr2 : opr3 →
opr1의 결과가 true면 opr2, false면 opr3
if-else를 조건연산자로 간결하게 표현 가능
예시
int x = 5;
int y = 3;

int big;
if (x > y)
    big = x;
else
    big = y;

👉 위 코드를 조건 연산자로 바꾸면

int big = (x > y) ? x : y;
설명
(x > y)가 true → x 선택
false → y 선택
즉, 둘 중 더 큰 값을 big에 저장
이미지 내용 텍스트로 정리해줄게!
## **비트 연산**

* **비트 개념**
  `byte x = 10;`
  → x = `00001010` (바이트, 비트 단위로 표현)



* **비트 논리 연산** : 비트끼리 AND, OR, XOR, NOT 연산

* **비트 시프트 연산** : 비트를 오른쪽이나 왼쪽으로 이동

# 교재에 나와 있는 예는 센서의 예를 제외하면 단순히 연산하는 방법에 대해서만 설명하고 있습니다.

# 연산방법 보다 사용되는 사례를 확인하는 것이 도움이 됩니다.

# 비트 연산이 사용되는 경우
비트 연산(Bitwise Operations)은 하드웨어 프로그래밍 뿐만 아니라 일반 소프트웨어 개발에서도 여러 가지 용도로 사용됩니다.
특히 성능이 중요한 경우나 최적화가 필요한 경우에 많이 활용됩니다.
1. 성능 최적화 및 연산 속도 향상 : 곱셈(*)과 나눗셈(/)보다 비트 연산(<<, >>)이 훨씬 빠름
int x = 5;
int result = x << 1;  // 5 * 2 = 10
System.out.println(result);  // 10
2. 권한 및 플래그 설정 (비트 마스크) : 여러 개의 상태(flag)를 하나의 int 변수에 저장할 때 사용
class Permissions {
    static final int READ = 1;   // 0001
    static final int WRITE = 2;  // 0010
    static final int EXEC = 4;   // 0100
}
int userPermissions = Permissions.READ | Permissions.WRITE; // 0011 (3)

// 특정 권한 확인
boolean canWrite = (userPermissions & Permissions.WRITE) != 0;

System.out.println("Can Write: " + canWrite);  // true
이미지의 텍스트를 아래와 같이 정리했습니다:

### 조건문 - 단순 if 문, if-else 문

#### 단순 if 문

* `if` 조건문 안에 조건식(논리형 변수나 논리 연산)
* 실행문장이 단일 문장일 경우, `{}` 생략 가능

```java
if(조건식) {
    // 실행문장
}
```

**예시:**

```java
if(n2 == 0) {
    System.out.println("n2는 0입니다.");
}
if(score >= 80 && score <= 89) {
    System.out.println("평균점수입니다.");
}
```

#### if-else 문

* 조건식이 `true`면 실행문장1, `false`면 실행문장2 실행

```java
if(조건식) {
    // 실행문장1
} else {
    // 실행문장2
}
```

**예시:**

```java
if(score >= 90) {
    System.out.println("합격입니다!");
} else {
    System.out.println("불합격입니다.");
}
이미지의 텍스트를 아래와 같이 정리했습니다:

---

### switch 문

#### Switch문의 식과 case 문의 값과 비교

* `case`의 비교 값과 일치하면 해당 `case`의 실행문장 수행
* `break`를 만나면 `switch`문을 벗어남
* `case`의 비교 값과 일치하는 것이 없으면 `default` 문 실행
* `default` 문은 선택사항

```java id="thsjf1"
switch(식) {
    case 1:
        // 실행문장 1;
        break;
    case 2:
        // 실행문장 2;
        break;
    default:
        // 실행문장 3;
}
```

**예시:**

```java id="6dflv5"
char grade = 'B';
switch(grade) {
    case 'A':
        System.out.println("우수학생입니다.");
        break;
    case 'B':
        System.out.println("평균학생입니다.");
        break;
    case 'C':
        System.out.println("노력하세요.");
        break;
    default:
        System.out.println("등급외 학생");
}
이미지의 텍스트를 아래와 같이 정리했습니다:

---

### switch문에서 break문의 역할

#### switch문 내의 break문

* `break`를 만나면 `switch`문을 벗어남
* `case` 문에 `break`문이 없다면, 다음 `case`문 계속 실행
* 언제나 `break`를 만날 때까지 계속 내려가면서 실행

```java id="fyhcb3"
char grade = 'A';
switch(grade) {
    case 'A':
        System.out.println("90 ~ 100점입니다.");
        break;
    case 'B':
        System.out.println("80 ~ 89점입니다.");
        break;
    case 'C':
        System.out.println("70 ~ 79점입니다.");
        break;
}
```

**결과:**

```
90 ~ 100점입니다.
```
이미지의 텍스트를 아래와 같이 정리했습니다:

---

### case 문의 값

* 문자, 정수, 문자열 리터럴(JDK 1.7부터)만 허용
* 실수 리터럴은 허용되지 않음

```java id="hysb8f"
int b;
switch(b%2) {
    case 1: // 정수 리터럴 사용 가능
        break;
    case 2: // 정수 리터럴 사용 가능
        break;
}
```

```java id="gzhwt6"
char c;
switch(c) {
    case '*': // 문자 리터럴 사용 가능
        break;
    case 'a': // 문자 리터럴 사용 가능
        break;
}
```

```java id="7gvl4z"
String s = "안녕하세요";
switch(s) {
    case "예" : // 문자열 리터럴 사용 가능
        break;
    case "아니요" : // 문자열 리터럴 사용 가능
        break;
}
```

```java id="nx4q3d"
int b;
switch(b) {
    case a:  // 오류: 변수 사용 안됨
        break;
    case a > 3:  // 오류: 수식 입력됨
        break;
    case a == 1:  // 오류: 수식 입력됨
        break;
}
이미지의 텍스트를 아래와 같이 정리했습니다:

---

### 반복문

#### 자바 반복문 - for 문, while 문, do-while 문

```java id="m7nk3s"
for(조건식; 조건식; 반복 후 처리) {
    // 실행문 ...
}
```

**예시 출력 (0부터 9까지 출력):**

```java id="8k45jd"
for(int i = 0; i < 10; i++) {
    System.out.print(i);
}
```

**출력:**

```
0123456789
```

---

#### 예제 3-1: for 문을 이용하여 1부터 10까지 합 출력하기

```java id="5hdfl5"
public class Ex13ForSample {
    public static void main(String[] args) {
        int i, sum = 0;
        
        for (i = 1; i <= 10; i++) {
            sum += i; // sum = sum + i;
            if(i != 10) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.print(sum);
    }
}
```

**출력:**

```
1+2+3+4+5+6+7+8+9+10=55
```
이미지의 텍스트를 아래와 같이 정리했습니다:

---

### do-while 문

#### do-while 문의 구성과 코드 사례

* 조건식이 **참**인 동안 반복 실행. 작업문은 **한 번** 반드시 실행.

```java id="g8kr35"
do {
    // 실행문 ...
} while(조건식);
```

**예시 출력 (0부터 9까지 출력):**

```java id="2d9f7b"
int i = 0;
do {
    System.out.print(i);
    i++;
} while(i < 10);
```

**출력:**

```id="d93j0f"
0123456789
```

---

#### 예제 3-3: do-while 문을 이용하여 'a'에서 'z'까지 출력하기

```java id="8q73gx"
public class Ex33DoWhileSample {
    public static void main(String[] args) {
        char a = 'a';
        
        do {
            System.out.print(a);
            a = (char)(a + 1); // 문자 'a'를 하나씩 증가
        } while(a <= 'z');
    }
}
```

**출력:**

```id="x3hd5y"
abcdefghijklmnopqrstuvwxyz
```

---
이미지의 텍스트를 아래와 같이 정리했습니다:

---

### 중첩 반복문

#### 반복문이 다른 반복문을 내포하는 구조

* **10,000명**의 학생이 있는 **100개** 대학의 모든 학생 성적의 합을 구할 때, `for` 문을 이용한 **이중 중첩 구조**.

```java id="x8k4vb"
for(int i = 0; i < 100; i++) { // 대학 100개 반복
    for(int j = 0; j < 10000; j++) { // 학생 10,000명 반복
        // 학생 성적 합 구하는 코드
    }
}


#### 예제 3-4: 2중 중첩을 이용한 구구단 출력하기

```java id="x3f9sd"
public class Ex34NestedLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // 1단부터 9단까지
            for (int j = 1; j <= 9; j++) { // 1부터 9까지 곱하기
                System.out.print(i + "×" + j + "=" + (i * j) + "\t"); // 구구단 출력
            }
            System.out.println(); // 한 줄 끝날 때마다 줄 바꿈
        }
    }
}
```

**출력:**

```id="v7c9ws"
1×1=1	1×2=2	1×3=3	1×4=4	1×5=5	1×6=6	1×7=7	1×8=8	1×9=9	
2×1=2	2×2=4	2×3=6	2×4=8	2×5=10	2×6=12	2×7=14	2×8=16	2×9=18	

다음은 이미지 속 내용을 텍스트로 옮긴 것입니다:

---

### continue문

* 반복문을 빠져 나가지 않고, 다음 반복으로 제어 변경.
* 반복문에서 continue; 문에 의한 분기

---

### 예제 3-5 : continue 문을 이용하여 양수 합 구하기

5개의 정수를 입력 받고 양수 합을 구하여 출력하는 프로그램을 작성하라.

```java
import java.util.Scanner;

public class Ex35ContinueExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수들 5개 입력하세요.");
        int sum = 0;

        for(int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if(n <= 0) continue;   // 0이나 음수인 경우 더하지 않고 다음 반복으로 진행
            else sum += n;         // 양수인 경우 누적
        }

        System.out.println("양수의 합은 " + sum);

        scanner.close();
    }
}
다음은 이미지 속 내용을 텍스트로 옮긴 것입니다:

---

### break문

* 반복문 하나를 즉시 벗어날 때 사용. 하나의 반복문만 벗어남.
* 중첩 반복의 경우 안쪽 반복문의 break 문이 실행되면 안쪽 반복문만 벗어남.

---

```java
for(초기문; 조건식; 반복 후 작업) {
    ...
    break;
    ...
}
...
```

(a) 하나의 반복문을 벗어나는 경우

---

```java
for(초기문; 조건식; 반복 후 작업) {
    while(조건식) {
        ...
        break;
        ...
    }
    ...
}
(b) 중첩 반복에서 안쪽 반복문만 벗어나는 경우

다음은 이미지 속 내용을 텍스트로 옮긴 것입니다:

---

### 자바 배열 (array)

* 인덱스와 인덱스에 대응하는 데이터들로 이루어진 자료 구조로 한 번에 많은 메모리 공간 선언.
* 같은 타입의 데이터들이 순차적으로 저장되는 공간으로 인덱스를 이용하여 원소 데이터 접근.
* 반복문을 이용하여 처리하기에 적합한 자료 구조
* 배열 인덱스 : 0부터 시작

(1) 10개의 정수를 배열로 선언하는 경우

```java
int[] n = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
```

(2) 10개의 정수를 구분하여 배열로 선언하는 경우

```java
int[] n = new int[10];
