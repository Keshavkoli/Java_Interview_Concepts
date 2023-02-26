package com.java8_Base64_Concept;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.UUID;

public class Base64Example {
	public static void main(String[] args) {
//		String credential = "username:password";
		String credential = "cHJlLWNsYWltLXVzZXI";

		Encoder encoder = Base64.getEncoder();
		String encodedstr = encoder.encodeToString(credential.getBytes());
		System.out.println("Encoding  = " + encodedstr);

		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedstr.getBytes());

		String decodedstr = new String(decode);
		System.out.println("Decoding  = " + decodedstr);

		System.out.println("URL Basic encoding and decoding...");
		String URL = "https://kkjavatutorials.com/how-to-change-the-default-port-of-the-tomcat-server/";

		Encoder urlEncoder = Base64.getUrlEncoder();
		String encoderUrl = urlEncoder.encodeToString(URL.getBytes());
		System.out.println(encoderUrl);

		Decoder urlDecoder = Base64.getUrlDecoder();
		byte[] decode2 = urlDecoder.decode(encoderUrl.getBytes());

		String decodedUrl = new String(decode2);
		System.out.println(decodedUrl);

		System.out.println("mime Encoding and Decoding");

		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
		Encoder mimeEncoder = Base64.getMimeEncoder();

		String encodeMimeString = mimeEncoder.encodeToString(uuid.getBytes());
		System.out.println(encodeMimeString);

		Decoder mimeDecoder = Base64.getMimeDecoder();
		byte[] decode3 = mimeDecoder.decode(encodeMimeString);
		String decodedMineStr = new String(decode3);
		System.out.println(decodedMineStr);
	}
}
