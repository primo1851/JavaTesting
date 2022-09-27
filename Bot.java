public class Bot extends Personagem implements Interacao{

    boolean inteligente;

    Personagem personagem = new Personagem();

    @Override
    void mostraInfo() {
        System.out.println("O bot" + personagem + "é inteligente?: " + inteligente);

    }

    @Override
    void fazMissao() {
        System.out.println("O bot" + personagem + "realizou a missão");

    }

    @Override
    public void interagir(){
        System.out.println("Selecione x para interagir");        
    }

}