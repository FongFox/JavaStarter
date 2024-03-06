package lab07;

public class SinhVienCoKhi extends SinhVien {
	private String skill; // kỹ năng
	private double scoreCNC;
	private double scorePLC;

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill, double scoreCNC,
			double scorePLC) {
		super(id, name, price, tax);
		this.skill = skill;
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public double getScoreCNC() {
		return scoreCNC;
	}

	public void setScoreCNC(double scoreCNC) {
		this.scoreCNC = scoreCNC;
	}

	public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	@Override
	double getScore() {
		// TODO Auto-generated method stub
		return (scoreCNC + scorePLC) / 2;
	}

}
