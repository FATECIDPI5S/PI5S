package br.com.pi5s.icomida.dao;

import android.support.annotation.NonNull;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class EmpresaDAO implements IDAO<Empresa> {
    private DatabaseReference dbEmpresa;

    public EmpresaDAO() {
        this.dbEmpresa = FirebaseDatabase.getInstance().getReference("empresa");
    }

    @Override
    public String Gravar(Empresa empresa) {
        String id = this.dbEmpresa.push().getKey();
        if (id == null)
            Log.d("GravarEmpresa", id);
        dbEmpresa.child(id).setValue(empresa);
        empresa.setKey(id);
        return null;
    }

    @Override
    public String Atualizar(Empresa empresa) {
        empresa.setRazaoSocial("EMPRESA ATUALIZADA" + empresa.getKey());
        dbEmpresa.child(empresa.getKey()).setValue(empresa);
        return null;
    }

    @Override
    public String Deletar(Empresa empresa) {
        dbEmpresa.child(empresa.getKey()).removeValue();
        return null;
    }

    @Override
    public String Buscar() {
        return null;
    }

    public Empresa BuscarPorId(final Empresa empresa) {
        Query query = dbEmpresa.child(empresa.getKey());

        query.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()){
                    for (DataSnapshot empresaData: dataSnapshot.getChildren()){
                        empresa.setRazaoSocial((String) empresaData.child("razaoSocial").getValue());
                        empresa.setNomeFantasia((String) empresaData.child("nomeFantasia").getValue());
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        return empresa;
    }
}
