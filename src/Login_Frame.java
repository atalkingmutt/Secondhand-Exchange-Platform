
	// import essential packages
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import javax.swing.*;
	public class Login_Frame extends JFrame{
			private StudentList users = new StudentList();
			private Home_Frame frame;
			private JTextField stuIDField, tfPassword, tfUserName, phoneNumField;
			private JButton btnEnroll, btnLogin;
			private JPanel panel = (JPanel) this.getContentPane();
			public Login_Frame() {
			//your code
				this.setTitle("Login");
				this.setSize(1000,800);
				// LoginFrame window size width is 1000, height is 800
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// JTextFiled length is 20
				stuIDField=new JTextField(20);
				phoneNumField=new JTextField(20);
				tfUserName = new JTextField(20);
				tfPassword = new JTextField(20);
				btnEnroll = new JButton("Enroll");
				btnLogin = new JButton("Login");
				createLayout();
				btnEnroll.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int stuID = Integer.parseInt(stuIDField.getText());
						String phoneNum = phoneNumField.getText().toString();
						String name = tfUserName.getText();
						String pw = tfPassword.getText();
						//try {
							Student user = new Student(name,stuID,pw,phoneNum);
							JOptionPane.showMessageDialog(Login_Frame.this,"User enrolled successfully.");
						}/*catch(UserError ex) {
							//JOptionPane.showMessageDialog(Login_Frame.this, "UserError: "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
						}
						catch(PasswordError ex) {
							JOptionPane.showMessageDialog(Login_Frame.this, "PasswordError: "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
						}
					}*/
				});
				
				btnLogin.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String name = tfUserName.getText();
						String pw = tfPassword.getText();
						//try {
							/*user.checkUserExist(name);
							user.checkPassword(name,pw);*/
							frame = new Home_Frame(name);
							frame.setVisible(true);
							dispose();
						/*}catch(UserError ex) {
							JOptionPane.showMessageDialog(LoginFrame.this, "UserError: "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
						}
						catch(PasswordError ex) {
							JOptionPane.showMessageDialog(LoginFrame.this, "PasswordError: "+ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
						}*/
					}
				});
				this.setVisible(true);
			}
			private void createLayout() {
				JPanel uPanel = new JPanel();
				uPanel.add(new JLabel("Username:"));
				uPanel.add(tfUserName);
				uPanel.setPreferredSize(new Dimension(500, 40));
				JPanel pPanel = new JPanel();
				pPanel.add(new JLabel("Password:"));
				pPanel.add(tfPassword);
				pPanel.setPreferredSize(new Dimension(500, 40));
				JPanel bPanel = new JPanel();
				bPanel.add(btnEnroll);
				bPanel.add(btnLogin);
				bPanel.setPreferredSize(new Dimension(500, 40));
				JPanel allPannel = new JPanel();
				allPannel.add(uPanel);
				allPannel.add(pPanel);
				allPannel.add(bPanel);
				setLayout(new BorderLayout(20, 40));
				getContentPane().add(new JPanel(), BorderLayout.NORTH);
				getContentPane().add(allPannel, BorderLayout.CENTER);
				getContentPane().add(new JPanel(), BorderLayout.SOUTH);
			}
	}
