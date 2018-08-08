import java.applet.*;
import java.awt.*;

/* <applet code= "SecondApplet" 
width="600" 
height="600"> 
</applet> */

public class SecondApplet extends Applet implements Runnable{
  Thread t;
  int f=0;
  Color c1,c2;
  public void init(){
   t=new Thread(this);
   t.start();
   }
   public void run(){
    while(true){
	 if(f==0){
	 c1=Color.RED;
	 c2=Color.BLUE;
	 f=1;
	 }
	 else if(f==1)
	 {c1=Color.BLUE;
	  c2=Color.RED;
	  f=0;
	  }
	  
	  try{Thread.sleep(2000);
	  }
	  
	  catch(Exception e){}
	  repaint();
	  }};
	  public void paint(Graphics g){
	  //g.draw Rect(260,160,190,60);
	  //g.draw Rect(280,170,150,60);
	  g.setColor(c1);
	  g.fillRect(260,160,190,90);
	  
	  g.setColor(c2);
	  g.fillRect(280,170,160,60);
	  
	  Font f=new Font("comic sans ms",Font.BOLD,20);
	  
	  g.setFont(f);
	  g.setColor(Color.YELLOW);
	  g.drawString(" my first applet",300,200);
	  }}
	  