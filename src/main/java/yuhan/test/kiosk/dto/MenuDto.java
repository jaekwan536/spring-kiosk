package yuhan.test.kiosk.dto;

public class MenuDto {
	private int menu_no;
	private String menu_nm;
	private String menu_cat;
	private int price;
	
	public int getMenu_no() {
		return menu_no;
	}
	public void setMenu_no(int menu_no) {
		this.menu_no = menu_no;
	}
	public String getMenu_nm() {
		return menu_nm;
	}
	public void setMenu_nm(String menu_nm) {
		this.menu_nm = menu_nm;
	}
	public String getMenu_cat() {
		return menu_cat;
	}
	public void setMenu_cat(String menu_cat) {
		this.menu_cat = menu_cat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
