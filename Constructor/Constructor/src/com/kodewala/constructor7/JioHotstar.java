package com.kodewala.constructor7;

public class JioHotstar extends Jio {
	int saving;
	public JioHotstar(String _name,String _productId,int _recharge,int _saving) {
	   super(_name, _productId, _recharge);
	   this.saving=_saving;
	}

}
