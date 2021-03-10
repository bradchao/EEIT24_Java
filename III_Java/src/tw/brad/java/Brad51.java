package tw.brad.java;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Brad51 {

	public static void main(String[] args) {
		try {
			// https://data.gov.tw/dataset/116285
			InetAddress ip1 = InetAddress.getByName("www.bradchao.com");
			System.out.println(ip1.getHostAddress());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
