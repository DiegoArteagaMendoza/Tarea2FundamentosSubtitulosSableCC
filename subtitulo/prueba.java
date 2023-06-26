package subtitulo;

import subtitulo.analysis.Visitador;
import subtitulo.lexer.Lexer;
import subtitulo.node.Start;
import subtitulo.node.Subtitulo;
import subtitulo.parser.Parser;

import java.io.FileReader;
import java.io.PushbackReader;
import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        try {
            Parser p = new Parser(new Lexer(new PushbackReader(new FileReader("C:\\Users\\josei\\IdeaProjects\\Tarea2FundamentosSubtitulosSableCC\\subtitulo.srt"))));

            Start tree = p.parse();

            Visitador vis = new Visitador();

            tree.apply(vis);

            ArrayList<Subtitulo> subtitulos = vis.getSubtitulos();

            for (Subtitulo s : subtitulos){
                System.out.println(s.getTiempo());
            }


            for (int i = 0; i < subtitulos.size(); i++) {
                String timeio = subtitulos.get(i).getSubtitulo();
                System.out.println(timeio);
                int hrsI = Integer.parseInt(timeio.substring(0, 2));
                int mntosI = Integer.parseInt(timeio.substring(3, 5));
                int sgdosI = Integer.parseInt(timeio.substring(6, 8));
                int milsI = Integer.parseInt(timeio.substring(9, 12));

                int hrsO = Integer.parseInt(timeio.substring(15, 17));
                int mntosO = Integer.parseInt(timeio.substring(18, 20));
                int sgdosO = Integer.parseInt(timeio.substring(21, 23));
                int milsO = Integer.parseInt(timeio.substring(24, 27));

                System.out.println(hrsI);
                System.out.println(mntosI);
                System.out.println(sgdosI);
                System.out.println(milsI);

                System.out.println(hrsO);
                System.out.println(mntosO);
                System.out.println(sgdosO);
                System.out.println(milsO);


            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
