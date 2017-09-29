package io.jeti.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#WRAP_CONTENT} and a height of
 * {@link LayoutParams#MATCH_PARENT}. This is just much less verbose than the
 * standard call.
 */
public class WrapMatch1 extends LayoutParams {
    public WrapMatch1() {
        super(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT, 1);
    }
}
