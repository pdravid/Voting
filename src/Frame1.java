import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JLabel;


public class Frame1 {

	private JFrame frmElec;
	private JTextField textField;
	private JLabel lblWelcome;
	private JTextField aadhar;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField output;

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frmElec.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Frame1() {
		initialize();
	}
	
	
	private void initialize() {
		frmElec = new JFrame();
		frmElec.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 13));
		frmElec.setBounds(100, 100, 845, 708);
		frmElec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmElec.getContentPane().setLayout(null);
		
		lblWelcome = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/header.jpg")).getImage();
		lblWelcome.setIcon(new ImageIcon(img));
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblWelcome.setBounds(0, 0, 855, 244);
		frmElec.getContentPane().add(lblWelcome);
		
		JLabel lblWelcome_1 = new JLabel("--------------------WELCOME--------------------");
		lblWelcome_1.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblWelcome_1.setBounds(49, 243, 816, 50);
		frmElec.getContentPane().add(lblWelcome_1);
		
		JLabel lblEnterDetails = new JLabel("Enter Details");
		lblEnterDetails.setFont(new Font("Times New Roman", Font.BOLD, 37));
		lblEnterDetails.setBounds(307, 291, 314, 50);
		frmElec.getContentPane().add(lblEnterDetails);
		
		JLabel aadharlabel = new JLabel("AADHAR CARD Number  :-");
		aadharlabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		aadharlabel.setBounds(73, 337, 521, 50);
		frmElec.getContentPane().add(aadharlabel);
		
		aadhar = new JTextField();
		aadhar.setBounds(403, 352, 344, 25);
		frmElec.getContentPane().add(aadhar);
		aadhar.setColumns(10);
		
		JLabel lblE = new JLabel("Email Address :-");
		lblE.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblE.setBounds(117, 372, 200, 50);
		frmElec.getContentPane().add(lblE);
		
		textField_2 = new JTextField();
		textField_2.setBounds(338, 388, 380, 25);
		frmElec.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEnter = new JLabel("Enter Verification Code :-");
		lblEnter.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblEnter.setBounds(94, 412, 411, 50);
		frmElec.getContentPane().add(lblEnter);
		
		textField_3 = new JTextField();
		textField_3.setText("");
		textField_3.setBounds(403, 424, 200, 25);
		frmElec.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCandidatesForElection = new JLabel("Candidates for Election :");
		lblCandidatesForElection.setFont(new Font("Times New Roman", Font.BOLD, 37));
		lblCandidatesForElection.setBounds(118, 460, 411, 50);
		frmElec.getContentPane().add(lblCandidatesForElection);
		
		JButton congi = new JButton("Amar Chavan");
		congi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "Congragulations! Your vote has been saved successfully.");
				String ano=aadhar.getText();
				String n="Amar Chavan";
				output.setText(n);
				
				
				Statement statement = null;
				 Connection connection = null;
				 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  
				  
					//step2 create  the connection object  
					try {
						connection=DriverManager.getConnection(  
						"jdbc:oracle:thin:@localhost:1521:xe","system","it");

					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						statement = connection.createStatement();
						
						 String sql3 = "UPDATE election SET votes = nvl(votes,1) + 1  WHERE Name = 'Amar Chavan'";
						 PreparedStatement pstmt3 = connection.prepareStatement(sql3);
						 pstmt3.executeUpdate();
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		});
		congi.setFont(new Font("Times New Roman", Font.BOLD, 10));
		Image img1 = new ImageIcon(this.getClass().getResource("/congi.jpg")).getImage();
		congi.setIcon(new ImageIcon(img1));
		congi.setBounds(10, 509, 169, 83);
		frmElec.getContentPane().add(congi);
		
		JButton bjp = new JButton("Rina Mehta");
		bjp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Congragulations! Your vote has been saved successfully.");
				String ano=aadhar.getText();
				String n="Rina Mehta";
				output.setText(n);
				
				
				Statement statement = null;
				 Connection connection = null;
				 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}  
				  
					//step2 create  the connection object  
					try {
						connection=DriverManager.getConnection(  
						"jdbc:oracle:thin:@localhost:1521:xe","system","it");

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						statement = connection.createStatement();
						
						String sql3 = "UPDATE election SET votes = nvl(votes,1) + 1  WHERE Name = 'Rina Mehta'";
						 PreparedStatement pstmt3 = connection.prepareStatement(sql3);
						 pstmt3.executeUpdate();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		bjp.setFont(new Font("Times New Roman", Font.BOLD, 10));
		Image img2 = new ImageIcon(this.getClass().getResource("/bjp.jpg")).getImage();
		bjp.setIcon(new ImageIcon(img2));
		bjp.setBounds(189, 508, 169, 83);
		frmElec.getContentPane().add(bjp);
		
		JButton ncp = new JButton("Shivaji Deshmukh");
		ncp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Congragulations! Your vote has been saved successfully.");
				String ano=aadhar.getText();
				String n="Shivaji Deshmukh";
				output.setText(n);
				
				
				Statement statement = null;
				 Connection connection = null;
				 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}  
				  
					//step2 create  the connection object  
					try {
						connection=DriverManager.getConnection(  
						"jdbc:oracle:thin:@localhost:1521:xe","system","it");

					} catch (SQLException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
					try {
						statement = connection.createStatement();
						

						String sql3 = "UPDATE election SET votes = nvl(votes,1) + 1  WHERE Name = 'Shivaji Deshmukh'";
						 PreparedStatement pstmt3 = connection.prepareStatement(sql3);
						 pstmt3.executeUpdate();
						
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		Image img3 = new ImageIcon(this.getClass().getResource("/ncp.jpg")).getImage();
		ncp.setIcon(new ImageIcon(img3));
		ncp.setFont(new Font("Times New Roman", Font.BOLD, 10));
		ncp.setBounds(368, 508, 200, 83);
		frmElec.getContentPane().add(ncp);
		
		JButton shivesena = new JButton("Priyanka Bhosale");
		shivesena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Congragulations! Your vote has been saved successfully.");
				String ano=aadhar.getText();
				String n="Priyanka Bhosale";
				output.setText(n);
				
				
				Statement statement = null;
				 Connection connection = null;
				 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
				} catch (ClassNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}  
				  
					//step2 create  the connection object  
					try {
						connection=DriverManager.getConnection(  
						"jdbc:oracle:thin:@localhost:1521:xe","system","it");

					} catch (SQLException e3) {
						// TODO Auto-generated catch block
						e3.printStackTrace();
					}
					try {
						statement = connection.createStatement();
						

						String sql3 = "UPDATE election SET votes = nvl(votes,1) + 1  WHERE Name = 'Priyanka Bhosale'";
						 PreparedStatement pstmt3 = connection.prepareStatement(sql3);
						 pstmt3.executeUpdate();
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		Image img4 = new ImageIcon(this.getClass().getResource("/shivsena.jpg")).getImage();
		shivesena.setIcon(new ImageIcon(img4));
		shivesena.setFont(new Font("Times New Roman", Font.BOLD, 10));
		shivesena.setBounds(578, 509, 206, 83);
		frmElec.getContentPane().add(shivesena);
		
		JLabel lblYou = new JLabel("YOU HAVE SELECTED :-");
		lblYou.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblYou.setBounds(20, 589, 431, 50);
		frmElec.getContentPane().add(lblYou);
		
		output = new JTextField();
		output.setBounds(332, 602, 213, 25);
		frmElec.getContentPane().add(output);
		output.setColumns(10);
		
		JLabel lblWwwvoteonlinecom = new JLabel("www.voteonline.com");
		lblWwwvoteonlinecom.setBounds(10, -16, 200, 50);
		frmElec.getContentPane().add(lblWwwvoteonlinecom);
		
		
		
		
	}
}
