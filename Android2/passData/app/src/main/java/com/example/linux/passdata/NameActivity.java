package com.example.linux.passdata;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends Activity implements OnClickListener {

    EditText etName;
    Button btnOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_data);

        etName = findViewById(R.id.etName);
        btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);

        Bundle arguments = getIntent().getExtras();
        if(arguments!=null) {
            String name = arguments.get("hello").toString();
            etName.setText(name);
        }

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = findViewById(R.id.etName);
        String message = editText.getText().toString();
        intent.putExtra("name", message);
        startActivity(intent);
        startActivityForResult(intent, 1);
    }

}