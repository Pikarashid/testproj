private static boolean canRedeem(String current, String goal, ArrayList<String> pathForMiles, ArrayList<String> airlinesVisited, ArrayList<Airline> network) {

					if(current.equals(goal)) {
						//base case 1, I have found a path!

						pathFoeMiles.add(current);
						return true;
					}
					else

					if (airlinesVisited.contains(current))
						//base case 2, I have already been here
						//don't go into a cycle 
						return false;
					else{
						//I have not been here and it isn't 
						//the goal so check its partners
						//now I have been here 
						airlinesVisited.add(current);

						//add this to the path 
						pathForMiles.add(current);

						//findthis airline in the network

						int pos = -1;
						int index = 0;
						while(pos == -1 && index < network.size()) {

							if(network.get(index).getName().equals(current))
								pos = index;
							index++;
						}
						//if not in the network, no partners

						if(pos == -1)
							return false;

						//loop through partners 
						index = 0;
						String[] partners = network.get(pos).getPartners();

							boolean foundPath = false;

						while( !foundPath && index < partners.length) {
							foundPath = canRedeem(partners[index], goal, pathForMiles, airlinesVisited, network);
							index++;

						}
						if( !foundPath)
							pathForMiles.remove(pathForMiles.size() - 1);
								return foundPath;

							}

						}



