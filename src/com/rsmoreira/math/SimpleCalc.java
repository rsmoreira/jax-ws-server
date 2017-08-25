package com.rsmoreira.math;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// SEI - Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface SimpleCalc {

	@WebMethod
	public float somar(float v1, float v2);

	@WebMethod
	public float subtrair(float v1, float v2);

	@WebMethod
	public float multiplicar(float v1, float v2);

	@WebMethod
	public float dividir(float v1, float v2);

}
