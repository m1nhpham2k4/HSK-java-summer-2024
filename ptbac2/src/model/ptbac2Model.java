package model;

public class ptbac2Model {
	private String value_a;
	private String value_b;
	private String value_c;
	private String answer;
	
	public ptbac2Model() {
		
	}

	
	
	public String getValue_a() {
		return value_a;
	}



	public void setValue_a(String value_a) {
		this.value_a = value_a;
	}



	public String getValue_b() {
		return value_b;
	}



	public void setValue_b(String value_b) {
		this.value_b = value_b;
	}



	public String getValue_c() {
		return value_c;
	}



	public void setValue_c(String value_c) {
		this.value_c = value_c;
	}



	public String getAnswer() {
		return answer;
	}



	public void setAnswer(String answer) {
		this.answer = answer;
	}



	public void giaiphuongtrinhbac2() {
		double denta = Double.valueOf(this.value_b) * Double.valueOf(this.value_b)- 4 * Double.valueOf(this.value_a) * Double.valueOf(this.value_c);
		if(denta < 0) {
			this.answer = "Error value";
		}else if(denta == 0) {
			this.answer = String.valueOf(- Double.valueOf(this.value_b) / (2 * Double.valueOf(this.value_a)));
		}
		else {
			this.answer = String.valueOf(((- Double.valueOf(this.value_b) + Math.sqrt(denta))/2*Double.valueOf(this.value_a)) + "," + ((- Double.valueOf(this.value_b) - Math.sqrt(denta))/2*Double.valueOf(this.value_a)));
		}
	}
	
	public void xoa() {
		this.answer = "";
		this.value_a = "";
		this.value_b = "";
		this.value_c = "";
		
	}
	
	
}
