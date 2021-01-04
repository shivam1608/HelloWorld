/*Codded by Shivam 
Master Program to print Hello World
 */


import java.util.Scanner;

class Main {
 
 //Anti large PP System
  public boolean isSmallPP(String size){
    if(size.toLowerCase().contains("small")){
      return true;
    }
    System.out.println("No Big PPs Allowed !!!!");
    return false;
  }
 
 //Important Data Decrypter 
  protected String[] dataDecrypter(String importantData){
    System.out.println("");
     String Data[]=new String[importantData.length()];
     for(int i=0;i<importantData.length();i++){
       int temp=importantData.charAt(i)+1;
       char Temp=(char)temp;
        Data[i]=Character.toString(Temp);
     }
     return Data;
  }

// Display Every Data
  public void Display(String importantData[]){
     for(int i=0;i<importantData.length;i++){
       System.out.print(importantData[i]);
     }
  }
  
  //The Main Function
  public static void main(String[] args) {
    String data="Gdkkn Vnqkc";
    String freeKnowledge="OGO_Rtbjr";

    //Guess it Boiii
   Scanner kh_l_fa=new Scanner(System.in); 
   Main mia=new Main();
     
    System.out.println("Enter Small Or large (Acctually size of ur pP)");
    String size = kh_l_fa.nextLine();

    if(mia.isSmallPP(size)==false){
       return;
    }
    
    mia.Display(mia.dataDecrypter(data));

    // One Truth of Life
    mia.Display(mia.dataDecrypter(freeKnowledge));
    
    

    
     
  }
}