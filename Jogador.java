
public class Jogador extends Personagem {
    int nível;

    Personagem personagem = new Personagem();

    @Override
    void mostraInfo() {
        Skin.mostraInfo();
        Mochila.mostraInfo();
        System.out.println("Nível " + nível + personagem);

    }

    @Override
    void fazMissao() {
        System.out.println("Missao: Concluida");

    }

    void adicionaSkin(Skin skin) {
        System.out.println("Adicionar Skin: default com raridade comum ");
        Skin.nome = "Default";
        Skin.raridade = "comum";

    }

    void adicionaMochila(Mochila mochila) {
        System.out.println("Adicionar Mochila com 3 itens e capacidade de 20  ");
        Mochila.qtdIntens = 3;
        Mochila.capacidade = 20;

    }

}