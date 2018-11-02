package br.com.pi5s.icomida;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

import br.com.pi5s.icomida.dao.DataHoraAtualizacao;
import br.com.pi5s.icomida.dao.Empresa;
import br.com.pi5s.icomida.dao.EmpresaDAO;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: apagar linhas abaixo! Apenas para testar o CRUD no firebase
        EmpresaDAO empresaDAO = new EmpresaDAO();
        DataHoraAtualizacao dataHoraAtualizacao = new DataHoraAtualizacao(new Date(), new Date(), null);
        Empresa empresa = new Empresa("EmpresaRazao", "EmpresaFantasia", "EmpresaCNPJ", "EmpresaIscricaoEstadual", dataHoraAtualizacao, null, null, null);
        empresaDAO.Gravar(empresa);
        empresaDAO.Atualizar(empresa);

        //empresa.setKey("-LQL2xf_s7jN4ziHUi_n");
        //empresaDAO.Deletar(empresa);

        TextView txtHello = findViewById(R.id.txtHello);
        txtHello.setText("Empresa Adicionada" + empresa.getRazaoSocial());

        empresa.setKey("-LQL7z0Acqi8YnPC1Xgw");
        empresa = empresaDAO.BuscarPorId(empresa);

        String valorAtual = txtHello.getText().toString();

        txtHello.setText(valorAtual + " ============ Empresa buscada: " + empresa.getRazaoSocial());
        // TODO: apagar até aqui

    }
}
