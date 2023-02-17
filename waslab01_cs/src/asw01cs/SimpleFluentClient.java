package asw01cs;


import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
//This code uses the Fluent API

public class SimpleFluentClient {

	private static String URI = "http://localhost:8080/waslab01_ss/";

	public final static void main(String[] args) throws Exception {
    	
    	/* Insert code for Task #4 here */

		System.out.print(Request.Post(URI)
    		    .bodyForm(Form.form().add("author",  "Ericriera").add("tweet_text",  "Hola Mundo!").build())
    		    .addHeader("Accept", "text/plain")
    		    .execute().returnContent());
		
    	System.out.println(Request.Get(URI).addHeader("Accept","text/plain").execute().returnContent());
    	
    	/* Insert code for Task #5 here */
    }
}

