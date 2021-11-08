package fundamentos;

import static fundamentos.Medidas.entrada;

public interface ContadoresMedidas {
    static void contagemRegressiva() {

        System.out.print("Começar a contagem a partir de qual numero??");
        int numero = entrada.nextInt();


        for (int i = numero; i >= 1; i--) {

            System.out.println(i);
        }
        System.out.println("Usou uma modificação do metodo");

    }


}
