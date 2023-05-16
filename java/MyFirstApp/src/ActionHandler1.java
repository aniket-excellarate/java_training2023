import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ActionHandler1 implements ActionListener {
    private TextField firstTf;
    private TextField secondTf;
	private Object answerLbl;
    
	public ActionHandler1(TextField firstTf, TextField secondTf, Label answerLbl) {
		this.firstTf = firstTf;
		this.secondTf = secondTf;
		this.answerLbl = answerLbl;
	}

	public void ActionHandler(TextField firstTf2, TextField secondTf2, Label answerLbl2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Button b= (Button)e.getSource();
		//System.out.println(b.getActionCommand());
	//System.out.println(e.getActionCommand());
		int a = Integer.parseInt(firstTf.getText());
		int b = Integer.parseInt(secondTf.getText()); 
		int result;
	if(e.getActionCommand().equalsIgnoreCase("add"))
	{
		result = a+b;
		System.out.println("add button pressed");
		((Label) answerLbl).setText("Answer = "+ result);
	}if (e.getActionCommand().equalsIgnoreCase("substract")) {
		//System.out.println(this.firstTf.getText());
		//System.out.println(this.secondTf.getText());
		System.out.println("subtract button pressed");
	result = a-b;
	((Label) answerLbl).setText("Answer = "+ result);
	}if (e.getActionCommand().equalsIgnoreCase("multiply")) {
		//System.out.println(this.firstTf.getText());
		//System.out.println(this.secondTf.getText());
		System.out.println("subtract button pressed");
		result = a*b;
	((Label) answerLbl).setText("Answer = "+ result);
	}if (e.getActionCommand().equalsIgnoreCase("Divide")) {
		//System.out.println(this.firstTf.getText());
		//System.out.println(this.secondTf.getText());
		
	result = a/b;
	((Label) answerLbl).setText("Answer = "+ result);

}
}
}