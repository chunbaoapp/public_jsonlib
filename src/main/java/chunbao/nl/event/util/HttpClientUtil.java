package chunbao.nl.event.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class HttpClientUtil {

  public static String getJson(String urlStr)
      throws IOException {
    URL url = new URL(urlStr);
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setRequestMethod("GET");
    conn.setRequestProperty("Accept", "application/json");
    conn.setReadTimeout(5000);
    conn.setConnectTimeout(5000);

    if (conn.getResponseCode() != 200) {
      throw new RuntimeException("Failed : HTTP error code : "
          + conn.getResponseCode());
    }

    return IOUtils.toString(new BufferedReader(new InputStreamReader(conn.getInputStream(), Charset.forName("UTF-8"))));
  }
}
