package domain;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
	
	private String pseudo;
	private ArrayList<Score> scoreHistory;
	private Score maxScore;
	
	public User() {
		
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}


	public ArrayList<Score> getScoreHistory() {
		return scoreHistory;
	}

	public void setScoreHistory(ArrayList<Score> scoreHistory) {
		this.scoreHistory = scoreHistory;
	}

	public Score getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Score maxScore) {
		this.maxScore = maxScore;
	}	
	

}
