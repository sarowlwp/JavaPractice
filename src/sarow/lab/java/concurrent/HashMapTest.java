package sarow.lab.java.concurrent;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
	
	ConcurrentHashMap<String, String> cMap = new ConcurrentHashMap<String, String>();
	
	HashMap<String , String> map = new HashMap<String, String>();
	
	public static void main(String[] args) {
		new HashMapTest();
	}
}
