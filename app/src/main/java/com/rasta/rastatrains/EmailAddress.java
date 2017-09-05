package com.rasta.rastatrains;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailAddress extends AppCompatActivity {

    private String emailAddress;
    private EditText email;
    private boolean authenticateFail = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_address);

        // Find the View that shows the Email Address Activity
        Button next = (Button) findViewById(R.id.emailbutton);

        // Set a click listener on that View
        next.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the email View is clicked on.
            @Override
            public void onClick(View view) {

                //checks the values entered in the editText for the email address
                attemptLogin();

                if (authenticateFail == true) {
                    return;
                }
                //Creates and intent that starts the next activity for the password
                Intent passwordIntent = new Intent(EmailAddress.this,Password.class);
                startActivity(passwordIntent);
            }
        });
    }

    private void attemptLogin(){

        email = (EditText) findViewById(R.id.email);
        emailAddress = email.getText().toString().trim();

        if (checkEmail() == true)
            authenticateFail = true;
        else
            authenticateFail = false;

    }

    private boolean checkEmail(){
        if(emailAddress.equals("") || !(emailAddress.contains("@"))){
            email.setError("Please enter a Valid email address");
            return true;
        }
        else return false;
    }

}
