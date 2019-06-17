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
	private Scanner sc;

	public Game() {
		sc = new Scanner(System.in);

		System.out.println(
				"\n**************************************************************************************************\n"
						+ "                                       JEU DE CALCUL MENTAL\n"
						+ "**************************************************************************************************\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------------\n"
						+ "Bienvenue dans notre jeu de calcul mental !\n"
						+ "Chaque partie est constituée de 10 calculs aléatoires et chaque bonne réponse vous rapporte 1 point.\n"
						+ "La calculatrice est bien entendu INTERDITE !\n"
						+ "Votre score sera enregistré en fin de partie et pourra être consulté ultérieurement.\n"
						+ "A vous de jouer !\n"
						+ "--------------------------------------------------------------------------------------------------\n");

		System.out.print("Veuillez saisir votre pseudo : ");
		user = new User();
		score = new Score();
		user.setPseudo(sc.nextLine());
		score.setUser(user);
		System.out.println("\nBienvenue " + user.getPseudo() + " ! \n");

		initMenu();

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
		int menuChoice = 0;
		while (menuChoice == 0) {
			System.out.println("Veuillez choisir une option dans le menu suivant : ");
			System.out.println("1) Lancer une nouvelle partie.\n" + "2) Afficher son meilleur score. \n"
					+ "3) Afficher le classement des scores.\n");		
			menuChoice = sc.nextInt();

			switch (menuChoice) {
			case 1:
				while (true) {
					this.initGame();

					String reponse = new String();
					while (!reponse.equals("O") && !reponse.equals("N")) {
						reponse = sc.nextLine();
						System.out.println("Souhaitez-vous faire une nouvelle partie ? (O/N)");
					}
					if (reponse.equals("N")) {
						System.out.println("\n Merci d'avoir joué et à bientôt !");
						break;
					}
				}
				break;
			case 2:

				break;
			case 3:

				break;
			default:
				menuChoice = 0;
				
			}

		}
		
	}

	private void initGame() {
		this.calculations = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			calculations.add(new Calculation());
		}

	}

}
