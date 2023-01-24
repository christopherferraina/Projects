import java.util.Scanner;
public class Hangmangame
{
  public static void main (String[]args)
  {
    
    
    
    
    
  }
  
  public void printmenue()
  {
    
    System.out.println(" Options:"); 
    System.out.println(" 1.  Start New Game");
    System.out.println(" 2. Draw Hangman Parts");
    System.out.println(" 3.  Exit"); 
    System.out.println(" Enter an option >>");
    
    
  }
  
  
  
  private void setSecretWord()
  {
    String Secret = "AARDVARK";
    
    
    
    
  }
  public String getLetter()
  {
    boolean tf=false;
    int length = 0;
    String letter;
    Scanner sc = new Scanner( System.in);
    System.out.println("enter a single letter");
    letter = sc.nextLine();
    while(tf = false) 
      length=letter.length()-1;
    if(isGuessOK(letter, length))
    {
      String theLetter = letter.toUpperCase();
      tf=true;
    }
    else
    {
      letter = " ";
      System.out.println("please enter one letter");
      
    }
    
    return letter;
  }
  private void printSecretWord()
  {
    DrawHangman draw = new DrawHangman();
    draw. missedNone();
    System.out.println("the word is");
    String secret = " ";
    secret = secret.replace('a', '_');
    secret = secret.replace('b', '_');
    secret = secret.replace('c', '_');
    secret = secret.replace('d', '_');
    secret = secret.replace('e', '_');
    secret = secret.replace('f', '_');
    secret = secret.replace('g', '_');
    secret = secret.replace('h', '_');
    secret = secret.replace('i', '_');
    secret = secret.replace('j', '_');
    secret = secret.replace('k', '_');
    secret = secret.replace('l', '_');
    secret = secret.replace('m', '_');
    secret = secret.replace('n', '_');
    secret = secret.replace('o', '_');
    secret = secret.replace('p', '_');
    secret = secret.replace('q', '_');
    secret = secret.replace('r', '_');
    secret = secret.replace('s', '_');
    secret = secret.replace('t', '_');
    secret = secret.replace('u', '_');
    secret = secret.replace('v', '_');
    secret = secret.replace('w', '_');
    secret = secret.replace('x', '_');
    secret = secret.replace('y', '_');
    String secretWord = secret.replace('z', '_');
    
    System.out.println(secretWord);  
    System.out.println(" ");
    
  }
  private boolean isGuessOK(String letter, int length)
  {
    
    for(int sum = 0; sum < length ; sum++)
    {
      letter.charAt(sum);
      if(Character.isLetter(letter.charAt(sum))) 
      {
        
      }
    }
    return true;
  }
  
  public void runHangman()
  {
    
    int option;
    
    Scanner keyboard = new Scanner(System.in);
    
    
    
    
    DrawHangman draw = new DrawHangman();
    
    option = keyboard.nextInt();
    
    
    
    if (option == 1)
    {
      
     
      setSecretWord();
      printSecretWord();
     System.out.println("this is where i would start the game "); 
    }
    
    
    if (option == 2)
    {
      
      draw.missedNone();
      draw.missone();
      draw.misstwo();
      draw.missthree();
      draw.missedfour();
      draw.missedfive();
      draw.missedsix();
    } 
    if(option > 3) 
    {
      
      System.out.println(" Invalid menue option");
    }
    
  }
  
  public void start()
  {
    
    
    printmenue();
    
    
    runHangman();
  }
}

