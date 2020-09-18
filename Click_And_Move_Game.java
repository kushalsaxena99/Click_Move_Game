import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
class A extends JFrame
{   JButton b1;
int frWidth=600,frHeight=400,btnWidth=150,btnHeight=50;
A()
{
setLayout(null);
b1=new JButton("CLICK ME");
b1.setBounds(frWidth/2-btnWidth/2,frHeight/2-btnHeight,btnWidth,btnHeight);
add(b1);
b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae)
{
JOptionPane.showMessageDialog(A.this,"KUSHAL WIN");
}
});

b1.addKeyListener(new KeyAdapter()
{
public void keyPressed(KeyEvent ke){
if(ke.getKeyChar()==32)
{
ke.consume();
}
}
});

b1.addMouseListener(new MouseAdapter()
{
public void mouseEntered(MouseEvent me)
{
int x=b1.getLocation().x;
int y=b1.getLocation().y;
int newX=0,newY=0;
Random r1=new Random();
while(true)
{
newX=r1.nextInt(frWidth-btnWidth);
newY=r1.nextInt(frHeight-btnHeight);
Rectangle oldRect=new Rectangle(x,y,btnWidth,btnHeight);
Rectangle newRect=new Rectangle(newX,newY,btnWidth,btnHeight);
if(!oldRect.intersects(newRect))
break;
}
if(me.getX()>=btnWidth-5 && me.getY()>=btnHeight-5)
     return;
     b1.setLocation(newX,newY);
}
});

setUndecorated(true);
setBounds(100,100,600,400);
setVisible(true);


}
public static void main(String args[])
{
A i=new A();
}
}
