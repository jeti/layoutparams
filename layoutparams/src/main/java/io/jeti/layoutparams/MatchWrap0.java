package io.jeti.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#MATCH_PARENT} and a height of
 * {@link LayoutParams#WRAP_CONTENT}. This is just much less verbose than the
 * standard call.
 */
public class MatchWrap0 extends LayoutParams {
    public MatchWrap0() {
        super(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 0);
    }
}
