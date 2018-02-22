/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201700857;

import java.util.Scanner;

/**
 *
 * @author Bminas
 */
public class Tarea3_201700857 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       menuprincipal();
       
    }
    public static void menuprincipal(){
        Scanner entrada = new Scanner(System.in);
       int a;
        String mprincipal[] = {"1.Usuarios","2.Contador de dígitos","3.Tres números de mayor a menor","4.Calcular promedio","5.Salir"};
        System.out.println("///////////////////////////////");
        for(String elemento:mprincipal)
            System.out.println(elemento);
        System.out.println("///////////////////////////////");
        a = entrada.nextInt();
        switch (a){
            case 1://Abre el menú de usuario
                System.out.println("///////////////////////////////");
                menu1();
            case 2://Abre el menú de números
                System.out.println("///////////////////////////////");
                menu2();
            case 5:
                System.exit(0);
            default://En caso de no poner un número correcto da la oportunidad de abrir denuevo el programa
                System.out.println("///////////////////////////////");
                System.out.println("El número ingresado está incorrecto");
                menuprincipal();
        }
        }
    public static void menu1(){
        
        int b,i;
        Scanner entrada = new Scanner(System.in);
        String m1[] = {"1.Ingresar usuarios","2.Mostrar usuarios ascendente","3.Mostrar usuarios descendente","4.Menú Principal"};
        String usuario[] = new String[5];
        System.out.println("///////////////////////////////");
        for (String menu2:m1)
            System.out.println(menu2);
        System.out.println("///////////////////////////////");
        b = entrada.nextInt();
        switch (b){
            case 1://Sirve para ingresar los nombres de los usuarios
                System.out.println("///////////////////////////////");
                System.out.println("Ingerse el nombre del primer usuario");
                usuario[0] = entrada.next();
                System.out.println("Ingerse el nombre del segundo usuario");
                usuario[1] = entrada.next();
                while (usuario[0].equals(usuario[1])){
                
                    System.out.println("Debe ingresar otro nombre que no este escrito");
                    usuario[1] = entrada.next();
        }
            
                System.out.println("Ingerse el nombre del tercer usuario");
                usuario[2] = entrada.next();
                while (usuario[2].equals(usuario[0])||usuario[2].equals(usuario[1])){
                    System.out.println("Este usuario ya existe, debe ingresar otro");
                    usuario[2] = entrada.next();
                }
                System.out.println("Ingerse el nombre del cuarto usuario");
                usuario[3] = entrada.next();
                while (usuario[3].equals(usuario[0])||usuario[3].equals(usuario[1])||usuario[3].equals(usuario[2])){
                    System.out.println("Este usuario ya existe, debe ingresar otro");
                    usuario[3] = entrada.next();
                }
                System.out.println("Ingerse el nombre del quinto usuario");
                usuario[4] = entrada.next();
                while (usuario[4].equals(usuario[0])||usuario[4].equals(usuario[1])||usuario[4].equals(usuario[2])||usuario[4].equals(usuario[3])){
                    System.out.println("Este usuario ya existe, debe ingresar otro");
                    usuario[4] = entrada.next();
                }
                System.out.println("Volviendo a Usuarios");
                System.out.println("///////////////////////////////");
                menu1();
            case 2://Imprime los usuarios en orden invertido al que fue ingresado
                System.out.println("///////////////////////////////");
                for (int x=usuario.length-1;x>=0;x--){
                System.out.println(usuario[x]);
                }
                System.out.println("///////////////////////////////");
                menu1();
            case 3://Imprime los usuarios en orden en que fueron ingresados
                System.out.println("///////////////////////////////");
                for (i = 0;i<usuario.length;i++){
                    System.out.println(usuario[i]);
                }
                System.out.println("///////////////////////////////");
                menu1();
            case 4://Permite volver al menu principal
                menuprincipal();
                }   
        }
    public static void menu2(){
        Scanner entrada=new Scanner(System.in);
        double num=0;
        int c,replica;
        
        String m2[] = {"1.Ingresar número","2.Mostrar número de dígitos","4.Menú Principal"};
        for (String z:m2)
            System.out.println(z);
        c = entrada.nextInt();
        double y=0;
        switch (c){
                case 1://Permite ingresar el numero deseado entre 0 y 100000
                    System.out.println("///////////////////////////////");
                    System.out.println("Escriba un número entero entre 0 y 100000");
                    num = entrada.nextInt();
                    while (num<0||num>100000){
                        System.out.println("El numero ingresado es menor a 0 o mayor a 100000 por favor ingrese un numero ");
                        num = entrada.nextInt();
                        y=num;
                    }
                    int cont=0;
                    while (num>0){
                    num/=10;
                    cont++;}
                    System.out.println("///////////////////////////////");
                    for (String z:m2)
            System.out.println(z);
                    replica=entrada.nextInt();
                    switch (replica){
                        case 1:
                            menu2();
                        case 2:
                            System.out.println("///////////////////////////////");
                    System.out.println("El número tiene"+cont);
                    
                    System.out.println("///////////////////////////////");
                    menu2();
                    }
                    menu2();
                case 2://Imprime la cantidad de dígitos que tiene el número
                    System.out.println("///////////////////////////////");
                    System.out.println("El número tiene"+y);
                    
                    System.out.println("///////////////////////////////");
                    menu2();
                case 4://Permite volver al menu principal
                    menuprincipal();
                default:
                    System.out.println("///////////////////////////////");
                    System.out.println("El número ingresado es incorrecto");
                    menu2();
        } 
            }
    }

