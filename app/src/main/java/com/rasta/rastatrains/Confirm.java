package com.rasta.rastatrains;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Confirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        // Find the View that shows the next button Address Activity
        Button next = (Button) findViewById(R.id.confirmbutton);

        // Set a click listener on that View
        next.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the next button is clicked on.
            @Override
            public void onClick(View view) {
                Intent confirmIntent = new Intent(Confirm.this,SearchActivity.class);
                startActivity(confirmIntent);
            }
        });
    }
}
