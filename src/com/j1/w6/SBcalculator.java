package com.j1.w6;

import java.util.*;
import java.awt.*;
import java.awt.event.*;

class calculator_sub extends Frame{
  Button bt0=new Button("0");
  Button bt1=new Button("1");
  Button bt2=new Button("2");
  Button bt3=new Button("3");
  Button bt4=new Button("4");
  Button bt5=new Button("5");
  Button bt6=new Button("6");
  Button bt7=new Button("7");
  Button bt8=new Button("8");
  Button bt9=new Button("9");
  Button dot=new Button(".");
  Button back=new Button("ก็");
  Button equal=new Button("=");
  Button plus=new Button("+");
  Button minus=new Button("-");
  Button multiple=new Button("*");
  Button div=new Button("/");
  Button restOp=new Button("%");
  Button Lparenthesis=new Button("(");
  Button Rparenthesis=new Button(")");
  Label nolabel=new Label("");
  
  public calculator_sub(String str) {
    super(str);
    this.setSize(400,480);
    this.setLayout(new GridLayout(6,4));
    init();
    this.setVisible(true);
  }
  
  public void init(){
    Lparenthesis.addActionListener(new EventAction());
    Rparenthesis.addActionListener(new EventAction());
    restOp.addActionListener(new EventAction());
    div.addActionListener(new EventAction());
    bt7.addActionListener(new EventAction());
    bt8.addActionListener(new EventAction());
    bt9.addActionListener(new EventAction());
    multiple.addActionListener(new EventAction());
    bt4.addActionListener(new EventAction());
    bt5.addActionListener(new EventAction());
    bt6.addActionListener(new EventAction());
    minus.addActionListener(new EventAction());
    bt1.addActionListener(new EventAction());
    bt2.addActionListener(new EventAction());
    bt3.addActionListener(new EventAction());
    plus.addActionListener(new EventAction());
    dot.addActionListener(new EventAction());
    bt0.addActionListener(new EventAction());
    back.addActionListener(new EventAction());
    equal.addActionListener(new EventAction());
    
    this.add(Lparenthesis);
    this.add(Rparenthesis);
    this.add(restOp);
    this.add(div);
    this.add(bt7);
    this.add(bt8);
    this.add(bt9);
    this.add(multiple);
    this.add(bt4);
    this.add(bt5);
    this.add(bt6);
    this.add(minus);
    this.add(bt1);
    this.add(bt2);
    this.add(bt3);
    this.add(plus);
    this.add(dot);
    this.add(bt0);
    this.add(back);
    this.add(equal);
    this.add(nolabel);
  }
  
  class EventAction implements ActionListener{
    public void actionPerformed(ActionEvent e){
      Button eventButton=(Button)e.getSource();
      
      String clickArgs=eventButton.getLabel();
      System.out.print(clickArgs+" ");
     }
  }
}

public class SBcalculator {
  public static void main(String[] args){
    calculator_sub SBcal= new calculator_sub("subin");
  }
}