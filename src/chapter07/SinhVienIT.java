package chapter07;

public class SinhVienIT extends SinhVien {
	private String language;

	public SinhVienIT(String id, String name, double price, double tax, String language) {
		super(id, name, price, tax);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void getMoney() {
		System.out.println("Run Get Money!");
		super.info(); // goi toi method cua Class cha
//		this.info(); // goi toi chinh Class cua no (nghia la dang goi toi Class SinhVienIT)
	}

	public void info() {
		System.out.println("Run info from sinhvienIT");
	}
}
