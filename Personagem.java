public class Personagem{
     int cont;
     int id;
     String nome;
     int vida;
     int moedas;

     void mostraInfo(){
        System.out.println(cont + " " + 
        id + " " + 
        nome + " " + 
        vida + " " + 
        moedas + " "
        );

    }

     void fazMissao(){
        System.out.println("Missao: Concluida"); 
        
    }
}