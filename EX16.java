import javax.swing.*;
import java.awt.*;

// 파일 이름이 EX16.java이므로 클래스명도 반드시 EX16이어야 합니다.
public class EX16 extends JFrame {
    public EX16() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane = getContentPane(); 

        // FlowLayout: 왼쪽 정렬, 수평 간격 30, 수직 간격 40 설정
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));

        // 버튼 컴포넌트 추가
        contentPane.add(new JButton("add"));
        contentPane.add(new JButton("sub"));
        contentPane.add(new JButton("mul"));
        contentPane.add(new JButton("div"));
        contentPane.add(new JButton("Calculate"));

        setSize(300, 200); 
        setVisible(true);  
    }

    public static void main(String[] args) {
        // 클래스명과 동일하게 호출
        new EX16(); 
    }
}