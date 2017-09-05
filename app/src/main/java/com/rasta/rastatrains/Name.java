package com.rasta.rastatrains;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Name extends AppCompatActivity {

    //holds the name of the current user
    private String firstName = null;
    private String lastName = null;
    private EditText fName;
    private EditText lName;
    private boolean authenticateFail = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        // Find the View that shows the Email Address Activity
        Button next = (Button) findViewById(R.id.namebutton);

        // Set a click listener on that View
        next.setOnClickListener(new View.OnClickListener(){
            // The code in this method will be executed when the email View is clicked on.
            @Override
            public void onClick(View view) {

                //checks the data in the edit texts
                attemptLogin();

                if (authenticateFail == true) {
                    return;
                }

                Intent emailIntent = new Intent(Name.this,EmailAddress.class);
                startActivity(emailIntent);
            }
        });
    }

    private void attemptLogin(){
        fName = (EditText) findViewById(R.id.firstname);
        lName = (EditText) findViewById(R.id.lastname);

        firstName = fName.getText().toString().trim();
        lastName = lName.getText().toString().trim();

        if (checkFirstName() == true || checkLastName() == true)
            authenticateFail = true;
        else
            authenticateFail = false;

    }

    private boolean checkFirstName(){
        if(firstName.equals("")){
            fName.setError("Please enter a first Name");
            return true;
        }
        else return false;
    }

    private boolean checkLastName(){
        if(lastName.equals("")){
            lName.setError("Please enter a last Name");
            return true;
        }
        else return false;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

}
