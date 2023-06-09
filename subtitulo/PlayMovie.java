package subtitulo;

import de.humatic.dsj.*;
import subtitulo.analysis.Visitador;
import subtitulo.lexer.Lexer;
import subtitulo.node.Start;
import subtitulo.node.Subtitulo;
import subtitulo.parser.Parser;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class PlayMovie implements java.beans.PropertyChangeListener {

  private DSFiltergraph movie;
  private JavaOverlayFilter jof;
  private java.awt.Graphics2D g2d;
  private Vector subtitulos;
  private String texto_subtitulo = "Fundamentos de Ciencias de la Computacion";

  public PlayMovie() {

  }

  public void createGraph() {
    // reemplazar esta instruccion por su propio codigo de desbloqueo
    // DSEnvironment.unlockDLL("lgajardo@ubiobio.cl", 755802, 2966957, 0);
    DSEnvironment.unlockDLL("non@commercial.dsj", 75720, 1309601, 0);
    JFrame f = new JFrame("dsj - play movie");
    FileDialog fd = new FileDialog(f, "select movie", FileDialog.LOAD);
    fd.setVisible(true);
    if (fd.getFile() == null)
      return;
    movie = new DSMovie(fd.getDirectory() + fd.getFile(), DSFiltergraph.DD7, this);
    f.getContentPane().add(BorderLayout.CENTER, movie.asComponent());
    f.getContentPane().add(BorderLayout.SOUTH, new SwingMovieController(movie));
    f.pack();
    f.setVisible(true);

    jof = movie.insertOverlayFilter(JavaOverlayFilter.CALLBACK);
    g2d = jof.getDrawingSurface();
    jof.setKeyColor(Color.blue);
    g2d.setFont(new Font("Arial", 1, 18));

    /**********************************************************************
     * Crear aqui el arbol de derivacion
     */

    try {


      Parser p = new Parser(new Lexer(new PushbackReader(new InputStreamReader(new FileInputStream("C:\\Users\\josei\\IdeaProjects\\Tarea2FundamentosSubtitulosSableCC\\House.S08.Special-Swan.Song.HDTV.XviD (2).srt"),"cp1252"))));

      Start tree = p.parse();

      Visitador vis = new Visitador();

      tree.apply(vis);
      ArrayList<Subtitulo> subtitulos = vis.getSubtitulos();

    // Ejemplo que indica como programar el timer
      for (int i = 0; i < subtitulos.size(); i++) {
        String timeio = subtitulos.get(i).getTiempo();

        int hrsI = Integer.parseInt(timeio.substring(0, 2));
        int mntosI = Integer.parseInt(timeio.substring(3, 5));
        int sgdosI = Integer.parseInt(timeio.substring(6, 8));
        int milsI = Integer.parseInt(timeio.substring(9, 12));

        int hrsO = Integer.parseInt(timeio.substring(15, 17));
        int mntosO = Integer.parseInt(timeio.substring(18, 20));
        int sgdosO = Integer.parseInt(timeio.substring(21, 23));
        int milsO = Integer.parseInt(timeio.substring(24, 27));

        long tiempoEntrada = (long) (milsI + sgdosI * 1000 + mntosI * 60000 + hrsI * 3600000);
        long tiempoSalida = (long) (milsO + sgdosO * 1000 + mntosO * 60000 + hrsO * 3600000);

        new Reminder(tiempoEntrada, subtitulos.get(i).getSubtitulo()); // muestra el texto
        new Reminder(tiempoSalida, ""); // borra el texto
      }

      /*
      String timeio = "00:00:24,641-->00:00:27,031";

      int hrsI = Integer.parseInt(timeio.substring(0, 2));
      int mntosI = Integer.parseInt(timeio.substring(3, 5));
      int sgdosI = Integer.parseInt(timeio.substring(6, 8));
      int milsI = Integer.parseInt(timeio.substring(9, 12));

      int hrsO = Integer.parseInt(timeio.substring(17, 19));
      int mntosO = Integer.parseInt(timeio.substring(20, 22));
      int sgdosO = Integer.parseInt(timeio.substring(23, 25));
      int milsO = Integer.parseInt(timeio.substring(26, 29));

      long tiempoEntrada = (long) (milsI + sgdosI * 1000 + mntosI * 60000 + hrsI * 3600000);
      long tiempoSalida = (long) (milsO + sgdosO * 1000 + mntosO * 60000 + hrsO * 3600000);

      new Reminder(tiempoEntrada, "Tarea 1 - Uso de gramaticas - aplicacion practica"); // muestra el texto
      new Reminder(tiempoSalida, ""); // borra el texto


       */
      /**
       * Don't do this at home. This demo relies on dsj closing and disposing off
       * filtergraphs when the JVM exits. This is
       * OK for a "open graph, do something & exit" style demo, but real world
       * applications should take care of calling
       * dispose() on filtergraphs they're done with themselves.
       **/
      f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }catch (Exception e){
      System.out.println(e.getMessage());
    }

  }

  public void propertyChange(java.beans.PropertyChangeEvent pe) {
    // System.out.println("received event or callback from "+pe.getPropagationId());
    switch (DSJUtils.getEventType(pe)) {
    }

    try {
      /** escritura de subtitulo sobre el video **/
      g2d.clearRect(0, 0, (int) (movie.getMediaDimension().getWidth()), (int) (movie.getMediaDimension().getHeight()));
      g2d.setColor(java.awt.Color.white);
      g2d.drawString(texto_subtitulo, 20, (int) (movie.getMediaDimension().getHeight()) - 10);

      try {
        jof.submitFrame();
      } catch (Exception e) {
        g2d = jof.getDrawingSurface();
        System.out.println(e.toString());
      }

      /** g2d may be null on first call **/
    } catch (NullPointerException npe) {
    }
  }

  public static void main(String[] args) {
    new PlayMovie().createGraph();
  }

  public class Reminder {
    Timer timer;
    String texto;
    String color;
    Font f;

    public Reminder(long seconds, String texto) {
      this.texto = texto;
      timer = new Timer();
      timer.schedule(new RemindTask(), seconds); // 5000 milisegundos = 5 segundos
    }

    class RemindTask extends TimerTask {
      public void run() { // se ejecuta solo cuando se cumple el tiempo y de manera simultanea al video
        texto_subtitulo = texto;
        System.out.println(texto);
      }
    }
  }
}