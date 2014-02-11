
package br.com.caelum.estoque.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EstoqueWS", targetNamespace = "http://caelum.com.br/estoquews/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EstoqueWS {


    /**
     * 
     * @param tokenUsuario
     * @param parameters
     * @return
     *     returns br.com.caelum.estoque.soap.ItensPeloCodigoResponse
     */
    @WebMethod(operationName = "ItensPeloCodigo")
    @WebResult(name = "ItensPeloCodigoResponse", targetNamespace = "http://caelum.com.br/estoquews/v1", partName = "parameters")
    public ItensPeloCodigoResponse itensPeloCodigo(
        @WebParam(name = "ItensPeloCodigo", targetNamespace = "http://caelum.com.br/estoquews/v1", partName = "parameters")
        ItensPeloCodigo parameters,
        @WebParam(name = "tokenUsuario", targetNamespace = "http://caelum.com.br/estoquews/v1", header = true, partName = "tokenUsuario")
        String tokenUsuario);

}
