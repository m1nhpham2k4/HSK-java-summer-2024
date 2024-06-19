package model;

public class bai2Model {
	private int sodautien;
	private String ans;

	public bai2Model() {
		this.sodautien = 1;
	}

	public int getSodautien() {
		return sodautien;
	}

	public void setSodautien(int sodautien) {
		this.sodautien = sodautien;
	}
	
	
	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

	public boolean timsonguyento(int k) {
		
		if(k < 2)
			return false;
		for(int i = 2;i <= Math.sqrt(k);i++) {
			if(k % i == 0)
				return false;
		}
		return true;
	}
	
	public void checkPrime() {
		int dem = 0;
		int i = 2;
		StringBuilder primes = new StringBuilder();
		while(dem < this.sodautien) {
			if(timsonguyento(i) == true) {
//				this.ans = i + "";
				primes.append(i).append("\n");
//				System.out.println('\n');
				dem++;				
			}
			i++;
		}
		this.ans = primes.toString();
	}
	
}
