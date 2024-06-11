package Calendar;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import java.util.Random;
public class NiceLabels extends JPanel {
	private static final long serialVersionUID = 1L;

    Color C = Color.WHITE;
    Random R = new Random();
    JLabel Label_Alarm = new JLabel("闹钟: 无");
    JLabel Label_Remind = new JLabel("今日提醒: (点击时间获取提示)");
    JLabel Label_Tips = new JLabel("小提示: (点击时间获取提示)");

    NiceLabels() {
        Label_Alarm.setFont(new Font("Arove", 1, 30));
        Label_Alarm.setForeground(Color.BLUE);

        Label_Remind.setFont(new Font("Arove", 1, 30));
        Label_Remind.setForeground(Color.BLUE);

        Label_Tips.setFont(new Font("Arove", 1, 30));
        Label_Tips.setForeground(Color.BLUE);

        setLayout(new GridLayout(3, 1));
        // setBackground(C);

        add(Label_Remind);
        add(Label_Tips);
        add(Label_Alarm);
    }

    String getTips() {
        int i = R.nextInt(10);
        String S[] = new String[10];
        S[0] = "小提示: 今日是无好无坏";
        S[1] = "小提示: 忌 饮酒/旅行/葬礼";
        S[2] = "小提示: 宜 旅游/购物/理发/参观";
        S[3] = "小提示: 宜 嫁娶/移徙/入宅";
        S[4] = "小提示: 忌 开市/交易/安床";
        S[5] = "小提示: 宜 祭祀/祈福/酬神";
        S[6] = "小提示: 宜 求财/嫁娶/移徙";
        S[7] = "小提示: 忌 赴任/出行/修造";
        S[8] = "小提示: 宜 求嗣/斋醮/出行";
        S[9] = "小提示: 万事以汝所愿";

        return S[i];
    }

    void getRemind(int num) {
        switch (num) {
            case 11:
                Label_Remind.setText("今日提醒: 元旦啦！");
                break;
            case 214:
                Label_Remind.setText("今日提醒: 情人节哦！");
                break;
            case 38:
                Label_Remind.setText("今日提醒: 妇女节");
                break;
            case 41:
                Label_Remind.setText("今日提醒: 愚人节");
                break;
            case 422:
                Label_Remind.setText("今日提醒: 地球日");
                break;
            case 51:
                Label_Remind.setText("今日提醒: 劳动节");
                break;
            case 54:
                Label_Remind.setText("今日提醒: 青年节");
                break;
            case 57:
                Label_Remind.setText("今日提醒: 无");
                break;
            case 61:
                Label_Remind.setText("今日提醒: 儿童节");
                break;
            case 71:
                Label_Remind.setText("今日提醒: 建党节");
                break;
            case 81:
                Label_Remind.setText("今日提醒: 建军节");
                break;
            case 96:
                Label_Remind.setText("今日提醒: 无");
                break;
            case 910:
                Label_Remind.setText("今日提醒: 教师节");
                break;
            case 101:
                Label_Remind.setText("今日提醒: 国庆节");
                break;
            case 1128:
                Label_Remind.setText("今日提醒: 感恩节");
                break;
            case 1224:
                Label_Remind.setText("今日提醒: 平安夜");
                break;
            case 1225:
                Label_Remind.setText("今日提醒: 圣诞节");
                break;
            default:
                Label_Remind.setText("今日提醒: 无");
        }
    }
}
