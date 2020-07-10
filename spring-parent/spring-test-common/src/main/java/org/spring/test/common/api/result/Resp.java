package org.spring.test.common.api.result;

public class Resp<T> {
	
	private int status = 0;
	private String message = "success";
	private T data;
	
	public Resp() {
		super();
	}

	public Resp(int status, String message) {
		this(status, message, null);
	}

	public Resp(int status, String message, T data) {
		super();
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Resp [status=" + status + ", message=" + message + ", data=" + data + "]";
	}

}
