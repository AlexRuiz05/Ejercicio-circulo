package Ejercicio;

import circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    
    ArrayList<Circulo> arraycirculo = new ArrayList<Circulo>();
    
    public static void main(String[] args) {
        Principal app = new Principal();
        app.start();

    }
    
    public void start(){
        double radio;
        do{
            radio = radioRandom();
            if(radio>=0.1){
                arraycirculo.add(new Circulo(radio));
            }            
        }while(radio>=0.1);
        
        int numero = pregunta();
        ordenarLista(numero);
        imprimirLista();
        
    }
    
    public double radioRandom(){
        return Math.random();
    }
    
    public int pregunta(){
        Scanner scanner = new Scanner(System.in);
        int respuesta = 0;
        boolean respuestaOK = false;
        do{
            System.out.println("Ordenad de manera ascendente(1) o descendente(2)?");
            if(scanner.hasNextInt()){
                respuesta = scanner.nextInt();
                if(respuesta == 1 || respuesta == 2){
                    respuestaOK = true;
                }else{
                    System.out.println("Introduzca un numero valido");
                }
            }else{
                System.out.println("Por favor introduzca 1 o 2");
                scanner.next();
            }
        }while(!respuestaOK);
        return respuesta;
    }
    
    
    public void ordenarLista(int numero){
        if(numero == 1){
            Collections.sort(arraycirculo);
        }else{
            Collections.sort(arraycirculo, Collections.reverseOrder());
        }
    }
    
    public void imprimirLista(){
        for(Circulo circulo : arraycirculo){
            System.out.println(circulo); 
        }
    }
    
}

