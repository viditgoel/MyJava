import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class AddDemoGui{
  Frame f1;
  Label l1,l2,l3,l4;
  TextField t1,t2,t3,t4;
  Button btn1,btn2;
public AddDemoGui(){
f1=new Frame();
f1.setSize(500,500);

Font ff1=new Font("comic sans ms",Font.BOLD,20);
l1=new Label("Employee no");
t1=new TextField();
l1.setFont(ff1);
t1.setFont(ff1);

l2=new Label("Employee name");
t2=new TextField();
l2.setFont(ff1);
t2.setFont(ff1);

l3=new Label("Employee Salary");
t3=new TextField();
l3.setFont(ff1);
t3.setFont(ff1);

l4=new Label("Employee department");
t4=new TextField();
l4.setFont(ff1);
t4.setFont(ff1);

btn1=new Button("add Record");
btn2=new Button("exit");
btn1.setFont(ff1);
btn2.setFont(ff1);

f1.add(l1);
f1.add(t1);

f1.add(l2);
f1.add(t2);


f1.add(l3);
f1.add(t3);


f1.add(l4);
f1.add(t4);

f1.add(btn1);
f1.add(btn2);

f1.setLayout(null);
l1.setBounds(100,100,120,30);
t1.setBounds(240,100,120,30);

l2.setBounds(100,150,120,30);
t2.setBounds(240,150,120,30);

l3.setBounds(100,200,120,30);
t3.setBounds(240,200,120,30);

l4.setBounds(100,250,120,30);
t4.setBounds(240,250,120,30);

btn1.setBounds(120,300,120,30);
btn2.setBounds(250,300,120,30);

f1.setVisible(true);
}}

class AddGui{ 
public static void main(String ar[]){ 
                 new AddDemoGui();
}}
