import java.awt.*;
import javax.swing.*;

// 파일 이름이 EX16.java이므로 클래스 이름을 EX16으로 수정했습니다.
public class EX16 extends JFrame {
    public EX16() {
        super("GridLayout 예제"); // 프레임 타이틀 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 동작 설정
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기

        // 1x10의 GridLayout 배치관리자 설정 (1행 10열)
        contentPane.setLayout(new GridLayout(1, 10));

        for (int i = 0; i < 10; i++) { // 10개의 버튼 부착
            String text = Integer.toString(i); // i를 문자열로 변환
            JButton button = new JButton(text); // 버튼 생성
            add(button); // 컨텐트팬에 버튼 부착
        }

        setSize(500, 200); // 프레임 크기 500x200 설정
        setVisible(true); // 프레임을 화면에 출력
    }

    public static void main(String[] args) {
        // 수정된 클래스 이름인 EX16으로 객체 생성
        new EX16();
    }
}