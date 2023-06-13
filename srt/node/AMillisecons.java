/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.node;

import srt.analysis.*;

@SuppressWarnings("nls")
public final class AMillisecons extends PMillisecons
{
    private TDigit _d7_;
    private TDigit _d8_;

    public AMillisecons()
    {
        // Constructor
    }

    public AMillisecons(
        @SuppressWarnings("hiding") TDigit _d7_,
        @SuppressWarnings("hiding") TDigit _d8_)
    {
        // Constructor
        setD7(_d7_);

        setD8(_d8_);

    }

    @Override
    public Object clone()
    {
        return new AMillisecons(
            cloneNode(this._d7_),
            cloneNode(this._d8_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAMillisecons(this);
    }

    public TDigit getD7()
    {
        return this._d7_;
    }

    public void setD7(TDigit node)
    {
        if(this._d7_ != null)
        {
            this._d7_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._d7_ = node;
    }

    public TDigit getD8()
    {
        return this._d8_;
    }

    public void setD8(TDigit node)
    {
        if(this._d8_ != null)
        {
            this._d8_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._d8_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._d7_)
            + toString(this._d8_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._d7_ == child)
        {
            this._d7_ = null;
            return;
        }

        if(this._d8_ == child)
        {
            this._d8_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._d7_ == oldChild)
        {
            setD7((TDigit) newChild);
            return;
        }

        if(this._d8_ == oldChild)
        {
            setD8((TDigit) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}