/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.analysis;

import java.util.*;
import subtitulo.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPFilesub().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAFilesub(AFilesub node)
    {
        defaultIn(node);
    }

    public void outAFilesub(AFilesub node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFilesub(AFilesub node)
    {
        inAFilesub(node);
        if(node.getItemlist() != null)
        {
            node.getItemlist().apply(this);
        }
        outAFilesub(node);
    }

    public void inAItemItemlist(AItemItemlist node)
    {
        defaultIn(node);
    }

    public void outAItemItemlist(AItemItemlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAItemItemlist(AItemItemlist node)
    {
        inAItemItemlist(node);
        if(node.getItem() != null)
        {
            node.getItem().apply(this);
        }
        outAItemItemlist(node);
    }

    public void inAItemlistItemlist(AItemlistItemlist node)
    {
        defaultIn(node);
    }

    public void outAItemlistItemlist(AItemlistItemlist node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAItemlistItemlist(AItemlistItemlist node)
    {
        inAItemlistItemlist(node);
        if(node.getItemlist() != null)
        {
            node.getItemlist().apply(this);
        }
        if(node.getItem() != null)
        {
            node.getItem().apply(this);
        }
        outAItemlistItemlist(node);
    }

    public void inAItem(AItem node)
    {
        defaultIn(node);
    }

    public void outAItem(AItem node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAItem(AItem node)
    {
        inAItem(node);
        if(node.getDigit() != null)
        {
            node.getDigit().apply(this);
        }
        if(node.getTime() != null)
        {
            node.getTime().apply(this);
        }
        if(node.getSubs() != null)
        {
            node.getSubs().apply(this);
        }
        outAItem(node);
    }

    public void inATime(ATime node)
    {
        defaultIn(node);
    }

    public void outATime(ATime node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATime(ATime node)
    {
        inATime(node);
        if(node.getTstart() != null)
        {
            node.getTstart().apply(this);
        }
        if(node.getArrow() != null)
        {
            node.getArrow().apply(this);
        }
        if(node.getTend() != null)
        {
            node.getTend().apply(this);
        }
        outATime(node);
    }

    public void inATstart(ATstart node)
    {
        defaultIn(node);
    }

    public void outATstart(ATstart node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATstart(ATstart node)
    {
        inATstart(node);
        if(node.getHours() != null)
        {
            node.getHours().apply(this);
        }
        if(node.getT1() != null)
        {
            node.getT1().apply(this);
        }
        if(node.getMinutes() != null)
        {
            node.getMinutes().apply(this);
        }
        if(node.getT2() != null)
        {
            node.getT2().apply(this);
        }
        if(node.getSeconds() != null)
        {
            node.getSeconds().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getMillisecons() != null)
        {
            node.getMillisecons().apply(this);
        }
        outATstart(node);
    }

    public void inATend(ATend node)
    {
        defaultIn(node);
    }

    public void outATend(ATend node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATend(ATend node)
    {
        inATend(node);
        if(node.getHours() != null)
        {
            node.getHours().apply(this);
        }
        if(node.getT1() != null)
        {
            node.getT1().apply(this);
        }
        if(node.getMinutes() != null)
        {
            node.getMinutes().apply(this);
        }
        if(node.getT2() != null)
        {
            node.getT2().apply(this);
        }
        if(node.getSeconds() != null)
        {
            node.getSeconds().apply(this);
        }
        if(node.getComma() != null)
        {
            node.getComma().apply(this);
        }
        if(node.getMillisecons() != null)
        {
            node.getMillisecons().apply(this);
        }
        outATend(node);
    }

    public void inATextSubs(ATextSubs node)
    {
        defaultIn(node);
    }

    public void outATextSubs(ATextSubs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextSubs(ATextSubs node)
    {
        inATextSubs(node);
        if(node.getWriting() != null)
        {
            node.getWriting().apply(this);
        }
        outATextSubs(node);
    }

    public void inASubsSubs(ASubsSubs node)
    {
        defaultIn(node);
    }

    public void outASubsSubs(ASubsSubs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASubsSubs(ASubsSubs node)
    {
        inASubsSubs(node);
        if(node.getWriting() != null)
        {
            node.getWriting().apply(this);
        }
        if(node.getSubs() != null)
        {
            node.getSubs().apply(this);
        }
        outASubsSubs(node);
    }

    public void inAFontWriting(AFontWriting node)
    {
        defaultIn(node);
    }

    public void outAFontWriting(AFontWriting node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFontWriting(AFontWriting node)
    {
        inAFontWriting(node);
        if(node.getF1() != null)
        {
            node.getF1().apply(this);
        }
        if(node.getText() != null)
        {
            node.getText().apply(this);
        }
        if(node.getF2() != null)
        {
            node.getF2().apply(this);
        }
        outAFontWriting(node);
    }

    public void inATextWriting(ATextWriting node)
    {
        defaultIn(node);
    }

    public void outATextWriting(ATextWriting node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATextWriting(ATextWriting node)
    {
        inATextWriting(node);
        if(node.getText() != null)
        {
            node.getText().apply(this);
        }
        outATextWriting(node);
    }

    public void inAColorWriting(AColorWriting node)
    {
        defaultIn(node);
    }

    public void outAColorWriting(AColorWriting node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAColorWriting(AColorWriting node)
    {
        inAColorWriting(node);
        if(node.getOpen() != null)
        {
            node.getOpen().apply(this);
        }
        if(node.getColor() != null)
        {
            node.getColor().apply(this);
        }
        if(node.getEnd() != null)
        {
            node.getEnd().apply(this);
        }
        if(node.getText() != null)
        {
            node.getText().apply(this);
        }
        if(node.getClose() != null)
        {
            node.getClose().apply(this);
        }
        outAColorWriting(node);
    }

    public void inAHours(AHours node)
    {
        defaultIn(node);
    }

    public void outAHours(AHours node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAHours(AHours node)
    {
        inAHours(node);
        if(node.getDigit() != null)
        {
            node.getDigit().apply(this);
        }
        outAHours(node);
    }

    public void inAMinutes(AMinutes node)
    {
        defaultIn(node);
    }

    public void outAMinutes(AMinutes node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinutes(AMinutes node)
    {
        inAMinutes(node);
        if(node.getDigit() != null)
        {
            node.getDigit().apply(this);
        }
        outAMinutes(node);
    }

    public void inASeconds(ASeconds node)
    {
        defaultIn(node);
    }

    public void outASeconds(ASeconds node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASeconds(ASeconds node)
    {
        inASeconds(node);
        if(node.getDigit() != null)
        {
            node.getDigit().apply(this);
        }
        outASeconds(node);
    }

    public void inAMillisecons(AMillisecons node)
    {
        defaultIn(node);
    }

    public void outAMillisecons(AMillisecons node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMillisecons(AMillisecons node)
    {
        inAMillisecons(node);
        if(node.getDigit() != null)
        {
            node.getDigit().apply(this);
        }
        outAMillisecons(node);
    }
}
