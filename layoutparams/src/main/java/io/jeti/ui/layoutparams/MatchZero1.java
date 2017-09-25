package io.jeti.ui.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#MATCH_PARENT}, a height of 0, and a weight of 1. This is
 * just much less verbose than the standard call.
 */
public class MatchZero1 extends LayoutParams {
    public MatchZero1() {
        super(LayoutParams.MATCH_PARENT, 0, 1);
    }
}
