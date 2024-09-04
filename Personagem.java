import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Personagem{
    public int moedas = 100;
    public String nome;
    public String racaPersonagem;
    public String classePersonagem;
    public int level = 1;
    public int exp = 0;
    public int pontosAtributos = 5;
    public int raca;
    public int classe;
    public int capacidade = 0;
    public List<String> inventario = new ArrayList<>();

    public int vigor = 0;
    public int forca = 0;
    public int defesa = 0;
    public int intelecto = 0;
    public int piedade = 0;
    public int destreza = 0;
    public int carisma = 0;

    public String elmo = "";
    public String ombreiras = "";
    public String peitoral = "";
    public String vestes = "";
    public String bracadeiras = "";
    public String luvas = "";
    public String calca = "";
    public String botas = "";
    public String capa = "";
    
    public String anel1 = "";
    public String anel2 = "";
    public String colar = "";
    public String brasao = "";
    public String bandeirola = "";

    public String cajado = "";
    public String espada = "";
    public String martelo = ""; 
    public String machado = "";
    public String maca = "";
    public String lanca = "";
    public String foice = ""; 
    public String adaga = ""; 
    public String escudo = "";
    public String arco = ""; 

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    Itens itens = new Itens();

    public void CriarPersonagem(){
        inventario.add(cajado + espada + peitoral); 
        System.out.println("Qual seu Nome?: ");
        nome = scanner.nextLine();

        System.out.println("Qual sua Raça?: ");
        System.out.println("1. Humano");
        System.out.println("2. Elfo");
        System.out.println("3. Anão");
        System.out.println("4. Gnomo");
        raca = scanner.nextInt();

        System.out.println("Qual sua Classe?: ");
        System.out.println("1. Guerreiro");
        System.out.println("2. Caçador");
        System.out.println("3. Mago");
        System.out.println("4. Paladino");
        classe = scanner.nextInt();

        if(classe == 1){
            espada = "Espada longa de Ferro [Comum]";
            peitoral = "Peitoral de Couro [Comum]";            
            itens.AdicionarItens(espada);
            itens.AdicionarItens(peitoral);
        }

        if(classe == 2){
            arco = "Arco de Madeira [Comum]";
            itens.AdicionarItens(arco);
        }

        if(classe == 3){
            cajado = "Cajado Longo de Madeira [Comum]";
            vestes = "Manto de Tecido [Comum]";
            itens.AdicionarItens(cajado);
            itens.AdicionarItens(vestes);
        }

        if(classe == 4){
            espada = "";
            escudo = "";
            inventario.add("Peitoral de Malha [Comum]");
            inventario.add("Martelo Curto de Aço [Comum]");
            inventario.add("Escudo Pequeno de Madeira [Comum]");
        }

        //humano
        if(raca == 1){
            racaPersonagem = "Humano";
            capacidade = 130;
            vigor = random.nextInt(25);
            forca = random.nextInt(15);
            defesa = random.nextInt(15);
            intelecto = random.nextInt(5);
            piedade = random.nextInt(5);
            destreza = random.nextInt(5);
            carisma = random.nextInt(20);

            destreza = (int) (destreza * 1.5);
            carisma = (int) (carisma * 1.3);
        }
        //elfo 
        if(raca == 2){
            racaPersonagem = "Elfo";
            capacidade = 80;
            vigor = random.nextInt(25);
            forca = random.nextInt(5);
            defesa = random.nextInt(10);
            intelecto = random.nextInt(25);
            piedade = random.nextInt(25);
            destreza = random.nextInt(20);
            carisma = random.nextInt(5);

            intelecto = (int) (intelecto * 1.5);
            vigor = (int) (vigor * 1.3);
        } 
        //anão
        if(raca == 3){
            racaPersonagem = "Anão";
            capacidade = 180;
            vigor = random.nextInt(25);
            forca = random.nextInt(20);
            defesa = random.nextInt(25);
            intelecto = random.nextInt(5);
            piedade = random.nextInt(5);
            destreza = random.nextInt(10);
            carisma = random.nextInt(15);

            defesa = (int) (defesa * 1.5);
            forca = (int) (forca * 1.3);
        } 
        //gnomo
        if(raca == 4){
            racaPersonagem = "Gnomo";
            capacidade = 100;
            vigor = random.nextInt(25);
            forca = random.nextInt(15);
            defesa = random.nextInt(5);
            intelecto = random.nextInt(25);
            piedade = random.nextInt(25);
            destreza = random.nextInt(20);
            carisma = random.nextInt(20);

            piedade = (int) (piedade * 1.5);
            intelecto = (int) (intelecto * 1.3);
        }

        System.out.println("=======================");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + racaPersonagem);
        System.out.println("Classe: " + classePersonagem);
        System.out.println("Level: " + level);
        System.out.println("=======================");
        System.out.println("        STATS          ");
        System.out.println("");
        System.out.println("Pts Atributos: " + pontosAtributos);
        System.out.println("=======================");
        System.out.println("VIG: " + vigor);
        System.out.println("FOR: " + forca);
        System.out.println("DEF: " + defesa);
        System.out.println("INT: " + intelecto);
        System.out.println("PIE: " + piedade);
        System.out.println("DES: " + destreza);
        System.out.println("CAR: " + carisma);
        System.out.println("=======================");
        System.out.println("         ITENS         ");
        System.out.println("=======================");
        System.out.println(inventario); 
        System.out.println("=======================");
    }
}