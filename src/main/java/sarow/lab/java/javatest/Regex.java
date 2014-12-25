/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.javatest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author wenpingliu
 * @version v 0.1 5/28/14 13:51 wenpingliu Exp $$
 */
public class Regex {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile("(<?[\\w][^>]*/>|</?[\\w][^>]*>)");
        String abstracts = "<a></a><b>";
        Matcher matcher = pattern.matcher(abstracts);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());
        abstracts = "<a>abc</a><b>";
        matcher = pattern.matcher(abstracts);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        abstracts = "<img src=\"asdfasdf\" />";
        matcher = pattern.matcher(abstracts);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        abstracts = "<p src=\"asdfasdf\" /> </p>";
        matcher = pattern.matcher(abstracts);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

        abstracts = "<br/>";
        matcher = pattern.matcher(abstracts);
        System.out.println(matcher.find());
        System.out.println(matcher.matches());

    }
}
