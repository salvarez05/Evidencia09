public class Calculadora {
	private int n1;
	private int n2;

	public Calculadora (int n1, int n2){
		this.n1=n1;
		this.n2=n2;
	}



	public int sumar() {
		int suma= this.n1+this.n2;
		return suma;
	}
}