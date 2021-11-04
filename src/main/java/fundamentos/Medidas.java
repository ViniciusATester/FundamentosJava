package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {

    static Scanner entrada = new Scanner(System.in);
    ;

    public static void main(String[] args) {
        String opcao = "";
        double area = 0; //recebe o resultado dos calculos de area

        //instanciar o objeto de leitura do console
       // while (!opcao.toUpperCase().equals("s")) {

            System.out.println("Escolha o calculo desejado");
            System.out.println("(1) - Area do quadrado");
            System.out.println("(2) - Area do retangulo");
            System.out.println("(3) - Area do triangulo");
            System.out.println("(4) - Area do  circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Finbonacci");
            System.out.println("(7) - Contagem regressiva");
            System.out.println("(8) - CDivisao por zero");
            System.out.println("(S) - Sair");

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
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "8":
                    divisaoPorZero();
                    break;
                case "s":
                case "S":
                    System.out.println("Agradecemos pela preferencia !!");
                    break;
                 default:
                     System.out.println("Opção invalida: " + opcao);
            }

            if (area > 0) {
                System.out.println("A area e de: " + area + "m²");
            }
        //}

    }

    public static int calcularAreaDoQuadrado() {
        int lado;

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt();

        for (int linha = 1; linha <= lado; linha++) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("█");
            }
            System.out.println("");
        }
        System.out.println("");

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

    public static int calcularAreaDoTriangulo() {
        int base;
        int altura;

        System.out.println("Digite a base: ");
        base = entrada.nextInt();
        System.out.println("Agora digite a altura: ");
        altura = entrada.nextInt();
        return (base * altura) / 2;

    }

    public static double calcularAreaDoCirculo() {

        double raio;

        //raio = Float.parseFloat(in.nextLine());
        //rea = Math.PI * Math.pow(raio, 2);
        //System.out.println("A area do circulo de raio " +
        //      raio + " é igual a " + area);

        System.out.println("Digite o raio do circulo: ");
        raio = Float.parseFloat(entrada.nextLine());
        return (Math.PI * Math.pow(raio, 2));

    }

    public static void tabuada() {
        System.out.println("Você quer calcular a tabuada de qual numero??");
        byte numero = entrada.nextByte();

        for (byte i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);

        }
    }

    public static void fibonacci() {
        System.out.println("Quantos numeros deseja calcular na sequencia? ");
        byte numero = entrada.nextByte();

        switch (numero) {
            case 0:
                System.out.println("A sequencia esta vazia");
                break;
            case 1:
                System.out.println("Sequencia de Fibonnacci: 1");
                break;
            default:
                int num1 = 1;
                int num2 = 1;

                System.out.println("Sequencia de Fibonnacci: 1");
                for (byte i = 2; i <= numero; i++) {
                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }


        /*if(numero >0){
            int num1 = 1;
            System.out.println(num1 + " ");

            int num2 = 0;
            int fib = num1+num2;
            System.out.println(fib+ " ");


        for(byte i=1;i <= numero;i++) {
            System.out.println("Aqui mostra asequencia");
        }

        }else {
            System.out.println("A sequencia e vazia");
        }*/
    }

    public static void contagemRegressiva() {
        System.out.print("Começar a contagem a partir de qual numero??");
        int numero = entrada.nextInt();

        System.out.print("Diminuindo de quantos em quantos numeros??");
        int decrescimo = entrada.nextInt();

        for (int i = numero; i >= 1; i -= decrescimo) {

            System.out.println(i);
        }

    }

    public static void divisaoPorZero() {
        try {
            System.out.println("Qual e o dividendo?? (Numero a ser dividido)");
        float dividendo = entrada.nextInt();
        System.out.println("Qual o divisor?? (Numero ue vai dividir o dividendo)");
        float divisor = entrada.nextInt();


            System.out.println("o resultado e : " + dividendo / divisor);

        } catch(Exception e)   {
            System.out.println("nao e possivel dividir por zero - Erro "+ e.getMessage());
        }
        finally {
            System.out.println("por hoje é só pessoal!!");
        }
    }
}