/**
 * 
 */

import java.awt.image.BufferedImage;

/**
 * @author Yann M.FONTENOY
 *
 */
public class FiltresImage {

	/**
	 * Recopie une image dans un nouveau BufferedImage sans y apporter de transformation
	 * 
	 * @param original l'objet BufferedImage de l'image orignial
	 * @return l'objet contenant la nouvelle image
	 */
	public static BufferedImage clone(BufferedImage original) {
		int hauteurOriginal = original.getHeight();
		int largeurOriginal = original.getWidth();
		
		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = original.getRGB(w, h);
				
				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;
				
				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(w, h, pixelCourantCible);
			}
		}
		return resultat;
	}
	
	/**
	 * Recopie une image dans un nouveau BufferedImage en effectuant 
	 * une symétrie sur l'axe vertical
	 * 
	 * @param original l'objet BufferedImage de l'image orignial
	 * @return l'objet contenant la nouvelle image
	 */
	public static BufferedImage symetrieVerticale(BufferedImage original) {
		int hauteurOriginal = original.getHeight();
		int largeurOriginal = original.getWidth();
		
		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = original.getRGB(w, h);
				
				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;
				
				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(largeurOriginal- w, h, pixelCourantCible);
			}
		}
		return resultat;
	}
	
	/**
	 * Recopie une image dans un nouveau BufferedImage en effectuant 
	 * une symétrie sur l'axe horizontale
	 * 
	 * @param original l'objet BufferedImage de l'image orignial
	 * @return l'objet contenant la nouvelle image
	 */
	public static BufferedImage symetrieHorizontale(BufferedImage original) {
		int hauteurOriginal = original.getHeight();
		int largeurOriginal = original.getWidth();
		
		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = original.getRGB(w, h);
				
				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;
				
				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(w, hauteurOriginal- h, pixelCourantCible);
			}
		}
		return resultat;
	}

	/**
	 * Recopie une image dans un nouveau BufferedImage en effectuant 
	 * une rotation à 90° dans le sens anti-horaire
	 * 
	 * @param original l'objet BufferedImage de l'image orignial
	 * @return l'objet contenant la nouvelle image
	 */
	public static BufferedImage rotation90A(BufferedImage original) {
		int hauteurOriginal = original.getHeight();
		int largeurOriginal = original.getWidth();
		
		BufferedImage resultat = new BufferedImage(hauteurOriginal, largeurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = original.getRGB(w, h);
				
				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;
				
				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(h, w,pixelCourantCible);
			}
		}
		return resultat;
	}

	/**
	 * Recopie une image dans un nouveau BufferedImage en effectuant 
	 * une rotation à 90° dans le sens horaire
	 * 
	 * @param original l'objet BufferedImage de l'image orignial
	 * @return l'objet contenant la nouvelle image
	 */
	public static BufferedImage rotation90H(BufferedImage original) {
		int hauteurOriginal = original.getHeight();
		int largeurOriginal = original.getWidth();
		
		BufferedImage resultat = new BufferedImage(hauteurOriginal, largeurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = original.getRGB(w, h);
				
				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;
				
				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(hauteurOriginal- h, w,pixelCourantCible);
			}
		}
		return resultat;
	}

	/**
	 * Recopie une image dans un nouveau BufferedImage en effectuant 
	 * une moyenne de chaque pixel avec ses voisins
	 * 
	 * @param original l'objet BufferedImage de l'image original
	 * @param progress Affiche ou non une barre de progression dans la console. 
	 * Un point par ligne de l'image originale.
	 * @return l'objet contenant la nouvelle image
	 */
	public static BufferedImage blur(BufferedImage original, boolean progress) {
		int hauteurOriginal = original.getHeight();
		int largeurOriginal = original.getWidth();
		
		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			// Pour afficher une barre de progression si necessaire
			if (progress) System.out.print(".");
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur moyenne des pixels à la positon
				pixelCourantCible = FiltresImage.getPixelMoyen(original, w, h, 20);
				
				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(w, h, pixelCourantCible);
			}
		}
		return resultat;
	}

	
	/**
	 * Renvoie la valeur du pixel moyen en faisant le calcul sur la base 
	 * des comopsante RGB du pixel
	 * 
	 * @param image Le BufferedImage représentant l'image orignial 
	 * @param x L'abcisse du pixel dont on veut la moyenne
	 * @param y L'ordonnée du pixel dont on veut la moyenne
	 * @param taille le nombre de pixel autouts du pixel courant à prendre 
	 * en compte pour calculer la moyenne. cette taille est explorée dans toutes les 
	 * dimensions. Donc la moyenne est faite sur un carré de (taille x 2 + 1 ) X (taille x 2 + 1)
	 * contenant le pixel en coordonnées.
	 * @return La valueur de moyenne du pixel moyen en faisant le calcul sur la base 
	 * des comopsante RGB des voisins.
	 */
	public static int getPixelMoyen(BufferedImage image, int x, int y, int taille) {

		// Récupération de la couleur du pixel central
		int res = image.getRGB(x, y);

		// Création de quelques variables temporaires
		int sommeR = 0;
		int sommeV = 0;
		int sommeB = 0;
		int nbR = 0;
		int nbV = 0;
		int nbB = 0;
		Pixel pixelTemp = null;
		Pixel pixelMoyenne = null;
		
		// Taille négative interdite
		if(taille<0) taille = 0;
		
		// Parcours de tous les pixel autours du pixel central
		for (int i = x-taille; i <= x+taille; i++) {
			for (int j = y-taille; j < y+taille; j++) {
				// Sont intégré à la moyennt que les pixel qui appartiennent à l'image
				if(i>0 && j>0 && i < image.getWidth() && j < image.getHeight()) {
					pixelTemp = new Pixel(image.getRGB(i, j));
					sommeR += pixelTemp.getRed();
					nbR++;
					sommeV += pixelTemp.getGreen();
					nbV++;
					sommeB += pixelTemp.getBlue();
					nbB++;
				}
			}
		}
		// Le pixel final est le pixel original dont on va modifier les composantes RGB
		// En y mettant la moyennt des proches
		pixelMoyenne = new Pixel(res);
		pixelMoyenne.setBlue(sommeB/nbB);
		pixelMoyenne.setGreen(sommeV/nbV);
		pixelMoyenne.setRed(sommeR/nbR);
		return pixelMoyenne.couleur;
	}
	
		

}