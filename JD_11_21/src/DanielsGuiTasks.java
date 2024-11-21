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
		ta_result.setBounds(46, 129, 347, 108);
		frame.getContentPane().add(ta_result);	
		
		JComboBox cmb_1 = new JComboBox();
		cmb_1.setBounds(251, 34, 142, 22);
		frame.getContentPane().add(cmb_1);
		
		JComboBox cmb_2 = new JComboBox();
		cmb_2.setBounds(331, 82, 62, 22);
		frame.getContentPane().add(cmb_2);
		
		JButton btn_click_me = new JButton("Click me!");
		btn_click_me.setFont(btn_click_me.getFont().deriveFont(20f));
		btn_click_me.setBounds(46, 34, 194, 84);
		frame.getContentPane().add(btn_click_me);
		btn_click_me.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String [] pres = {"George Washington","Abraham Lincoln","Joe Biden"};
				cmb_1.setModel(new DefaultComboBoxModel(pres));
				String [] pres_2 = {"George Washington, 1800","Abraham Lincoln, 1900","Joe Biden, 2000"};
				cmb_2.setModel(new DefaultComboBoxModel(pres_2));
				String[] pres_3 = new String [pres_2.length];
				for (int i=0;i<pres_2.length;i++) {
					pres_3[i] = pres_2[i].split(",")[1];
				}
				cmb_2.setModel(new DefaultComboBoxModel(pres_3));
				StringBuilder sb = new StringBuilder();
				for (String item:pres_2) {
					sb.append(item).append("\n");
				}
				ta_result.setText(sb.toString());
			}
		});
	}
}
