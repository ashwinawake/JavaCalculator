import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private int ADD = 1;
    private int SUBTRACT = 2;
    private int MULTIPLY = 3;
    private int DIVIDE = 4;
    private int calculation;
    private JPanel JavaCalculator;
    private JTextField textDisplay;
    private JButton btnEqual;
    private JButton btnMultiply;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnPlus;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMinus;
    private JButton btnDivide;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnZero;

    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    String btnOneText = textDisplay.getText() + btnOne.getText();
                    textDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnPointText = textDisplay.getText() + btnPoint.getText();
                textDisplay.setText(btnPointText);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setText();
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(textDisplay.getText());
                setText();
                calculation = ADD;

            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textDisplay.getText()) - total1;
                setText();
                calculation = SUBTRACT;
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textDisplay.getText());
                setText();
                calculation = MULTIPLY;
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textDisplay.getText());
                setText();
                calculation = DIVIDE;
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(calculation == ADD) {
                    total2 = total1 + Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(Double.toString(total2));
                    calculation = 0;
                } else if(calculation == SUBTRACT) {
                    total2 =  total1 - Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(Double.toString(total2));
                    calculation = 0;
                } else if(calculation == MULTIPLY) {
                    total2 = total1 * Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(Double.toString(total2));
                    calculation = 0;
                } else if(calculation == DIVIDE) {
                    total2 = total1 / Double.parseDouble(textDisplay.getText());
                    textDisplay.setText(Double.toString(total2));
                    calculation = 0;
                }
                total1 = 0.0;
                total2 = 0.0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 900);
        frame.pack();
        frame.setVisible(true);
    }

    public void setText(){
        textDisplay.setText("");
    }
}
