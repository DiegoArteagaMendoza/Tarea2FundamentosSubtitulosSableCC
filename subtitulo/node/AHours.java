/* This file was generated by SableCC (http://www.sablecc.org/). */

package subtitulo.node;

import subtitulo.analysis.*;

@SuppressWarnings("nls")
public final class AHours extends PHours
{
    private TDigit _digit_;

    public AHours()
    {
        // Constructor
    }

    public AHours(
        @SuppressWarnings("hiding") TDigit _digit_)
    {
        // Constructor
        setDigit(_digit_);

    }

    @Override
    public Object clone()
    {
        return new AHours(
            cloneNode(this._digit_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAHours(this);
    }

    public TDigit getDigit()
    {
        return this._digit_;
    }

    public void setDigit(TDigit node)
    {
        if(this._digit_ != null)
        {
            this._digit_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._digit_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._digit_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._digit_ == child)
        {
            this._digit_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._digit_ == oldChild)
        {
            setDigit((TDigit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}