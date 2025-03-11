public class telefone extends celular {

  public telefone(String nome, String email, int telefone) {
    super(nome, email, telefone);
  }

  public void ligar() {
    if (!estaLigado()) return;

    System.out.println("Telefone está ligando...");
  }

  public void atender() {
    if (!estaLigado()) return;

    System.out.println("Atender telefone");
  }

  public void correioDeVoz() {
    if (!estaLigado()) return;

    System.out.println("Iniciando correio de voz");
  }
}