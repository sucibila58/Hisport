package com.example.hisport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
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

import static com.example.hisport.login.fromHtml;

public class register extends AppCompatActivity {
    EditText etName, etPassword, etConPw;
    Button Btn_Register;
    DBhelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        dbHelper = new DBhelper(this);

        etName = (EditText)findViewById(R.id.etNama);
        etPassword = (EditText)findViewById(R.id.etPassword);
        etConPw = (EditText)findViewById(R.id.etconPw);
        Btn_Register = (Button)findViewById(R.id.btn_register);
        TextView tvlogin = (TextView)findViewById(R.id.tvlogin);
        tvlogin.setText(fromHtml("Have an account? " +
                "</font><font color='#3b5998'>Login</font>"));
        tvlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(register.this, login.class));
            }
        });
        Btn_Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etName.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                String conPassword = etConPw.getText().toString().trim();

                ContentValues values = new ContentValues();

                if (!password.equals(conPassword)){
                    Toast.makeText(register.this, "Password not match", Toast.LENGTH_SHORT).show();
                }else if (password.equals("") || username.equals("")){
                    Toast.makeText(register.this, "Username or Password cannot be empty", Toast.LENGTH_SHORT).show();
                }else {
                    values.put(DBhelper.row_username, username);
                    values.put(DBhelper.row_password, password);
                    dbHelper.insertData(values);

                    Toast.makeText(register.this, "Register successful", Toast.LENGTH_SHORT).show();
                    finish();
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
