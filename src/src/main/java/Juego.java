import java.util.ArrayList;
public class Juego {
	private ArrayList<Dado> dados = new ArrayList<Dado>();

	public ArrayList<Dado> getDados() {
		return dados;
	}

	public void setDados(ArrayList<Dado> dados) {
		this.dados = dados;
	}

	public void agregarDado(Dado.Numero numero){
		Dado dado=new Dado(numero);
		dado.lanzarDado();
		this.dados.add(dado);
	}
	public boolean resultadoJuego(int suma) {
		if(suma==7){
			System.out.println("Ganaste");
			return true;
		}else {
			System.out.println("Perdiste");
			return false;}
	}

	public int calcularPuntaje() {
		Calculadora calculadora= new Calculadora(dados.get(0).getCaraSuperior(),dados.get(1).getCaraSuperior());
		int suma=calculadora.sumar();
		return suma;
	}
}