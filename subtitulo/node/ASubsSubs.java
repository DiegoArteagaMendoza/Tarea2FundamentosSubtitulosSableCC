/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.node;

import subtitulo.analysis.*;

@SuppressWarnings("nls")
public final class ASubsSubs extends PSubs
{
    private PWriting _writing_;
    private PSubs _subs_;

    public ASubsSubs()
    {
        // Constructor
    }

    public ASubsSubs(
        @SuppressWarnings("hiding") PWriting _writing_,
        @SuppressWarnings("hiding") PSubs _subs_)
    {
        // Constructor
        setWriting(_writing_);

        setSubs(_subs_);

    }

    @Override
    public Object clone()
    {
        return new ASubsSubs(
            cloneNode(this._writing_),
            cloneNode(this._subs_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseASubsSubs(this);
    }

    public PWriting getWriting()
    {
        return this._writing_;
    }

    public void setWriting(PWriting node)
    {
        if(this._writing_ != null)
        {
            this._writing_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._writing_ = node;
    }

    public PSubs getSubs()
    {
        return this._subs_;
    }

    public void setSubs(PSubs node)
    {
        if(this._subs_ != null)
        {
            this._subs_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._subs_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._writing_)
            + toString(this._subs_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._writing_ == child)
        {
            this._writing_ = null;
            return;
        }

        if(this._subs_ == child)
        {
            this._subs_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._writing_ == oldChild)
        {
            setWriting((PWriting) newChild);
            return;
        }

        if(this._subs_ == oldChild)
        {
            setSubs((PSubs) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
