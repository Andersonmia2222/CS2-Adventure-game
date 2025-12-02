 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       String command = ""; // stores the user's choices

       // STEP #1: Describe current scenatio
       System.out.println(" You are at a mall in Long island");
      System.out.println("It's crowded, loud, and smells like Auntie Annes pretzels.");

        
       // STEP #2: Get user commands 
       command = getCommand("Do you want to start upstairs or downstairs?(u/d) ");
      // STEP #3: Select a path based on user's command 
      if (command.equals("u"))
      {
         System.out.println("You ride the escalator up. At the top, you see the carousel spinning with kids screaming. A worker waves at you.");

         command = getCommand("Do you stop in ulta? (y/n)");
         if (command.equals("y"))
         {
            System.out.println(" Ulta falls down on you");
         }

         else if (command.equals("n"))
         {
            System.out.println("You keep walking in the mall.");

         }

         if (command.equals("l")) 
{
  System.out.println("You look for more stores");
  // NEXT BRANCH...
  command = getCommand("Go into Bath and Body Works (y/n)");
  if (command.equals("y"))
  {
    System.out.println("You buy items and got them on sale!");
  }
  else if (command.equals("y"))
  {
    System.out.println("You keep walking in the mall.");
  }
}
      }

   else{
      System.out.println("GAME OVER! You got lost in the time Zara and got lost for hours. Press RUN to replay.");
   }
   
    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎" + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       return command;
    } // END OF METHOD
 } // END OF CLASS
