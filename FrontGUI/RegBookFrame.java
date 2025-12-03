package FrontGUI;

import javax.swing.*;
/**
 * ResisterFrame 클래스의 설명을 작성하세요.
 *
 * @author (작성자 이름)
 * @version (버전 번호 또는 작성한 날짜)
 */
public class RegBookFrame extends JFrame
{
    public RegBookFrame(){
        this.setTitle("도서관 관리 시스템");
        this.setSize(297, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.add(new RegBookPanel());
    }
}