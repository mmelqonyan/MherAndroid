package com.example.linux.passdata;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

    TextView tvName;
    Button btnName;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvName =  findViewById(R.id.tvName);
        btnName = findViewById(R.id.btnName);
        btnName.setOnClickListener(this);
        Bundle arguments = getIntent().getExtras();
        if(arguments!=null) {
            String name = arguments.get("name").toString();
            tvName.setText(name);
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, NameActivity.class);
        intent.putExtra("hello", tvName.getText().toString());
        startActivity(intent);
        startActivityForResult(intent, 1);

    }

@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    if (data == null) {return;}
    String name = data.getStringExtra("name");
    tvName.setText(name);
}
}