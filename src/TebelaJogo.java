import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Classe Onde sera inserido Todos dados do Jogo
 */
public class TebelaJogo {

    /**
     * Parametros que define a classe onde irá Executar o Programa.
     * @param args
     */
    public static void main(final String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner leiaOpcao = new Scanner(System.in);

        /**
         * Criando ArrayList Classe Jogos de nome (ListaJogos)
         */
        //criando ArrayList Classe Jogos Nome ListaJogos.
        ArrayList<Jogos> ListaJogo = new ArrayList<>();

        //Método Construtor
        Jogos jogo = new Jogos();

        System.out.println("|     INICIO TABELA     |");
        System.out.println("|     INSERIR DADOS     |");
        System.out.println();
        System.out.println("| OBS:Placar numeros    |");
        System.out.println("| Inteiros,Positivos e  |");
        System.out.println("| Menores que 1000.     |");

        System.out.println("________________________");


        /**
         * @while
         * While Menu onde podera escolher quais opções irá ser feita
         */
        int opcao = 99;
        while (opcao != 0) {

            System.out.println("|        MENU JOGO       |");
            System.out.println("|     1 INSERIR JOGO     |");
            System.out.println("|     2 CONSULTAR TABELA |");
            System.out.println("|     3 NOVO JOGO        |");
            System.out.println("|     0 SAIR             |");
            System.out.println();

            opcao = (leiaOpcao.nextInt());


            //Comando Escolha
            switch (opcao) {


                /**
                 * @switch
                 * Opção Interface de Inserção de Jogos
                 */
                //Inserir dados no Jogo
                case 1: {

                    //Informando quantos jogos ira adicionar na tabela
                    int n;
                    System.out.println("| QUANTOS JOGOS? |");
                    n=(leia.nextInt());

                    for (int i = 0; i < n; i++) {

                        //armazena Jogo
                        System.out.println("|  Jogo :|" + (i + 1));
                        System.out.println("| Informe o Placar:|");
                        int placar = (leia.nextInt());


                        //Recebendo = Placar Mínimo e Máximo da temporada

                        int minTemporada = placar;
                        int maxTemporada = placar;
                        int recordmin = 0;
                        int recordmax = 0;


                        /**
                         * @while
                         *  Verificações de placare recordes.
                         */
                             //Verificação de numeros positivos e menores que 1000.
                             while (placar <= 0 == placar <1000) {
                                    System.out.println("| Seu placar não  'Positvo' !|");
                                    System.out.println("| Informe Placar >Novamente< |");
                                    placar = (leia.nextInt());

                                    //recebe o placar caso entre na verificação.
                                     minTemporada = placar;
                             }

                        /**
                         * @if
                         *  Verificações de placare recordes.
                         */
                        // Verificação para anotar o recorde.
                        if ( placar < 5) {
                            recordmin = 1;

                        }else{

                            recordmax = 1;
                        }

                        System.out.println("| Placar salvo com sucesso!  |");
                        System.out.println();

                        /**
                         * @ListaJogo.add
                         * ArrayList para criar uma nova referência de Objeto
                         */
                        ListaJogo.add(new Jogos(placar,minTemporada,maxTemporada,recordmin,recordmax));

                    }
                    break;

                }
                /*
                 * @while
                 * Interface para Consulta de Jogos
                 */
                case 2: {
                    //for para percorrer o ARRAYLIST
                    for (int i = 0; i < ListaJogo.size(); i++) {

                        //TABELA DO JOGO
                        System.out.println();
                        System.out.println("___________________-");
                        System.out.println("| Tabela Proway!   |");
                        System.out.println("| Jogo         : "+( i+ 1 ) +" |");
                        System.out.println("|                              |");
                        System.out.println("| Placar       : "+ListaJogo.get(i).getPlacar()+" |");
                        System.out.println("| Min-Temporada: "+ ListaJogo.get(i).getMinTemporada()+" |");
                        System.out.println("| Máx-Temporada: "+ ListaJogo.get(i).getMaxTemporada()+" |");
                        System.out.println("| Record-Min   : "+ ListaJogo.get(i).getRecordemin()+"   |");
                        System.out.println("| Record-Max   : "+ ListaJogo.get(i).getRecordemax()+"   |");
                        System.out.println("___________________-");
                        System.out.println();

                    }
                    break;
                }
                case 3: {

                }
            }
        }
    }
}


/*
    Iterator itr = ListaJogo.iterator();
                    while (itr.hasNext()){
                            Object element = itr.next();
                            System.out.println(element+ " >| ");
                            }*/