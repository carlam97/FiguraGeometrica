import java.util.Scanner;

import java.util.Scanner;

public class Principal {
    public static void main(String [] args){
        Quadrado quadrado = new Quadrado();
        System.out.println("Digite o valor do lado");
        Scanner sc = new Scanner(System.in);
        quadrado.setLado(sc.nextDouble());
        System.out.println(quadrado.getNomeFigura());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());

        Triangulo triangulo = new Triangulo();
        System.out.println("Digite o valor A");
        triangulo.setLadoA(sc.nextDouble());
        System.out.println("Digite o valor B");
        triangulo.setLadoB(sc.nextDouble());
        System.out.println("Digite o valor C");
        triangulo.setLadoC(sc.nextDouble());
        System.out.println("Digite o Base");
        triangulo.setBase(sc.nextDouble());
        System.out.println("Digite o Altura");
        triangulo.setAltura(sc.nextDouble());
        System.out.println(triangulo.getNomeFigura());
        System.out.println(triangulo.getArea());
        System.out.println(triangulo.getPerimetro());

        sc.close();

        

    }
    
}
