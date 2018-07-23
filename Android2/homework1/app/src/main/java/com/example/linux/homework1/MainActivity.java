package com.example.linux.homework1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

  private  TextView textView;
    Button button;
    private CharSequence email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.Text);

        button = findViewById(R.id.button);
        email = textView.getText();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!Valid(textView.getText())) {
                    Toast.makeText(MainActivity.this, textView.getText(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/#q=" + textView.getText())));
                } else {
                    Toast.makeText(MainActivity.this, textView.getText(), Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse((textView.getText()).toString())));
                }


                }

        });
    }
    public static boolean Valid (CharSequence input) {
        if (TextUtils.isEmpty(input)) {
            return false;
        }
        Pattern URL_PATTERN = Patterns.WEB_URL;
        boolean isURL = URL_PATTERN.matcher(input).matches();
        if (!isURL) {
            String urlString = input + "";
            if (URLUtil.isNetworkUrl(urlString)) {
                try {
                    new URL(urlString);
                    isURL = true;
                } catch (Exception e) {
                }
            }
        }
        return isURL;
    }


/*
    private boolean Valid(String email) {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }*/
}
