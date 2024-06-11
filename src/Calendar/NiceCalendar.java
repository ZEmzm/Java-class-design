package Calendar;
import java.awt.*;
public class NiceCalendar {
	public static void main(String[] args) {
	 NiceFrame NF = new NiceFrame(); // Window

     NF.setBounds(180, 100, 1200, 600); // 1200X600

     Image image = Toolkit.getDefaultToolkit().createImage("img\\logo.jpg");
     NF.setIconImage(image); // icon
     NF.setTitle("Nice Calendar"); // title
     NF.setVisible(true); // let the window visible
 };
}

