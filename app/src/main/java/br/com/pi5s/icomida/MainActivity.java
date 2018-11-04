package br.com.pi5s.icomida;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Date;

import br.com.pi5s.icomida.dao.DataHoraAtualizacao;
import br.com.pi5s.icomida.dao.Empresa;
import br.com.pi5s.icomida.dao.EmpresaDAO;

public class MainActivity extends AppCompatActivity {

    private TextView tvUsuario;
    private TextView tvUsuarioUID;

    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseAuth = FirebaseAuth.getInstance();

        tvUsuario = (TextView) findViewById(R.id.tvUsuario);
        tvUsuarioUID = (TextView) findViewById(R.id.tvUsuarioUID);

        verificarUsuarioLogado();

        // TODO: apagar linhas abaixo! Apenas para testar o CRUD no firebase
        //EmpresaDAO empresaDAO = new EmpresaDAO();
        //DataHoraAtualizacao dataHoraAtualizacao = new DataHoraAtualizacao(new Date(), new Date(), null);
        //Empresa empresa = new Empresa("EmpresaRazao", "EmpresaFantasia", "EmpresaCNPJ", "EmpresaIscricaoEstadual", dataHoraAtualizacao, null, null, null);
        //empresaDAO.Gravar(empresa);
        //empresaDAO.Atualizar(empresa);
        //empresa.setKey("-LQL2xf_s7jN4ziHUi_n");
        //empresaDAO.Deletar(empresa);
        //TextView txtHello = findViewById(R.id.txtHello);
        //txtHello.setText("Empresa Adicionada" + empresa.getRazaoSocial());
        //empresa.setKey("-LQL7z0Acqi8YnPC1Xgw");
        //empresa = empresaDAO.BuscarPorId(empresa);
        //String valorAtual = txtHello.getText().toString();
        //txtHello.setText(valorAtual + " ============ Empresa buscada: " + empresa.getRazaoSocial());
        // TODO: apagar até aqui
    }

    public void abrirLogin(View v){
        finish();
        startActivity(new Intent(this, Login2Activity.class));
    }

    public void abrirCadastro(View v){
        finish();
        startActivity(new Intent(this, CadastroActivity.class));
    }

    public void verificarUsuarioLogado(){
        FirebaseUser user = mFirebaseAuth.getCurrentUser();
        if(user != null){
            tvUsuario.setText(user.getEmail());
            tvUsuarioUID.setText(user.getUid());
        }
    }
}
