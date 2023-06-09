/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.analysis;

import java.util.*;
import subtitulo.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFilesub(AFilesub node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAItemItemlist(AItemItemlist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAItemlistItemlist(AItemlistItemlist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAItem(AItem node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATime(ATime node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATstart(ATstart node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATend(ATend node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextSubs(ATextSubs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASubsSubs(ASubsSubs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFontWriting(AFontWriting node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextWriting(ATextWriting node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAColorWriting(AColorWriting node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAHours(AHours node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMinutes(AMinutes node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASeconds(ASeconds node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMillisecons(AMillisecons node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDigit(TDigit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlank(TBlank node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTArrow(TArrow node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTTwopoint(TTwopoint node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTColor(TColor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTText(TText node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpen(TOpen node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTClose(TClose node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEnd(TEnd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTFont(TFont node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
