import java.util.Scanner;
public class adventureGame {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in); 
		
		String answer1; 
		String answer2; 
		String answer3; 
		String answer4;
		String answer5;
		
		
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!"); 
		
		System.out.println("You are in a creepy house! Would you like to go \"upstairs\" or into the \"kitchen\"?"); 
		answer1 = keyboard.next();  
		
		if(answer1 .equals("kitchen")){  
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\"."); 
			answer2 = keyboard.next();   
		
			if(answer2 .equals("refrigerator"))
				System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food? (\"yes\" or \"no\")");
				answer3 = keyboard.next();    
				
				if(answer3 .equals("no"))
					System.out.println("You die of starvation... eventually."); 
		
		} else if(answer1 .equals("upstairs")){ 
			
		System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master \"bedroom\".  There is also a \"bathroom\" off the hallway. Where would you like to go?"); 
		answer4 = keyboard.next();  
			
		if (answer4 .equals("bedroom")){ 
			System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade.  In the back of the room, the closet door is ajar.  Would you like to open the door? (\"yes\" or \"no\")");
			answer5 = keyboard.next();  
		if(answer5 .equals("no")){ 
			System.out.println("Well, then I guess you'll never know what was in there.Thanks for playing, I'm tired of making nested if statements.");	
		}
		  }
	}
		keyboard.close();
		
		} 
		

 
 
	} 



