/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package carnival;
 /**
 * A carnival of games is simulated.
 */
 public class Carnival {

	public static void main(String[] args) {
		GameBooth balloonDartToss = new GameBooth(2,"tiger plush", "sticker");
		GameBooth ringToss = new GameBooth(2,"bear keychain", "pencil");
		GameBooth breakAPlate = new GameBooth(1.5, "pig plush", "plastic dinosaur");
		Player shonda = new Player(5);
		Player luis = new Player(3);
				
		System.out.print("Shonda goes to Balloon Dart Toss. ");
		System.out.println(shonda.play(balloonDartToss));
		
		System.out.print("Luis goes to Ring Toss. ");
		System.out.println(luis.play(ringToss));
		
		System.out.print("Shonda goes to Ring Toss. ");
		System.out.println(shonda.play(ringToss));
		
		System.out.print("Luis goes to Break A Plate. ");
		System.out.println(luis.play(breakAPlate));
		
                //Prints out The Amount of money
		System.out.println("Shonda won: " + shonda.showPrizes());
		System.out.println("Luis won: " + luis.showPrizes());
                
                System.out.println("Prizes won " + shonda.showPrizes());
                System.out.println("Player has " + shonda.moneyLeft()+ "$");
                
                System.out.println("Prizes won " + luis.showPrizes());
                System.out.println("Player has " + luis.moneyLeft() + "$");
                
                
                //Prints Out the Amount of prizes won
                System.out.println("Prizes awarded at the Balloon Dart Toss: " );
                balloonDartToss.prizeAwarded();
                System.out.println("Prizes awarded at the ring Toss: ");
                ringToss.prizeAwarded();
                System.out.println("Prizes awarded at the break A Plate");
                breakAPlate.prizeAwarded();
	}
}