package com.example.finalproject_gcns.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class CustomFonts extends androidx.appcompat.widget.AppCompatTextView {
    public CustomFonts(Context context) {
        super(context);

        applyCustomFonts(context);
    }

    public CustomFonts(Context context, AttributeSet attrs) {
        super(context, attrs);

        applyCustomFonts(context);
    }

    public CustomFonts(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        applyCustomFonts(context);
    }

    private void applyCustomFonts(Context context) {
        Typeface customFont = FontCache.getTypeface("fonts/Cuprum-Regular.ttf", context);
        setTypeface(customFont);
    }
}
