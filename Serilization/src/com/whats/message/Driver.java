package com.whats.message;

import java.io.IOException;

public class Driver {

	public static void main(String[] args) throws IOException {
		MessageSerilization message = new MessageSerilization();
		Message msg = new Message("Kamdev","Bangalore","354684");
		message.serializeMsg(msg);
	}

}
