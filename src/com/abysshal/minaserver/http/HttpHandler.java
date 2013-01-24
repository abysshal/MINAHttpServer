package com.abysshal.minaserver.http;

public interface HttpHandler {

	HttpResponseMessage handle(HttpRequestMessage request);

	HttpResponseMessage errResponseMessage();
}