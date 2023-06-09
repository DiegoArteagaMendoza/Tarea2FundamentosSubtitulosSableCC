/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.node;

import subtitulo.analysis.*;

@SuppressWarnings("nls")
public final class TText extends Token
{
    public TText(String text)
    {
        setText(text);
    }

    public TText(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TText(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTText(this);
    }
}
