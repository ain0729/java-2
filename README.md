# java-2
 # 202530116송아인 
 ## 2025.03.11 push test
### 자바 프로그래밍 학습 정리 

#### 1. **기계어, 어셈블리어, 고급언어**

* **기계어**: 컴퓨터의 CPU가 이해하는 이진수 기반의 언어
* **어셈블리어**: 기계어의 명령어를 사람이 이해할 수 있도록 표현한 언어
* **고급언어**: 사람이 쉽게 이해할 수 있도록 고안된 언어 (예: C,Java)

#### 2. **프로그래밍 언어의 분류**

* **절차 지향 언어 (Procedural)**: C, Pascal, Fortran
  * 프로그램 순서대로 실행
  * 데이터와 함수가 분리됨
  * 코드 유연성이 낮고 재사용 어려움
  * 전역 변수 사용 많음

* **객체 지향 언어 (Object-Oriented)**: Java, Python
  * 현실의 객체를 모델링
  * 상속, 캡슐화, 다형성 등의 개념을 사용하여 유연하고 재사용 가능한 코드 작성

* **함수형 언어 (Functional)**: Haskell, Scala, Lisp
  * 상태 변경을 피하고 불변성 유지
  * 함수가 일급 객체로 취급됨

#### 3. **Java의 특징**

* **플랫폼 독립성 (WORA)**: Java 코드는 한 번 작성되면 다양한 플랫폼에서 실행 가능
* **바이트 코드**: Java는 소스 코드를 바이트 코드로 컴파일하여      JVM에서 실행
* **JVM**: Java Virtual Machine이 바이트 코드를 해석하고 실행
#### 4. **컴파일 과정**

* **자바**: `.java` → `.class` (바이트 코드)
* **C**: `.c` → `.obj` → `.exe`
* **C++**: `.cpp` → `.obj` → `.exe`

#### 5. **Java의 응용 프로그램 실행 환경**

* **JDK (Java Development Kit)**: 개발 도구 제공
* **JRE (Java Runtime Environment)**: 실행 환경 제공

#### 6. **JDK와 JRE**

* **JDK**: 자바 애플리케이션을 개발할 때 필요한 도구들
* **JRE**: 자바 애플리케이션 실행에 필요한 라이브러리와 JVM

#### 7. **식별자 (Identifiers) 명명 규칙**

* 특수 문자 사용 불가 (`@`, `#`, `!` 등)
* 키워드 사용 불가 (`true`, `false`, `null`)
* 숫자로 시작할 수 없음

#### 8. **Java의 데이터 타입**

* **기본 타입**: `boolean`, `char`, `byte`, `short`, `int`, `long`, `float`, `double`
* **레퍼런스 타입**: 클래스, 인터페이스, 배열

#### 9. **상수 선언**

* **final 키워드**를 사용하여 상수 선언
* 값 변경 불가

```java
final double PI = 3.141592;

### 10. **var 키워드 (Java 10)**

* 타입을 컴파일러가 추론하여 결정
* **지역 변수**에만 사용 가능
* **상수**와 **클래스 필드**에는 사용 불가

```java
var price = 200;  // 컴파일러가 자동으로 int로 추론

#### 11. **메모리 구조**

* **힙 (Heap)**: 프로그래머가 직접 관리하는 메모리 공간
* **스택 (Stack)**: 함수 호출 시 자동으로 사용하는 메모리

#### 12. **비교 연산자 및 논리 연산자**

* **비교 연산자**:

  * `<`, `>`, `<=`, `>=`, `==`, `!=`

* **논리 연산자**:

  * `!`, `&&`, `||`, `^`

#### 13. **조건문 (if, switch)**

* **if 문**: 조건식에 따라 코드 실행


if(score >= 90) {
    System.out.println("합격");
} else {
    System.out.println("불합격");
}

* **switch 문**: 변수의 값에 따라 여러 경우로 분기

switch(grade) {
    case 'A':
        System.out.println("우수학생");
        break;
    case 'B':
        System.out.println("평균학생");
        break;
    default:
        System.out.println("기타");
}
```

#### 14. **반복문 (for, while, do-while)**

* **for 문**: 주어진 범위 내에서 반복

for(int i = 0; i < 10; i++) {
    System.out.print(i);
}

* **while 문**: 조건이 참일 때 반복


while(condition) {
    // 실행문
}


* **do-while 문**: 적어도 한 번은 실행하고 조건을 검사

```java
do {
    // 실행문
} while(condition);
```

---

#### 15. **중첩 반복문 (Nested Loops)**

* 두 개 이상의 반복문을 중첩하여 사용

```java
for(int i = 1; i <= 9; i++) {
    for(int j = 1; j <= 9; j++) {
        System.out.print(i + "x" + j + "=" + (i * j) + "\t");
    }
    System.out.println();
}

#### 16. **continue와 break 문**

* **continue**: 현재 반복을 건너뛰고 다음 반복으로 진행

```java
for(int i = 0; i < 5; i++) {
    if(i == 2) continue;
    System.out.println(i);
}

* **break**: 반복문을 즉시 종료

```java
for(int i = 0; i < 5; i++) {
    if(i == 3) break;
    System.out.println(i);
}

#### 17. **자바 배열**

* 같은 타입의 데이터들이 순차적으로 저장되는 자료 구조

```java
int[] numbers = {1, 2, 3, 4, 5};
```

* 배열 선언 및 생성:

```java
int[] numbers = new int[10];  // 10개의 정수 배열 생성
```

* **배열 인덱스**: 0부터 시작

#### 18. **비트 연산 (Bitwise Operations)**

* **비트 논리 연산**: `AND`, `OR`, `XOR`, `NOT`
* **비트 시프트 연산**: 비트를 왼쪽이나 오른쪽으로 이동

```java
int x = 5;
int result = x << 1;  // 5 * 2 = 10
```

* **비트 마스크**: 권한 설정 등에 사용

```java
int permissions = 1 | 2;  // 읽기, 쓰기 권한
