package voting.rest.business.models.entities;

public class Vote {

    private Theme tema;

    private int id;

    private int voto;

    public Vote(Theme tema, int id, int voto) {
        super();
        this.tema = tema;
        this.id = id;
        this.voto = voto;
    }

    /**
     * @return the tema
     */
    public Theme getTema() {
        return tema;
    }

    /**
     * @param tema the tema to set
     */
    public void setTema(Theme tema) {
        this.tema = tema;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the voto
     */
    public int getVoto() {
        return voto;
    }

    /**
     * @param voto the voto to set
     */
    public void setVoto(int voto) {
        this.voto = voto;
    }

}
