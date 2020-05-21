package uf5a01circulos;

import circulo.Circulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    
    ArrayList<Circulo> circulos = new ArrayList<Circulo>();
    
    public static void main(String[] args) {
        App app = new App();
        app.start();

    }
    
    public void start(){
        double radio;
        do{
            radio = radioRandom();
            if(radio>=0.1){
                circulos.add(new Circulo(radio));
            }            
        }while(radio>=0.1);
        
        int numero = preguntaUsuario();
        ordenarLista(numero);
        imprimirLista();
        
    }
    
    public double radioRandom(){
        return Math.random();
    }
    
    public int preguntaUsuario(){
        Scanner scanner = new Scanner(System.in);
        int respuesta = 0;
        boolean respuestaOK = false;
        do{
            System.out.println("Quiere ordenarlo de manera Ascendente(1) o Descendente(2)?");
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
            Collections.sort(circulos);
        }else{
            Collections.sort(circulos, Collections.reverseOrder());
        }
    }
    
    public void imprimirLista(){
        for(Circulo circulo : circulos){
            System.out.println(circulo); 
        }
    }
    
}
