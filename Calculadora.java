package id;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Calculadora {

	protected static JPanel panel = new JPanel ();
	protected static JPanel panel2 = new JPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Calculadora");
		frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.Y_AXIS));
		
		
	    JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("0");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("*");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton(".");
		JButton jb16 = new JButton("=");
		
		//PARTE SUPERIOR DE LA VENTANA
		panel.setLayout(new BorderLayout());
        panel.setLayout(new FlowLayout());
        JLabel texto = new JLabel("");
        panel.add(texto);

        
        //PARTE INFERIOR DE LA VENTANA
        panel2.setLayout(new GridLayout(4,5));
        panel2.add(jb1);
        panel2.add(jb2);
        panel2.add(jb3);
        panel2.add(jb14);
        panel2.add(jb4);
        panel2.add(jb5);
        panel2.add(jb6);
        panel2.add(jb13);
        panel2.add(jb7);
        panel2.add(jb8);
        panel2.add(jb9);
        panel2.add(jb12);
        panel2.add(jb10);
        panel2.add(jb15);
        panel2.add(jb16);
        panel2.add(jb11);
        frame.add(panel);
        frame.add(panel2);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        //ACCIONES AL PULSAR LOS BOTONES.  
        
        
        
        jb1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "1");
				
			}
		});
        jb2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "2");
			}
		});
        jb3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "3");
			}
		});
        jb4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "4");
			}
		});
        jb5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "5");
			}
		});
        jb6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "6");
			}
		});
        jb7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "7");
			}
		});
        jb8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "8");
			}
		});  
        jb9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "9");
			}
		});
        jb10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = texto.getText();
				texto.setText(aux + "0");
			}
		});  
        jb11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = jb11.getText();
				System.out.println("Has pulsado " + aux);
			}
		});  
        jb12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = jb12.getText();
				System.out.println("Has pulsado " + aux);
			}
		});  
        jb13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = jb13.getText();
				System.out.println("Has pulsado " + aux);
			}
		});  
        jb14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = jb14.getText();
				System.out.println("Has pulsado " + aux);
			}
		});
        jb15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = jb15.getText();
				System.out.println("Has pulsado " + aux);
			}
		});
        jb16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String aux = jb16.getText();
				System.out.println("Has pulsado " + aux);
			}
		});
	}

	
		
}
	
	


