/**
 * 
 */
import java.util.Scanner;
/**
 * @author hugo6
 *
 */
public class MainPixel {

	/**
	 * @param args
	 
	 */
	
	static Scanner scanner = new Scanner (System.in);
	
	public static void main(String[] args) {

		int choix = -1;
		String nomFichier = null;
		ImageTransformable imCourante = null;
		afficherMessageAccueil();
		while(choix != 0) {
			choix = afficheMenuEtDemandeChoix();
			switch (choix) {
			case 1: // Charge du disque l'image en mémoire
				nomFichier = afficheQuestionEtDemandeNomFic();
				imCourante = new ImageTransformable(nomFichier);
				break;
			case 2: // Sauvegarde l'image en mémoire sur le disque
				nomFichier = afficheQuestionEtDemandeNomFic();
				imCourante.sauvegardeSous(nomFichier);
				break;
			case 3: // Symétrie Verticale de l'image
				imCourante.symetrieVerticale();
				break;
			case 4: // Symetrie Horizontale de l'image
				imCourante.symetrieHorizontale();
				break;
			case 5: // Neutraliser la composante Bleu de l'image
				imCourante.supprimeBleu();
				break;
			case 6: // Passe l'image en Niveaux de Gris
				imCourante.passeEnNiveauxDeGris();
				break;
			case 7: // Retourner l'image de 90° a gauche
				imCourante.rotation90G();
				break;
			case 8: // Retourner l'image de 90° a droite
				imCourante.rotation90D();
				break;
			}
		}
		afficheMessageDeFin();
		
	
	}

	
	private static String afficheQuestionEtDemandeNomFic() {
		String nomFichier = scanner.nextLine();
		return nomFichier;
	}

	private static int afficheMenuEtDemandeChoix() {
		System.out.println(" _________________________________________\n" +
                "| 0 - Exit\t\t\t\t\t\t\t\t  |\n" +
                "| 1 - Charger une image                   |\n" +
                "| 2 - Sauvegarder une image sur disque    |\n" +
                "| 3 - Symétrie verticale                  |\n" +
                "| 4 - Symétrie horizontale                |\n" +
                "| 5 - Supprimer le bleu                   |\n" +
                "| 6 - Niveau de Gris                      |\n" +
                "| 7 - Rotation 90° Gauche                 |\n" +
                "| 8 - Rotation 90° Droite                 |\n" +
                "|_________________________________________|\n");
		int choix = scanner.nextInt();
		scanner.nextLine();
		return choix;
		
	}

	private static void afficheMessageDeFin() {
		System.out.println("Votre image a bien été transformé");
	}

	private static void afficherMessageAccueil() {
		System.out.println("Bienvenue dans le modificateur d'images");
	}


}
