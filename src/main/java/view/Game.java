package view;

import java.util.ArrayList;
import java.util.Scanner;

import domain.Score;
import domain.User;
import domain.calcul.Calculation;

public class Game {
	
	private ArrayList<Calculation> calculations;
	private User user;
	private Score score;
	
	public Game() {
		
		System.out.println("\n**************************************************************************************************\n");
		System.out.println("                                       JEU DE CALCUL MENTAL\n");
		System.out.println("**************************************************************************************************\n");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("Bienvenue dans notre jeu de calcul mental !");
		System.out.println("Chaque partie est constituée de 10 calculs aléatoires et chaque bonne réponse vous rapporte 1 point.");
		System.out.println("La calculatrice est bien entendu INTERDITE !");
		System.out.println("Votre score sera enregistré en fin de partie et pourra être consulté ultérieurement.");
		System.out.println("A vous de jouer !");
		System.out.println("--------------------------------------------------------------------------------------------------\n");

		Scanner sc = new Scanner(System.in);
		System.out.print("Veuillez saisir votre pseudo : ");
		user = new User();
		score = new Score();
		user.setPseudo(sc.nextLine());
		score.setUser(user);
		
		while(true) {
			this.initGame();

			String reponse = new String();
			while (!reponse.equals("O") && !reponse.equals("N")) {
				System.out.println("Souhaitez-vous faire une nouvelle partie ? (O/N)");
				reponse = sc.nextLine();
			}
			if (reponse.equals("N"))
				break;
		}
		
		
	}

	public ArrayList<Calculation> getCalculations() {
		return calculations;
	}


	public void setCalculations(ArrayList<Calculation> calculations) {
		this.calculations = calculations;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Score getScore() {
		return score;
	}


	public void setScore(Score score) {
		this.score = score;
	}


	private void initMenu() {
		
	}	
	
	private void initGame() {
		
	}
	

}
