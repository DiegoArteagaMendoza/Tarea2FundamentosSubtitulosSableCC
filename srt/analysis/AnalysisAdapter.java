/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.analysis;

import java.util.*;
import srt.node.*;

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
    public void caseATextlistSubs(ATextlistSubs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEffectSubs(AEffectSubs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextTextlist(ATextTextlist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextlistTextlist(ATextlistTextlist node)
    {
        defaultCase(node);
    }

    @Override
    public void caseATextEffect(ATextEffect node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASlashEffect(ASlashEffect node)
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
    public void caseTNum(TNum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNewline(TNewline node)
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
    public void caseTDigit(TDigit node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTText(TText node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
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
