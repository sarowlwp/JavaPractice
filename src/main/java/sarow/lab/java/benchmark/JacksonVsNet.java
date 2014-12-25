/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.benchmark;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import net.sf.json.JSONObject;

import java.util.Date;
import java.util.Map;

/**
 *
 * @author wenpingliu
 * @version v 0.1 12/25/14 10:13 wenpingliu Exp $$
 */
public class JacksonVsNet {

    private static final ObjectMapper mapper = new ObjectMapper();

    public static void main(String[] args) throws Exception {
         new JacksonVsNet().singleThread();
         new JacksonVsNet().singleObjectThread();

    }

    public void singleObjectThread() throws Exception{
        TestJsonBean jsonBean = new TestJsonBean();
        jsonBean.setBeanAge(100);
        jsonBean.setBeanName("JsonTest");
        jsonBean.setBeanType("Json");
        jsonBean.setMsg("hello world");
        jsonBean.setCtime(new Date());
        String jsonStr = mapper.writeValueAsString(jsonBean);


        JSONObject obj = null;

        long start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            obj = JSONObject.fromObject(jsonStr);
        }
        System.out.println("net:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            mapper.readValue(jsonStr, TestJsonBean.class);
        }
        System.out.println("jackson:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            obj.toString();
        }
        System.out.println("net:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            mapper.writeValueAsString(jsonBean);
        }
        System.out.println("jackson:" + (System.currentTimeMillis() - start));
    }


    public void singleThread() throws Exception{
        Map data = Maps.newHashMap();
        data.put("att1",1);
        data.put("att2",1);
        data.put("att3",1);
        data.put("att4",1);
        data.put("att5",1);
        data.put("att6",1);
        data.put("att7",1);
        data.put("att8",1);
        data.put("att9",1);

        String json = mapper.writeValueAsString(data);
        JSONObject obj = null;
        Map tdata = null;
        System.out.println(json);
        long start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            obj = JSONObject.fromObject(json);
        }
        System.out.println("net:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            tdata = mapper.readValue(json, Map.class);
        }
        System.out.println("jackson:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            obj.toString();
        }
        System.out.println("net:" + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        for(int i=0;i<10000000;i++) {
            mapper.writeValueAsString(tdata);
        }
        System.out.println("jackson:" + (System.currentTimeMillis() - start));
    }

}
