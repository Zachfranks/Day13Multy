package CodeMain;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App {
    private JButton btn;
    private JTextArea txta;
    private JPanel PanelMain;

    String listnum = "";

    public App() {

        txta.setEditable(true);



        Random rng = new Random();
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int [][] array =  new int[6][4];


                for (int i = 0; i < 6; i++){

                    for (int j = 0; j < 4; j++){
                        array[i][j] = rng.nextInt(99+1 );
                        listnum = listnum + Integer.toString(array[i][j]);
                    }
                    listnum = listnum + "\n";

                }

                txta.setText(listnum);
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new App().PanelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
