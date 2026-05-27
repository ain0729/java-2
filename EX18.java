import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX18 extends JFrame {

    // "Hello" 레이블 생성
    private JLabel la = new JLabel("Hello");

    // 생성자
    public EX18() {

        // 프레임 제목 설정
        setTitle("Mouse 이벤트 예제");

        // 종료 버튼 클릭 시 프로그램 종료
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트팬 가져오기
        Container c = getContentPane();

        // 절대 위치 사용
        c.setLayout(null);

        // 마우스 리스너 등록
        c.addMouseListener(new MyMouseAdapter());

        // 레이블 크기 설정
        la.setSize(50, 20);

        // 레이블 초기 위치 설정
        la.setLocation(30, 30);

        // 컨텐트팬에 레이블 추가
        c.add(la);

        // 프레임 크기 설정
        setSize(300, 300);

        // 화면 출력
        setVisible(true);
    }

    // MouseAdapter 내부 클래스
    class MyMouseAdapter extends MouseAdapter {

        @Override
        public void mousePressed(MouseEvent e) {

            // 마우스 클릭 위치 가져오기
            int x = e.getX();
            int y = e.getY();

            // 레이블 이동
            la.setLocation(x, y);
        }
    }

    // 메인 메소드
    public static void main(String[] args) {

        new EX18();
    }
}