/**
 * Project Name : console-commons-log <br>
 * File Name : DoLog.java <br>
 * Package Name : com.lee.example.log <br>
 * Create Time : Sep 9, 2016 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.example.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * ClassName : DoLog <br>
 * Description : Do Log with the provide log impl <br>
 * Create Time : Sep 9, 2016 <br>
 * Create by : jimmyblylee@126.com <br>
 *
 */
public class DoLog {

    /**
     * Description : do log <br>
     * Create Time: Sep 9, 2016 <br>
     * Create by : jimmyblylee@126.com <br>
     *
     * @param args
     */
    public static void main(String[] args) {
        Log log = LogFactory.getLog(DoLog.class);
        log.info("java commons logging over to logback example.");
        log.info("Tt is logging with " + log.getClass().getName());
        log.info("hello");
    }

}
