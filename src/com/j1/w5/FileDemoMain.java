/*
 * @author ksb
 * @since 160404
 * demo how to use file decorator
 * 
 */

package com.j1.w5;

import java.io.File;
import java.io.FileInputStream;
  
public class FileDemoMain {
  public static void main(String[] args) throws Exception{
    int i;
    try{
      File myhome=new File(System.getProperty("user.home"));
      System.out.println("my home is"+myhome);
      
      String cwd=new File(".").getCanonicalPath();
      System.out.println("cwd is"+cwd);
      
      File readme=new File(cwd,"HelloWorld.java");
      System.out.println("readme is"+readme);
      
      FileInputStream isReadme=new FileInputStream(readme);
      while((i=isReadme.read())!=-1) {
        char c=(char)i;
        System.out.print(c);
      }
    } catch(Exception e){
      e.printStackTrace();
    } finally{
      String cwd=new File(".").getCanonicalPath();
      File readme=new File(cwd,"HelloWorld.java");
      FileInputStream isReadme=new FileInputStream(readme);
      
      if(isReadme != null)
        isReadme.close();
    }
  }
}