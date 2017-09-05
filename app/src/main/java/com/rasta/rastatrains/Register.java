package com.rasta.rastatrains;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        // Find the View that shows the Name Activity
        Button next = (Button) findViewById(R.id.registerbutton);

        // Set a click listener on that View
        next.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the next Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nameIntent = new Intent(Register.this,Name.class);
                startActivity(nameIntent);
            }
        });
    }
}
