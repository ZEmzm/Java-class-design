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
    JLabel Label_Alarm = new JLabel("����: ��");
    JLabel Label_Remind = new JLabel("��������: (���ʱ���ȡ��ʾ)");
    JLabel Label_Tips = new JLabel("С��ʾ: (���ʱ���ȡ��ʾ)");

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
        S[0] = "С��ʾ: �������޺��޻�";
        S[1] = "С��ʾ: �� ����/����/����";
        S[2] = "С��ʾ: �� ����/����/��/�ι�";
        S[3] = "С��ʾ: �� ��Ȣ/����/��լ";
        S[4] = "С��ʾ: �� ����/����/����";
        S[5] = "С��ʾ: �� ����/��/����";
        S[6] = "С��ʾ: �� ���/��Ȣ/����";
        S[7] = "С��ʾ: �� ����/����/����";
        S[8] = "С��ʾ: �� ����/ի��/����";
        S[9] = "С��ʾ: ����������Ը";

        return S[i];
    }

    void getRemind(int num) {
        switch (num) {
            case 11:
                Label_Remind.setText("��������: Ԫ������");
                break;
            case 214:
                Label_Remind.setText("��������: ���˽�Ŷ��");
                break;
            case 38:
                Label_Remind.setText("��������: ��Ů��");
                break;
            case 41:
                Label_Remind.setText("��������: ���˽�");
                break;
            case 422:
                Label_Remind.setText("��������: ������");
                break;
            case 51:
                Label_Remind.setText("��������: �Ͷ���");
                break;
            case 54:
                Label_Remind.setText("��������: �����");
                break;
            case 57:
                Label_Remind.setText("��������: ��");
                break;
            case 61:
                Label_Remind.setText("��������: ��ͯ��");
                break;
            case 71:
                Label_Remind.setText("��������: ������");
                break;
            case 81:
                Label_Remind.setText("��������: ������");
                break;
            case 96:
                Label_Remind.setText("��������: ��");
                break;
            case 910:
                Label_Remind.setText("��������: ��ʦ��");
                break;
            case 101:
                Label_Remind.setText("��������: �����");
                break;
            case 1128:
                Label_Remind.setText("��������: �ж���");
                break;
            case 1224:
                Label_Remind.setText("��������: ƽ��ҹ");
                break;
            case 1225:
                Label_Remind.setText("��������: ʥ����");
                break;
            default:
                Label_Remind.setText("��������: ��");
        }
    }
}
