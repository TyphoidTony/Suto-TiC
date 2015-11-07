import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class calc extends JFrame {

    private JButton nOne;
    private JButton nTwo;
    private JButton nThree;
    private JButton nFour;
    private JButton nFive;
    private JButton nSix;
    private JButton nSeven;
    private JButton nEight;
    private JButton nNine;
    private JButton nZero;
    private JButton plus;
    private JButton product;
    private JButton clear;
    private JButton enter;
    private JTextField nView;
    private String operation;
    private ArrayList<Double> nList = new ArrayList<Double>();
    private String accu="";//num is sent to accu once an operation is pressed.
    private String num = "";


    public calc(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Suto-calc");
        setSize(100, 100);
        setResizable(false);
        setVisible(true);
        setLayout(new GridLayout(0, 3));
        add(bOne());
        add(bTwo());
        add(bThree());
        add(bFour());
        add(bFive());
        add(bSix());
        add(bSeven());
        add(bEight());
        add(bNine());
        add(bZero());
        add(bEnter());
        add(bSum());
        add(bProduct());
        add(bClear());
        add(field(),BorderLayout.NORTH);
        pack();
    }

    public JPanel bOne() {
        JPanel panel = new JPanel();
        nOne = new JButton(" 1 ");
        nOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("1");
                nList.add(1.0);
            }
        });
        panel.add(nOne);

        return panel;

    }

    public JPanel bTwo() {
        JPanel panel = new JPanel();
        nTwo = new JButton(" 2 ");
        nTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("2");
                setNum("2");
            }
        });
        panel.add(nTwo);
        return panel;
    }

    public JPanel bThree() {
        JPanel panel = new JPanel();
        nThree = new JButton(" 3 ");
        nThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("3");
                setNum("3");
            }
        });
        panel.add(nThree);
        return panel;
    }

    public JPanel bFour() {
        JPanel panel = new JPanel();
        nFour = new JButton(" 4 ");
        nFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("4");
                setNum("4");
            }
        });
        panel.add(nFour);

        return panel;
    }

    public JPanel bFive() {
        JPanel panel = new JPanel();
        nFive = new JButton(" 5 ");
        nFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("5");
                setNum("5");
            }
        });
        panel.add(nFive);
        return panel;
    }

    public JPanel bSix() {
        JPanel panel = new JPanel();
        nSix = new JButton(" 6 ");
        nSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("6");
                setNum("6");

            }
        });
        panel.add(nSix);
        return panel;
    }

    public JPanel bSeven() {
        JPanel panel = new JPanel();
        nSeven = new JButton(" 7 ");
        nSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("7");
                setNum("7");
            }
        });
        panel.add(nSeven);
        return panel;
    }

    public JPanel bEight() {
        JPanel panel = new JPanel();
        nEight = new JButton(" 8 ");
        nEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("8");
                setNum("8");
            }
        });
        panel.add(nEight);
        return panel;
    }

    public JPanel bNine() {
        JPanel panel = new JPanel();
        nNine = new JButton(" 9 ");
        nNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("9");
                setNum("9");
            }
        });
        panel.add(nNine);

        return panel;
    }

    public JPanel bZero() {
        JPanel panel = new JPanel();
        nZero = new JButton(" 0 ");
        nZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("0");
                setNum("0");
            }
        });
        panel.add(nZero);
        return panel;
    }

    public JPanel bSum() {
        JPanel panel = new JPanel();
        plus = new JButton(" Sum ");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation("+");
                setReg(getNum());
                deleteNum();
            }
        });
        panel.add(plus);
        return panel;
    }


    public JPanel bProduct() {
        JPanel panel = new JPanel();
        product = new JButton(" Product ");
        product.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setOperation("*");
                setReg(getNum());
                setNum("");
            }
        });
        panel.add(product);
        return panel;
    }
    //TODO fix, something not working with this method.
    public JPanel bEnter(){
        enter = new JButton("Enter");
        JPanel panel = new JPanel();
        panel.add(enter);
        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double g;
                if (getOperation().equals("+")) {
                    g = toDouble(getNum()) + toDouble(getReg());
                    nView.setText(""+g);
                } else {
                    nView.setText(getNum());//test case
                }
            }
        });
        return panel;
    }


    public JPanel bClear() {
        JPanel panel = new JPanel();
        clear = new JButton("clear");
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nView.setText("cleared");
                deleteNum();
            }
        });
        panel.add(clear);
        return panel;
    }

    public JPanel field() {
        JPanel panel = new JPanel();
        nView = new JTextField(5);
        nView.setEditable(false);
        panel.add(nView);
        return panel;
    }


    private double toDouble(String str){
        double num = 0;

        num = Double.parseDouble(str);

        return num;
    }


    private void setNum(String str){
      num =   num.concat(str);

    }

    private void deleteNum(){
        num = "";
    }

    private void deleteAccu(){
        accu = "";
    }

    private String getNum(){
        return num;
    }

    private String getReg() {
        return accu;
    }


    private void setOperation(String str){

        operation = str;
    }

    private String getOperation(){
        return operation;
    }

    private void setReg(String str) {
          accu = accu.concat(str);
    }



    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new calc();
            }
        });
    }


}



