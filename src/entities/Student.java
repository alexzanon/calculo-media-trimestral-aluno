package entities;

public class Student {
	
	public String name;
	public double ptrimestre;
	public double strimestre;
	public double ttrimestre;
	
	public double calculaNota() {
		return ptrimestre + strimestre + ttrimestre;
	}
	
	public double difNota() {
		return 60.00 - (ptrimestre + strimestre + ttrimestre);
	}
	
	public String toString() {
		return String.format("%.2f", calculaNota());
	}
}
