package cn.abelib.solution.five;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertSame;

/**
 * @Author: abel.huang
 * @Date: 2019-12-08 16:43
 */
public class EncodeAndDecodeTinyURL535 {
    public class Codec {
        private Map<String, String> map = new HashMap<>(16);
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            if (map.containsKey(longUrl)) {
                return map.get(longUrl);
            }
            map.put(longUrl, String.valueOf(map.size() + 1));
            return String.valueOf(map.size());
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            if (shortUrl == null || "".equals(shortUrl)) {
                return "";
            }
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(shortUrl)) {
                    return entry.getKey();
                }
            }
            return "";
        }
    }

    public class Codec2 {
        private Map<String, String> map1 = new HashMap<>(16);
        private List<String> map2 = new ArrayList<>(16);
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            if (map1.containsKey(longUrl)) {
                return map1.get(longUrl);
            }
            map1.put(longUrl, String.valueOf(map1.size() + 1));
            map2.add(longUrl);
            return String.valueOf(map1.size());
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return map2.get(Integer.parseInt(shortUrl) - 1);
        }
    }

    @Test
    public void codecTest() {
        Codec2 codec = new Codec2();

        String url1 = "123";
        assertSame(url1, codec.decode(codec.encode(url1)));
    }
}
