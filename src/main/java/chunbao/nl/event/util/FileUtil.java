package chunbao.nl.event.util;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class FileUtil {

  public static String readFileFromClassPathAsString(String fileName) {
    InputStream inputStream = FileUtil.class.getClassLoader().getResourceAsStream(fileName);
    String result = null;
    try {
      result = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return result;
  }
}
