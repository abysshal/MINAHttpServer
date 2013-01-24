package com.abysshal.minaserver.http.test;

import java.io.IOException;

import com.abysshal.minaserver.http.HttpServer;

public class TestHttpServer {

	public static void main(String[] args) {
		int port = 8080;

		for (String str : args) {
			if (str.startsWith("-p") && str.length() >= 3) {
				String tmp = str.substring(2);
				try {
					port = Integer.valueOf(tmp);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}

		System.out.println("Get http port:" + port);

		System.out.println("Start http");
		HttpServer hs = new HttpServer();
		hs.setEncoding("UTF-8");
		hs.setHttpHandler(new TestServerHandler());

		try {
			hs.run(port);
			System.out.println("Started");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// System.out.println("Stop http");
		// hs.stop();
	}
}
