package br.com.pi5s.icomida.dao;

public interface IDAO<T> {
    String Gravar(T t);
    String Atualizar(T t);
    String Deletar(T t);
    String Buscar();
}
