package eg.edu.alexu.csd.datastructure.iceHockey.cs;

public class Main {

	public static void main(String[] args) {
		
		PlayersFinder object = new PlayersFinder();
		String[] image1 = {"BU33"
						  ,"4433"
						  ,"44NB"
						  ,"SDP3"};
		String[] image2 = {"33JUBU33",
						   "3U3O4433",
						   "O33P44NB",
						   "PO3NSDP3",
						   "VNDSD333",
						   "OINFD33X"} ;
		String[] image3 = {"44444H44S4",
						   "K444K4L444",
						   "4LJ44T44XH",
						   "444O4VIF44",
						   "44C4D4U444",
						   "4V4Y4KB4M4",
						   "G4W4HP4O4W",
						   "4444ZDQ4S4",
						   "4BR4Y4A444",
						   "4G4V4T4444"};
		String[] image4 = {"8D88888J8L8E888",
						   "88NKMG8N8E8JI88",
						   "888NS8EU88HN8EO",
						   "LUQ888A8TH8OIH8",
						   "888QJ88R8SG88TY",	
						   "88ZQV88B88OUZ8O",
						   "FQ88WF8Q8GG88B8",
						   "8S888HGSB8FT8S8",
						   "8MX88D88888T8K8",
						   "8S8A88MGVDG8XK8",
						   "M88S8B8I8M88J8N",
						   "8W88X88ZT8KA8I8",
						   "88SQGB8I8J88W88",
						   "U88H8NI8CZB88B8",
						   "8PK8H8T8888TQR8"};
		
		String[] image5 = {"11111",
						   "1AAA1",
						   "1A1A1",
						   "1AAA1",
						   "11111"};
		
		String[] image6 = {};		
		
		java.awt.Point[] playersArray = object.findPlayers(image4, 8, 9);
		//System.out.println("----------------------------------------------------");
		for(int i = 0 ; i < playersArray.length && playersArray[i] != null ; i++) {
			System.out.println(playersArray[i]);
		}
		/*object.checkPlayer(image4, 1, 0, 0);
		for(int i = 0 ; i < image4.length ; i++) {
			System.out.println(image4[i]);
		}*/
		/*System.out.println();
		for(int i = 0 ; i<4 ;i++) {
			System.out.println(object.borders[i]);
		}*/
	}

}
