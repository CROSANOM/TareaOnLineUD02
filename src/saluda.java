import java.util.Scanner;/*
 **
importamos la clase escanner para leer por teclado*/
public class saluda {
	static String nombre=null;
	public saluda() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String nombre;
		System.out.println("Hola como te llamas, introduce tu nombre humana");
		nombre=sc.nextLine();
		System.out.println("Buenos dias:"+" "+ nombre);
		System.out.println("Hola como te llamas, introduce tu nombre humana");
		nombre=sc.nextLine();
		System.out.println("Buenos dias:"+" "+ nombre);
		// TODO Auto-generated method stub

	}
}
