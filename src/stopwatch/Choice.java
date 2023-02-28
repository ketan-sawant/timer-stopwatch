package stopwatch;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Choice implements ActionListener{
	JFrame frame = new JFrame();
	JButton timerButton = new JButton("TIMER");
	 JButton stopwatchButton = new JButton("STOPWATCH");

	Choice(){
//		JFrame frame = new JFrame();
//		JButton timerButton = new JButton("TIMER");
//		 JButton stopwatchButton = new JButton("STOPWATCH");

		
			
		
			 timerButton.setBounds(30,200,170,80);
			  timerButton.setFont(new Font("Ink Free",Font.PLAIN,20));
			  timerButton.setFocusable(false);
			  timerButton.addActionListener(this);
			  
			  stopwatchButton.setBounds(200,200,170,80);
			  stopwatchButton.setFont(new Font("Ink Free",Font.PLAIN,20));
			  stopwatchButton.setFocusable(false);
			  stopwatchButton.addActionListener(this);
			  
			  frame.add(timerButton);
			  frame.add(stopwatchButton);
			  
			  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			  frame.setSize(420,420);
			  frame.setLayout(null);
			  frame.setVisible(true);
			  
	}
				 
			
			
	   
		       
		
		
		@Override
		public void actionPerformed(ActionEvent a) {
			if (a.getSource()==timerButton) {
				CountDown_Timer c = new CountDown_Timer();
				
			}
			
			else if (a.getSource()== stopwatchButton) {
				stopwatch s = new stopwatch();
			       
			}
			
		}
	

	}

