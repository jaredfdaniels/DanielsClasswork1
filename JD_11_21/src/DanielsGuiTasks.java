import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DanielsGuiTasks {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanielsGuiTasks window = new DanielsGuiTasks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DanielsGuiTasks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea ta_result = new JTextArea();
		ta_result.setBounds(33, 106, 175, 108);
		frame.getContentPane().add(ta_result);	
		
		JComboBox cmb_1 = new JComboBox();
		cmb_1.setBounds(267, 34, 126, 22);
		frame.getContentPane().add(cmb_1);
		
		JComboBox cmb_2 = new JComboBox();
		cmb_2.setBounds(267, 84, 126, 22);
		frame.getContentPane().add(cmb_2);
		
		JButton btn_click_me = new JButton("Click me!");
		btn_click_me.setBounds(33, 34, 89, 23);
		frame.getContentPane().add(btn_click_me);
		btn_click_me.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] pres = {"George Washington","Abraham Lincoln","Joe Biden"};
				cmb_1.setModel(new DefaultComboBoxModel(pres));
			}
		});
	}
}
