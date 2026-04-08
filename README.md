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
```
## 16. **continue와 break 문**

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
```
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
```
## 0408
### 배열의 크기, length 필드

* 자바의 배열은 객체로 처리
* 배열의 크기는 배열 객체의 length 필드에 저장

```java
int intArray[];
intArray = new int[5];

int size = intArray.length;
// size는 5
```

(그림 설명)
intArray → intArray[0] ~ intArray[4]
int length = 5
→ 배열 객체

* length 필드를 이용하여 배열의 모든 값을 출력하는 사례

```java
for(int i=0; i<intArray.length; i++) { // intArray 배열 크기만큼 루프를 돈다.
    System.out.println(intArray[i]);
}
```
이미지 내용 텍스트화 해줄게:

---

### 함수 호출 시 배열 전달 비교 : C/C++ vs. 자바

* 자바가 C/C++에 비해 배열을 다루기 10배 편한 구조임.

---

#### C/C++ 경우

배열과 크기를 각각 전달 받음

```cpp
int sum(int x[], int size) {
    int n, s=0;

    for(n=0; n < size; n++)
        s += x[n];

    return s;
}
```

```cpp
int a[] = {1,2,3,4,5};
int n = sum(a, 5);
```

---

#### 자바 경우

배열만 전달받음

```java
int sum(int x[]) {
    int n, s=0;

    for(n=0; n < x.length; n++)
        s += x[n];

    return s;
}
```

```java
int a[] = {1,2,3,4,5};
int n = sum(a);
```

### 배열과 for-each 문

* for-each 문 : 배열이나 나열(enumeration)의 원소를 순차 접근하는데 유용한 for 문

```java
for(변수 : 배열레퍼런스) {
    반복작업
}
```

---

* for-each 문으로 정수 배열의 합을 구하는 사례

```java
int [] n = {1,2,3,4,5};
int sum = 0;

for (int k : n) {
    sum += k;
}
```
rlPds

```java
for(int i=0; i<n.length; i++) {
    int k = n[i];
    sum += k;
}
```

* 반복될 때마다 k는 n[0], n[1], ..., n[4]로 번갈아 설정됨

### 2차원 배열
#### ● 2차원 배열 선언

```java
int intArray[][];
또는
int[][] intArray;
```

#### ● 2차원 배열 생성

```java
intArray = new int[2][5];

int intArray[][] = new int[2][5]; // 배열 선언과 생성 동시
```

#### ● 2차원 배열의 구조

```java
int i[][] = new int[2][5];

int size1 = i.length;        // 2
int size2 = i[0].length;     // 5
int size3 = i[1].length;     // 5
```

(구조 설명)

* i는 2개의 행을 가짐
* 각 행은 길이 5의 배열을 가짐

#### ● 2차원 배열의 length 필드

* `i.length` → 2차원 배열의 행의 개수 (2)
* `i[n].length` → n번째 행의 열의 개수
* `i[1].length` → 1번째 행의 열의 개수 (5)

### 2차원 배열의 초기화

* 배열 선언과 동시에 초기화

```java id="ij71kp"
int intArray[][] = {
    {0, 1, 2},
    {3, 4, 5},
    {6, 7, 8}
}; // 3x3 배열 생성
```

```java id="7zb6cc"
char charArray[][] = {
    {'a', 'b', 'c'},
    {'d', 'e', 'f'}
}; // 2x3 배열 생성
```

```java id="m8ty0s"
double doubleArray[][] = {
    {0.01, 0.02},
    {0.03, 0.04}
}; // 2x2 배열 생성
```

**메소드의 배열 리턴**

* 배열의 레퍼런스만 리턴되며, 배열 전체가 리턴되는 것이 아님

* 메소드의 리턴 타입

  * 리턴하는 배열 타입과 리턴 받는 배열 타입 일치
  * 리턴 타입에 배열의 크기를 지정하지 않음

---

```java
int[] makeArray() {
    int temp[] = new int[4];
    return temp;
}
```

(리턴 타입 / 메소드 이름 / 배열 리턴)

```java
int[] intArray;
intArray = makeArray();
```
이미지의 텍스트를 옮기면 다음과 같습니다:

---

배열을 리턴 받아 사용하는 과정

마스터 텍스트 스타일 편집

```
int[] makeArray() {
    int temp[] = new int[4];
    return temp;
}
```

(1) int[] intArray;

(2) makeArray();  // 메소드 실행

(3) intArray에 temp 값 치환

(4) for(int i=0; i<intArray.length; i++)
intArray[i] = i;

## 자바의 예외 처리

* 예외(Exception) : 실행 중 오류적이나 결과에 악영향을 미치는 예상치 못한 상황 발생
  → 자바에서는 실행 중 발생하는 에러를 예외로 처리

* 실행 중 예외가 발생하면 → 자바 플랫폼은 응용프로그램이 예외를 처리하도록 호출
  → 응용프로그램이 예외를 처리하지 않으면 프로그램 강제 종료 시킴

* 예외 발생 경우 1
  ✓ 정수를 0으로 나누는 경우
  ✓ 배열의 크기보다 큰 인덱스로 배열의 원소를 접근하는 경우
  ✓ 정수를 읽는 코드가 실행되고 있을 때 사용자가 문자를 입력한 경우
---

## 자바의 예외 처리, try-catch-finally문

* 예외 처리 : 발생한 예외에 대해 개발자가 작성한 프로그램 코드에서 대응하는 것
* try-catch-finally문 사용. finally 블록은 생략 가능.

```
try {
    예외가 발생할 가능성이 있는 실행문 (try 블록)
}
catch (처리할 예외 타입 선언) {
    예외 처리 (catch 블록)
}
finally {
    예외 발생 여부와 상관없이 무조건 실행되는 문장 (finally 블록)
}
```
(생략 가능)

## 자바의 예외 클래스

* 자바는 응용프로그램이 실행 중 오류를 탐지할 수 있도록 많은 예외를 클래스 형태로 제공

| 예외 타입(예외 클래스)                  | 예외 발생 경우                                                                 | 패키지       |
| ------------------------------ | ------------------------------------------------------------------------ | --------- |
| ArithmeticException            | 정수를 0으로 나눌 때 발생                                                          | java.lang |
| NullPointerException           | null 레퍼런스를 참조할 때 발생                                                      | java.lang |
| ClassCastException             | 변환할 수 없는 타입으로 객체를 변환할 때 발생                                               | java.lang |
| OutOfMemoryError               | 메모리가 부족한 경우 발생                                                           | java.lang |
| ArrayIndexOutOfBoundsException | 배열의 범위를 벗어난 접근 시 발생                                                      | java.lang |
| IllegalArgumentException       | 잘못된 인자 전달 시 발생                                                           | java.lang |
| IOException                    | 입출력 동작 실패 또는 인터럽트 시 발생                                                   | java.io   |
| NumberFormatException          | 문자열이 나타내는 숫자와 일치하지 않는 타입의 숫자로 변환 시 발생                                    | java.lang |
| InputMismatchException         | Scanner 클래스의 nextInt() 등을 호출하여 정수를 입력받고자 했지만, 사용자가 'a' 등과 같이 문자열을 입력한 경우 | java.util |


## 예외 클래스 사례

* 배열의 범위를 벗어난 원소를 접근하는 예외 처리
* ArrayIndexOutOfBoundsException 예외

```java
int intArray[] = new int[5];

try {
    intArray[3] = 10;   // 정상 실행
    intArray[6] = 5;    // 예외 발생 (배열 범위 초과)
}
catch (ArrayIndexOutOfBoundsException e) { // 객체 e에 예외 정보가 넘어옴
    System.out.println("배열의 범위를 초과하여 원소를 접근하였습니다.");
}
```
## 자바의 객체 지향 특성:캡슐화
캡슐화:객체를 캡슐로 싸서 내부를 볼수 없게 하는것
객체의 가장 본질적인 특징
외부의 접근으로부터 객체 보호

자바의 캡슐화
클래스(class):객체 모야을 선언한 틀(캡슐화 하는 툴)
객체:생성된 실체:클래스 내에 메스드와 필드 구현

## 자바의 개개체 지향 특성:상속
# 상속
상위 객체의 속성이 하위 객체에 물려 줌
하위 객체가 상위 객체의 속성을 모두 가지는 관계
# 실세계 상속 사례
나무는 식물의 속성과 생물의 속성을 모두 가짐
사람은 생물의 속성은 가지지만 식물으 속성은 가지고 있지 않음

## 자바의 상속
# 자바의 상속
상위 클래스의 멤버를 하위 클래스가 물려 받음
상위 클래스:슈퍼 클래스
하위 클래스:서브 클래스,수퍼 글래스 코드의 재사용, 새로운 특성 추가 가능

## 자바의 객체: 다형성
다형성
같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현 되는것
다형성 사례
메소드 오버로딩:한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
메소드 오버라이딩:슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스 마다 다르게 구현 

## 객체 지향 언어의 목적
# 1.소프트웨어의 생산성 향상
컴퓨터 산업 발전 에 따라 소프트웨어의 생명 주기 단축
소프트웨어를 빠른 속도로 생산할 필요성이 중대
#객체 지향 언어
상속,다형성,객체,캡슐화 등 소프트웨어 재사용을 위한 여러 장칯 내장
소프트웨어 재사용과 부분 수정 빠름
소프트웨어를 다시 만드는 부담 대폭 줄임
소프트웨어 생사선 향상
# 2.실세계에 대한 쉬운 모델링
초기 프로그래밍
수학 계산/통계 처리를 하는 등 처리 과정,계산 절차 중요

현재 프로그래밍
컴퓨터가 산업 전반에 활용
실세계에서 발생하는 일을 프로그래밍

## 절차 지향 프로그래밍과 객체 지향 프로그래밍
# 절차 지향 프로그래밍
작업 순서를 표현 하는 컴퓨터 명령 집합
함수들이 집합으로 프로그램 작성
 
## 클래스와 객체
클래스:객체의 속성과 행위 선언,객체의 설계도 혹은 틀
객체:클래스의 틀로 찍어낸 실체
프로그램 실행중에 생성되는 실체
메모리 공간을 갖는 구체적인 실체
인스턴스 라고도 부름
사례:
클래스:소나타 자동차/객체:출고된 실제 소나타 100대
클래스:벽 시계/객체:우리 집 벽에 ㅇ걸린 벽 시계들
클래스:책상/객체:우리가 사용중인 실제 책상들 
