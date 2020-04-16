package cn.abelib.contest.weekly_contest_184;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2020-04-12 11:07
 */
public class HtmlEntityParser3 {
    public String entityParser(String text) {
        return text.replaceAll("&quot;", "\"")
                .replaceAll("&apos;", "'")
                .replaceAll("&amp;", "&")
                .replaceAll("&gt;", ">")
                .replaceAll("&lt;", "<")
                .replaceAll("&frasl;", "/");
    }

    @Test
    public void test1() {
        String text = "&amp; is an HTML entity but &ambassador; is not.";
        System.err.println(entityParser(text));
    }

    @Test
    public void test2() {
        String text = "and I quote: &quot;...&quot;";
        System.err.println(entityParser(text));
    }

    @Test
    public void test3() {
        String text = "Stay home! Practice on Leetcode :)";
        System.err.println(entityParser(text));
    }
    @Test
    public void test4() {
        String  text = "x &gt; y &amp;&amp; x &lt; y is always false";
        System.err.println(entityParser(text));
    }

    @Test
    public void test5() {
        String  text = " &frasl; &quot; &apos; ZooP)x:6~";
        System.err.println(entityParser(text));
    }
}
