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
	public void primeraLetraMayuscula() {
		int cont=0;
		for(int i=0; i<cadena.length(); i++) {
			if(cadena.charAt(i)==' ')
				cont++;
		}
		String[] palabras = new String[cont];
		palabras = cadena.split(" ");
		cadena = "";
		for(int i=0; i<palabras.length; i++) {
			cadena = cadena + palabras[i].substring(0,1).toUpperCase() + palabras[i].substring(1) + " ";
		}
		System.out.println("\nResultado: "+cadena);
	}
}
public class Strings {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("\n\nPROGRAMA DE CADENA MANIPULABLE");
		System.out.println("\nIngrese la cadena a tratar:");
		String cad = x.nextLine();
		StringManipulable str = new StringManipulable(cad);
		int elec = 0;
		while(elec!=6) {
		System.out.println("\nQue desea hacer?\n1.- Invertir la cadena\n2.- Agregar una parte a la cadena\n3.- Eliminar una parte de la cadena\n4.- CaMeL CaSe\n5.- Convertir primer letra de cada palabra en mayuscula\n6.- Salir");
		elec = x.nextInt();
		switch(elec) {
		case 1:
			str.invertirCadena();
			break;
		case 2:
			System.out.println("\nIngrese la parte a agregar");
			x.next();
			String parte = x.nextLine();
			System.out.println("Ingrese la posicion de inicio");
			int posicion = x.nextInt();
			str.agregarParte(parte, posicion);
			break;
		case 3:
			System.out.println("\nIngrese la posicion a eliminar");
			int posicion2 = x.nextInt();
			str.eliminarParte(posicion2);
			break;
		case 4:
			str.cambiarCamel();
			break;
		case 5:
			str.primeraLetraMayuscula();
			break;
		default:
			System.out.println("\nLa eleccion no es valida");
			break;
		}
		}
	}

}
