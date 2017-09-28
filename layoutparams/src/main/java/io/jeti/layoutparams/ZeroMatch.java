package io.jeti.ui.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of 0, a
 * height of {@link LayoutParams#MATCH_PARENT}, and the specified weight. This
 * is just much less verbose than the standard call.
 */
public class ZeroMatch extends LayoutParams {

    public ZeroMatch(float weight) {
        super(0, LayoutParams.MATCH_PARENT, weight);
    }
}
