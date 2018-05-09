package adminauthclient;

import javax.xml.ws.Endpoint;

class AdminServer {
	public static void main(String[] args) {
		System.out.println("publicerer kontotjeneste");
		AdminImpl k = new AdminImpl();
		// Ipv6-addressen [::] svarer til Ipv4-adressen 0.0.0.0, der matcher alle maskinens netkort og IP-adresser
		Endpoint.publish("http://[::]:9901/AdminAuthmoduel", k);
		System.out.println("Kontotjeneste publiceret.");
	}
}
