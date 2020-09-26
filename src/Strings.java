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
}
public class Strings {

	public static void main(String[] args) {
		
		StringManipulable str = new StringManipulable("Hola que hace bro");
		str.invertirCadena();

	}

}
