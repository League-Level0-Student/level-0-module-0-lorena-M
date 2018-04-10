import javax.swing.JOptionPane;

public class code {
	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("Do You know how to code?");
		
		if (userName.equals("Yes")) {
			JOptionPane.showMessageDialog(null, " You will rule the world");
		}else{
			JOptionPane.showMessageDialog(null, " Practice mopping floors");
		}
	}

}
