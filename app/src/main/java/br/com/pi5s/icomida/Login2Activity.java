package br.com.pi5s.icomida;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login2Activity extends AppCompatActivity {

    private static final String TAG = "Login2Activity";

    private EditText edtEmail;
    private EditText edtSenha;

    private FirebaseAuth mFirebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        mFirebaseAuth = FirebaseAuth.getInstance();

        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
    }

    public void btnLogar(View v){
        FirebaseUser user = mFirebaseAuth.getCurrentUser();
        if(user == null){
            String email = edtEmail.getText().toString().trim();
            String senha  = edtSenha.getText().toString().trim();

            if(TextUtils.isEmpty(email)){
                Toast.makeText(this,"Por favor! Informe seu e-mail.",Toast.LENGTH_SHORT).show();
                return;
            }

            if(TextUtils.isEmpty(senha)){
                Toast.makeText(this,"Por favor! Informe sua senha.",Toast.LENGTH_SHORT).show();
                return;
            }

            mFirebaseAuth.signInWithEmailAndPassword(email,senha)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Log.d(TAG, "signInWithEmail:success");
                                Toast.makeText(Login2Activity.this, "Autenticação foi um sucesso.", Toast.LENGTH_SHORT).show();

                                finish();
                                startActivity(new Intent(Login2Activity.this, MainActivity.class));
                            }else{
                                Log.w(TAG, "signInWithEmail:failure", task.getException());
                                Toast.makeText(Login2Activity.this, "Autenticação falhou.",Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }else{
            Toast.makeText(this,"O usuário de e-mail: "+user.getEmail()+" já está logado",Toast.LENGTH_SHORT).show();
        }
    }

    public void btnVoltar(View v){
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }

    public void sair(View v){
        FirebaseUser user = mFirebaseAuth.getCurrentUser();
        if(user == null){
            Toast.makeText(this, "Nenhum usuario logado, efetue um login antes de sair.", Toast.LENGTH_SHORT).show();
        }else{
            mFirebaseAuth.signOut();
            Toast.makeText(this, "Usuário deslogado.", Toast.LENGTH_SHORT).show();
        }
    }
}
