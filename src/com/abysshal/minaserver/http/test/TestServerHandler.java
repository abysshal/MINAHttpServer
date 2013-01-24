package com.abysshal.minaserver.http.test;

import com.abysshal.minaserver.http.HttpHandler;
import com.abysshal.minaserver.http.HttpRequestMessage;
import com.abysshal.minaserver.http.HttpResponseMessage;

public class TestServerHandler implements HttpHandler {

	@Override
	public HttpResponseMessage handle(HttpRequestMessage request) {
		HttpResponseMessage hrm = new HttpResponseMessage();
		hrm.setResponseCode(HttpResponseMessage.HTTP_STATUS_SUCCESS);
		hrm.appendBody("Success");
		return hrm;
	}

	@Override
	public HttpResponseMessage errResponseMessage() {
		HttpResponseMessage hrm = new HttpResponseMessage();
		hrm.setResponseCode(HttpResponseMessage.HTTP_STATUS_SUCCESS);
		hrm.appendBody("Error");
		return hrm;
	}

}
