package fundamentos;

import java.util.Scanner;

public class Medidas {

    static Scanner entrada = new Scanner(System.in);
    ;

    public static void main(String[] args) {
        String opcao;
        double area = 0; //recebe o resultado dos calculos de area

        //instanciar o objeto de leitura do console

        System.out.println("Escolha o calculo desejado");
        System.out.println("(1) - Area do quadrado");
        System.out.println("(2) - Area do retangulo");
        System.out.println("(3) - Area do triangulo");
        System.out.println("(4) - Area do  circulo");

        opcao = entrada.nextLine();//leitura da opcao

        switch (opcao) {
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                area = calcularAreaDoRetangulo();
                break;
            case "3":
                area = calcularAreaDoTriangulo();
                break;
            case "4":
                area = calcularAreaDoCirculo();
                break;

            default:
                System.out.println("Opção invalida: " + opcao);
        }
        System.out.println("A area e de: " + area + "m²");
    }

    public static int calcularAreaDoQuadrado() {
        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt();
        return lado * lado;
    }

    public static int calcularAreaDoRetangulo() {
        int base;
        int altura;

        System.out.println("Digite a base: ");
        base = entrada.nextInt();
        System.out.println("Agora digite a altura, precisa ser um diferente da base: ");
        altura = entrada.nextInt();
        return base * altura;
    }
    public static int calcularAreaDoTriangulo(){
        int base;
        int altura;

        System.out.println("Digite a base: ");
        base = entrada.nextInt();
        System.out.println("Agora digite a altura: ");
        altura = entrada.nextInt();
        return (base * altura)/2;

    }
    public static double calcularAreaDoCirculo(){

        double raio;

        //raio = Float.parseFloat(in.nextLine());
        //rea = Math.PI * Math.pow(raio, 2);
        //System.out.println("A area do circulo de raio " +
          //      raio + " é igual a " + area);

        System.out.println("Digite o raio do circulo: ");
        raio =Float.parseFloat(entrada.nextLine());
        return  (Math.PI * Math.pow(raio, 2));

    }


}