package com.rcoem.enotice.enotice_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CrossDept extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private Button btnDisplay;
    private ImageButton nextClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_dept);
        addListenerOnButton();
    }
    public void addListenerOnButton() {

        radioGroup = (RadioGroup) findViewById(R.id.radio);
        nextClick = (ImageButton) findViewById(R.id.nextButton);

        nextClick.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioButton = (RadioButton) findViewById(selectedId);


                if(radioButton.getText().toString().equals("Enter the CSE Department")) {
                    Toast.makeText(CrossDept.this,
                            "cse", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CrossDept.this,AccountCrossDept.class);
                    intent.putExtra("postkey","CSE");
                    startActivity(intent);
                }
                if(radioButton.getText().toString().equals("Enter the Mech Department")) {
                    Toast.makeText(CrossDept.this,
                            "Mech", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(CrossDept.this,AccountCrossDept.class);
                    intent.putExtra("postkey","Mech");
                    startActivity(intent);
                }

            }

        });

    }
}