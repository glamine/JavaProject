package MyPackage;

public class Player {
	
	int x_pos;
	int y_pos;
	
	// skill attributs
	
	int looks;
	int danceSkills;
	
	// energy
	
	int energy;
	
	Player(){
		x_pos = 0;
		y_pos = 0;
		
		looks = 10;
		danceSkills = 10;
		
		energy = 10;
		
	}
	
	void goUp() {
		
		y_pos = y_pos+1;
	
	}
	
	void move(int x1, int y1) {
		x_pos = x_pos + x1;
		y_pos = y_pos + y1;
	}
	
	void loseEnergy() {
		
		energy--;
	}

}