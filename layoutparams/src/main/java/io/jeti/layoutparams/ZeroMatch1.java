package io.jeti.layoutparams;

import android.widget.LinearLayout.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of 0, a
 * height of {@link LayoutParams#MATCH_PARENT}, and a weight of 1. This is just
 * much less verbose than the standard call.
 */
public class ZeroMatch1 extends LayoutParams {
    public ZeroMatch1() {
        super(0, LayoutParams.MATCH_PARENT, 1);
    }
}
