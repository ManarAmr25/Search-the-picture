package eg.edu.alexu.csd.datastructure.iceHockey.cs;

public class PlayersFinder implements IPlayersFinder{
		
	private int length = 0; // number of players
	private java.awt.Point[] playersArray = new java.awt.Point[10000]; // list of points representing players
	private int currentPlayerArea = 0;
	private int[] borders = {0,0,0,0}; //right left up down
	
	private void sortPlayers(java.awt.Point[] arr) {	//bubble sort
		boolean sorted = true;
		for(int i = 0 ; i < length ; i++) {
			for(int j = 0 ; j < length-1-i ; j++) {
				if(arr[j].getX() > arr[j+1].getX() || (arr[j].getX() == arr[j+1].getX() && arr[j].getY() > arr[j+1].getY())) {
					sorted = false;
					java.awt.Point x = new java.awt.Point(arr[j]);
					arr[j].setLocation(arr[j+1]);
					arr[j+1].setLocation(x);
				}
			}
			if(sorted) {
				break;
			}
		}
	}
	
	private java.awt.Point calculateCentre() {
		int right = (borders[0]+1)*2;
		int left = borders[1]*2;
		int up = borders[2]*2;
		int down = (borders[3]+1)*2;
		java.awt.Point C = new java.awt.Point((right+left)/2,(up+down)/2);
		return C;
	}
	
	private void checkPlayer(String[] photo, int team, int X, int Y) {
		
		if(X+1 < photo[0].length() && Character.getNumericValue(photo[Y].charAt(X+1)) == team ) {//right
			if(X+1 > this.borders[0]) {
				this.borders[0] = X+1;
			}
			photo[Y] = photo[Y].substring(0,X+1) + '*' + photo[Y].substring(X+2);
			this.currentPlayerArea++;
			checkPlayer(photo, team, X+1, Y);
			
		}
		if(X-1 != -1 && Character.getNumericValue(photo[Y].charAt(X-1)) == team && X-1 != -1) {//left
			if(X-1 < this.borders[1]) {
				this.borders[1] = X-1;			
			}
			photo[Y] = photo[Y].substring(0,X-1) + '*' + photo[Y].substring(X);
			this.currentPlayerArea++;
			checkPlayer(photo, team, X-1, Y);
			
		}
		if(Y-1 != -1 && Character.getNumericValue(photo[Y-1].charAt(X)) == team) {//up
			if(Y-1 < this.borders[2]) {
				this.borders[2] = Y-1;
			}
			photo[Y-1] = photo[Y-1].substring(0,X) + '*' + photo[Y-1].substring(X+1);
			this.currentPlayerArea++;
			checkPlayer(photo, team, X, Y-1);
			
		}
		if(Y+1 < photo.length && Character.getNumericValue(photo[Y+1].charAt(X)) == team) {//down
			if(Y+1 > this.borders[3]) {
				this.borders[3] = Y+1;
			}
			photo[Y+1] = photo[Y+1].substring(0,X) + '*' + photo[Y+1].substring(X+1);
			this.currentPlayerArea++;
			checkPlayer(photo, team, X, Y+1);
			
		}

	}
	
	public java.awt.Point[] findPlayers(String[] photo, int team, int threshold){
		
		if(photo != null && photo.length != 0 && photo[0] != null) {
			
			for(int i = 0 ; i < photo.length ; i++) {
				for(int j = 0 ; j < photo[0].length() ; j++) {
					
					if(Character.getNumericValue(photo[i].charAt(j)) == team) {
						photo[i] = photo[i].substring(0,j) + '*' + photo[i].substring(j+1);
						this.currentPlayerArea ++;
						this.borders[0] = this.borders[1] = j;
						this.borders[2] = this.borders[3] = i;
						//check and calculate area
						checkPlayer(photo, team, j, i);
						if(this.currentPlayerArea*4 >= threshold) {	
							//append to this.playersArray if not exist
							this.playersArray[length] = calculateCentre();
							this.length++;
						}
					}
					//reset the parameters
					this.borders[0] = this.borders[1] = this.borders[2] = this.borders[3] = 0;
					this.currentPlayerArea = 0;
				}
			}
			if(length == 0) {
				return null;
			}
			for(int i = 0 ; i < photo.length ; i++) {
				for(int j = 0 ; j < photo[0].length() ; j++) {
					if(photo[i].charAt(j) == '*') {
						photo[i] = photo[i].substring(0,j) + team + photo[i].substring(j+1);
					}
				}
			}	
			sortPlayers(this.playersArray);
			return this.playersArray;
		}
		
		return null;
	}
	
}
