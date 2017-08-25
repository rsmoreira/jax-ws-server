package com.rsmoreira.math;
import javax.jws.WebService;

@WebService(endpointInterface = "com.rsmoreira.math.SimpleCalc")
public class SimpleCalcImpl implements SimpleCalc {

	@Override
	public float somar(float v1, float v2) {
		return v1 + v2;
	}

	@Override
	public float subtrair(float v1, float v2) {
		return v1 - v2;
	}

	@Override
	public float multiplicar(float v1, float v2) {
		return v1 * v2;
	}

	@Override
	public float dividir(float v1, float v2) {
		return v1 / v2;
	}

}
