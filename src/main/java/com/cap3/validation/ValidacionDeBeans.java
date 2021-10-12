package com.cap3.validation;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.validation.constraints.NotNull;

public class ValidacionDeBeans {
	
	@Inject
	private Logger logger;
	
	@NotNull
	private String atributo1;
	@NotNull
	private String atributo2;
	@NotNull
	private String atributo3;
	@NotNull
	private String atributo4;
	@NotNull
	private String atributo5;
	
	public ValidacionDeBeans () {}

	public ValidacionDeBeans(String atributo1, String atributo2, String atributo3, String atributo4, String atributo5) {
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
		this.atributo4 = atributo4;
		this.atributo5 = atributo5;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}

	public String getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}

	public String getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}

	public String getAtributo5() {
		return atributo5;
	}

	public void setAtributo5(String atributo5) {
		this.atributo5 = atributo5;
	}
}
