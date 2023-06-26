package subtitulo.analysis;

import subtitulo.node.ATime;
import subtitulo.node.TDigit;
import subtitulo.node.TText;

import java.util.ArrayList;

public class Visitador extends DepthFirstAdapter {

    ArrayList<String> nodos = new ArrayList<String>();

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

    public ArrayList<String> getNodos() {
        return nodos;
    }
}
