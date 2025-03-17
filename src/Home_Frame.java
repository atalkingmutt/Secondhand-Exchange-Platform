// import essential packages
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;

public class Home_Frame extends JFrame{
	//your code
	JLabel label = new JLabel();
	//your code
	public Home_Frame(String username) {
	    label = new JLabel("Hello " + username+"!");
	    this.setTitle("Home");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,300);
		label.setFont(new Font("TimesRoman", Font.PLAIN, 60));
		JPanel helloPanel = new JPanel();
		helloPanel.add(label);
		helloPanel.setPreferredSize(new Dimension(500, 100));
		this.setLayout(new BorderLayout(20, 60));
		this.getContentPane().add(helloPanel, BorderLayout.CENTER);
		this.getContentPane().add(new JPanel(), BorderLayout.SOUTH);
		this.getContentPane().add(new JPanel(), BorderLayout.NORTH);
	}
	public Home_Frame(){
		this.setTitle("Home");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,300);
		label.setFont(new Font("TimesRoman", Font.PLAIN, 60));
		JPanel helloPanel = new JPanel();
		helloPanel.add(label);
		helloPanel.setPreferredSize(new Dimension(500, 100));
		this.setLayout(new BorderLayout(20, 60));
		this.getContentPane().add(helloPanel, BorderLayout.CENTER);
		this.getContentPane().add(new JPanel(), BorderLayout.SOUTH);
		this.getContentPane().add(new JPanel(), BorderLayout.NORTH);
		}
}
