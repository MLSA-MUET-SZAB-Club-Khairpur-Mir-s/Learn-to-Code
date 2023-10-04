package com.example.haidersapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
// This is the best repo I have ever seen

public class MainActivity extends AppCompatActivity {
     private EditText username;
     private EditText  password;
     private Button login;
     private TextView signup;
     validateinput validateinput;
     FirebaseAuth auth;
     FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        username=findViewById(R.id.fahad);
        password=findViewById(R.id.password);
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();
        login=findViewById(R.id.login);
        validateinput=new validateinput(this);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usernamelogin=username.getText().toString();
                String passwordlogin=password.getText().toString();
                if(validateinput.checkemailisvalid(usernamelogin)&&validateinput.checkpasswordisvalid(passwordlogin)){
                    auth.signInWithEmailAndPassword(usernamelogin,passwordlogin).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isComplete()){
                                Toast.makeText(MainActivity.this, "Logged in", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(MainActivity.this,Logout.class));
                            }
                            else {
                                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup=findViewById(R.id.signup_fahad);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Signup.class));
             }
        });
        }
    }
// try to connect with DBMS 
