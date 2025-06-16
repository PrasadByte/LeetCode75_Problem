package oop_practice;

public class PolyMorphism {
	public int addition(int a, int b) {
		return a + b;
		
	}
	public double addition(double a,double b) {
		return a + b;
	}
	public double addition(int a,double b) {
		return a + b;
	}
	class p extends PolyMorphism{
		public int addition(int a, int b) {
			return a + b;
			
		}
	}
	public static void main(String[] args) {
		PolyMorphism a=new PolyMorphism();
		System.out.println(a.addition(12, 56));;
		System.out.println(a.addition(265.2, 9));
		
	}

}
