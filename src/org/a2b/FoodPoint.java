package org.a2b;

public class FoodPoint extends items {

	@Override
	public void dosa() {
		System.out.println(" Our Dosa: rs.30");
		super.dosa();
	}
	@Override
	public void sambarIdly() {
		System.out.println("Our Sambar Idly: rs.40");
		super.sambarIdly();
	}
	@Override
	public void pongalVadai() {
	 System.out.println("our Pongal Vadai: rs.50");
		super.pongalVadai();
	}
	public static void main(String[] args) {
		FoodPoint f=new FoodPoint();
		f.dosa();
		f.sambarIdly();
		f.pongalVadai();
	}
}
