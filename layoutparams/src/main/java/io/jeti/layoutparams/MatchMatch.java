package io.jeti.layoutparams;

import android.view.ViewGroup.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#MATCH_PARENT} and a height of
 * {@link LayoutParams#MATCH_PARENT}. This is just much less verbose than the
 * standard call.
 */
public class MatchMatch extends LayoutParams {
    public MatchMatch() {
        super(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
    }
}
