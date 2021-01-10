package project1;
import javax.swing.*;
import javax.swing.text.JTextComponent;

import java.awt.*;
import java.awt.event.*;
  class swing1 extends JFrame implements ActionListener  {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField t;
	swing1()
	 {
		super("MY CALCULATOR");
		
		t=new JTextField();
		t.setBounds(40,50,230,50);
		add(t);
		
		JButton n1=new JButton("7");
		n1.setBounds(40,120,50,50);
		n1.addActionListener(this);
		add(n1);
		JButton n2=new JButton("8");
		n2.setBounds(100,120,50,50);
		n2.addActionListener(this);
		add(n2);
		JButton n3=new JButton("9");
		n3.setBounds(160,120,50,50);
		n3.addActionListener(this);
		add(n3);
		JButton n4=new JButton("+");
		n4.setBounds(220,120,50,50);
		n4.addActionListener(this);
		add(n4);
		
		JButton n5=new JButton("4");
		n5.setBounds(40,180,50,50);
		n5.addActionListener(this);
		add(n5);
		JButton n6=new JButton("5");
		n6.setBounds(100,180,50,50);
		n6.addActionListener(this);
		add(n6);
		JButton n7=new JButton("6");
		n7.setBounds(160,180,50,50);
		n7.addActionListener(this);
		add(n7);
		JButton n8=new JButton("-");
		n8.setBounds(220,180,50,50);
		n8.addActionListener(this);
		add(n8);
		JButton n9=new JButton("1");
		n9.setBounds(40,240,50,50);
		n9.addActionListener(this);
		add(n9);
		JButton n10=new JButton("2");
		n10.setBounds(100,240,50,50);
		n10.addActionListener(this);
		add(n10);
		JButton n11=new JButton("3");
		n11.setBounds(160,240,50,50);
		n11.addActionListener(this);
		add(n11);
		JButton n12=new JButton("*");
		n12.setBounds(220,240,50,50);
		n12.addActionListener(this);
		add(n12);
		JButton m1=new JButton("%");
		m1.setBounds(40,300,50,50);
		m1.addActionListener(this);
		add(m1);
		JButton m2=new JButton("0");
		m2.setBounds(100,300,50,50);
		m2.addActionListener(this);
		add(m2);
		JButton m3=new JButton("/");
		m3.setBounds(160,300,50,50);
		m3.addActionListener(this);
		add(m3);
		JButton m4=new JButton("=");
		m4.setBounds(220,300,50,50);
		m4.addActionListener(this);
		add(m4);
		
		JButton r1=new JButton("+/-");
		r1.setBounds(40,360,50,50);
		r1.addActionListener(this);
		add(r1);
		JButton r2=new JButton("C");
		r2.setBounds(100,360,50,50);
		r2.addActionListener(this);
		add(r2);
		JButton r3=new JButton("ac");
		r3.setBounds(160,360,50,50);
		r3.addActionListener(this);
		add(r3);
		JButton r4=new JButton(".");
		r4.setBounds(220,360,50,50);
		r4.addActionListener(this);
		add(r4);
		
		 setLayout(null);
		 setSize(310,500);
		 setVisible(true);
	 }

	static String  a="",b="",c="",res="";
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton j=(JButton)e.getSource();
		String s=j.getText();
		t.setText(s);
		if(a==""||(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")&&!s.equals("%")&&!s.equals("=")&&c==""&&!s.equals("+/-")))
		{
			if(s.equals("-")&&a=="")
				a="";
			else
			a=a+s;
			t.setText(a);
		}
		else if((s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")||s.equals("%"))&&(!s.equals("="))&&(!s.equals("+/-")))
		{
			c=s;
			t.setText(c);
		}
		else if((b==""&&!s.equals("+/-"))||(!s.equals("+")&&!s.equals("-")&&!s.equals("*")&&!s.equals("/")&&!s.equals("%")&&!s.equals("=")&&!c.equals("")&&!s.equals("+/-")))
		{
			
			b=b+s;
			t.setText(b);
		}
		else if(s.equals("+/-"))
		{
			if(!a.equals("")&&b==""&&c=="")
			{
				a="-"+a;
				t.setText(a);
			}
			else if(!a.equals("")&&!c.equals("")&&!b.equals(""))
			{
				b="-"+b;
				t.setText(b);
			}
		}
		else
		{
			
			int a1=Integer.parseInt(a);
			int b1=Integer.parseInt(b);
			System.out.println(a1+" "+b1+" ");
			if(c.equals("+"))
			a=String.valueOf(a1+b1);
			else if(c.equals("-"))
				a=String.valueOf(a1-b1);
			else if(c.equals("/"))
				a=String.valueOf(a1/b1);
			else if(c.equals("*"))
				a=String.valueOf(a1*b1);
			else if(c.equals("%"))
			a=String.valueOf(a1%b1);
			t.setText(a);
			b="";
			
		}
	}
 }
 public class Main
 {
	 public static void main(String args[])
	 {
		new swing1();
	 }
}
 
