# java-2
# 202530116송아인 


## 이벤트 리스너 작성 방법

### [ 3 가지 방법 ]

* **독립 클래스로 작성**
* 이벤트 리스너를 완전한 클래스로 작성
* 이벤트 리스너를 여러 곳에서 사용할 때 적합


* **내부 클래스(inner class)로 작성**
* 클래스 안에 멤버처럼 클래스 작성
* 이벤트 리스너를 특정 클래스에서만 사용할 때 적합


* **익명 클래스(anonymous class)로 작성**
* 클래스의 이름 없이 간단히 리스너 작성
* 클래스 조차 만들 필요 없이 리스너 코드가 간단한 경우에 적합

# 이벤트 리스너 작성 과정 사례

### 1. 이벤트와 이벤트 리스너 선택

* **버튼 클릭을 처리하고자 하는 경우**
* 이벤트 : `ActionEvent`
* 이벤트 리스너 : `ActionListener`



### 2. 이벤트 리스너 클래스 작성 : `ActionListener` 인터페이스 구현

```java
class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) { // 버튼이 클릭될 때 호출되는 메소드
        JButton b = (JButton)e.getSource();    // 사용자가 클릭한 버튼 알아내기
        if(b.getText().equals("Action")) {       // 버튼의 문자열이 "Action"인지 비교
            b.setText("액션");                    // JButton의 setText() 호출. 문자열 변경
        } else {
            b.setText("Action");                  // JButton의 setText() 호출. 문자열 변경
        }
    }
}

```

### 3. 이벤트 리스너 등록

* 이벤트를 받아 처리하고자 하는 컴포넌트에 이벤트 리스너 등록
* `component.addXXXListener(listener)`
* `xxx` : 이벤트 명, `listener` : 이벤트 리스너 객체



```java
MyActionListener listener = new MyActionListener(); // 리스너 인스턴스 생성
btn.addActionListener(listener);                    // 리스너 등록

```

# 리스너 인터페이스

* **이벤트 리스너 :** 이벤트를 처리하는 자바 프로그램 코드, **클래스로 작성**
* **자바는 다양한 리스너 인터페이스 제공**

### 예) `ActionListener` 인터페이스

> 버튼 클릭 이벤트를 처리하기 위한 인터페이스

```java
interface ActionListener { // 아래 메소드를 개발자가 구현해야 함
    public void actionPerformed(ActionEvent e); // Action 이벤트 발생시 호출됨
}

```

### 예) `MouseListener` 인터페이스

> 마우스 조작에 따른 이벤트를 처리하기 위한 인터페이스

```java
interface MouseListener { // 아래의 5개 메소드를 개발자가 구현해야 함
    public void mousePressed(MouseEvent e);  // 마우스 버튼이 눌러지는 순간 호출
    public void mouseReleased(MouseEvent e); // 눌러진 마우스 버튼이 떼어지는 순간 호출
    public void mouseClicked(MouseEvent e);  // 마우스가 클릭되는 순간 호출
    public void mouseEntered(MouseEvent e);  // 마우스가 컴포넌트 위에 올라가는 순간 호출
    public void mouseExited(MouseEvent e);   // 마우스가 컴포넌트 위에서 내려오는 순간 호출
}

```

---

* **사용자의 이벤트 리스너 작성**
* 자바의 리스너 인터페이스(`interface`)를 **상속받아 구현**
* 리스너 인터페이스의 **모든 추상 메소드 구현** 필수

# 이벤트 객체, 이벤트 소스, 발생하는 경우

| 이벤트 객체 | 이벤트 소스 | 이벤트가 발생하는 경우 |
| --- | --- | --- |
| **ActionEvent** | `JButton`<br>

<br>`JMenuItem`<br>

<br>`JTextField` | 마우스나 `<Enter>` 키로 버튼 선택<br>

<br>메뉴 아이템 선택<br>

<br>텍스트 입력 중 `<Enter>` 키 입력 |
| **ItemEvent** | `JCheckBox`<br>

<br>`JRadioButton`<br>

<br>`JCheckBoxMenuItem` | 체크박스의 선택 혹은 해제<br>

<br>라디오 버튼의 선택 상태가 변할 때<br>

<br>체크박스 메뉴 아이템의 선택 혹은 해제 |
| **ListSelectionEvent** | `JList` | 리스트에 선택된 아이템이 변경될 때 |
| **KeyEvent** | `Component` | 키가 눌러지거나 눌려진 키가 떼어질 때 |
| **MouseEvent** | `Component` | 마우스 버튼이 눌러지거나 떼어질 때, 마우스 버튼이 클릭될 때, 컴포넌트 위에 마우스가 올라갈 때, 올라간 마우스가 내려올 때, 마우스가 드래그될 때, 마우스가 단순히 움직일 때 |
| **FocusEvent** | `Component` | 컴포넌트가 포커스를 받거나 잃을 때 |
| **WindowEvent** | `Window` | Window를 상속받는 모든 컴포넌트에 대해 윈도우 활성화, 비활성화, 아이콘화, 아이콘에서 복구, 윈도우 열기, 윈도우 닫기, 윈도우 종료 |
| **ComponentEvent** | `Component` | 컴포넌트가 사라지거나, 나타나거나, 이동, 크기 변경 시 |
| **ContainerEvent** | `Container` | Container에 컴포넌트 추가 혹은 삭제 시 |
# 이벤트 객체와 이벤트 정보를 리턴하는 메소드

### [EventObject]

* `Object getSource()`
* └ **[AWTEvent]**
* ├ **[ActionEvent]**
* `String getActionCommand()`


* ├ **[ComponentEvent]**
* └ **[InputEvent]**
* `int getModifiers()`
* ├ **[MouseEvent]**
* `int getButton()`
* `int getClickCount()`
* `Point getPoint()`
* `int getX()`
* `int getY()`


* └ **[KeyEvent]**
* `char getKeyChar()`
* `int getKeyCode()`
* `String getKeyText()`


* └ **[ItemEvent]**
* `Object getItem()`
* `int getStateChange()`


### 구조 한눈에 보기 요약

* 최상위에는 `EventObject`가 있으며, 모든 이벤트 객체는 `getSource()` 메소드를 공유합니다.
* 키보드(`KeyEvent`)와 마우스(`MouseEvent`) 입력은 모두 `InputEvent`와 `ComponentEvent`를 상속받는 계층 구조를 가집니다.

# 이벤트 객체

* **이벤트 객체**
* 발생한 이벤트에 관한 정보를 가진 객체
* 이벤트 리스너에 전달됨
* **이유:** 이벤트 리스너 코드가 발생한 이벤트에 대한 **상황을 파악할 수 있게 함**

* **이벤트 객체가 포함하는 정보**
* 이벤트 종류와 이벤트 소스
* 이벤트가 발생한 **화면 좌표 및 컴포넌트 내 좌표**
* 이벤트가 발생한 버튼이나 메뉴 아이템의 문자열
* 클릭된 마우스 버튼 번호 및 마우스의 클릭 횟수
* 키의 코드 값과 문자 값
* 체크박스, 라디오버튼 등과 같은 컴포넌트에 이벤트가 발생하였다면 **체크 상태**


* **이벤트 소스를 알아내는 메소드 : `Object getSource()**`
* 발생한 이벤트의 **소스 컴포넌트 리턴**
* `Object` 타입으로 리턴하므로 **캐스팅(Casting)하여 사용**
* 모든 이벤트 객체에 대해 적용 가능

# 자바의 이벤트 기반 스윙 응용프로그램의 구조와 이벤트 처리 과정

### 1. 이벤트 처리 흐름 (도식 순서)

1. **① 화면상의 New 버튼에 마우스 클릭**
* 하드웨어(마우스)에서 입력 발생


2. **② 시스템 거치기**
* PC 등 하드웨어 $\rightarrow$ 운영체제 $\rightarrow$ 자바 가상 기계(JVM) 순으로 신호 전달


3. **③ 이벤트 분배 스레드**
* JVM에서 이벤트 분배 스레드로 신호가 넘어감


4. **④ ActionEvent 생성**
* 이벤트 소스(`JButton`)에서 `ActionEvent` 객체가 생성됨


5. **⑤ 호출**
* 이벤트 분배 스레드가 해당 버튼에 연결된 **이벤트 리스너4**를 호출하여 코드를 실행


### 2. 자바 응용프로그램 내부 컴포넌트와 리스너 관계

* **JList** $\leftrightarrow$ 이벤트 리스너1
* **JTextField** $\leftrightarrow$ 이벤트 리스너2
* **JMenuItem** $\leftrightarrow$ 이벤트 리스너3
* **JButton (이벤트 소스)** $\leftrightarrow$ 이벤트 리스너4

---

### 3. 캐릭터 말풍선 설명 요약

> "발생한 이벤트는 **Action 이벤트**이고, 이벤트 소스는 **JButton**이며, 이벤트 객체는 **ActionEvent**이고, 이벤트 리스너는 **이벤트 리스너4**입니다."

## 자바 스윙 프로그램에서 이벤트 처리 과정
1. 이벤트 발생
예 : 마우스의 움직임 혹은 키보드 입력

2. 이벤트 객체 생성
현재 발생한 이벤트에 대한 정보를 가진 객체

3. 응용프로그램에 작성된 이벤트 리스너 찾기
4. 이벤트 리스너 실행
리스너에 이벤트 객체 전달

리스너 코드 실행

## 이벤트 기반 프로그래밍

* **이벤트 기반 프로그래밍(Event Driven Programming)**
* 이벤트의 발생에 의해 **프로그램 흐름이 결정되는 방식**
* 이벤트가 발생하면 이벤트를 처리하는 루틴(**이벤트 리스너**) 실행
* 실행될 코드는 이벤트의 발생에 의해 전적으로 결정


* 반대되는 개념 : **배치 실행(batch programming)**
* 프로그램의 **개발자가 프로그램의 흐름을 결정하는 방식**


* 이벤트 종류
* **사용자의 입력** : 마우스 드래그, 마우스 클릭, 키보드 누름 등
* 센서로부터의 입력, 네트워크로부터 데이터 송수신
* 다른 응용프로그램이나 다른 스레드로부터의 메시지

* **이벤트 기반 응용 프로그램의 구조**
* 각 이벤트마다 처리하는 **리스너 코드 보유**


* **GUI 응용프로그램은 이벤트 기반 프로그래밍으로 작성됨**
* GUI 라이브러리 종류 : C++의 MFC, C# GUI, Visual Basic, X Window, Android 등
* 자바의 **AWT와 Swing**
--5/20
### 배치 관리자가 없는 컨테이너 (Absolute Positioning)

배치 관리자를 제거하면 개발자가 컴포넌트의 좌표($x$, $y$)와 크기($width$, $height$)를 직접 지정해야 합니다.

#### 1. 필요한 경우

* 컴포넌트의 크기나 위치를 개발자가 임의로 결정하고자 하는 경우
* 게임 프로그램처럼 시간이나 마우스/키보드 입력에 따라 위치와 크기가 수시로 변하는 경우
* 여러 컴포넌트를 서로 겹쳐서 출력하고자 하는 경우

#### 2. 배치 관리자 제거 방법

* `container.setLayout(null);` 코드를 사용합니다.
* 예시: `JPanel p = new JPanel(); p.setLayout(null);`

#### 3. 제거 시 주의사항

* 배치 관리자가 없어지면 컴포넌트에 대한 자동 배치가 수행되지 않습니다.
* 추가된 컴포넌트의 크기가 기본적으로 **0**으로 설정되며, 위치를 알 수 없게 되어 화면에 보이지 않습니다.
* 따라서 반드시 `setSize()`, `setLocation()` 또는 `setBounds()` 메소드를 사용하여 **크기와 위치를 수동으로 지정**해야 합니다.

---

### EX16.java (절대 배치 예제)

파일 이름을 `EX16.java`로 유지하면서, 버튼을 직접 원하는 위치에 배치하는 코드입니다.

```java
import javax.swing.*;
import java.awt.*;

public class EX16 extends JFrame {
    public EX16() {
        setTitle("절대 배치 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = getContentPane();

        // 1. 배치 관리자 삭제
        contentPane.setLayout(null); 

        // 2. 버튼 생성 및 절대 위치/크기 지정
        JButton b = new JButton("Click");
        b.setLocation(50, 50); // x=50, y=50 위치
        b.setSize(100, 30);    // 폭=100, 높이=30
        contentPane.add(b);    // 컨텐트팬에 부착

        // 3. 반복문을 이용한 배치 (겹치기 가능)
        for(int i=1; i<=5; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setBounds(i*15, i*15, 50, 20); // x, y, width, height를 한 번에 설정
            contentPane.add(btn);
        }

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EX16();
    }
}

```

##  GridLayout 생성자 상세

`GridLayout`은 컨테이너를 격자판 모양으로 나누어 컴포넌트를 배치할 때 사용하며, 다음과 같은 생성자들을 제공합니다.

### 1. 생성자 종류

* **`GridLayout()`**: 기본 생성자로, 행과 열의 수를 정하지 않고 컴포넌트가 추가되는 대로 배치합니다.
* **`GridLayout(int rows, int cols)`**: 행 수(`rows`)와 열 수(`cols`)를 지정하여 격자를 만듭니다.
* **`GridLayout(int rows, int cols, int hGap, int vGap)`**: 행/열 수뿐만 아니라 컴포넌트 사이의 간격까지 세밀하게 설정합니다.

### 2. 매개변수 설명

* **`rows`**: 격자의 **행 수**를 의미합니다. (디폴트 : 1)
* **`cols`**: 격자의 **열 수**를 의미합니다. (디폴트 : 1)
* **`hGap`**: 좌우 두 컴포넌트 사이의 **수평 간격**을 픽셀 단위로 설정합니다. (디폴트 : 0)
* **`vGap`**: 상하 두 컴포넌트 사이의 **수직 간격**을 픽셀 단위로 설정합니다. (디폴트 : 0)

### 3. 주요 특징

* **`rows x cols`** 만큼의 셀을 가진 격자로 컨테이너 공간을 분할하여 컴포넌트를 배치합니다.

---

**💡 참고:** 이전에 사용하셨던 `new GridLayout(4, 3, 5, 5)` 코드는 이 생성자 중 세 번째 방식을 사용하여 **4행 3열**의 격자를 만들고, 각 버튼 사이에 **5픽셀**씩 틈을 준 것입니다.

###  GridLayout 배치방법 요약

* **격자 분할**: 컨테이너 공간을 동일한 사각형 격자(그리드)로 분할하고 각 셀에 컴포넌트를 하나씩 배치합니다.
* **생성자 설정**: 생성자에 행수와 열수를 지정하여 구조를 결정합니다.
* 예: `new GridLayout(4, 3, 5, 5)`는 4행 3열 분할이며, 컴포넌트 사이의 수평/수직 간격을 5픽셀로 설정한다는 의미입니다.


* **배치 순서**: 셀에 **왼쪽에서 오른쪽으로, 다시 위에서 아래로** 순서대로 컴포넌트가 배치됩니다.

---

### EX16.java (GridLayout 버전)

이미지의 예시(4x3 그리드, 버튼 11개)를 바탕으로 파일명을 `EX16.java`로 유지한 최종 코드입니다.

```java
import javax.swing.*;
import java.awt.*;

public class EX16 extends JFrame {
    public EX16() {
        setTitle("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = getContentPane();

        // 4행 3열, 수평/수직 간격 5픽셀 설정
        contentPane.setLayout(new GridLayout(4, 3, 5, 5));

        // 1부터 9까지 버튼 추가
        for(int i=1; i<=9; i++) {
            contentPane.add(new JButton(Integer.toString(i)));
        }

        // 마지막 줄 버튼들 추가
        contentPane.add(new JButton("*"));
        contentPane.add(new JButton("0"));
        // 총 11개의 버튼이 순서대로 add 됨

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EX16();
    }
}

```

---

### 실행 및 확인

1. **컴파일**: `javac -encoding UTF-8 EX16.java`
2. **실행**: `java EX16`

이미지 **image_55f177.png**의 하단 그림처럼 버튼들이 바둑판 모양으로 예쁘게 정렬된 것을 확인하실 수 있습니다. 특히 `GridLayout`은 모든 컴포넌트의 크기를 동일하게 강제하기 때문에 계산기 숫자판 같은 화면을 만들 때 아주 유용합니다.

## BorderLayout 생성자와 add() 메소드

BorderLayout은 컨테이너를 5개의 구역(동, 서, 남, 북, 중앙)으로 나누어 배치하는 방식입니다.

### 1. 생성자 (Constructor)

* **`BorderLayout()`**: 기본 생성자로, 컴포넌트 사이의 간격이 0인 상태로 생성합니다.
* **`BorderLayout(int hGap, int vGap)`**: 컴포넌트 간의 간격을 설정하며 생성합니다.
* **hGap**: 좌우 컴포넌트 사이의 수평 간격 (픽셀 단위, 기본값 0)
* **vGap**: 상하 컴포넌트 사이의 수직 간격 (픽셀 단위, 기본값 0)



### 2. add() 메소드

컴포넌트를 추가할 때 반드시 **위치**를 지정해줘야 합니다.

* **`void add(Component comp, int index)`**: `comp` 컴포넌트를 지정된 `index` 위치에 삽입합니다.
* **위치 상수 (index)**:
* **동**: `BorderLayout.EAST`
* **서**: `BorderLayout.WEST`
* **남**: `BorderLayout.SOUTH`
* **북**: `BorderLayout.NORTH`
* **중앙**: `BorderLayout.CENTER`



---

## 실습 코드 (EX16_Border.java)

위의 내용을 바탕으로 직접 실행해볼 수 있는 코드를 짜봤습니다. 이번에는 파일명을 `EX16_Border.java`로 해서 연습해 보세요!

```java
import javax.swing.*;
import java.awt.*;

public class EX16_Border extends JFrame {
    public EX16_Border() {
        setTitle("BorderLayout 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = getContentPane();

        // 수평 간격 20, 수직 간격 30으로 설정
        contentPane.setLayout(new BorderLayout(20, 30));

        // 각 구역에 버튼 추가
        contentPane.add(new JButton("Calculate"), BorderLayout.CENTER);
        contentPane.add(new JButton("add"), BorderLayout.NORTH);
        contentPane.add(new JButton("sub"), BorderLayout.SOUTH);
        contentPane.add(new JButton("mul"), BorderLayout.EAST);
        contentPane.add(new JButton("div"), BorderLayout.WEST);

        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EX16_Border();
    }
}

```

### 실행 팁

1. **파일명**: `EX16_Border.java`
2. **컴파일**: `javac -encoding UTF-8 EX16_Border.java`
3. **실행**: `java EX16_Border`

## 배치 관리자 대표 유형 4가지
FlowLayout 배치관리자

컴포넌트가 삽입되는 순서대로 왼쪽에서 오른쪽으로 배치됩니다.

배치할 공간이 없으면 아래로 내려와서 다시 왼쪽부터 배치를 반복합니다.

(질문하신 코드에서 사용된 방식입니다!)

BorderLayout 배치관리자

컨테이너의 공간을 동(EAST), 서(WEST), 남(SOUTH), 북(NORTH), 중앙(CENTER)의 5개 영역으로 나눕니다.

5개 영역 중 응용프로그램에서 지정한 영역에 컴포넌트를 배치합니다.

GridLayout 배치관리자

컨테이너를 프로그램에서 설정한 동일한 크기의 2차원 격자로 나눕니다.

컴포넌트는 삽입 순서대로 좌에서 우로, 다시 위에서 아래로 배치됩니다.

CardLayout 배치관리자

컨테이너의 공간에 카드를 쌓아 놓은 듯이 컴포넌트를 포개어 배치합니다.

한 번에 하나의 컴포넌트(카드)만 보이게 할 때 주로 사용합니다.

## # 현재 권장 JDK

* 2026년 기준, JDK는 Java 17 또는 Java 21 (LTS 버전) 사용이 권장됩니다.

* 신규 프로젝트는 21, 기존 레거시 시스템은 17이나 11을 주로 사용합니다.

* Java 8은 지원 종료 시점(2026년 11월)이 가까워 전환이 필요합니다.

---

🚨 JDK 1.5는 2004년도에 릴리즈된 버전입니다. 공식 지원도 끝난 상태입니다.

🚨 교재에서 소개하는 1.5 이전의 방법으로 코딩하는 것은 검토할 가치가 없습니다.

---

현재 본인의 jdk 버전을 확인해 보세요.

```bash id="r7n3kq"
java --version
```

예시 출력:

```bash id="z2m6df"
openjdk 25.0.2 2026-01-20 LTS
OpenJDK Runtime Environment Temurin-25.0.2+10 (build 25.0.2+10-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.2+10 (build 25.0.2+10-LTS, mixed mode, sharing)
```

[Java Version History](https://en.wikipedia.org/wiki/Java_version_history?utm_source=chatgpt.com)


## # Tip. 컨텐트팬에 대한 JDK 1.5 이후의 추가 사항

## JDK 1.5 이전

* 프레임의 컨텐트팬을 알아내어, 반드시 컨텐트팬에 컴포넌트 부착

```java id="8j9m3r"
Container c = frame.getContentPane();

c.add(new JButton("Click")); // 컨텐트팬에 직접 컴포넌트 부착
```

---

## JDK 1.5 이후 추가 사항

* 프레임에 컴포넌트를 부착하면 프레임이 대신 컨텐트팬에 부착

```java id="1v7c6q"
frame.add(new JButton("Click"));

// 프레임이 버튼 컴포넌트를 컨텐트팬에 대신 부착
```

---

## 저자의 결론

* JDK1.5 이전처럼 직접 컨텐트팬에 컴포넌트를 부착하는 것이 바람직함
* 컨텐트팬 다루기 능력이 필요하기 때문
* 컴포넌트의 부모가 프레임이 아닌, 컨텐트팬임을 알고 명확히 사용할 필요

---

# 정리

* 1.5 이후 추가된 기능을 사용하는 것이 가독성이 좋음
* 하지만 Content Pane을 다루는 능력이 반드시 필요 없는 것은 아님


## # 프레임에 컴포넌트 붙이기

* 타이틀 달기

  * `super()`나 `setTitle()` 이용

```java id="d0y1n4"
MyFrame() { // 생성자
    super("타이틀문자열");
}
```

```java id="2p3bd2"
MyFrame() { // 생성자
    setTitle("타이틀문자열");
}
```

---

* 컨텐트팬에 컴포넌트 달기

  * 컨텐트팬이란?
    스윙 컴포넌트들이 부착되는 공간

  * 컨텐트팬 알아내기 :
    스윙 프레임에 붙은 디폴트 컨텐트팬 알아내기

```java id="b5g2ln"
public class MyFrame extends JFrame {

    MyFrame() {

        // 프레임의 컨텐트팬을 알아낸다.
        Container contentPane = getContentPane();
    }
    ...
}
```

---

* 컨텐트팬에 컴포넌트 붙이기

```java id="v4q3kp"
// 버튼 컴포넌트 생성
JButton button = new JButton("Click");

// 컨텐트팬에 버튼 부착
contentPane.add(button);
```

---

* 컨텐트팬 변경

```java id="7r95g4"
class MyPanel extends JPanel {
    // JPanel을 상속받은 패널을 구현한다.
}

// frame의 컨텐트팬을 MyPanel 객체로 변경
frame.setContentPane(new MyPanel());
```

## ## Swing 응용프로그램에서 main()의 기능과 위치

* 스윙 응용프로그램에서 main()의 기능 최소화 바람직

  * 스윙 응용프로그램이 실행되는 시작점으로서의 기능만
  * 스윙 프레임을 생성하는 정도의 코드로 최소화

```java
public static void main(String[] args) {
    MyFrame frame = new MyFrame(); // 스윙 프레임 생성
}
```

---

# frame 객체를 생성하고 사용하지 않기 때문에 worrying이 발생합니다.

# 실무에서는 다음과 같이 코딩하는 것이 일반적입니다.

```java
public static void main(String[] args) {
    javax.swing.SwingUtilities.invokeLater(() -> {
        new Ex81MyFrame(); // EDT에서 프레임 생성
    });
}
```

```java
public static void main(String[] args) {
    new MyFrame(); // 스윙 프레임 생성
}
```


## 프레임 만들기,JFraim 클래스 상속
스윙 프레임
* JFram 클래스를 상속 받은 클래스 작성
* 프레임의 크기 반드시 지정:setSize()호출
* 프레임을 화면에 출력하는 코드 반드시 필요:setVisible(true)호출

## Swing 프레임
스윙 프레임:모든 스윙 컴포넌트를 담는 최상위 컨테이너
JFraim을 상속 받아 구현
컴포넌트들은 화면에 보이려면 스윙 프레임에 부착되어야 함
프레임 닫으려면 프레임에 부착된 모든 컴포넌트가 보이지 않게 됨
스윙 프레임 기본 구성
프레임:스윙 프로그램의 기본 틀
메뉴바:

## Swing GUI  프로그램 만들기
스윙 GUI 프로그램을 만드는 과정
1.스윙 프레임 만들기
2.main()

## 컨테이너와 컴포넌트 포함 관계
최상위 컨테이너를 바닥에 깔고 그 위에서 컨테이너를 놓고, 다시 컴포 넌트를 쌓아 가는 방식, 즉 레고 블록으 쌓는듯이 GUI 프로그램을 작성 한다

## 컨테이너와 컴포넌트

• 컨테이너

* 다른 컴포넌트를 포함할 수 있는 GUI 컴포넌트 : java.awt.Container를 상속받음
* 다른 컨테이너에 포함될 수 있음
* AWT 컨테이너 : Panel, Frame, Applet, Dialog, Window
* Swing 컨테이너 : JPanel, JFrame, JApplet, JDialog, JWindow

• 컴포넌트

* 컨테이너에 포함되어야 화면에 출력될 수 있는 GUI 객체
* 다른 컴포넌트를 포함할 수 없는 순수 컴포넌트
* 모든 GUI 컴포넌트가 상속받는 클래스 : java.awt.Component
* 스윙 컴포넌트가 상속받는 클래스 : javax.swing.JComponent

• 최상위 컨테이너

* 다른 컨테이너에 포함되지 않고도 화면에 출력되며, 독립적으로 존재 가능한 컨테이너
* 스스로 화면에 자신을 출력하는 컨테이너 : JFrame, JDialog, JApplet

## GUI 패키지 게층 구조
AWT 클래스
Swing 클래스

## [ Swing 패키지 ]

• AWT 기술을 기반으로 작성된 자바 라이브러리

• 모든 AWT 기능 + 추가된 풍부하고 화려한 고급 컴포넌트

• AWT 컴포넌트를 모두 스윙으로 재작성.

• AWT 컴포넌트 이름 앞에 J자를 덧붙임

• 순수 자바 언어로 구현

• 스윙 컴포넌트는 경량 컴포넌트(light weight component)

• 스윙 컴포넌트는 운영체제의 도움을 받지 않고, 직접 그리기 때문에 운영체제에 부담주지 않음

• 현재 자바의 GUI 표준으로 사용됨

## 자바의 GUI(Graphical User Interface)

• GUI : 사용자가 편리하게 입출력 할 수 있도록 그래픽으로 화면을 구성하고, 마우스나 키보드로 입력 받을 수 있도록 지원하는 사용자 인터페이스

• 자바 언어에서 GUI 응용프로그램 작성 : AWT와 Swing 패키지에 강력한 GUI 컴포넌트 제공.

[ AWT(Abstract Windowing Toolkit) 패키지 ]

• 자바가 처음 나왔을 때부터 배포된 GUI 패키지, 최근에는 거의 사용하지 않음

• AWT 컴포넌트는 중량 컴포넌트(heavy weight component)

• AWT 컴포넌트의 그리기는 운영체제에 의해 이루어지며, 운영체제의 자원을 많이 소모하고 부담을 줌

• 운영체제가 직접 그리기 때문에 속도는 빠름


## 자바의 패키지와 모듈이랑?
자바에서 **패키지(package)**와 **모듈(module)**은 코드를 구조화하고 관리하기 위한 개념인데, 서로 역할과 범위가 달라요.

---

## 🔹 패키지 (Package)

* **정의**: 서로 관련된 클래스와 인터페이스를 묶어 놓은 폴더(디렉터리) 개념

* **목적**:

  * 코드 구조를 정리하고 관리하기 쉽게 함
  * 클래스 이름 충돌 방지 (같은 이름의 클래스라도 패키지가 다르면 공존 가능)
  * 접근 제어(접근 제한자)와 함께 캡슐화 지원

* **예시**:

```java
package com.example.util;

public class MathUtil {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

* **특징**:

  * 계층 구조 가능 (`com.example.util`)
  * `import` 문으로 다른 패키지의 클래스 사용 가능

---

## 🔹 모듈 (Module)

* **정의**: 여러 패키지를 묶어서 하나의 독립적인 단위로 관리하는 개념 (Java 9부터 도입)

* **목적**:

  * 애플리케이션을 더 크게 나누어 관리
  * **강력한 캡슐화** 제공 (어떤 패키지를 외부에 공개할지 명시)
  * 의존성 관리 (어떤 모듈을 사용하는지 선언)

* **구성 파일**: `module-info.java`

* **예시**:

```java
module com.example.myapp {
    exports com.example.util;
    requires java.base;
}
```

* **특징**:

  * `exports`: 외부에 공개할 패키지 지정
  * `requires`: 의존하는 다른 모듈 선언
  * 패키지보다 더 큰 단위

---

## 🔸 패키지 vs 모듈 정리

| 구분    | 패키지          | 모듈              |
| ----- | ------------ | --------------- |
| 범위    | 클래스/인터페이스 묶음 | 패키지 묶음          |
| 도입 시기 | 초기 자바부터      | Java 9          |
| 역할    | 코드 정리        | 시스템 구조 및 의존성 관리 |
| 캡슐화   | 제한적          | 강력 (export로 제어) |

---

## ✔ 한 줄 정리

* **패키지**: 클래스들을 묶는 단위
* **모듈**: 패키지들을 묶고, 외부 공개와 의존성을 관리하는 단위


## 패키지 개념과 필요성
* 3명이 분담하여 자바 응용 프로그램을 개발하는경우,동일한 이름의 클래스가 존재할 가능성 있음

## 인터페이스 구성 요소
[인터페이스 구성 요소들]
* 상수:public만 허용,public statric final 생략
* 추상 메소드: public avstratct만 사용 가능 

## 자바의 인터페이스
* 소프트 웨어를 규격화 된 모듈로 만들고,인터페이스가 맞는 모듈로

## 추상 클래스의 목적

추상 클래스의 목적
상속을 위한 슈퍼 클래스로 활용하는 것
서브 클래스에서 추상 메소드 구현
다형성 실현
class Shape {
    public void draw() {
        System.out.println("Shape");
    }
}

→ (X 표시) 추상 클래스로 작성

abstract class Shape {
    public abstract void draw();
}

(설명) 추상 클래스를 상속받아 추상 메소드 draw() 구현

class Line extends DObject {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends DObject {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends DObject {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

## 추상 클래스의 상속과 구현

**추상 클래스 상속**

* 추상 클래스를 상속받으면 추상 클래스가 됨
* 서브 클래스도 abstract로 선언해야 함

```id="a3z2k1"
abstract class A { // 추상 클래스
    abstract public int add(int x, int y); // 추상 메소드
}

abstract class B extends A { // 추상 클래스
    public void show() { System.out.println("B"); }
}
```

```id="p9x8m2"
A a = new A(); // 컴파일 오류. 추상 클래스의 인스턴스 생성 불가
B b = new B(); // 컴파일 오류. 추상 클래스의 인스턴스 생성 불가
```

---

**추상 클래스 구현**

* 서브 클래스에서 슈퍼 클래스의 추상 메소드 구현 (오버라이딩)
* 추상 클래스를 구현한 서브 클래스는 추상 클래스 아님

```id="k7d4q9"
class C extends A { // 추상 클래스 구현. (=> 정상 클래스)
    public int add(int x, int y) { return x + y; } // 추상 메소드 구현. 오버라이딩
    public void show() { System.out.println("C"); }
}

...
C c = new C(); // 정상
```

---


## 추상 클래스의 인스턴스 생성 불가**

* 추상 클래스는 온전한 클래스가 아니기 때문에 인스턴스를 생성할 수 없음

```
JComponent p;      // 오류 없음. 추상 클래스의 레퍼런스 선언

p = new JComponent();   // 컴파일 오류. 추상 클래스의 인스턴스 생성 불가

Shape obj = new Shape();   // 컴파일 오류. 추상 클래스의 인스턴스 생성 불가
```

컴파일 오류 메시지
→ **Unresolved compilation problem: Cannot instantiate the type Shape**

## 추상 클래스

* **추상 메소드(abstract method)**
  : abstract로 선언된 메소드, 메소드의 코드는 없고 원형만 선언

```java
abstract public String getName(); // 추상 메소드
abstract public String fail() { return "Good Bye"; } // 추상 메소드 아님, 컴파일 오류
```

---

* **추상 클래스(abstract class)**

  * 추상 메소드를 가지며, abstract로 선언된 클래스
  * 추상 메소드 없이, abstract로 선언한 클래스

```java
// 추상 메소드를 가진 추상 클래스
abstract class Shape {
    public Shape() { ... }
    public void edit() { ... }

    abstract public void draw(); // 추상 메소드
}
```

```java
// 추상 메소드 없는 추상 클래스
abstract class JComponent {
    String name;
    public void load(String name) {
        this.name = name;
    }
}
```

---

```java
class fault { // 오류. 추상 메소드를 가지고 있으므로 abstract로 선언되어야 함
    abstract public void f(); // 추상 메소드
}
```

## 오버라이딩의 목적,다형성 실현
* 오버라이딩아로 다형성 실현
* 하나의 인터페이스(같은이름)에 서로 다른 구현
* 슈퍼 클래스의 메소드를 서브 클래스에서 각각 목적에 맞게 다르게 구현
* 사례:super()

## 서브 클래스 객체와 오버라이딩된 메소드 호출

## 메소드 오버라이딩(Method Overriding)의 개념

* 서브 클래스에서 슈퍼 클래스의 메소드 중복 작성

* 슈퍼 클래스의 메소드 무력화, 항상 서브 클래스에 오버라이딩한 메소드가 실행되도록 보장됨

* "메소드 무시하기"로 번역되기도 함

* 오버라이딩 조건
  → 슈퍼 클래스 메소드의 원형(메소드 이름, 인자 타입 및 개수, 리턴 타입) 동일하게 작성

## 다운캐스팅(downcasting)

* 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입

* 업캐스팅 된 것을 다시 원래대로 되돌리는 것

* 반드시 명시적 타입 변환 지정

* 다운캐스팅 사례

```java
public class DowncastingEx {

    public static void main(String[] args) {
        Person p = new Student("이재문"); // 업캐스팅
        Student s;

        s = (Student)p; // 다운캐스팅

        System.out.println(s.name); // 오류 없음
        s.grade = "A"; // 오류 없음
    }
}
```

(오른쪽 코드)

```java
class Person { }
class Student extends Person { }

Person p = new Student("이재문"); // 업캐스팅

Student s = (Student)p; // 다운캐스팅, 강제타입변환
```

## 업케스팅(upcasting)개념
# 하위 클래스의 레퍼런스는 상위 클래스를 가리킬 수 없지만, 상위 클래스의 레퍼런스는 하위 클래스를 가리킬 수 있다는 설명.
* 생물이 들어가는 박스에 사람이나 코끼리를 넣어도 무방.
* 사람이나 코끼리 모두 생물을 상속받았기 때문.
* 업캐스팅(upcasting) 이란?
- 서브 클래스의 레퍼런스를 슈퍼 클래스 레퍼런스에 대입
- 슈퍼 클래스 레퍼런스로 서브 클래스 객체를 가리키게 되는 현상

class Person { } // 슈퍼 클래스
class Student extends Person { }

Person p;
Student s = new Student();
p = s; // 업캐스팅

(오른쪽 설명)

슈퍼클래스 레퍼런스로 객체 내의 슈퍼 클래스의 멤버만 접근 가능
p.grade = "A"; // grade는 Person의 멤버가 아니므로 컴파일 오류

## 서브 클래스와 슈퍼 클래스의 생성자 선택
* 슈퍼 클래스와 서브 클래스 : 각각 여러개의 생성자 작성 가능
* 서브 클래스의 객체가 생성 될때: 슈퍼 클래스 생성자 1개와 서브     클래스 생성자 1개가 실행
* 서브 클래스의 생성자와 슈퍼 클래스의 생성작 결정 되는 방식
1. 개발자의 명시적 선택
    * 서브 클래스 개발자가 슈퍼 클래스의 생성자가 명시적 선택
    * super() 키워드 이용하여 선택
2. 컴파일러가 기본 생성자 선택
    * 서브 클래스 개발자가 슈퍼 클래스 생성자를 선택하지 않는 경우
    * 컴파일러가 자동으로 슈퍼 클래스의 기본 생성자 선택

## 슈퍼 클래스 멤버의 접근 지정자

## 슈퍼 클래스의 멤버에 대한 서브 클래스의 접근
* 슈퍼 클래스 private멤버:서브 클래스에서 접근할수 없음
* 슈퍼 클래스의 디폴트 멤버:서브 클래스가 도오인한 패키지가 있을떼, 접근 가능
* 슈퍼 클래스의 public멤버

## 자바 상속의 특징
* 클래스 다중 상속(multiple inheritance) 불허
* 하나의 클래스가 둘 이상의 부모 클래스를 동시에 상속받는 것을 말합니다.

✓ C++는 다중 상속 가능

✓ C++는 다중 상속으로 멤버가 중복 생성되는 문제 있음. (다이아몬드 상속)

* 부모 클래스 간에 계층적 관계가 있을 경우, 중복된 멤버가 생성될 수 있습니다.
* 모호성(Ambiguity) 문제 : 두 부모 클래스에 동일한 이름의 멤버(변수나 함수)가 존재할 경우, 어떤 부모의 멤버를 호출해야 할지 모호해집니다.

* 자바는 인터페이스(interface)의 다중 상속 허용.

* 다중 상속과 유사한 기능을 제공합니다.
모든 자바 클래스는 묵시적으로 Object 클래스를 상속받음

✓ java.lang.Object는 클래스는 모든 클래스의 슈퍼 클래스

## 서브 클래스에서 슈퍼 클래스 멤버 접근 

## 서버 클래스 객체 모양
슈퍼 클래스와

**클래스 상속과 객체**

* 상속 선언 : extends 키워드 사용
* 부모 클래스를 물려받아 자식 클래스를 확장한다는 의미
* 부모 클래스 → 슈퍼 클래스(super class)
* 자식 클래스 → 서브 클래스(sub class)

```id="h0mx8e"
class Point {
    int x, y;
    ...
}

// Point를 상속받는 ColorPoint 클래스 선언
class ColorPoint extends Point {
    ...
}
```

(서브 클래스 / 슈퍼 클래스 표시됨)

* ColorPoint는 Point를 물려 받으므로, Point에 선언된 필드와 메소드 선언 필요 없음

## 상속(inheritance)의 필요성

* 상속이 없는 경우 중복된 멤버를 가진 4개의 클래스

```
class Student
- 말하기
- 먹기
- 걷기
- 잠자기
- 공부하기

class StudentWorker
- 말하기
- 먹기
- 걷기
- 잠자기
- 공부하기
- 일하기

class Researcher
- 말하기
- 먹기
- 걷기
- 잠자기
- 연구하기

class Professor
- 말하기
- 먹기
- 걷기
- 잠자기
- 연구하기
- 가르치기
```

---

* 상속을 이용한 경우 중복이 제거되고 간결해진 클래스 구조

```
class Person
- 말하기
- 먹기
- 걷기
- 잠자기

class Student extends Person
- 공부하기

class Researcher extends Person
- 연구하기

class StudentWorker extends Student
- 일하기

class Professor extends Researcher
- 가르치기
```

(공통 기능은 Person 클래스에 작성)


## final 필드
final 필드: 상수를 선언할때 사용
상수 필드는 선언 시에 초기 값을 지정하여야 한다
상수 필드는 실행 중에 값을 변경할수 없다

## final 클래스와 메소드
final 클래스 - 더이상 클래스 상속 불가능
final 메소드 - 더 이상 오버라이딩 불가능
## static 제약 조건
static 메소드는 오직 static 멤버만 접근 가능
static 메소드는 this 사용불가
static 메소드는 객체 없이도 사용 가능하므로, this 레퍼런스 사용 할수 없음

 ## static 멤버를 가진 calc 클래스 작성
 전역 함수로 작성하고자 하는 abs,max,min의 3개 함수를 static 메소드를 작성하고 호출 

 ## static 활용
 전역 변수와 전역 함수를 만들때 활용
 공유 멤버를 만들때:static으로 선언한 멤버는 클래스와 객체들 사이에 공유

 ## static 멤버 사용
 클래스 이름으로 접근 가능
 객체의 벱머로 접근 가능
 non-static멤버는 클래스 이름으로 접근 안됨
    #non-static 모든 객체에 생성

 ## static 멤버의 생성
 static 멤버는 클래스당 하나만 생성
 객체들에 의해 공유됨

## static 멤버
static 멤버 선언
``java
    class static{
        int n; //non-static 필드
        void g() //non-static 메소드

        static int m; //static 필드
        static void i() //static 메소드
    }
    ``
객세 생성과 non-static 멤버의 생성: non-static 멤버는 객체가 생성될때,객체 마다 생긴다.
객체 마다 n,g()의 non-static 멤버들이 생긴다
#non-static 모든 객체에 멤버 생성,static은 멤버 공유

## 클래스 접근 지정
다른 클래스에서 사용하도록 허용할 지 지정
public 클래스: 다른 모든 클래스에게 접근 허용
디폴트 클래스: 같은 패키지의 클래스에만 접근 허용
public class World{ //public 클래스 구성
    `````
    ````
} 

## 접근 지정자
자바의 접근 지정자 4가지:privatm,poteted,publicm,디폴트 


## 가비지 컬렉션

* JVM이 가비지 자동 회수

✓ 가용 메모리 공간이 일정 이하로 부족해질 때
✓ 가비지를 수거하여 가용 메모리 공간으로 확보

* 가비지 컬렉터(garbage collector)에 의해 자동 수행

---

* 강제 가비지 컬렉션 수행 : System 또는 Runtime 객체의 gc() 메서드 호출

```java id="6nqv2h"
System.gc();  // 가비지 컬렉션 작동 요청
```

* 이 코드는 JVM에 강력한 가비지 컬렉션 요청
* 그러나 JVM이 가비지 컬렉션 시점을 전적으로 판단

## 가비지의 발생
객체가 생성 되었을때

## 가비지
가리키는 레퍼런스가 하나도 없는 객체
더 이상 접근 할수 없어 사용할수 없게된 메모리
가비지 컬렉션: 자가 가상 기계의 가비지 컬렉터가 자동으로 가비지 수집,반환 
## 객체 소멸
new로 할당 받은 객체와 메모리를 jvm느로 되돌려 주는 행위
자바는 객체 소멸 연산자 없음
객체 소멸은 jvmm의 고유 역할

c/c++에서는 할당 받은 객체를 개발자가 프로그램 내에서 삭제 해야함
c/c++ 의 프로그램 작성을 이렇게 만드는 요인
자바에서는 사용하지 않는 객체나 배열을 돌려주는 코징 책임으로 부터 개발자 해방

## 객체 치환 시 주의 할점
객체 치환은 객체 복사가 아니며, 레퍼런스 복사이다

## 메소드 오버로딩
한 클래스 내에서 두개 이상의 이름이 같은 메소드 작성
메소드 이릠이 동일해야함
매개 변수의 개수 혹은 타입이 달라야 함
리턴 타입은 오보로딩과 관련 없음

## 인자 전달 – 배열이 전달되는 경우

* 배열 레퍼런스만 매개 변수에 전달 : 배열 통째로 전달되지 않음
* 객체가 전달되는 경우와 동일 : 매개 변수가 실인자의 배열 공유

---

```java id="2x0c6v"
public class ArrayPassing {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        increase(a);

        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    static void increase(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i]++;
        }
    }
}
```

---

**실행 결과**

```id="t9slfh"
2 3 4 5 6
```

---

**핵심 요약**

* 배열을 전달하면 **값이 아니라 참조(주소)가 복사됨**
* 따라서 함수 안에서 배열을 수정하면 **원본 배열도 같이 변경됨**

## 인자 전달 – 기본 타입의 값이 전달되는 경우

* 매개 변수가 byte, int, double 등 기본 타입으로 선언되었을 때
  → 호출자가 건네는 값이 매개 변수에 복사되어 전달. 실 인자 값은 변경되지 않음

---

```java
public class CallByValue {
    public static void main(String args[]) {
        int n = 10;

        increase(n);

        System.out.println(n);
    }

    static void increase(int n) {
        n = n + 1;
    }
}
```

---

**실행 결과**

```
10
```

---

**동작 과정 설명**

* main() 실행 시작
  int n = 10;

* increase(n); 호출
  → 값 복사: n (10) → increase(int n)의 n (10)

* increase(int n) 실행 시작
  n = n + 1; → n = 11

* increase(int n) 종료
  (main의 n은 여전히 10)

* System.out.println(n);
  → 10 출력

## 메소드(Method)
정의: 메소드는 C/C++의 함수와 동일한 개념입니다.

특징: 자바의 모든 메소드는 반드시 클래스 안에 존재해야 합니다. (이는 객체지향의 캡슐화 원칙에 따릅니다.)

1. 메소드 형식
이미지 예시 코드를 바탕으로 한 구조 분석입니다.

``Java
public int getSum(int i, int j) {
    int sum;
    sum = i + j;
    return sum;
}
``
public: 접근 지정자

int: 리턴 타입

getSum: 메소드 이름

(int i, int j): 메소드 인자들 (매개변수)

{ ... }: 메소드 코드 (본문)

2. 주요 구성 요소 설명
접근 지정자: 다른 클래스에서 해당 메소드에 접근할 수 있는지 여부를 선언합니다.

종류: public, private, protected, 디폴트(접근 지정자 생략 시)

리턴 타입: 메소드가 실행을 마치고 돌려주는(리턴하는) 값의 데이터 타입입니다.

값을 반환하지 않을 때는 void를 사용합니다.

## 객체 배열 선언과 생성 과정

1단계: 배열에 대한 레퍼런스 변수 선언
코드: Circle[] c;

설명: Circle 객체 배열을 가리킬 참조 변수(Reference Variable) c를 선언합니다. 아직 실제 배열이나 객체는 생성되지 않은 상태입니다.

2단계: 레퍼런스 배열 생성
코드: c = new Circle[5];

설명: Circle 객체의 주소값(Reference)을 저장할 수 있는 5개짜리 배열 공간을 생성합니다.

참고: 이 단계에서 생성된 c[0] ~ c[4]는 실제 객체가 아니라, 객체를 가리킬 수 있는 '빈 칸(null)' 상태입니다.

3단계: 객체 생성
코드: ```java
for(int i=0; i<c.length; i++)
c[i] = new Circle(i);

설명: 루프를 돌면서 실제 Circle 객체를 생성하여 배열의 각 칸에 대입합니다.

결과:

c[0] → radius=0 인 Circle 객체

c[1] → radius=1 인 Circle 객체

c[2] → radius=2 인 Circle 객체

c[3] → radius=3 인 Circle 객체

c[4] → radius=4 인 Circle 객체

### 객체 배열

* 객체에 대한 레퍼런스 배열

* 자바의 객체 배열 만들기 3단계

  1. 배열 레퍼런스 변수 선언
  2. 레퍼런스 배열 생성
  3. 배열의 각 원소 객체 생성

---

```java id="h3l9qk"
Circle[] c;          // 1. Circle 배열에 대한 레퍼런스 변수 선언
c = new Circle[5];   // 2. 레퍼런스 배열 생성

for (int i = 0; i < c.length; i++) {   // c.length는 배열의 크기 (5)
    c[i] = new Circle(i);              // 3. 각 원소 객체 생성
}

for (int i = 0; i < c.length; i++) {   // 모든 객체의 면적 출력
    System.out.print((int)(c[i].getArea()) + " ");
}
```

---

✔ 핵심 포인트

* `Circle[] c` → 객체 자체가 아니라 **객체를 가리키는 주소 배열**
* `new Circle[5]` → 객체 5개가 아니라 **빈 칸 5개 (null 상태)**
* 반드시 `c[i] = new Circle(...)`로 객체 생성해야 사용 가능

---

### 객체 속에서의 this

```java
public class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    void set(int radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle ob1 = new Circle(1);
        Circle ob2 = new Circle(2);
        Circle ob3 = new Circle(3);

        ob1.set(4);
        ob2.set(5);
        ob3.set(6);
    }
}
```

---

(오른쪽 그림 설명)

* `ob1` 객체 → `radius = 4`
* `ob2` 객체 → `radius = 5`
* `ob3` 객체 → `radius = 6`

각 객체마다 `this.radius`는 **자기 자신의 radius 값**을 가리킴

---

✔ 핵심 정리

* `this`는 **현재 객체 자기 자신**
* 같은 메서드를 써도 객체마다 `this`가 다르게 동작함

---

### this 레퍼런스

* 객체 자신에 대한 레퍼런스
* 컴파일러에 의해 자동 관리, 개발자는 사용하기만 하면 됨
* `this.멤버` 형태로 멤버를 접근할 때 사용

---

```java
public class Circle {
    int radius;

    public Circle() { radius = 1; }

    public Circle(int r) { radius = r; }

    double getArea() {
        return 3.14 * radius * radius;
    }
    ...
}
```

=

```java
public class Circle {
    int radius;

    public Circle() { this.radius = 1; }

    public Circle(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return 3.14 * this.radius * this.radius;
    }
    ...
}
```

### 생성자의 종류

* 기본 생성자 (default constructor) :
  매개 변수 없고, 아무 작업 없이 단순 리턴하는 생성자

```java
class Circle {
    public Circle() { } // 기본 생성자
}
```

---

* 기본 생성자가 자동 생성되는 경우

✔ 클래스에 생성자가 하나도 선언되어 있지 않을 때
✔ 컴파일러에 의해 자동 생성됨

```java
public class Circle {
    int radius;

    void set(int r) { radius = r; }

    double getArea() { return 3.14 * radius * radius; }

    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.set(5);
        System.out.println(pizza.getArea());
    }
}
```

→ 컴파일러에 의해 기본 생성자 자동 생성됨

```java
public Circle() { }
```

---

### 생성자의 특징

* 생성자 이름은 클래스 이름과 동일
* 생성자는 여러 개 작성 가능 (생성자 중복)

```java
public class Circle {
    public Circle() { ... } // 매개 변수 없는 생성자
    public Circle(int r, String n) { ... } // 2개의 매개 변수를 가진 생성자
}
```

* 생성자는 객체 생성 시 한 번만 호출

  * 자바에서 객체 생성은 반드시 new 연산자로 함

```java
Circle pizza = new Circle(10, "자바피자"); // 생성자 Circle(int r, String n) 호출
Circle donut = new Circle(); // 생성자 Circle() 호출
```

* 생성자의 목적은 객체 생성 시 초기화

* 생성자는 리턴 타입을 지정할 수 없음

```java
public void Circle() { ... } // 오류, void도 사용 안 됨
```

## 생성자 개념과 목적
● 생성자
객체가 생성될 때 초기화 목적으로 실행되는 메소드
객체가 생성되는 순간에 자동 호출
● 그림 설명
기본 객체 → 생성자 → 초기화된 객체

(중간 과정)

생성자가 객체의 상태를 설정(초기화)함
● 요약
생성자는 객체를 만들 때 자동으로 실행됨
객체의 초기 상태(값)를 설정하는 역할을 함

## 객체 생성과 활용

### 1. 레퍼런스 변수 선언

```java
Circle pizza;
```

---

### 2. 객체 생성

* new 연산자 이용

```java
pizza = new Circle();
```

---

### 3. 객체 멤버 접근

* 점(.) 연산자 이용

```java
pizza.radius = 10;
area = pizza.getArea();
```

---

## 오른쪽 그림 단계 설명

### (1)

```java
Circle pizza;
```

* Circle 타입의 레퍼런스 변수 pizza 선언

---

### (2)

```java
pizza = new Circle();
```

* Circle 객체 생성
* 객체 메모리에 radius, name, getArea() 포함

---

### (3)

```java
pizza.radius = 10;
```

* radius 값 변경 (10)

---

### (4)

```java
pizza.name = "자바피자";
```

* name 값 변경 ("자바피자")

---

### (5)

```java
double area = pizza.getArea();
```

* getArea() 메소드 실행
* 계산식:

```java
return 3.14 * radius * radius;
```

* 결과:

```java
area = 314.0
```

---

## 자바 클래스 구성
클래스
class 키워드로 선언
멤버:클래스 구성 요소.필드(멤버 변수)와 메소드(멤버 함수)
클래스에 대한 public 접근 지엉: 다른 모든 클래스에서 클래스 사용허락

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

## 절차 지향 프로그래밍과 객체 지향 프로그래밍
# 절차 지향 프로그래밍
작업 순서를 표현 하는 컴퓨터 명령 집합
함수들이 집합으로 프로그램 작성

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

## 자바의 객체: 다형성
다형성
같은 이름의 메소드가 클래스 혹은 객체에 따라 다르게 구현 되는것
다형성 사례
메소드 오버로딩:한 클래스 내에서 같은 이름이지만 다르게 작동하는 여러 메소드
메소드 오버라이딩:슈퍼 클래스의 메소드를 동일한 이름으로 서브 클래스 마다 다르게 구현 

## 자바의 상속
# 자바의 상속
상위 클래스의 멤버를 하위 클래스가 물려 받음
상위 클래스:슈퍼 클래스
하위 클래스:서브 클래스,수퍼 글래스 코드의 재사용, 새로운 특성 추가 가능

## 자바의 개개체 지향 특성:상속
# 상속
상위 객체의 속성이 하위 객체에 물려 줌
하위 객체가 상위 객체의 속성을 모두 가지는 관계
# 실세계 상속 사례
나무는 식물의 속성과 생물의 속성을 모두 가짐
사람은 생물의 속성은 가지지만 식물으 속성은 가지고 있지 않음

## 자바의 객체 지향 특성:캡슐화
캡슐화:객체를 캡슐로 싸서 내부를 볼수 없게 하는것
객체의 가장 본질적인 특징
외부의 접근으로부터 객체 보호

자바의 캡슐화
클래스(class):객체 모야을 선언한 틀(캡슐화 하는 툴)
객체:생성된 실체:클래스 내에 메스드와 필드 구현

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
````

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

### 2차원 배열의 초기화

* 배열 선언과 동시에 초기화

```java
int intArray[][] = {
    {0, 1, 2},
    {3, 4, 5},
    {6, 7, 8}
}; // 3x3 배열 생성
```

```java
char charArray[][] = {
    {'a', 'b', 'c'},
    {'d', 'e', 'f'}
}; // 2x3 배열 생성
```

```java
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

#### ● 2차원 배열의 length 필드

* `i.length` → 2차원 배열의 행의 개수 (2)
* `i[n].length` → n번째 행의 열의 개수
* `i[1].length` → 1번째 행의 열의 개수 (5)

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

### 함수 호출 시 배열 전달 비교 : C/C++ vs. 자바

* 자바가 C/C++에 비해 배열을 다루기 10배 편한 구조임.

---

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

#### 18. **비트 연산 (Bitwise Operations)**

* **비트 논리 연산**: `AND`, `OR`, `XOR`, `NOT`
* **비트 시프트 연산**: 비트를 왼쪽이나 오른쪽으로 이동

```java
int x = 5;
int result = x << 1;  // 5 * 2 = 10
```

* **비트 마스크**: 권한 설정 등에 사용

````java
int permissions = 1 | 2;  // 읽기, 쓰기 권한

### 17. **자바 배열**

* 같은 타입의 데이터들이 순차적으로 저장되는 자료 구조

```java
int[] numbers = {1, 2, 3, 4, 5};
````

* 배열 선언 및 생성:

```java
int[] numbers = new int[10];  // 10개의 정수 배열 생성
```

* **배열 인덱스**: 0부터 시작

## 16. **continue와 break 문**

* **continue**: 현재 반복을 건너뛰고 다음 반복으로 진행

````java
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
````

### 15. **중첩 반복문 (Nested Loops)**

* 두 개 이상의 반복문을 중첩하여 사용

```java
for(int i = 1; i <= 9; i++) {
    for(int j = 1; j <= 9; j++) {
        System.out.print(i + "x" + j + "=" + (i * j) + "\t");
    }
    System.out.println();
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

````

#### 12. **비교 연산자 및 논리 연산자**

* **비교 연산자**:

  * `<`, `>`, `<=`, `>=`, `==`, `!=`

* **논리 연산자**:

  * `!`, `&&`, `||`, `^`

#### 11. **메모리 구조**

* **힙 (Heap)**: 프로그래머가 직접 관리하는 메모리 공간
* **스택 (Stack)**: 함수 호출 시 자동으로 사용하는 메모리

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

#### 8. **Java의 데이터 타입**

* **기본 타입**: `boolean`, `char`, `byte`, `short`, `int`, `long`, `float`, `double`
* **레퍼런스 타입**: 클래스, 인터페이스, 배열

#### 7. **식별자 (Identifiers) 명명 규칙**

* 특수 문자 사용 불가 (`@`, `#`, `!` 등)
* 키워드 사용 불가 (`true`, `false`, `null`)
* 숫자로 시작할 수 없음

#### 6. **JDK와 JRE**

* **JDK**: 자바 애플리케이션을 개발할 때 필요한 도구들
* **JRE**: 자바 애플리케이션 실행에 필요한 라이브러리와 JVM

#### 5. **Java의 응용 프로그램 실행 환경**

* **JDK (Java Development Kit)**: 개발 도구 제공
* **JRE (Java Runtime Environment)**: 실행 환경 제공

#### 4. **컴파일 과정**

* **자바**: `.java` → `.class` (바이트 코드)
* **C**: `.c` → `.obj` → `.exe`
* **C++**: `.cpp` → `.obj` → `.exe`

#### 3. **Java의 특징**

* **플랫폼 독립성 (WORA)**: Java 코드는 한 번 작성되면 다양한 플랫폼에서 실행 가능
* **바이트 코드**: Java는 소스 코드를 바이트 코드로 컴파일하여      JVM에서 실행
* **JVM**: Java Virtual Machine이 바이트 코드를 해석하고 실행

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

#### 1. **기계어, 어셈블리어, 고급언어**

* **기계어**: 컴퓨터의 CPU가 이해하는 이진수 기반의 언어
* **어셈블리어**: 기계어의 명령어를 사람이 이해할 수 있도록 표현한 언어
* **고급언어**: 사람이 쉽게 이해할 수 있도록 고안된 언어 (예: C,Java)
                                                                                   
