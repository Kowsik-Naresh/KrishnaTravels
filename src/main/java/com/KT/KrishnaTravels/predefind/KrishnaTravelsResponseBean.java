package com.KT.KrishnaTravels.predefind;


public class KrishnaTravelsResponseBean {
	
	private Boolean isAutorised;
	private Object data;
	private String errorMSG;
	private String successMSG;
	public Boolean getIsAutorised() {
		return isAutorised;
	}
	public void setIsAutorised(Boolean isAutorised) {
		this.isAutorised = isAutorised;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getErrorMSG() {
		return errorMSG;
	}
	public void setErrorMSG(String errorMSG) {
		this.errorMSG = errorMSG;
	}
	public String getSuccessMSG() {
		return successMSG;
	}
	
	public void setSuccessMSG(String successMSG) {
		this.successMSG = successMSG;
	}
	

}

