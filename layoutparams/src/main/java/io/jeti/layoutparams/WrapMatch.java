package io.jeti.ui.layoutparams;

import android.view.ViewGroup.LayoutParams;

/**
 * As the name implies, this class constructs an instance of
 * {@link LayoutParams} that has a width of
 * {@link LayoutParams#WRAP_CONTENT} and a height of
 * {@link LayoutParams#MATCH_PARENT}. This is just much less verbose than the
 * standard call.
 */
public class WrapMatch extends LayoutParams {
    public WrapMatch() {
        super(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT);
    }
}
