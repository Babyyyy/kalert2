package com.baby.android.kalert;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity
{
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this,R.array.enquiry,android.R.layout.simple_list_item_1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        /*jumping on to the next page... to the second activity*/
        Button next = (Button)findViewById(R.id.next);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String sel = (String) parent.getItemAtPosition(position);

                //Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+" selected", Toast.LENGTH_SHORT).show();

                if(sel.equalsIgnoreCase("pot holes"))
                {
                    Intent myIntent = new Intent(view.getContext(), Main2Activity.class);
                    startActivity(myIntent);
                }
                else if(sel.equalsIgnoreCase("street lights"))
                {
                    Intent myIntent = new Intent(view.getContext(), Main4Activity.class);
                    startActivity(myIntent);
                }
                else if (sel.equalsIgnoreCase("road signs"))
                {
                    Intent myIntent = new Intent(view.getContext(), Main5Activity.class);
                    startActivity(myIntent);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
