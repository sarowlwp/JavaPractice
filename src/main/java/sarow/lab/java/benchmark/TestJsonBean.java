/**
 * Sohu.com Inc.
 * Copyright (c) 2004-2014 All Rights Reserved.
 */
package sarow.lab.java.benchmark;

import java.util.Date;

/**
 *
 * @author wenpingliu
 * @version v 0.1 12/25/14 15:52 wenpingliu Exp $$
 */
public class TestJsonBean {

    private String beanName;

    private int beanAge;

    private String beanType;

    private Date ctime;

    private String msg;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public int getBeanAge() {
        return beanAge;
    }

    public void setBeanAge(int beanAge) {
        this.beanAge = beanAge;
    }

    public String getBeanType() {
        return beanType;
    }

    public void setBeanType(String beanType) {
        this.beanType = beanType;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
