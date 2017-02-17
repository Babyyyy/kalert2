package com.baby.android.kalert;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Main5Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main5);

        /*jumping on to the next page... to the third activity*/
        Button next = (Button)findViewById(R.id.next);

        next.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent myIntent = new Intent(view.getContext(), Main3Activity.class);
                        startActivity(myIntent);
                    }
                }
        );
    }
}
