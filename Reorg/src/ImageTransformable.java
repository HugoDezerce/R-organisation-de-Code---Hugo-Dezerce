import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageTransformable {

	public String nomFichier;
	public BufferedImage bufferedImage;

	public ImageTransformable(String nomFichier) {
		this.nomFichier = nomFichier;

		try {
			this.bufferedImage = ImageIO.read(new File(nomFichier));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sauvegardeSous(String nomFichier) {
		File outputfile = new File(nomFichier);
		try {
			ImageIO.write(this.bufferedImage, "PNG", outputfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void symetrieVerticale() {
		int hauteurOriginal = this.bufferedImage.getHeight();
		int largeurOriginal = this.bufferedImage.getWidth();

		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = this.bufferedImage.getRGB(w, h);

				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;

				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(largeurOriginal - w, h, pixelCourantCible);
			}
		}
		this.bufferedImage = resultat;
	}

	public void symetrieHorizontale() {
		int hauteurOriginal = this.bufferedImage.getHeight();
		int largeurOriginal = this.bufferedImage.getWidth();

		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = this.bufferedImage.getRGB(w, h);

				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;

				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(w, hauteurOriginal - h, pixelCourantCible);
			}
		}
		this.bufferedImage = resultat;
	}

	public void supprimeBleu() {
		int hauteurOriginal = this.bufferedImage.getHeight();
		int largeurOriginal = this.bufferedImage.getWidth();

		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;

		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				int p = this.bufferedImage.getRGB(w, h);
				
				int a =(p>>24)&0xff;
				int r =(p>>16)&0xff;
				int g =(p>>8)&0xff;
				int b = 0;
				
				p = a << 24 + r << 16 + g << 8 + b;
				
				resultat.setRGB(w, h, p);
			}
		}
		this.bufferedImage = resultat;
	}

	public void passeEnNiveauxDeGris() {
		int hauteurOriginal = this.bufferedImage.getHeight();
		int largeurOriginal = this.bufferedImage.getWidth();

		BufferedImage resultat = new BufferedImage(largeurOriginal, hauteurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;

		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				int p = this.bufferedImage.getRGB(w, h);
				
				int a =(p>>24)&0xff;
				int r =(p>>16)&0xff;
				int g =(p>>8)&0xff;
				int b = p&0xff;
				
				int avg = (r+g+b) / 3;
				
				p = (a<<24) | (avg<<16) | (avg<<8) | avg;
				
				resultat.setRGB(w, h, p);
			}
		}
		this.bufferedImage = resultat;
	}

	public void rotation90G() {
		int hauteurOriginal = this.bufferedImage.getHeight();
		int largeurOriginal = this.bufferedImage.getWidth();

		BufferedImage resultat = new BufferedImage(hauteurOriginal, largeurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = this.bufferedImage.getRGB(w, h);

				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;

				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(h, w, pixelCourantCible);
			}
		}
		this.bufferedImage = resultat;
	}

	public void rotation90D() {
		int hauteurOriginal = this.bufferedImage.getHeight();
		int largeurOriginal = this.bufferedImage.getWidth();

		BufferedImage resultat = new BufferedImage(hauteurOriginal, largeurOriginal, BufferedImage.TYPE_INT_RGB);

		int pixelCourantOriginal;
		int pixelCourantCible;
		// Double boucle impriqué pour parcourir tous les pixel de l'image originale
		for (int h = 1; h < hauteurOriginal; h++) {
			for (int w = 1; w < largeurOriginal; w++) {
				// Récupération de la valeur du pixel à la positon
				pixelCourantOriginal = this.bufferedImage.getRGB(w, h);

				// Transformation a apporter au Pixel (Ici rien...)
				pixelCourantCible = pixelCourantOriginal;

				// Ecriture du pixel transformé dans l'image.
				resultat.setRGB(hauteurOriginal - h, w, pixelCourantCible);
			}
		}
		this.bufferedImage = resultat;
	}

}
