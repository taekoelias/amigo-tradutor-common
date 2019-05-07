package br.com.amigotradutor.common.validator;

import br.com.amigotradutor.common.exception.ValidacaoNegocioException;

public interface BaseValidator<TYPE,ID> {

	void requiredField(TYPE obj) throws ValidacaoNegocioException;
	
	void duplicated(TYPE obj) throws ValidacaoNegocioException;
	
	void notExists(ID id) throws ValidacaoNegocioException;
}
