/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.node;

import srt.analysis.*;

@SuppressWarnings("nls")
public final class TDigit extends Token
{
    public TDigit(String text)
    {
        setText(text);
    }

    public TDigit(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TDigit(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTDigit(this);
    }
}
