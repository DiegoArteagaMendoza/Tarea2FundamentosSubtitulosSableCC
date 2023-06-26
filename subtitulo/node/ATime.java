/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.node;

import subtitulo.analysis.*;

@SuppressWarnings("nls")
public final class ATime extends PTime
{
    private PTstart _tstart_;
    private TArrow _arrow_;
    private PTend _tend_;

    public ATime()
    {
        // Constructor
    }

    public ATime(
        @SuppressWarnings("hiding") PTstart _tstart_,
        @SuppressWarnings("hiding") TArrow _arrow_,
        @SuppressWarnings("hiding") PTend _tend_)
    {
        // Constructor
        setTstart(_tstart_);

        setArrow(_arrow_);

        setTend(_tend_);

    }

    @Override
    public Object clone()
    {
        return new ATime(
            cloneNode(this._tstart_),
            cloneNode(this._arrow_),
            cloneNode(this._tend_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATime(this);
    }

    public PTstart getTstart()
    {
        return this._tstart_;
    }

    public void setTstart(PTstart node)
    {
        if(this._tstart_ != null)
        {
            this._tstart_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tstart_ = node;
    }

    public TArrow getArrow()
    {
        return this._arrow_;
    }

    public void setArrow(TArrow node)
    {
        if(this._arrow_ != null)
        {
            this._arrow_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._arrow_ = node;
    }

    public PTend getTend()
    {
        return this._tend_;
    }

    public void setTend(PTend node)
    {
        if(this._tend_ != null)
        {
            this._tend_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._tend_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._tstart_)
            + toString(this._arrow_)
            + toString(this._tend_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._tstart_ == child)
        {
            this._tstart_ = null;
            return;
        }

        if(this._arrow_ == child)
        {
            this._arrow_ = null;
            return;
        }

        if(this._tend_ == child)
        {
            this._tend_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._tstart_ == oldChild)
        {
            setTstart((PTstart) newChild);
            return;
        }

        if(this._arrow_ == oldChild)
        {
            setArrow((TArrow) newChild);
            return;
        }

        if(this._tend_ == oldChild)
        {
            setTend((PTend) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
