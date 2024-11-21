import java.awt.EventQueue;
import java.sql.*;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DanielsGuiForm {

	private JFrame frame;
	private JTextField tf_id;
	private JTextField tf_first;
	private JTextField tf_last;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws Exception{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanielsGuiForm window = new DanielsGuiForm();
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
	public DanielsGuiForm() throws Exception{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() throws Exception{
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Scanner scanner = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/tbl_authors","root","");
		PreparedStatement statement=con.prepareStatement(
				"Select * from tbl_authors");
		
		JLabel lbl_authors = new JLabel("Authors");
		lbl_authors.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_authors.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_authors.setBounds(148, 11, 104, 38);
		frame.getContentPane().add(lbl_authors);
		
		JLabel lbl_id = new JLabel("Author ID");
		lbl_id.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_id.setBounds(44, 47, 90, 20);
		frame.getContentPane().add(lbl_id);
		
		JLabel lbl_first = new JLabel("First Name");
		lbl_first.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_first.setBounds(44, 78, 90, 20);
		frame.getContentPane().add(lbl_first);
		
		JLabel lbl_last = new JLabel("Last Name");
		lbl_last.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl_last.setBounds(44, 109, 90, 20);
		frame.getContentPane().add(lbl_last);
		
		tf_id = new JTextField();
		tf_id.setBounds(143, 49, 184, 20);
		frame.getContentPane().add(tf_id);
		tf_id.setColumns(10);
		
		tf_first = new JTextField();
		tf_first.setColumns(10);
		tf_first.setBounds(143, 80, 184, 20);
		frame.getContentPane().add(tf_first);
		
		tf_last = new JTextField();
		tf_last.setColumns(10);
		tf_last.setBounds(143, 111, 184, 20);
		frame.getContentPane().add(tf_last);
		
		JTextPane tp_table = new JTextPane();
		tp_table.setBounds(27, 200, 384, 61);
		frame.getContentPane().add(tp_table);
		
		JButton btn_submit = new JButton("Submit");
		btn_submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn_submit.setBounds(143, 142, 104, 30);
		frame.getContentPane().add(btn_submit);
		btn_submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e){
					
			}
		});
		
		
	}
}
