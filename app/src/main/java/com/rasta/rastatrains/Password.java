package com.rasta.rastatrains;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Password extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        // Find the View that shows the next button Address Activity
        Button next = (Button) findViewById(R.id.passbutton);
        

        // Set a click listener on that View
        next.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the next button is clicked on.
            @Override
            public void onClick(View view) {
                Intent confirmIntent = new Intent(Password.this,Confirm.class);
                startActivity(confirmIntent);
            }
        });
    }
}
