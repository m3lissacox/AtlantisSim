import java.util.Random;
import java.util.Scanner;

public class AtlantisSim {
	public static void waves(int dir) throws InterruptedException {
		for (int i=1; i<6; i++) {
			if (dir<0) {
				for (int j = 6; j>i; j--) {
					System.out.print(".");
					Thread.sleep(10);
				}
			} else {
				for (int j = 1; j<i; j++) {
					System.out.print(".");
					Thread.sleep(10);
				}
			}
			System.out.print("\n");	
			Thread.sleep(100);
		}
	}
	public static void waveMaker(int times) throws InterruptedException {
		for (int i = 0; i<times; i++) {
			waves(1) ;
			waves(-1);
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Random generator = new Random();
		//int randNum = generator.nextInt(10);
		Scanner in = new Scanner(System.in);
		
		waveMaker(1) ;
		System.out.println("*-*-*-*-*-*-*-Welcome to Atlantis Simulator-*-*-*-*-*-*-*");
		System.out.println("Please enter your name: ");
	    String name = in.nextLine();
	    
	    System.out.println("A small research team from iD Tech has been on a mission to find Atlantis for the past 2 months.");
	    Thread.sleep(2000);
		System.out.println("Captain " + name + " was piloting the submarine when the lights suddenly flickered off.");
		Thread.sleep(2000);
		System.out.println("Before the Captain could even raise the alarm, the vessel jerked and " + name + " face planted into the controls!");
		Thread.sleep(3000);
		System.out.println("The ship got tossed");
		Thread.sleep(1000);
		System.out.println("to...");
		Thread.sleep(1000);
		System.out.println("...and fro...");
		Thread.sleep(1000);
		waveMaker(3);
		System.out.println("After what seemed like hours of turbulence, the submarine ground to a halt.");
		Thread.sleep(3000);
		System.out.println(name + " uncurls from the fetal position.");
		Thread.sleep(3000);
		System.out.println("What does Captain " + name + " do?");

		boolean correct = false;
		while (!correct) {
		    System.out.println("-\n(1) Get up \n(2) Explore submarine \n(3) Look through periscope \n(4) Open the hatch");
		    int ans = in.nextInt();
		    if (ans == 1) {
		        System.out.println(name + " gets up from the floor and looks around the room. There's water leaking down the walls and the windows are completely dark. There's an emergency escape hatch in the back.");
		        Thread.sleep(3000);
		    } else if ( ans == 2) {
		        System.out.println(name + " tries to explore the submarine. One of the doors has an alarming volume of water leaking through the sides. The only other escape is though the emergency hatch.");
		        Thread.sleep(3000);
		    } else if ( ans == 3) {
		        System.out.println(name + " looks through the periscope. They blink and rub their eyes, and look again. \"I must have gotten a concussion,\" grumbles " + name + " to themself."); 
		        Thread.sleep(3000);
		    } else if ( ans == 4) {
		        System.out.println("Captain " + name + " decides they must abandon ship. They open the emergency hatch and brace for water to pour into the ship, but the hatch swings open into air.");
		        correct = true;
		        Thread.sleep(3000);
		    } else {
		        System.out.println("Please type 1, 2, or 3 and press enter");
		    }
		}
		
		boolean jump = false;
		while (!jump) {
		    System.out.println("-\n(1) Look around \n(2) Go back in the submarine \n(3) Jump out of the hatch");
		    int ans = in.nextInt();
		    if (ans == 1) {
		        System.out.println("The captain pokes their head out of the submarine and takes a look around. The back of the submarine is submerged underwater, while the front end is prcariously wedged in an underwater cave.");
		        System.out.println(name + " can see a faint light in the distance. Perhaps it's a way out.");
		        Thread.sleep(3000);
		    } else if ( ans == 2) {
		        System.out.println(name + " scrambles back down into the submarine. The water levels have noticably risen. They climb cautiously back up to the energency hatch.");
		        Thread.sleep(3000);
		    } else if ( ans == 3) {
		        System.out.println(name + " musters all of their energy and jumps out of the emergency hatch!"); 
		        Thread.sleep(3000);
		        jump = true;  
		    } else {
		        System.out.println("Please type 1, 2, or 3 and press enter");
		    }
		}

		System.out.println("Exit the cave? \n-\n(1) Yes\n(2) No");
		int ans = in.nextInt();
		if (ans == 1) {
		    System.out.println("Captain "+ name + " bravely decides to walk towards the light.");
		} else {
		    System.out.println("Captain " + name + " hesitates, but then realizes that there is nowhere else to go in the cave. They begin to walk towards the light.");
		}
		Thread.sleep(3000);
		waveMaker(3)  ;
		
		System.out.println("When " + name + " finally reaches the light, they are relieved to see that it is indeed an exit to the outside. \nThey wonder whether they will actually find Atlantis.");
		Thread.sleep(2000);
		System.out.println("They briefly remember the sad fate of the entire crew of the submarine, but then decide it is worth it if Atlantis is found.");
		Thread.sleep(2000);
		System.out.println("As soon as they exit the cave and their eyes adjust, "+name+"'s jaw drops.");
		Thread.sleep(2000);
		
		in.nextLine(); //clear input to consume the newline
		System.out.println("What does " + name + " see?");
		String seen = in.nextLine();
		
		if (seen.equalsIgnoreCase("Atlantis")) {
		    System.out.println("How did you guess? ");
		    System.out.println(name + " discovered the hidden ruins of Atlantis, and became rich and famous and got to live the remainder of their life in comfort.");
		} else {
		    System.out.println(name + " looked at the outside world in disbelief."
		    		+ " Turns out they'd been wrong in their navigation, and they'd just crashed into the coast of Florida. "
		    		+ "\n"+ name + " shrugged and strolled past the piles of " + seen + " into the nearest McDonald's to get some fries.");
		}
		Thread.sleep(3000);
		waves(1) ;
		System.out.println(".....");
		System.out.println(".FIN.");
		waves(-1) ;	       
	}
}
