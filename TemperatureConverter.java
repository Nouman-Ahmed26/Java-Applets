import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Font;

class TemperatureConverter
{
    // Declare the GUI Elements
    public static JFrame frmMain;
    public static JLabel lblCelsius;
    public static JTextField textCelsius;
    public static JLabel lblFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton btnCalculateCtoF;
    public static JButton btnCalculateFtoC;
    
    public static void main(String[] args)
    {
        // Set up the frame

        frmMain = new JFrame("Temperature Converter by Nouman Ahmed 160921750008");
        frmMain.setSize(700,500);
        frmMain.setLayout(new FlowLayout(FlowLayout.CENTER,30,20));
        frmMain.getContentPane().setBackground(Color.BLACK);
        frmMain.pack();
        frmMain.setVisible(true);



        


    
        // Create GUI Elements
        lblCelsius = new JLabel("Celsius");
        lblCelsius.setText("Celsius");
        Font f1=new Font("Celsius",Font.PLAIN,20);
        lblCelsius.setFont(f1);
        lblCelsius.setForeground (Color.cyan);
        textCelsius = new JTextField(10);
        lblFahrenheit = new JLabel("Fahrenheit");
        lblFahrenheit.setText("Fahrenheit");
        Font f2=new Font("Fahrenheit",Font.PLAIN,20);
        lblFahrenheit.setFont(f2);
        lblFahrenheit.setForeground (Color.cyan);
        textFahrenheit = new JTextField(10);
        btnCalculateCtoF = new JButton("Convert Celsius to Fahrenheit");



        // Add ActionListener
        btnCalculateCtoF.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert C to F
                    String cText = textCelsius.getText();
                    double c = Double.parseDouble(cText);
                    double f = (c * 9 / 5) + 32;
                    textFahrenheit.setText(String.valueOf(f));
                }
            }
        );
        
        btnCalculateFtoC = new JButton("Convert Fahrenheit to Celsius");
        // Add ActionListener
        btnCalculateFtoC.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    // Convert F to C
                    String fText = textFahrenheit.getText();
                    double f = Double.parseDouble(fText);
                    double c = (f - 32) * 5 / 9;
                    textCelsius.setText(String.valueOf(c)); 
                }
            }
        );
    
        // Add the GUI Elements to the frame
        frmMain.add(lblCelsius);
        frmMain.add(textCelsius);
        frmMain.add(lblFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(btnCalculateCtoF);
        frmMain.add(btnCalculateFtoC);
        
        // Make the frame visible
        frmMain.setVisible(true);
    }
}