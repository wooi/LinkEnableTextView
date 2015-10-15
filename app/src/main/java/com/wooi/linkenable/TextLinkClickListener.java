package com.wooi.linkenable;

import android.view.View;

/**
 * Created by Administrator on 2015/10/15.
 */
public interface TextLinkClickListener {
    //  This method is called when the TextLink is clicked from LinkEnabledTextView

    public void onTextLinkClick(View textView, String clickedString);
}
