/* This file was generated by SableCC (http://www.sablecc.org/). */

package srt.node;

import srt.analysis.*;

@SuppressWarnings("nls")
public final class ATextEffect extends PEffect
{
    private TPlus _plus_;
    private TText _text_;
    private TMinus _minus_;

    public ATextEffect()
    {
        // Constructor
    }

    public ATextEffect(
        @SuppressWarnings("hiding") TPlus _plus_,
        @SuppressWarnings("hiding") TText _text_,
        @SuppressWarnings("hiding") TMinus _minus_)
    {
        // Constructor
        setPlus(_plus_);

        setText(_text_);

        setMinus(_minus_);

    }

    @Override
    public Object clone()
    {
        return new ATextEffect(
            cloneNode(this._plus_),
            cloneNode(this._text_),
            cloneNode(this._minus_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseATextEffect(this);
    }

    public TPlus getPlus()
    {
        return this._plus_;
    }

    public void setPlus(TPlus node)
    {
        if(this._plus_ != null)
        {
            this._plus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._plus_ = node;
    }

    public TText getText()
    {
        return this._text_;
    }

    public void setText(TText node)
    {
        if(this._text_ != null)
        {
            this._text_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._text_ = node;
    }

    public TMinus getMinus()
    {
        return this._minus_;
    }

    public void setMinus(TMinus node)
    {
        if(this._minus_ != null)
        {
            this._minus_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._minus_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._plus_)
            + toString(this._text_)
            + toString(this._minus_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._plus_ == child)
        {
            this._plus_ = null;
            return;
        }

        if(this._text_ == child)
        {
            this._text_ = null;
            return;
        }

        if(this._minus_ == child)
        {
            this._minus_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._plus_ == oldChild)
        {
            setPlus((TPlus) newChild);
            return;
        }

        if(this._text_ == oldChild)
        {
            setText((TText) newChild);
            return;
        }

        if(this._minus_ == oldChild)
        {
            setMinus((TMinus) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
