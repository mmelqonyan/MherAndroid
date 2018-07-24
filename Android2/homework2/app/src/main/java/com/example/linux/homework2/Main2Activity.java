package com.example.linux.homework2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends Activity {

    protected Button back;
    private TextView name;
    private TextView lastName;
    protected View view;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back =  findViewById(R.id.back_button);
        name =  findViewById(R.id.nametxt);
        lastName =  findViewById(R.id.lastnametxt);
        public void goNewView (View view){
            switch (view.getId()) {
                case R.id.btnActTwo:
                    Intent intent = new Intent(this, Main2Activity.class);
                    intent.putExtra("name", name.getText().toString());
                    intent.putExtra("lastname", lastName.getText().toString());
                    startActivity(intent);
                    break;
                default:
                    break;
            }
        }
    }

}
