/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.node;

import subtitulo.analysis.*;

@SuppressWarnings("nls")
public final class TOpen extends Token
{
    public TOpen()
    {
        super.setText("<font color=\"#");
    }

    public TOpen(int line, int pos)
    {
        super.setText("<font color=\"#");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOpen(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOpen(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOpen text.");
    }
}