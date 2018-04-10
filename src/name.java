import javax.swing.JOptionPane;

public class name {
	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("WHat is your name?");
		
		if (userName.equals("roberto")){
			JOptionPane.showMessageDialog(null, "Your parents have great taste!");
		}else{
			JOptionPane.showMessageDialog(null, "Your parent s don't love you");
		}
	}

}
