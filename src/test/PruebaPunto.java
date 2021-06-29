
package test;

import dominio.Punto;
import java.util.Scanner;

public class PruebaPunto {
public static void main(String[] args) {
Punto t1;
Scanner e= new Scanner(System.in);
    t1=new Punto();
    int q=0, n;
System.out.println("Punto inicial en x=0;y=0**");
    do{
System.out.println("0. Se va a mover.");
System.out.println("1. Terminado");
    q=e.nextInt();
    switch(q){
case 0:
    plano(t1);
    break;
case 1:
    break;
    default: 
System.out.println("La opcion que ingreso no es valida");
    break;
    }
    
    }while(q!=1);
    
    }

//Entonces
public static void plano(Punto p1){
    int j,n,p,i,f,t=0;
    double r;
    Scanner e= new Scanner(System.in);
System.out.println("Veces que va a realizar movimientos: ");
    j=e.nextInt();
 //No ingrese valores iguales a 0
    do{
        
    if(j<0){
    n=0;
System.out.println("No se mueve o veces");
System.out.println("Ingrese diferente valor: ");
    j=e.nextInt();
    }else{
        
    n=1;
    
}
    
    }while(n!=1);
    for(i=0; i<j; i++){
System.out.println("Ingrese numero de espacios para mover:");
    f=e.nextInt();
    do{
    if(f<0){
System.out.println("Valores inscritos deben ser mayor al 0.");
System.out.println("Ingrese otro valor");
    f=e.nextInt();
    }else{
    n=1;
    }
    }while(n!=1);
    r=Math.random()*12+1;
    t=t+f;
    if(r<3){
             
        p = p1.getY()-f;
            p1.setY(p);
            p1.setJ(f);
System.out.println(p1.toString()+"\n Esta direccion es: arriba");
}
    if(r<3){
    if(r<6){
    p =p1.getY()+f;
    p1.setY(p);
    p1.setJ(f);
    
System.out.println(p1.toString()+"\n Esta direccion es: abajo");
} 
    }
    if(r>5){
    if(r<8){
    p =p1.getX()-f;
    p1.setX(p);
    p1.setJ(f);
System.out.println(p1.toString()+"\n Esta direccion es: derecha");
}
    }
    
    if(r>9){
    p =p1.getX()+f;
    p1.setX(p);
    p1.setJ(f);
System.out.println(p1.toString()+"\n Esta direccion es: izquierda");
}
    }
    
     p1.setJ(t);
     
System.out.println(p1.toString());
    }
}


    