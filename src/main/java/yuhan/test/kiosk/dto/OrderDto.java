package yuhan.test.kiosk.dto;

public class OrderDto {
	private int seq;
	private int mem_no;
	private String order_dt;
	private String finish_yn;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getMem_no() {
		return mem_no;
	}
	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}
	public String getOrder_dt() {
		return order_dt;
	}
	public void setOrder_dt(String order_dt) {
		this.order_dt = order_dt;
	}
	public String getFinish_yn() {
		return finish_yn;
	}
	public void setFinish_yn(String finish_yn) {
		this.finish_yn = finish_yn;
	}
}
