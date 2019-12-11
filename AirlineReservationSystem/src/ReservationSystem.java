import java.util.Scanner;

public class ReservationSystem {

	private boolean[] seats = new boolean[11];

	private enum Seat {
		FIRSTCLASS, ECONOMY
	};

	private static Scanner input = new Scanner(System.in);
	private int userInput;
	private Seat seatType;
	private String alternateInput;
	private int firstClassCounter = 1;
	private int economyCounter = 6;

	public void promptUser() {
		System.out.println("Please Type 1 for First Class or Type 2 for Economy: ");
		userInput = input.nextInt();
		
		if (userInput == 1) {
			seatType = Seat.FIRSTCLASS;
		} else if (userInput == 2) {
			seatType = Seat.ECONOMY;
		} else {
			System.out.println("Input is invalid");
			promptUser();
		}
	}

	public boolean isAvailable(Seat type) {
		boolean result = false;
		
		if (type == Seat.FIRSTCLASS) {
			
			for (int i = 0; i <= 5; i++) {

				if (seats[i] == false) {
					result = true;
					break;
				}
			}

		}
		if (type == Seat.ECONOMY) {
			for (int i = 6; i <= 10; i++) {

				if (seats[i] == false) {
					result = true;
					break;
				}
			}
		}
		return result;

	}
	
	private void displayBoardingPass(int sitNumber, Seat type) {
		System.out.println("[BOARDING PASS]");
		System.out.println("Sit-number" + sitNumber +"\nClass" + type.toString());
		
	}


	
	public void assignSeat(Seat type) {
		
		if(type == Seat.FIRSTCLASS) {
				seats[firstClassCounter] = true;
				displayBoardingPass(firstClassCounter, type);
				firstClassCounter++;
			
		}
		
		if(type == Seat.ECONOMY) {
				seats[economyCounter] = true;
				displayBoardingPass(economyCounter, type);
				economyCounter++;
			
		}
	}
	
	
	public void provideAlternative(Seat type) {
		
	
		if (type == Seat.FIRSTCLASS) {
			if (isAvailable(Seat.ECONOMY)) {
				System.out.println("Would you like to be placed in Economy-class? Y or N ");
				alternateInput = input.next();
				if(alternateInput.compareToIgnoreCase("Y") == 0) {
					assignSeat(Seat.ECONOMY);
				}else {
					System.out.println("Next Flight leaves in 3 Hours!");
				}
			
			}
		
		
		if (type == Seat.ECONOMY) {
			if (isAvailable(Seat.FIRSTCLASS)) {
				System.out.println("Would you like to be placed in First-Class? Y or N ");
				alternateInput = input.next();
				if(alternateInput.compareToIgnoreCase("Y") == 0) {
					assignSeat(Seat.FIRSTCLASS);
				}else {
					System.out.println("Next Flight leaves in 3 Hours!");
				}
			}
		}
	}
	
	}
	public void startReservation() {
		
		System.out.println("\tAIRLINE RESERVATION PORTAL");
		System.out.println("--------------------------------------------");
		
		
			while(true) {
				promptUser();
				
				if(seatType == Seat.FIRSTCLASS) {
					
					if(isAvailable(Seat.FIRSTCLASS)) {
						assignSeat(Seat.FIRSTCLASS);
						
					}else {
						provideAlternative(seatType);
					}
				}
				
				if(seatType == Seat.ECONOMY) {
					
					if(isAvailable(Seat.ECONOMY)) {
						assignSeat(Seat.ECONOMY);
						
					}else {
						provideAlternative(seatType);
					}
				}
				if(firstClassCounter > 5 && economyCounter >10) {
					System.out.println("\nFight Booking Full.  Next flight leaves in 3 hours.");
					
					System.exit(0);
				}
			}
		}
	}
	
	
	

