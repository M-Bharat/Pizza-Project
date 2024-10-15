package com.bharat.main.logic;

import java.io.*;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import com.bharat.entity.Pizza;
import com.bharat.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Loop extends Variables{
  protected int N=s.nextInt();
  
  @SuppressWarnings("resource")
public Loop(){
	  System.out.println();
    for(Ans=1;Ans<=N;Ans++){
      try{
        PrintStream f=new PrintStream("Bill.txt");
        System.out.println("May i know your name sir?");
        String name=s.next();
        System.out.println("Your contact number please sir?");
        long number=s.nextLong();
        System.out.println("May i know your email sir?");
        String email=s.next();
        System.out.println("Welcome! to our pizza store "+name+" sir");
        System.out.println();
        f.println("\n------------------------------------------------------------------------------------------\n");
        f.println("\n                                       Pizza Hut                                          \n");
        f.println("\n                               PVP Shopping mall, Vijayawada                              \n");
        f.println("\n------------------------------------------------------------------------------------------\n");
        f.println("\nName of the customer: "+name);
        f.println("\ncontact Number      : "+number);
        f.println("\nMail ID             : "+email);
        f.println("\n__________________________________________________________________________________________\n");
        f.printf("%-15s%-15s%-15s%-15s%-15s%-15s","\nCode","Category","Variant","Size","Crust","Price\n");
        f.println("\n__________________________________________________________________________________________\n");
        for(Ans=1;Ans<=N;Ans++){
          System.out.println("What would you like to order sir?");
          System.out.println("I mean veg or non-veg?");
          Type=s.next();
          System.out.println();
          if(Type.equals("veg")){
            System.out.println();
            System.out.println("In veg what would you like to have?");
            System.out.println("i mean we are having veg deluxe and supreme types ");
            System.out.println("So which one you would like to have");
            System.out.println();
            DorS=s.next();
            System.out.println();
            System.out.println("which size are you going to order medium/large?");
            System.out.println();
            Size=s.next();
            if(DorS.equals("deluxe")){
              System.out.println();
              System.out.println("How do you like the crust of your deluxe pizza?");
              System.out.println();
              TorP=s.next();
            }else{
              System.out.println();
              System.out.println("How do you like the crust of your supreme pizza?");
              System.out.println();
              TorP=s.next();
            }
          }else{
            System.out.println();
            System.out.println("In non-veg what would you like to have?");
            System.out.println("i mean we are having non-veg Tikka and supreme types ");
            System.out.println("So which one you would like to have");
            System.out.println();
            DorS=s.next();
            System.out.println();
            System.out.println("which size are you going to order medium/large?");
            System.out.println();
            Size=s.next();
            if(DorS.equals("Tikka")){
              System.out.println();
              System.out.println("How do you like the crust of your Tikka pizza?");
              System.out.println();
              TorP=s.next();
            }else{
              System.out.println();
              System.out.println("How do you like the crust of your supreme pizza?");
              System.out.println();
              TorP=s.next();
            }
          }
          System.out.println();
          System.out.println("So the order is a "+Size+" size "+Type+" "+DorS+" pizza with the crust as "+TorP+" ");
          System.out.println();
          if(Type.equals("veg")){
            if(DorS.equals("deluxe")){
              if(TorP.equals("pan")){
                if(Size.equals("large")){
                  code=4;
                  price=900;
                }else{
                  code=3;
                  price=600;
                }
              }else if(TorP.equals("thin")){
                if(Size.equals("large")){
                  code=2;
                  price=750;
                }else{
                  code=1;
                  price=550;
                }
              }
            }else if(DorS.equals("supreme")){
              if(TorP.equals("pan")){
                if(Size.equals("large")){
                  code=8;
                  price=950;
                }else{
                  code=7;
                  price=650;
                }
              }else if(TorP.equals("thin")){
                if(Size.equals("large")){
                  code=6;
                  price=800;
                }else{
                  code=5;
                  price=600;
                }
              }
            }
          }else if(Type.equals("non-veg")){
            if(DorS.equals("Tikka")){
              if(TorP.equals("pan")){
                if(Size.equals("large")){
                  code=58;
                  price=1050;
                }else{
                  code=57;
                  price=850;
                }
              }else if(TorP.equals("thin")){
                if(Size.equals("large")){
                  code=56;
                  price=900;
                }else{
                  code=55;
                  price=800;
                }
              }
            }else if(DorS.equals("supreme")){
              if(TorP.equals("pan")){
                if(Size.equals("large")){
                  code=54;
                  price=950;
                }else{
                  code=53;
                  price=750;
                }
              }else if(TorP.equals("thin")){
                if(Size.equals("large")){
                  code=52;
                  price=800;
                }else{
                  code=51;
                  price=700;
                }
              }
            }
          }
          System.out.println();
          System.out.println("So the price for your order would be Rs."+price+" Only");
          System.out.println();
          SessionFactory sf = HibernateUtils.getSessionFactory();
      	  Session session=sf.openSession();
      	  session.beginTransaction();
      	  Class.forName("com.mysql.jdbc.Driver");
          Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza-project","root","Bharath5*");
      	  Statement st=con.createStatement();
      	  ResultSet rs=st.executeQuery("select * from pizza where code="+code);
      	  while(rs.next() != false){
      		  f.printf("%-15s%-15s%-15s%-15s%-15s%-15s%n",rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
      	  }
        }
        f.println("\n--------------------------------------------------------------------------------------------\n");
        f.println("\nThank you for shopping with us and visit again!!");
        f.close();
      }catch(Exception e){
        System.out.println("Error: "+e);
      }
    }
    System.out.println("Thank you for buying from us and visit again!!");
    System.out.println();
  }
}

