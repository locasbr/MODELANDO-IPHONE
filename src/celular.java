import java.lang.reflect.Constructor;

public class celular {
  public String nome;
  public String email;
  public int telefone;
  public boolean estadoCelular = false;

  public celular(String nome, String email, int telefone) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
  }

  public void ligarEDesligarCelular() {
    estadoCelular = !estadoCelular;
  }

  // Getters
  public String getNome() {
    return nome;
  }

  public String getEmail() {
    return email;
  }

  public int getTelefone() {
    return telefone;
  }

  public boolean isEstadoCelular() {
    return estadoCelular;
  }

  // Setters
  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setTelefone(int telefone) {
    this.telefone = telefone;
  }

  public void setEstadoCelular(boolean estadoCelular) {
    this.estadoCelular = estadoCelular;
  }

  protected boolean estaLigado() {
    if (!estadoCelular) {
      System.out.println("⚠ O celular está desligado! Ligue-o primeiro.");
      return false;
    }
    return true;
  }
}
