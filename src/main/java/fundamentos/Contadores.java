package fundamentos;

public class Contadores extends Medidas implements ContadoresMedidas {
    public static void main(String[] args) {
        System.out.println("Deseja realizar a contagem regressiva ??  <S/N>");
        String resposta = entrada.nextLine();
        switch (resposta) {
            case "s":
            case "S":
                ContadoresMedidas.contagemRegressiva();
                break;
            default:
                System.out.println("Escolheu um texto diferente de \"S\" ");
        }
    }

}
