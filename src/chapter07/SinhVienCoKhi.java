package chapter07;

public class SinhVienCoKhi extends SinhVien {
	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

	private String skill;

	public SinhVienCoKhi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		// TODO Auto-generated constructor stub
		this.skill = skill;
	}

}
