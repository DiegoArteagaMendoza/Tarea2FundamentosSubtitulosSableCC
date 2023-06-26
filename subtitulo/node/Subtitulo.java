package subtitulo.node;

public class Subtitulo {

    private int secuencia;
    private String tiempoInicio;
    private String tiempoFin;
    private String subtitulo;

    public Subtitulo() {
    }

    public Subtitulo(int secuencia, String tiempoInicio, String tiempoFinal, String subtitulo) {
        this.secuencia = secuencia;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFin = tiempoFinal;
        this.subtitulo = subtitulo;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public String getTiempoInicio() {
        return tiempoInicio;
    }

    public String getTiempoFin() {
        return tiempoFin;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public void setTiempoInicio(String tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public void setTiempoFin(String tiempoFin) {
        this.tiempoFin = tiempoFin;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

}
