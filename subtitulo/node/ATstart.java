/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.node;

import subtitulo.analysis.*;

@SuppressWarnings("nls")
public final class ATstart extends PTstart
{
    private PHours _hours_;
    private TTwopoint _t1_;
    private PMinutes _minutes_;
    private TTwopoint _t2_;
    private PSeconds _seconds_;
    private TComma _comma_;
    private PMillisecons _millisecons_;

    public ATstart()
    {
        // Constructor
    }

    public ATstart(
        @SuppressWarnings("hiding") PHours _hours_,
        @SuppressWarnings("hiding") TTwopoint _t1_,
        @SuppressWarnings("hiding") PMinutes _minutes_,
        @SuppressWarnings("hiding") TTwopoint _t2_,
        @SuppressWarnings("hiding") PSeconds _seconds_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PMillisecons _millisecons_)
    {
        // Constructor
        setHours(_hours_);

        setT1(_t1_);

        setMinutes(_minutes_);

        setT2(_t2_);

        setSeconds(_seconds_);

        setComma(_comma_);

        setMillisecons(_millisecons_);

    }

    @Override
    public Object clone()
    {
        return new ATstart(
            cloneNode(this._hours_),
            cloneNode(this._t1_),
            cloneNode(this._minutes_),
            cloneNode(this._t2_),
            cloneNode(this._seconds_),
            cloneNode(this._comma_),
            cloneNode(this._millisecons_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATstart(this);
    }

    public PHours getHours()
    {
        return this._hours_;
    }

    public void setHours(PHours node)
    {
        if(this._hours_ != null)
        {
            this._hours_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._hours_ = node;
    }

    public TTwopoint getT1()
    {
        return this._t1_;
    }

    public void setT1(TTwopoint node)
    {
        if(this._t1_ != null)
        {
            this._t1_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._t1_ = node;
    }

    public PMinutes getMinutes()
    {
        return this._minutes_;
    }

    public void setMinutes(PMinutes node)
    {
        if(this._minutes_ != null)
        {
            this._minutes_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minutes_ = node;
    }

    public TTwopoint getT2()
    {
        return this._t2_;
    }

    public void setT2(TTwopoint node)
    {
        if(this._t2_ != null)
        {
            this._t2_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._t2_ = node;
    }

    public PSeconds getSeconds()
    {
        return this._seconds_;
    }

    public void setSeconds(PSeconds node)
    {
        if(this._seconds_ != null)
        {
            this._seconds_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._seconds_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
    }

    public PMillisecons getMillisecons()
    {
        return this._millisecons_;
    }

    public void setMillisecons(PMillisecons node)
    {
        if(this._millisecons_ != null)
        {
            this._millisecons_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._millisecons_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._hours_)
            + toString(this._t1_)
            + toString(this._minutes_)
            + toString(this._t2_)
            + toString(this._seconds_)
            + toString(this._comma_)
            + toString(this._millisecons_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._hours_ == child)
        {
            this._hours_ = null;
            return;
        }

        if(this._t1_ == child)
        {
            this._t1_ = null;
            return;
        }

        if(this._minutes_ == child)
        {
            this._minutes_ = null;
            return;
        }

        if(this._t2_ == child)
        {
            this._t2_ = null;
            return;
        }

        if(this._seconds_ == child)
        {
            this._seconds_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._millisecons_ == child)
        {
            this._millisecons_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._hours_ == oldChild)
        {
            setHours((PHours) newChild);
            return;
        }

        if(this._t1_ == oldChild)
        {
            setT1((TTwopoint) newChild);
            return;
        }

        if(this._minutes_ == oldChild)
        {
            setMinutes((PMinutes) newChild);
            return;
        }

        if(this._t2_ == oldChild)
        {
            setT2((TTwopoint) newChild);
            return;
        }

        if(this._seconds_ == oldChild)
        {
            setSeconds((PSeconds) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._millisecons_ == oldChild)
        {
            setMillisecons((PMillisecons) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
