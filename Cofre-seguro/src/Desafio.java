import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();

    if (tipoCofre.equalsIgnoreCase("digital")) {
      // Se o tipo de cofre for digital, leia a senha e a confirmação de senha
      int senha = Integer.parseInt(scanner.nextLine());
      int confirmacaoSenha = Integer.parseInt(scanner.nextLine());

      // Crie um cofre digital com a senha fornecida
      CofreDigital cofreDigital = new CofreDigital(senha);

      // Verifique se a senha está correta
      if (cofreDigital.validarSenha(confirmacaoSenha)) {
        System.out.println("Tipo: Cofre Digital");
        System.out.println("Metodo de abertura: Senha");
        System.out.println("Cofre aberto!");
      } else {
        System.out.println("Tipo: Cofre Digital");
        System.out.println("Metodo de abertura: Senha");
        System.out.println("Senha incorreta!");
      }
    } else if (tipoCofre.equalsIgnoreCase("fisico")) {
      // Se o tipo de cofre for físico, crie um cofre físico
      CofreFisico cofreFisico = new CofreFisico();
      System.out.println("Tipo: Cofre Fisico");
      System.out.println("Metodo de abertura: Chave");
    } else {
      // Tipo de cofre inválido
      System.out.println("Tipo de cofre inválido.");
    }
  }
}
