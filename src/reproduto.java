import java.util.Random;

public class reproduto extends celular {

  public reproduto(String nome, String email, int telefone) {
    super(nome, email, telefone);
  }

  public boolean moveAndStop = false;

  public void tocarEPausar() {
    if (!estaLigado()) return;

    if (!moveAndStop) {
      tocar();
      moveAndStop = true;
    } else {
      moveAndStop = false;
    }
  }

  private void tocar() {
    System.out.println("A música está tocando...");
    System.out.println(musicaEscolhida());
  }

  private String musicaEscolhida() {
    Random random = new Random();
    int numero = random.nextInt(3) + 1;

    switch (numero) {
      case 1:
        return "EU e minha casa";
      case 2:
        return "Tudo posso";
      case 3:
        return "Vai arrebentarrrr";
      default:
        return "Opção inválida";
    }
  }
}