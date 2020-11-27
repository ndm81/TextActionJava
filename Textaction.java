import java.awt.*;
import java.awt.event.*;
public class Textaction extends Frame implements ActionListener{
	Label l1,l2;
	TextArea area;
	Button b;
	Textaction(){
	 l1=new Label();
	 l1.setBounds(80,100,80,50);
	 l1=new Label();
	 l1.setBounds(80,150,80,50);
	 area=new TextArea();
	 area.setBounds(80,200,80,50);
	 b=new Button("Count Words");
	 b.setBounds(80,250,80,50);
	 b.addActionListener(this);
	 add(l1);add(l2);add(area);add(b);
	 setSize(400,400);
	 setLayout(null);
	 setVisible(true);
	}
	    public void actionPerformed(ActionEvent e){
		String ar=area.getText();
		String words[]=ar.split("\\s");
		 l1.setText("Words: "+words.length);  
         l2.setText("Characters: "+ar.length());  
		
	} 
		public static void main(String[] args) {
		new TextArea();
	}
}