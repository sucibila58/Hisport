package com.example.hisport;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import static android.text.Html.fromHtml;

public class login extends AppCompatActivity {
    private EditText etNama1,etpassword1;
    private String nama;
    private Button btn_login;
    DBhelper Dbhelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etNama1= findViewById(R.id.etNama1);
        etpassword1= findViewById(R.id.etPassword1);
        btn_login = findViewById(R.id.btn_login);
        Dbhelper = new DBhelper(this);
        TextView tvregister =  findViewById(R.id.tvregister);
        tvregister.setText(fromHtml("Don't have an account?" +
                "</font><font color='#3b5998'>register</font>"));

        tvregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (login.this,register.class));
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etNama1.getText().toString().trim();
                String password = etpassword1.getText().toString().trim();

                Boolean res = Dbhelper.checkUser(username,password);
                if(res == true){
                    Toast.makeText(login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(login.this, home.class));
                }else {
                    Toast.makeText(login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    public static Spanned fromHtml(String html){
        Spanned result;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            result = Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY);
        }else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}