package subtitulo.analysis;

import subtitulo.node.ATime;
import subtitulo.node.Subtitulo;
import subtitulo.node.TDigit;
import subtitulo.node.TText;

import java.util.ArrayList;

public class Visitador extends DepthFirstAdapter {

    private ArrayList<String> nodos = new ArrayList<String>();

    @Override
    public void caseTDigit(TDigit node) {
        nodos.add(node.getText());
    }

    @Override
    public void caseATime(ATime node) {
        nodos.add(node.toString());
    }

    @Override
    public void caseTText(TText node) {
        nodos.add(node.getText());
    }

    public ArrayList<Subtitulo> getSubtitulos() {

        ArrayList<Subtitulo> subtitulos = new ArrayList<>();
        for(int i=0 ; i < nodos.size() ; i+=3){
            Subtitulo sub = new Subtitulo();
            sub.setSecuencia(Integer.parseInt(nodos.get(i)));
            sub.setTiempo(nodos.get(i+1).replace(" ",""));
            sub.setSubtitulo(nodos.get(i+2));
            subtitulos.add(sub);
        }

        return subtitulos;
    }
}
