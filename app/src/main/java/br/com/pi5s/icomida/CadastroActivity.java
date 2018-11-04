package br.com.pi5s.icomida;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.pi5s.icomida.dto.Funcionario;

public class CadastroActivity extends AppCompatActivity {

    private static final String TAG = "CadastroActivity";

    private EditText edtEmail;
    private EditText edtSenha;
    private EditText edtCPF;
    private EditText edtRG;
    private EditText edtNome;
    private RadioButton rbGarcom;
    private RadioButton rbCozinha;

    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mFuncionarioDatabaseReference;
    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFuncionarioDatabaseReference = mFirebaseDatabase.getReference().child("funcionario");

        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        edtCPF = (EditText) findViewById(R.id.edtCPF);
        edtRG = (EditText) findViewById(R.id.edtRG);
        edtNome = (EditText) findViewById(R.id.edtNome);
        rbGarcom = (RadioButton) findViewById(R.id.rbGarcom);
        rbCozinha = (RadioButton) findViewById(R.id.rbCozinha);
    }

    public void btnCadastrar(View v){

        String email = edtEmail.getText().toString().trim();
        String senha = edtSenha.getText().toString().trim();

        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Por favor! Informe seu e-mail.",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(senha)){
            Toast.makeText(this,"Por favor! Informe sua senha.",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(edtCPF.getText().toString().trim())){
            Toast.makeText(this,"Por favor! Informe seu cpf.",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(edtRG.getText().toString().trim())){
            Toast.makeText(this,"Por favor! Informe seu rg.",Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(edtNome.getText().toString().trim())){
            Toast.makeText(this,"Por favor! Informe seu nome.",Toast.LENGTH_SHORT).show();
            return;
        }

        mFirebaseAuth.createUserWithEmailAndPassword(email, senha)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "createUserWithEmail:sucesso");
                            Toast.makeText(CadastroActivity.this, "Autenticação foi um sucesso.",Toast.LENGTH_SHORT).show();
                            mFirebaseAuth.signOut();

                            Funcionario funcionario = new Funcionario();
                            funcionario.setEmail(edtEmail.getText().toString().trim());
                            funcionario.setCpf(edtCPF.getText().toString().trim());
                            funcionario.setRg(edtRG.getText().toString().trim());
                            funcionario.setNome(edtNome.getText().toString().trim());
                            if(rbGarcom.isChecked()){
                                funcionario.setTipo("garcom");
                            }else if(rbCozinha.isChecked()){
                                funcionario.setTipo("cozinha");
                            }
                            mFuncionarioDatabaseReference.push().setValue(funcionario);

                            finish();
                            startActivity(new Intent(CadastroActivity.this, MainActivity.class));
                        } else {
                            Log.w(TAG, "createUserWithEmail:falhou", task.getException());
                            Toast.makeText(CadastroActivity.this, "Autenticação falhou.",Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    public void btnVoltar(View v){
        finish();
        startActivity(new Intent(this, MainActivity.class));
    }
}
