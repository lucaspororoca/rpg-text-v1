import java.util.Random;
import java.util.Scanner;

public class Itens {
    public String nomeItem;
    public int valorItem;
    public String raridadeItem;
    public Double pesoItem;
    public String tipoItem;
    public int vantagem;
    public int confirm;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Personagem personagem = new Personagem();

    public void AdicionarItens(String item){
        if(item == "Espada longa de Ferro [Comum]"){
            personagem.forca = personagem.forca + 5;
        }

        if(item == "Cajado Longo de Madeira [Comum]"){
            personagem.intelecto = personagem.intelecto + 5;
        }

        if(item == "Peitoral de Couro [Comum]"){
            personagem.defesa = personagem.defesa + 3;
        }

        if(item == "Manto de Tecido [Comum]"){
            personagem.defesa = personagem.defesa + 1;
        }
    }
   
    public void GerarItem(){
        int randTipoItem = random.nextInt(1);
        int randNomeItem = random.nextInt(100);

        switch (randTipoItem) {
            case 0:
                if(randNomeItem == 1){
                    System.out.println("===============================");
                    System.out.println("Voce deseja equipar este item? ");
                    System.out.println("      1. Sim / 2. Não          ");
                    System.out.println("===============================");                 
                    System.out.println("Elmo de Bronze [Comum]");
                    System.out.println("15 moedas");
                    System.out.println("1.5Kg");
                    System.out.println("===============================");
                    confirm = scanner.nextInt();
                    if(confirm == 1){
                        nomeItem = "Elmo de Bronze [Comum]";
                        valorItem = 15;
                        pesoItem = 1.5;
                        tipoItem = "Elmo";
                    }
                    AdicionarItens(nomeItem);
                }
                break;
            
            case 1:
                if(randNomeItem == 1){
                    nomeItem = "Peitoral de Bronze [Comum]";
                    valorItem = 35;
                    pesoItem = 3.5;
                    tipoItem = "Peitoral";
                }
                break;
            
            default:
                break;
        }
    }

    public String getNomeItem(){
        return this.nomeItem;
    }

    public String getRaridadeItem(){
        return this.raridadeItem;
    }

    public Double getPesoItem(){
        return this.pesoItem;
    }

    public int getValorItem(){
        return this.valorItem;
    }

    public String getTipoItem(){
        return this.tipoItem;
    }

    public void getItem(){
        getNomeItem();
        getPesoItem();
        getRaridadeItem();
        getValorItem();
        getTipoItem();
    }

    public void setNomeItem(String nomeItem1){
        nomeItem = nomeItem1;
    }

    public void setTipoItem(String tipoItem1){
        tipoItem = tipoItem1;
    }
}
