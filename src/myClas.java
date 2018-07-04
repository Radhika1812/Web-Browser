import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class myClas extends JFrame{
private JTextField addressBar;
private JEditorPane display;

public myClas()
{
	super("My Browser");
	addressBar=new JTextField("ENTER THE URL DUDE");
	addressBar.addActionListener(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent event){
					loadCrap(event.getActionCommand()); 
					
				}
				
			}
	);
	add(addressBar,BorderLayout.NORTH);
	display=new JEditorPane();
	display.setEditable(false);
	display.addHyperlinkListener(
		new HyperlinkListener(){
			public void hyperlinkUpdate(HyperlinkEvent event)
			{
				if(event.getEventType()==HyperlinkEvent.EventType.ACTIVATED)
				{
					loadCrap(event.getURL().toString());
					
					
				}
				
				
			}
			
			
		}	
	
	
	);

add(new JScrollPane(display),BorderLayout.CENTER);
setSize(500,300);
setVisible(true);
}
//reads the html file and display it on the screen
private void loadCrap(String userText)
{
	try{
	display.setPage(userText);	
		addressBar.setText(userText);
		
	}catch(Exception e)
	{
		System.out.println("Ohhh! Crap!!!");
	}
	
	
	
	
	
	
	}


}
  