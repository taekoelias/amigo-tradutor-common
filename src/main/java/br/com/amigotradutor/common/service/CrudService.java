package br.com.amigotradutor.common.service;

import java.util.List;

import br.com.amigotradutor.common.exception.ValidacaoNegocioException;

public interface CrudService<TYPE,ID>{

	List<TYPE> getAll();
	
	TYPE getOne(ID v) throws ValidacaoNegocioException;
	
	void add(TYPE t) throws ValidacaoNegocioException;
	
	void update(ID v, TYPE t) throws ValidacaoNegocioException;
	
	void delete(ID t) throws ValidacaoNegocioException;
}
