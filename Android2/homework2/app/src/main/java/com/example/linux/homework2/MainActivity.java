package com.example.linux.homework2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    public Button forward;
    private EditText name;
    private EditText lastName;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        forward = findViewById(R.id.btnActTwo);
        name =  findViewById(R.id.name);
        lastName =  findViewById(R.id.lastname);

    }
    public void goNewView(View v){
        switch (v.getId()) {
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
