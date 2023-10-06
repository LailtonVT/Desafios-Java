import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BancoOrganizadorAtivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> ativos = new ArrayList<>();

        int quantidadeAtivos = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantidadeAtivos; i++) {
            String codigoAtivo = scanner.nextLine();
            ativos.add(codigoAtivo);
        }

        // Ordena os ativos em ordem alfabética usando a biblioteca Collections
        Collections.sort(ativos);

        // Imprime a lista completa digitada pelo usuário
        for (String ativo : ativos){
            System.out.println(ativo);
        }

        // Fecha o objeto scanner para evitar vazamento de recursos
        scanner.close();
    }
}
