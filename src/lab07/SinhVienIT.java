package lab07;

public class SinhVienIT extends SinhVien {
	private String language; // ngôn ngữ lập trình
	private double scoreJava;
	private double scoreHTML;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	public SinhVienIT(String id, String name, double price, double tax, String language, double scoreJava,
			double scoreHTML) {
		super(id, name, price, tax);
		this.language = language;
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	public double getPriceTax() {
		return this.price * this.tax;
	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return (scoreJava * 2 + scoreHTML) / 3;
	}

}
