import java.net.*;
import java.io.*;

public class GithubAccess {

	public static void main(String[] args) {
	}
	
	public void URLReader(String url) throws MalformedURLException, IOException {
		HttpURLConnection gitCon = (HttpURLConnection) new URL("https://api.github.com/user").openConnection();
		gitCon.addRequestProperty("User", "Chrome");
		BufferedReader in = new BufferedReader(new InputStreamReader(gitCon.getInputStream()));
		
		String inputLine;
		while((inputLine = in.readLine()) != null) {
			System.out.print(inputLine);
		}
		in.close();
	}

}
