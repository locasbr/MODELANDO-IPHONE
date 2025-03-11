📌 Estrutura do Diagrama UML
O diagrama representa a relação entre quatro classes: celular, navegador, telefone e reproduto.

1️⃣ Classe Base: celular (Superclasse)
            Atributos:
            nome: String
            email: String
            telefone: int
            estadoCelular: boolean
            Métodos:
            ligarEDesligarCelular()
            estaLigado(): boolean
            Getters e Setters para os atributos
2️⃣ Classe navegador (Herda de celular)
            Métodos:
            exibirPagina()
            adicionarNovaAba()
            atualizarPagina()
3️⃣ Classe telefone (Herda de celular)
Métodos:
            ligar()
            atender()
            correioDeVoz()
4️⃣ Classe reproduto (Herda de celular)
Atributos:

            moveAndStop: boolean
            Métodos:
            
            tocarEPausar()
            tocar()
            musicaEscolhida()
📌 Relações
A classe celular é a superclasse.
As classes navegador, telefone e reproduto são subclasses que herdam de celular.
Cada subclasse tem métodos específicos para sua funcionalidade.
