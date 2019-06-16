package domain;

import java.io.Serializable;

public class Score implements Serializable {

	private User user;
	private int score;
	
	public Score() {
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	

}
