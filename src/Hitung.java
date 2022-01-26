import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hitung {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton button1;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hitung");
        frame.setContentPane(new Hitung().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Hitung() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a,b,t,hasil;
                a = Integer.parseInt(textField1.getText());
                b = Integer.parseInt(textField2.getText());
                t = Integer.parseInt(textField3.getText());
                hasil=(a+b)*t/2;
                textField4.setText(Integer.toString(hasil));

            }
        });
    }
}
