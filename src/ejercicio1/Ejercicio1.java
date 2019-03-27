/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;
 // // /// /////// /// ////////////
/**
 *
 * @author Erika Rodriguez
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        ArrayList arreglo= new ArrayList();
        boolean flag= true;
        
        llenarArreglo(arreglo,in);
        
        do{
            System.out.println("________________________________");
            System.out.println("\t1.SUMAR ARREGLO              ");
            System.out.println("\t2.SALIR");
            System.out.println("________________________________");
            int res= in.nextInt(); in.nextLine();
            
            switch(res){
                case 1:
                    sumarArreglo(arreglo);
                    break;
                case 2:
                    flag=false;
            }
            break;
        }while(flag);
    }

    private static void llenarArreglo(ArrayList arreglo, Scanner in) {
        System.out.println("Cuantos numeros desea ingresar?: ");
        int num= in.nextInt();
        for(int i=0; i<num; i++){
            System.out.println("Ingrese un numero al arreglo: ");
            arreglo.add(in.nextInt());
            }
    }

    private static void sumarArreglo(ArrayList arreglo) {
            System.out.println(arreglo);
            if(arreglo.size()%2==0){
                for( int i=0; i<arreglo.size();i++){
                    int num = (int) arreglo.get(0);
                    int num1= (int) arreglo.get(arreglo.size()-1);
                    int suma=  num+ num1;
                    System.out.println("La suma es: "+suma);
                    arreglo.remove(arreglo.size()-1);
                    arreglo.remove(0);
                }
            }
            else{
                int r1= ((arreglo.size()/2));
                for(int i=0; i<r1;i++){
                    int num = (int) arreglo.get(0);
                    int num1= (int) arreglo.get(arreglo.size()-1);
                    int suma=  num+ num1;
                    System.out.println("La suma es: "+suma);
                    arreglo.remove(arreglo.size()-1);
                    arreglo.remove(0);
                    
                }
                int suma_ultimo = (int) (arreglo.get(0));
                int sumaimpar = suma_ultimo +suma_ultimo;
                System.out.println("La suma es: "+ sumaimpar);
                arreglo.remove(0);
               
            }
            if (arreglo==null){
                System.out.println("l");
            }
    }
    
}
