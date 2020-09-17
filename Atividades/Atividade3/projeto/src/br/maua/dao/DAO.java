package br.maua.dao;

import br.maua.throwables.EntradaNaoEncontradaException;

import java.sql.SQLException;
import java.util.List;

public interface DAO <T> {

	String DBFileName = "res/otakuDB.db";
	String ID = "id";
	String URL = "url";
	String TITULO = "titulo";
	String SINOPSE = "sinopse";
	String EPISODIOS = "episodios";
	String CAPITULOS = "capitulos";
	String VOLUMES = "volumes";
	String TIPO = "tipo";
	String NOTA = "nota";

	List<T> getAll();
	void escreverEntrada(T t) throws SQLException;
	void apagarEntrada(T t) throws SQLException;
	T getEntradaPorID(int id);
	T getEntradaPorTitulo(String titulo) throws EntradaNaoEncontradaException;
}
