package io.jeti.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#WRAP_CONTENT} and a height of
 * {@link LayoutParams#MATCH_PARENT}. This is just much less verbose than the
 * standard call.
 */
public class WrapMatch0 extends LayoutParams {
    public WrapMatch0() {
        super(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT, 0);
    }
}
