package io.jeti.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#MATCH_PARENT}, a height of 0, and the specified weight.
 * This is just much less verbose than the standard call.
 */
public class MatchZero extends LayoutParams {
    public MatchZero(int weight) {
        super(LayoutParams.MATCH_PARENT, 0, weight);
    }
}
