package homework9;

public class PieceWorker extends Employee {

	private double wage;
	private double pieces;
	
	public double getWage() {
		return wage;
	}
	
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	public double getPieces() {
		return pieces;
	}
	
	public void setPieces(double pieces) {
		this.pieces = pieces;
	}
	
	public PieceWorker() {
		super();
	}
	
	public PieceWorker(double wage, double pieces) {
		super();
		this.wage = wage;
		this.pieces = pieces;
	}
	
	@Override
	public double getPaymentAmount() {
		return wage*pieces;
	}
	
}
