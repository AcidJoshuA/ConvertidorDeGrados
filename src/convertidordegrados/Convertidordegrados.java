/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertidordegrados;

/**
 *
 * @author jcplo
 */
public class Convertidordegrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa la temperatura en grados Celsius: ");
    double celsius = scanner.nextDouble();        
    System.out.println("Elegir opción para convertir la temperatura:");
    System.out.println("Convertir a Fahrenheit");
    System.out.println("Convertir a Kelvin");        
    System.out.print("Ingresar la opción: ");
    int opcion = scanner.nextInt();
    switch (opcion){
    default:
    if (opcion == Fahrenheit){
    double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.println("La temperatura convertida a Fahrenheit es: " + fahrenheit + " °F");
    }else if (opcion == Kelvin) {             
    double kelvin = celsius + 273.15;
    System.out.println("La temperatura convertida a Kelvin es: " + kelvin + " K");
    }else{
    System.out.println("Opción no válida");
    }
  }
    scanner.close();
    }
}
