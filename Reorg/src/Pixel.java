
public class Pixel {
	public int couleur;
	
	public Pixel(int laValeur) {
		this.couleur = laValeur;
	}
	
	public String getBinaire() {
		return Integer.toBinaryString(this.couleur);
	}

	public String getBinairePlus() {
		return "???????? " + Integer.toBinaryString(this.getRed()) + " " + Integer.toBinaryString(this.getGreen()) + " " + Integer.toBinaryString(this.getBlue());
	}
	
	public int getBlue() {
		return couleur & 0x000000FF;
	}
	public String getBinaireBlue() {
		return Integer.toBinaryString(this.getBlue());
	}
	
	public int getGreen() {
		return (couleur & 0x0000FF00) >> 8;
	}
	public String getBinaireGreen() {
		return Integer.toBinaryString(this.getGreen());
	}

	public int getRed() {
		return (couleur & 0x00FF0000) >> 16;
	}
	public String getBinaireRed() {
		return Integer.toBinaryString(this.getRed());
	}
	public void setBlue(int laValEnBleu) {
		couleur = (couleur & 0xFFFFFF00) + (laValEnBleu & 0x000000FF);
	}
	public void setGreen(int laValEnVert) {
		couleur = (couleur & 0xFFFF00FF) + ( (laValEnVert & 0x000000FF) << 8);
	}
	public void setRed(int laValEnRouge) {
		couleur = (couleur & 0xFF00FFFF) + ( (laValEnRouge & 0x000000FF) << 16);
	}
}