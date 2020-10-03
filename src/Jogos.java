public class Jogos  {



    private int placar;
    private int placarTest; 
    private int minTemporada;
    private int maxTemporada;
    private int recordemin;
    private int recordemax;


    public Jogos(int placar, int placarTest, int minTemporada, int maxTemporada, int recordemin, int recordemax){
        this.placar=placar;
        this.placarTest=placarTest;
        this.minTemporada=minTemporada;
        this.maxTemporada=maxTemporada;
        this.recordemin=recordemin;
        this.recordemax=recordemax;
    }

    /**
     * @Jogos
     * Metodo de que chama váriaveis em TabelaJogo
     */
    public Jogos(){

    }


    /**
     * Métodos Getters e Setters
     * @return
     */
    public int getMinTemporada() {
        return minTemporada;
    }

    public void setMinTemporada(int minTemporada) {
        this.minTemporada = minTemporada;
    }

    public int getMaxTemporada() {
        return maxTemporada;
    }

    public void setMaxTemporada(int maxTemporada) {
        this.maxTemporada = maxTemporada;
    }

    public int getRecordemin() {
        return recordemin;
    }

    public void setRecordemin(int recordemin) {
        this.recordemin = recordemin;
    }

    public int getRecordemax() {
        return recordemax;
    }

    public void setRecordemax(int recordemax) {
        this.recordemax = recordemax;
    }


    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }


    public int getPlacarTest() {
        return this.placarTest;
    }

    public void setPlacarTest(int placarTest) {
        this.placarTest = placarTest;
    }


    public void add(int nextInt) {
    }
}
