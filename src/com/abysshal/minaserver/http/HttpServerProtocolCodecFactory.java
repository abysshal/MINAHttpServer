package com.abysshal.minaserver.http;

import org.apache.mina.filter.codec.demux.DemuxingProtocolCodecFactory;

public class HttpServerProtocolCodecFactory extends
		DemuxingProtocolCodecFactory {
	public HttpServerProtocolCodecFactory() {
		super.addMessageDecoder(HttpRequestDecoder.class);
		super.addMessageEncoder(HttpResponseMessage.class,
				HttpResponseEncoder.class);
	}

}
