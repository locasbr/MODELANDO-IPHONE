public class navegador extends celular {

  public navegador(String nome, String email, int telefone) {
    super(nome, email, telefone);
  }

  public void exibirPagina() {
    if (!estaLigado()) return;

    System.out.println("Mostrando página");
  }

  public void adicionarNovaAba() {
    if (!estaLigado()) return;

    System.out.println("Aba adicionada");
  }

  public void atualizarPagina() {
    if (!estaLigado()) return;

    System.out.println("Página atualizada");
  }
}