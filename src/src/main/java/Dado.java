import java.util.Random;

public class Dado {
	private int caraSuperior;
	public enum Numero{Primer,Segundo}
	private Numero numeroDado;

	public int getCaraSuperior() {
		return this.caraSuperior;
	}

	public void setCaraSuperior(int caraSuperior) {
		this.caraSuperior = caraSuperior;
	}

	public Numero getNumeroDado() {
		return this.numeroDado;
	}

	public void setNumeroDado(Numero numeroDado) {
		this.numeroDado = numeroDado;
	}
	public Dado(Numero numeroDado){
		this.numeroDado=numeroDado;
	}

	public void lanzarDado() {
		Random rnum= new Random();
		int cara=rnum.nextInt(1,6);
		setCaraSuperior(cara);
		System.out.println(toString());
	}

	public String toString()
	{
		return "La cara del "+getNumeroDado()+" dado es: "+getCaraSuperior();
	}
}