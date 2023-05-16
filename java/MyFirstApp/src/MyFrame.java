import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Window;
import java.awt.Button;
import java.awt.Component;

public class MyFrame extends Frame {

	public MyFrame(boolean visible,String title, int x, int y, int width, int height) {
		this.setVisible(visible);
		this.setTitle(title);
		this.setBounds(x,y,width,height);
		
		TextField firstTf = new TextField("");
		firstTf.setBounds(100, 50, 80, 30);
		add(firstTf);
		
		TextField secondTf = new TextField("");
		secondTf.setBounds(200, 50, 80, 30);
		add(secondTf); 
		
		Label answerLbl = new Label("Answer is =");
		answerLbl.setBounds(100,80,150,20);
		add(answerLbl);
		
		Button addButton = new Button("Add");
		addButton.setBounds(100, 100, 80, 30);
		
		Button subButton = new Button("Substract");
		subButton.setBounds(200, 100, 80, 30);
		
		Button mulButton = new Button("Multiply");
		mulButton.setBounds(300, 100, 80, 30);
		
		Button divButton = new Button("Divide");
		divButton.setBounds(400, 100, 80, 30);
		this.setLayout(null);
		
		this.add(addButton);
		this.add(subButton);
		this.add(mulButton);
		this.add(divButton);
		addButton.addActionListener(new ActionHandler1(firstTf,secondTf,answerLbl));
		subButton.addActionListener(new ActionHandler1(firstTf,secondTf,answerLbl));
		mulButton.addActionListener(new ActionHandler1(firstTf,secondTf,answerLbl));
		divButton.addActionListener(new ActionHandler1(firstTf,secondTf,answerLbl));
		//this.addWindowListener(new WindowHandler());
        //this.addMouseListener(new MouseHandler());	
	    //this.addMouseMotionListener(new MouseMotionHandler());
	
		this.addWindowListener(new MasterWindowHandler());
		this.addMouseListener(new MasterWindowHandler());
		this.addMouseMotionListener(new MasterWindowHandler());
		
	}



	

}