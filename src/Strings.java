import java.util.Scanner;
class StringManipulable{
	Scanner x = new Scanner(System.in);
	String cadena;
	public StringManipulable() {}
	public StringManipulable(String cadena) {
		this.cadena = cadena;
	}
	public void invertirCadena(){
		System.out.println("\nDeseas invertir la cadena por letra o por palabra?\n1.- Por letra\n2.- Por palabra");
		int elec = x.nextInt();
		if(elec==1) {
		String porLetra="", porPalabra="";
		for(int i=0; i<cadena.length(); i++) {
			porLetra = porLetra + cadena.charAt(cadena.length()-(i+1));
		}
		cadena = porLetra;
		System.out.println("\nResultado: "+cadena);
		}else if(elec==2) {
			int cont=0;
			for(int i=0; i<cadena.length(); i++) {
				if(cadena.charAt(i)==' ')
					cont++;
			}
			String[] palabras = new String[cont];
			palabras = cadena.split(" ");
			cadena = "";
			for(int i=0; i<palabras.length; i++) {
				cadena = cadena + palabras[palabras.length-(i+1)] + " ";
			}
			System.out.println("\nResultado: "+cadena);
		}
	}
	public void agregarParte(String parte, int posicion) {
		cadena = cadena.substring(0, posicion-1) + parte + cadena.substring(posicion);
		System.out.println("\nResultado: "+cadena);
	}
	public void eliminarParte(int posicion) {
		cadena = cadena.substring(0, posicion-1) + cadena.substring(posicion+1);
		System.out.println("\nResultado: "+cadena);
	}
	public void cambiarCamel() {
		String cad = "";
		for(int i=1; i<=cadena.length(); i++) {
			if(i%2!=0)
				cad = cad + cadena.substring(i-1, i).toUpperCase();
			else
				cad = cad + cadena.substring(i-1, i).toLowerCase();
		}
		cadena = cad;
		System.out.println("\nResultado: "+cadena);
	}
}
public class Strings {

	public static void main(String[] args) {
		
		StringManipulable str = new StringManipulable("Hola que hace bro");
		str.cambiarCamel();

	}

}
