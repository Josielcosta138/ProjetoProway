import java.sql.Connection;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.transform.ErrorListener;

/**
 * Classe Onde sera inserido Todos dados do Jogo
 */
public class TebelaJogo {

    //private static int placarTest;
    private static int minTemporadaTest;
    private static int maxTemporadaTest;
    private int recordeminTest;
    private int recordemaxTest;


    String nome ;

    /**
     * Parametros que define a classe onde irá Executar o Programa.
     * 
     * @param args
     */
    public static void main(final String[] args) {

        Scanner leia = new Scanner(System.in);
        Scanner leiaOpcao = new Scanner(System.in);

            
        /**
         * Criando ArrayList Classe Jogos de nome (ListaJogos)
         * E metodo construtor para jogo
         */
        ArrayList<Jogos> ListaJogo = new ArrayList<>();   
        Jogos jogo = new Jogos();

        ArrayList<Jogos> ListaJogo2 = new ArrayList<>();   
        Jogos jogo2 = new Jogos();

        int minTemporada = 0;
        int maxTemporada = 0;
        int  placarTest = 0;

        System.out.println();
        System.out.println();
        System.out.println("|_______________________|");
        System.out.println("|     INICIO TABELA     |");
        System.out.println("|     INSERIR DADOS     |");
        System.out.println("|                       |");
        System.out.println("| OBS:Placar numeros    |");
        System.out.println("| Inteiros,Positivos e  |");
        System.out.println("| Menores que 1000.     |");
        System.out.println("|                       |");
        System.out.println("|_______________________|");
        System.out.println();


        /**
         * @while While Menu onde podera escolher quais opções irá ser feita
         */

        int opcao = 9;
        while (opcao != 0) {

            /**
             * Inicio de tratamento de erro.
             */
            try {

                System.out.println("|________________________|");
                System.out.println("|                        |");
                System.out.println("|        MENU JOGO       |");
                System.out.println("|     1 INSERIR JOGO     |");
                System.out.println("|     2 CONSULTAR TABELA |");
                System.out.println("|     0 SAIR             |");
                System.out.println("|________________________|");
                System.out.println();

                opcao = (leiaOpcao.nextInt());

            } catch (Exception erro) {
                System.out.println("|___________________________________________|");
                System.out.println("|                                           |");
                System.out.println("| Atenção! Insira somente valor *Numérico* >|" + erro);
                System.out.println("|      Execute o código Novamente          >|" + erro);
                System.out.println("|___________________________________________|");

                opcao = (leiaOpcao.nextInt());
                break;
            }

            /**
             * @switch Opção Interface de Inserção de Jogos
             */
            switch (opcao) {

                /**
                 * Informando quantos jogos ira adicionar na tabela
                 */
                case 1: {
                    int n;

                    /**
                     * Inicio de tratamento de erro.
                     */
                    try {
                        System.out.println("| QUANTOS JOGOS? |");
                        n = (leia.nextInt());

                    } catch (InputMismatchException erro) {
                        System.out.println("|___________________________________________|");
                        System.out.println("|                                           |");
                        System.out.println("| Atenção! Insira somente valor *Numérico* >|" + erro);
                        System.out.println("|      Execute o código Novamente          >|" + erro);
                        System.out.println("|___________________________________________|");
                        n = (leia.nextInt());
                        break;
                    }

                    for (int i = 0; i < n; i++) {

                        // armazena cada Jogo
                        System.out.println("|  Jogo :|" + (i + 1));
                        System.out.println("| Informe o Placar:|");
                        int placar = (leia.nextInt());

                        // Recebendo = Placar Mínimo e Máximo da temporada

                       
                        int recordmin = 0;
                        int recordmax = 0;

                        /**
                         * @while Verificações de placar e recordes. Verificação de numeros positivos e
                         *        menores que 1000.
                         */

                        while (placar <= 0 == placar < 1000) {
                            System.out.println("| Seu placar não  'Positvo' !|");
                            System.out.println("| Informe Placar >Novamente< |");
                            placar = (leia.nextInt());
                           // minTemporada = placar;
                        }

                        System.out.println("| PLACAR TEST  : "+placarTest+" |");

                            //NOVOplacar     placar1
                        if (placar < placarTest  ){

                              minTemporada = placar;
                              maxTemporada = placarTest;

                        } else {

                        minTemporada = placar;
                        maxTemporada = placar;

                        }

                        if (placar > placarTest ) {

                            maxTemporada = placar;
                            minTemporada = placarTest;

                        }

                        /**
                         * @if1
                         *  Verificações de placare recordes.
                         *  Verificação para anotar o recorde.
                         */

                        for (int a = 0; i < ListaJogo.size(); i++) {

                        //placar 1    //placar 2
                        if ((placar < placarTest)) {
                            recordmin = 1;
                            recordmax = 0;

                        }else{
                            recordmax = 1;
                            recordmin = 0;
                        }
                        
                        

                    }
                    
                        
                        System.out.println("| Placar salvo com sucesso!  |");
                        System.out.println();

                        /**
                         * @ListaJogo.add
                         * ArrayList para criar uma nova referência de Objeto
                         */
                        ListaJogo.add(new Jogos(placar,placarTest,minTemporada,maxTemporada,recordmin,recordmax));
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
                        System.out.println("|__________________|");
                        System.out.println("| Tabela Proway!   |");
                        System.out.println("| Jogo         : "+( i+ 1 ) +" |");
                        System.out.println("|                  |");
                        System.out.println("| Placar       : "+ListaJogo.get(i).getPlacar()+" |");
                        System.out.println("| Min-Temporada: "+ ListaJogo.get(i).getMinTemporada()+" |");
                        System.out.println("| Máx-Temporada: "+ ListaJogo.get(i).getMaxTemporada()+" |");
                        System.out.println("| Record-Min   : "+ ListaJogo.get(i).getRecordemin()+" |");
                        System.out.println("| Record-Max   : "+ ListaJogo.get(i).getRecordemax()+" |");
                        System.out.println("|__________________|");
                        System.out.println();
                        
                        // Tamanho da Lista
                        System.out.println("Qntd na Lista: "+ListaJogo.size());
                        System.out.println();

                        placarTest = ListaJogo.get(i).getPlacar();
                        minTemporadaTest = ListaJogo.get(i).getMinTemporada();
                        maxTemporadaTest = ListaJogo.get(i).getMaxTemporada();

                    }
                    break;
                }

                /**
                 * Encerrando programa...
                 */
                case 0: {
                        System.out.println();
                        System.out.println("|____________________|");
                        System.out.println("|                    |");
                        System.out.println("|       End...       |");
                        System.out.println("|____________________|");
                }

            }
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

