import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main extends JFrame {
    private JTextField textField;

    public Main() {
        super("Соединение заданий");
        createGUI();
    }

    public void createGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ActionListener actionListener = new TestActionListener();
        JButton button1 = new JButton("Задание 1");
        button1.setActionCommand("https://github.com/maxraywork/Luchikhin/tree/master/src/task1");
        panel.add(button1);
        button1.addActionListener(actionListener);
        JButton button2 = new JButton("Задание 2");
        button2.setActionCommand("https://github.com/maxraywork/Luchikhin/tree/master/src/task2");
        panel.add(button2);
        button2.addActionListener(actionListener);
        JButton button3 = new JButton("Задание 3");
        button3.setActionCommand("https://github.com/maxraywork/Luchikhin/tree/master/src/task3");
        panel.add(button3);
        button3.addActionListener(actionListener);
        JButton button4 = new JButton("Задание 4");
        button4.setActionCommand("https://github.com/maxraywork/Luchikhin/tree/master/src/task4");
        panel.add(button4);
        button4.addActionListener(actionListener);
        JButton button5 = new JButton("Задание 5");
        button5.setActionCommand("https://github.com/maxraywork/Luchikhin/tree/master/src/task5");
        panel.add(button5);
        button5.addActionListener(actionListener);
        JButton button6 = new JButton("Задание 6");
        button6.setActionCommand("");
        panel.add(button6);
        button6.addActionListener(actionListener);
        JButton button7 = new JButton("Задание 7");
        button7.setActionCommand("");
        panel.add(button7);
        button7.addActionListener(actionListener);
        JButton button8 = new JButton("Задание 8");
        button8.setActionCommand("");
        panel.add(button8);
        button8.addActionListener(actionListener);
        JButton button9 = new JButton("Задание 9");
        button9.setActionCommand("");
        panel.add(button9);
        button9.addActionListener(actionListener);
        getContentPane().add(panel);
        setPreferredSize(new Dimension(400, 300));
    }

    public class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Desktop.getDesktop().browse(new URL(e.getActionCommand()).toURI());
            } catch (Exception ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                Main frame = new Main();
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
