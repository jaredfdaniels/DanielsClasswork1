import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class DanielsAddBook {

	private JFrame frame;
	private JTextField txt_quantity;
	private JTextField txt_price;
	private JTextField txt_author;
	private JTextField txt_title;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DanielsAddBook window = new DanielsAddBook();
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
	public DanielsAddBook() {
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
		
		JLabel lbl_add_books = new JLabel("Add Books");
		lbl_add_books.setForeground(new Color(0, 0, 128));
		lbl_add_books.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lbl_add_books.setBounds(170, 11, 96, 34);
		frame.getContentPane().add(lbl_add_books);
		
		JLabel lbl_title = new JLabel("Title: ");
		lbl_title.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_title.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_title.setBounds(59, 65, 76, 14);
		frame.getContentPane().add(lbl_title);
		
		JLabel lbl_author = new JLabel("Author: ");
		lbl_author.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_author.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_author.setBounds(59, 90, 76, 14);
		frame.getContentPane().add(lbl_author);
		
		JLabel lbl_price = new JLabel("Price: ");
		lbl_price.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_price.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_price.setBounds(59, 115, 76, 14);
		frame.getContentPane().add(lbl_price);
		
		JLabel lbl_quantity = new JLabel("Quantity: ");
		lbl_quantity.setHorizontalAlignment(SwingConstants.TRAILING);
		lbl_quantity.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_quantity.setBounds(59, 140, 76, 14);
		frame.getContentPane().add(lbl_quantity);
		
		txt_quantity = new JTextField();
		txt_quantity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_quantity.setForeground(Color.DARK_GRAY);
		txt_quantity.setBounds(137, 139, 175, 20);
		frame.getContentPane().add(txt_quantity);
		txt_quantity.setColumns(10);
		
		txt_price = new JTextField();
		txt_price.setForeground(Color.DARK_GRAY);
		txt_price.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_price.setColumns(10);
		txt_price.setBounds(137, 114, 175, 20);
		frame.getContentPane().add(txt_price);
		
		txt_author = new JTextField();
		txt_author.setForeground(Color.DARK_GRAY);
		txt_author.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_author.setColumns(10);
		txt_author.setBounds(137, 90, 175, 20);
		frame.getContentPane().add(txt_author);
		
		txt_title = new JTextField();
		txt_title.setForeground(Color.DARK_GRAY);
		txt_title.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txt_title.setColumns(10);
		txt_title.setBounds(137, 64, 175, 20);
		frame.getContentPane().add(txt_title);
		
		JTextArea ta_added = new JTextArea();
		ta_added.setRows(3);
		ta_added.setColumns(2);
		ta_added.setFont(new Font("Monospaced", Font.PLAIN, 10));
		ta_added.setBounds(59, 209, 318, 43);
		frame.getContentPane().add(ta_added);
		
		JButton btn_add_book = new JButton("Add Book");
		btn_add_book.setForeground(new Color(0, 0, 64));
		btn_add_book.setBackground(new Color(192, 192, 192));
		btn_add_book.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btn_add_book.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String title = txt_title.getText();
				if (title.isEmpty()) title = "";
				String author = txt_author.getText();
				if (author.isEmpty()) author = "";
				String price = txt_price.getText();
				if (price.isEmpty()) price = "";
				String quantity = txt_quantity.getText();
				if (quantity.isEmpty()) quantity = "";
				DanielsBook mybook = new DanielsBook(title, author, price, quantity);
				System.out.println("The book has been added.\n" + mybook);
				ta_added.setText("" + mybook);
			}
		});
		btn_add_book.setBounds(170, 170, 96, 28);
		frame.getContentPane().add(btn_add_book);
		
	}
}
