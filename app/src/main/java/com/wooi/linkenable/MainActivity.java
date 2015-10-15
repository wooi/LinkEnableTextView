package com.wooi.linkenable;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 *
 */
public class MainActivity extends Activity implements TextLinkClickListener {
    private LinkEnableTextView check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = (LinkEnableTextView) findViewById(R.id.text);
        String text = "This is a #test of regular expressions with http://example.com links as used in @twitter \'for  performing various operations based on the links this handles multiple links like http://this_is_fun.com and #Awesomess and @Cool";
        check.setOnTextLinkClickListener(this);
        check.gatherLinksForText(text);
    }

    public void onTextLinkClick(View textView, String clickedString) {
        Toast.makeText(getApplication(), clickedString, Toast.LENGTH_LONG).show();
    }


}
