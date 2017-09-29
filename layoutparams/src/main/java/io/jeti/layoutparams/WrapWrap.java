package io.jeti.layoutparams;

import android.view.ViewGroup.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#WRAP_CONTENT} and a height of
 * {@link LayoutParams#WRAP_CONTENT}. This is just much less verbose than the
 * standard call.
 */
public class WrapWrap extends LayoutParams {
    public WrapWrap() {
        super(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
    }
}
