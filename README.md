            +----------------------+
            |       celular        |
            +----------------------+
            | - nome: String       |
            | - email: String      |
            | - telefone: int      |
            | - estadoCelular: bool|
            +----------------------+
            | + ligarEDesligar()   |
            | + estaLigado(): bool |
            | + getters e setters  |
            +----------------------+
                     ▲
                     │
  ---------------------------------
  |               |               |
  ▼               ▼               ▼
+----------------+  +------------+  +-----------------+
|  navegador    |  |  telefone  |  |   reproduto     |
+----------------+  +------------+  +-----------------+
| + exibirPagina()|  | + ligar()  |  | - moveAndStop  |
| + adicionarAba()|  | + atender()|  | + tocarEPausar()|
| + atualizar()   |  | + correioVoz()|+ tocar()       |
+----------------+  +------------+  | + musicaEscolhida()|
                                    +-----------------+
UML