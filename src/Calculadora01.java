import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora01 {

	private JFrame 			janela 	  	= new JFrame("Calculadora");
	private JPanel 			pnlDisplay 	= new JPanel();
	private JPanel 			pnlButtons 	= new JPanel();
	private JTextField 	display 		= new  JTextField();
	private JButton 		btn0 	 			= new JButton("0");
	private JButton 		btn1 	 			= new JButton("1");
	private JButton 		btn2 	 			= new JButton("2");
	private JButton 		btn3 	 			= new JButton("3");
	private JButton 		btn4 	 			= new JButton("4");
	private JButton 		btn5 	 			= new JButton("5");
	private JButton 		btn6 	 			= new JButton("6");
	private JButton 		btn7 	 			= new JButton("7");
	private JButton 		btn8 	 			= new JButton("8");
	private JButton 		btn9 	 			= new JButton("9");
	private JButton 		btnSoma  		= new JButton("+");
	private JButton 		btnSubtr 		= new JButton("-");
	private JButton 		btnMulti 		= new JButton("*");
	private JButton 		btnDiv   		= new JButton("/");
	private JButton 		btnPonto 		= new JButton(".");
	private JButton 		btnIgual 		= new JButton("=");
	private	int opCache, result, op = 0;
	private String numStr = "0";

	
	public Calculadora01() {
		this.janela.setBounds(200, 200, 400, 600);
		this.janela.setLayout(null);
		this.pnlDisplay.setBounds(
				0, 0, 
				this.janela.getWidth(),  
				(int) (this.janela.getHeight()*0.15) 
			);
		this.pnlDisplay.setBackground(Color.BLUE);
		this.pnlDisplay.setLayout(null);
		this.display.setBounds(
				0, 0, 
				this.pnlDisplay.getWidth(), 
				this.pnlDisplay.getHeight()
			);
		
		Font defaultFont = new Font("Courier New", Font.BOLD , 48);
		this.display.setFont(defaultFont);
		
		this.display.setEditable(false);
		this.display.setHorizontalAlignment( JTextField.RIGHT );
		
		this.pnlDisplay.add(this.display);
		this.janela.add( this.pnlDisplay );
		this.pnlButtons.setBounds(
				0, 
				(int) (this.janela.getHeight()*0.15), 
				this.janela.getWidth(), 
				(int) (this.janela.getHeight()*0.75)  
			);
		
		this.btn0.setFont(defaultFont);
		this.btn1.setFont(defaultFont);
		this.btn2.setFont(defaultFont);
		this.btn3.setFont(defaultFont);
		this.btn4.setFont(defaultFont);
		this.btn5.setFont(defaultFont);
		this.btn6.setFont(defaultFont);
		this.btn7.setFont(defaultFont);
		this.btn8.setFont(defaultFont);
		this.btn9.setFont(defaultFont);
		this.btnDiv.setFont(defaultFont);
		this.btnSoma.setFont(defaultFont);
		this.btnSubtr.setFont(defaultFont);
		this.btnMulti.setFont(defaultFont);
		this.btnPonto.setFont(defaultFont);
		this.btnIgual.setFont(defaultFont);

		
		this.pnlButtons.setBackground(Color.RED);
		this.pnlButtons.setLayout(new GridLayout(4,4));
		this.pnlButtons.add(btn7);
		this.pnlButtons.add(btn8);
		this.pnlButtons.add(btn9);
		this.pnlButtons.add(btnSoma);
		this.pnlButtons.add(btn4);
		this.pnlButtons.add(btn5);
		this.pnlButtons.add(btn6);
		this.pnlButtons.add(btnSubtr);
		this.pnlButtons.add(btn1);
		this.pnlButtons.add(btn2);
		this.pnlButtons.add(btn3);
		this.pnlButtons.add(btnMulti);
		this.pnlButtons.add(btn0);
		this.pnlButtons.add(btnPonto);
		this.pnlButtons.add(btnIgual);
		this.pnlButtons.add(btnDiv);


		
		this.btn0.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
			}
		});
		this.btn1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
				System.out.println(numStr);

				display.setText( display.getText() + label );
			}
		});
		this.btn5.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn6.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn7.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn8.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		this.btn9.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(opCache != 0){
					opCache = 0;
					display.setText("0");
				}
				String label = ((JButton) e.getSource()).getText();
				numStr += ((JButton) e.getSource()).getText();
								System.out.println(numStr);
				display.setText( display.getText() + label );
			}
		});
		
		this.btnPonto.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				display.setText( "0");
			}
		});

		this.btnSubtr.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				result = Integer.parseInt(numStr);
				numStr = "0";
				op = 2;
				opCache = op;
				display.setText( display.getText() + label );
			}
		});

		this.btnMulti.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				result = Integer.parseInt(numStr);
				numStr = "0";
				op = 3;
				opCache = op;
				display.setText( display.getText() + label );
			}
		});

		this.btnSoma.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				result = Integer.parseInt(numStr);
				numStr = "0";
				op = 1;
				opCache = op;	
				display.setText( display.getText() + label );
			}
		});

		this.btnDiv.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				result = Integer.parseInt(numStr);
				numStr = "0";
				op = 4;
				opCache = op;
				display.setText( display.getText() + label );
			}
		});

		this.btnIgual.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch (op) {
					case 1:
						result += Integer.parseInt(numStr);
						break;
					case 2:
						result -= Integer.parseInt(numStr);
						break;
					case 3:
						result *= Integer.parseInt(numStr);
						break;
					case 4:
						result /= Integer.parseInt(numStr);
						break;
					default:
						break;
				}
				String label = Integer.toString(result);
				opCache = op;
				numStr = "";
				display.setText(label );
			}
		});

		this.janela.add( this.pnlButtons );
		this.janela.setVisible(true);
	}
}
