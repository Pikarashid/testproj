public class AirlineProblem {

	public static AirlineProblem main(String args[]) {

		Scanner scannerToReadAirlines = null;

		try {
			scannerToReadAirlines = new Scanner(new File("airlines.txt"));
			}

			catch(IOException e){
				
				System.out.println("Could not connect to file airlines.txt.");
				System.exit(0);

				}

				if(ScannerToReadAirlines != null) {
					ArrayList<Airline> airlinesPartnersNetwork = new ArrayList <Airline>();

					Airline newAirline;
					String lineFormFile;
					String [] airlineNames;

					while(scannerToReadAirlines.hasNext()) {
						lineFormFile = scannerToReadAirlines.nextLine();
						airlineNames = lineFormFile.split(",");
						newAirline = new Airline(airlineNames);

						airlinesPartnersNetwork.add(newAirline);
					}

					System.out.println(airlinesPartnersNetwork);

						Scanner keyboard = new Scanner(System.in);
						System.out.println("Enter airline miles are on:");

						String start = keyboard.nextLine();
						System.out.println("Enter goal airline:");

						String goal = keyboard.nextline();
						ArrayList<String> pathForMiles = new ArrayList<String>();
						ArrayList<String> airlinesVisited = new ArrayList<String>();

							if(canRedeem(start, goal, pathForMiles, airlinesVisited, airlinesPartnersNetwork)) {
							
							System.out.println("Path to redeem miles :" + pathForMiles);
						}
						else 
						
							System.out.println(" Cannot convert miles from " + start + " to " + goal + " . ");

					}

				}


}
	


