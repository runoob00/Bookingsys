package messages;

import java.io.Serializable;
import java.util.Vector;

import info.OrderForm;


public class MessageOrderfrom1Ack extends Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2132114345139808929L;
	private String Name = null;
	private boolean success = false;
	private String failReason = null;
	private Vector<OrderForm> orderForm = null;
	public MessageOrderfrom1Ack(String stuNum) {
		super(MSG_TYPE.MSG_Orderfrom1_ACK);
		Name = stuNum;
	}

	public String getName() {
		return Name;
	}

	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setLoginResult(boolean result) {
		success = result;
	}

	public boolean getLoginResult() {
		return success;
	}

	public void setFailReason(String reason) {
		failReason = reason;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setOrderForm(Vector<OrderForm> orderform2) {
		this.orderForm = orderform2;
	}

	public Vector<OrderForm> getOrderForm() {
		return orderForm;
	}
}
