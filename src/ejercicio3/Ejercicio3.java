/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author SERGIO CUERVO 20241222272
 */
import java.util.Scanner; public class Ejercicio3 { public static void main(String[] args) {

//Fruteria ofrece descuento segun los kilos comprados
//De 0-2 kilos ofrece 0% de descuento
//De 2.1-5 ofrece 10% de descuento
//De 5.1-10 ofrce 15% de descuento
//DE 10.1 en adelante ofrece 20% de desceunto
double fruta;
double Descuento=0;
double Valortotal=0;
double valorkilo=7500;
double valorSubtotal=0;
Scanner cliente = new Scanner(System.in);
System.out.println("Cuantos kilos de fruta va a llevar?: ");
fruta = cliente.nextDouble();

if(fruta>0 && fruta<2){
 Descuento=(0);
}
else if(fruta>2 && fruta<5){
 Descuento=(0.10);
}
else if(fruta>5 && fruta<10){
 Descuento=(0.15);
}
else if(fruta>10){
 Descuento=(0.20);
}
valorSubtotal=(fruta*valorkilo);
Valortotal=valorSubtotal-(valorSubtotal*Descuento);
System.out.println("El valor de la fruta es: "+ Valortotal);
} }