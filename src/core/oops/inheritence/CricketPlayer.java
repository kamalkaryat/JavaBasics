package core.oops.inheritence;

public class CricketPlayer extends Player {
	//private char grade;
	private String category;
	private String playerType;
	private float battingAvg=0.0f;
	private float bowlingAvg=0.0f;

	/*public void setGrade(char grade){
       this.grade=grade;

	}*/
	public void setCategory(String category){
       this.category=category;

	}
	public void setPlayerType(String playerType){
       this.playerType=playerType;

	}
	public void setBattingAvg(float battingAvg){
       this.battingAvg=battingAvg;

	}
	public void setBowlingAvg(float bowlingAvg){
       this.bowlingAvg=bowlingAvg;

	}

	/*public void getGrade(){
    	System.out.println("Grade: "+grade);
	}*/
	public void getCategory(){
    	System.out.println("Category: "+category);
	}
	public void getPlayerType(){
    	System.out.println("Player Type: "+playerType);
	}
	public void getBattingAvg(){
    	System.out.println("Batting Average: "+battingAvg);
	}
	public void getBowlingAvg(){
    	System.out.println("Bowling Average: "+bowlingAvg);
	}
}