import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class RPSLS_Game
{
  int [] user = {1 , 2, 3 ,4 ,5};
  int [] win1 = { 2, 3 , 5 ,1 , 4};
  int [] win2 = { 5, 4, 1 ,3 ,2};
  int rock = 0;
  int paper = 0;
  int scissors = 0;
  int lizard = 0;
  int spock = 0;
  String choice ="";
  String outcome = "";
  int win = 0;
  int lose = 0;
  int tie = 0;  
  ArrayList<Integer> size = new ArrayList<Integer>();
  public void printmenu()
  {
    System.out.println(" Select a weapon:");
    System.out.println("") ;
    System.out.println(" 1. Rock") ;
    System.out.println(" 2. Paper");
    System.out.println("3. Scissors"); 
    System.out.println("4. Lizard"); 
    System.out.println("5. Spock"); 
    System.out.println(" or");
    System.out.println("6. Quit");
    System.out.println("");
    System.out.println(" Your selection:" + choice);
  }
  
  public void start()
  {
    
    printmenu();
    
    runRPSLS();
    
    
    
  }
  
  
  
  
  public void runRPSLS()
  {
    int [] player = {0};
   
    int [] computer = {0};
    int option = 0; 
    int decision = 0;
    
    
    
   ArrayList<Integer> size = new ArrayList<Integer>();
    Scanner keyboard = new Scanner(System.in);
    
   
   
    while (option != 6)
    {
      try
      {
    option = keyboard.nextInt();
    
    
    if (option == 1)
    {
      choice = "Rock";
      user[ option - 1] = player [0]    ;
       rock = rock +1;
       size.add ( 1 ) ;
    }
    
    if (option == 2)
    {
      choice = "Paper";
        user[ option - 1] = player [0] ;
       paper = paper + 1;
        size.add ( 2);
    }
    if (option == 3)
    {
      choice = "Scissors";
        user[ option - 1] =player [0] ;
       scissors = scissors + 1;
     size.add ( 3);
    }
    if (option == 4)
    {
      choice = "Lizard";
      user[ option - 1] =player [0] ;
       lizard = lizard + 1;
 size.add ( 4);
    }
    if (option == 5)
    {
      choice = "Spock";
    user[ option - 1] =player [0] ;
       spock = spock + 1;
     size.add ( 5);
    }
    
    
    
    int rindex = getRandomNumber( size.size());
    
  int  randome = size.get(rindex);
    if (randome == 0)
    {
      win1 [randome - 1] =   computer [0] ;
    }
    if( randome == 1)
         {
      win1 [randome - 1] =   computer [0] ;
    }
     if ( randome == 2)
     {
     win1 [randome - 1] =   computer [0] ;
     } 
      
     if (randome == 3)
     {
     win1 [randome - 1] =   computer [0] ;
     }
     
     
     if (randome == 4)
     {
     win1 [randome - 1] =   computer [0] ;
     }
    
    
    
   
    
     
     
     
     
     if (computer == player)
     {
      decision = 3;
     }
      
  /*   if ( player == 'S' && computer == 'p')
           {
       decision = 1;
     }
      
      if ( player == 'P' && computer == 'S')
           {
       decision = 2;
     }
      
     if ( player == 'P' && computer == 'r')
           {
       decision = 1;
     }
      
      
         if ( player == 'R' && computer == 'P')
           {
       decision = 2;
     }
      
          if ( player == 'R' && computer == 'L')
           {
       decision = 1;
     }
     
     if ( player == 'L' && computer == 'R')
           {
       decision = 2;
     }
    
      if ( player == 'L' && computer == 'O')
           {
       decision = 1;
     }
  
  
   if ( player == 'O' && computer == 'L')
           {
       decision = 2;
     }
  
   if ( player == 'O' && computer == 'S')
           {
       decision = 1;
     }
  
  
   if ( player == 'S' && computer == 'O')
           {
       decision = 2;
     }
  
    if ( player == 'S' && computer == 'L')
           {
       decision = 1;
     }
     if ( player == 'L' && computer == 'S')
           {
       decision = 2;
     }
      if ( player == 'L' && computer == 'O')
           {
       decision = 1;
     }
       if ( player == 'O' && computer == 'L')
           {
       decision = 2;
     }
        if ( player == 'P' && computer == 'O')
           {
       decision = 1;
     }
         if ( player == 'O' && computer == 'P')
           {
       decision = 2;
     }
          if ( player == 'O' && computer == 'R')
           {
       decision = 1;
     }
           if ( player == 'R' && computer == 'O')
           {
       decision = 2;
     }
            if ( player == 'R' && computer == 'S')
           {
       decision = 1;
     }
             if ( player == 'S' && computer == 'R')
           {
       decision = 2;
     }
  
  */
  
  
  
  
  if (decision == 1)
  {
    outcome = "You win !";
     win = win +1;
  }
  if(decision == 2)
  {
    outcome= "You lose!";
     lose = lose + 1;
  
  }
  
  if(decision == 3)
  {
    outcome = "It's a tie!";
   tie = tie + 1;
  }
  
  
  
  
   System.out.println("User:" + choice + "        Computer:"   );
      System.out.println(outcome);
  
  
  
  
  
  
  
  
  
   if (option == 6)
    {
      System.out.println(" you won " + win + " times");
      System.out.println(" the computer won " + lose + " times");
      System.out.println(" you tied " + tie + " times");
      System.out.println("you chose rock " + rock + " times" );
      System.out.println("you chose paper " + paper + " times" );
      System.out.println("you chose scissors " + scissors + " times" );
      System.out.println("you chose lizard " + lizard + " times" );
      System.out.println("you chose spock " + spock + " times" );
}
    }
    catch(Exception e)
    {
      System.out.println(" only input a valid number");
     
    }
    } 
   
   
   
  }




 public static int getRandomNumber(int list)
  {
    int randomNum;
  Random rand =  new Random();
  randomNum = rand.nextInt(list);
  return randomNum;
  }


}
/*  Arraylist<Interger> xlist = new Array <intergre
 * xlist.add(5);
 * xlist.size();
 * xlist.get(1);
 * 
 * 
 * 
 * 
 * 
 * 
 * char [] x = {'A','B','C','D'};
 * char [] y= {'K','D','J','X'};
 * 
 * 
 * FOR(INT i = 0, i < x.length, i++)
 * {
 * IF (C == x[i])
 * return y[i]
 * }
 * return 'Z'
 * 
 * 
 * 
 * 
 * char [][] x = {{'A','K'};
 * {'B','D'};
 * {'C','J'};
 * {'D','X'};
 * 
 * 
 * 
 * FOR(INT i = 0, i< x.length, i++)
 *{ 
 *if ( c == x[i][0])
 * return x[i][1];
 * 
 * 
 * keyboard.nextInt();
 * */