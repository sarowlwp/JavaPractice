//package com.sohu.suc.concurrent;
//
//import java.io.IOException;
//
//import org.apache.http.HttpResponse;
//import org.apache.http.client.ClientProtocolException;
//import org.apache.http.client.HttpClient;
//import org.apache.http.client.methods.HttpPost;
//import org.apache.http.client.params.CookiePolicy;
//import org.apache.http.impl.client.DefaultHttpClient;
//import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
//import org.apache.http.params.HttpConnectionParams;
//import org.apache.http.params.HttpParams;
//import org.junit.Test;
//
//public class HttpclientTest {
//		String url = "http://www.renren.com//";
//		
//		private static DefaultHttpClient httpClient = null;
//		
//		public static DefaultHttpClient getInstance(){
//			if(httpClient == null){
//				DefaultHttpClient client4 = new DefaultHttpClient();
//			    HttpParams params = client4.getParams();
//			    ThreadSafeClientConnManager mgr = new ThreadSafeClientConnManager();
//			    //params.setParameter(CoreProtocolPNames.PROTOCOL_VERSION, HttpVersion.HTTP_1_1);
//			    //mgr.setMaxTotal(20);
//			    //HttpConnectionParams.setTcpNoDelay(params, false);
//			    HttpConnectionParams.setStaleCheckingEnabled(params, false);
//			    //HttpConnectionParams.setConnectionTimeout(params, 3000);
//			    //HttpConnectionParams.setSoTimeout(params, 5000);
//			    client4 = new DefaultHttpClient(mgr,params);
//			    return client4;
//			}else{
//				return httpClient;
//			}
//		}
//		
//		@Test
//		public void testHttpClient4() throws ClientProtocolException, IOException {
//			long total4 = 0;
//			long total41 = 0;
//			int time =100;
//			HttpPost method = null;
//			long start=0;
//			long cost = 0;
//			HttpResponse httpResponse = null;
//			
//			for(int i=0 ;i<time ;i++){
//					System.out.println(i);
//					 method = new HttpPost(url);
//					// method.getParams().setCookiePolicy(CookiePolicy.IGNORE_COOKIES);
//					 start = System.currentTimeMillis();
//					 httpResponse = HttpclientTest.getInstance().execute(method);
//					 cost = System.currentTimeMillis()-start;
//					total4+=cost;
//					System.out.println("http4:" + cost);
//					
//					HttpClient client3 = new DefaultHttpClient();
//					method = new HttpPost(url);
//					start = System.currentTimeMillis();
//					httpResponse = client3.execute(method);
//					cost = System.currentTimeMillis()-start;
//					total41+=cost;
//					System.out.println("http41:" + cost);
//				}
//				System.out.println("avg http41:" + total41/time);
//				System.out.println("avg http4:" + total4/time);
//				
//		}
//
//}
