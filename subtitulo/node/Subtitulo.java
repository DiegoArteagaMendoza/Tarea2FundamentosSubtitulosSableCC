package subtitulo.node;

public class Subtitulo {

    private int secuencia;
    private String tiempo;
    private String subtitulo;

    public Subtitulo() {
    }

    public Subtitulo(int secuencia, String tiempo, String subtitulo) {
        this.secuencia = secuencia;
        this.tiempo = tiempo;
        this.subtitulo = subtitulo;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public String getTiempo() {
        return tiempo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

}
