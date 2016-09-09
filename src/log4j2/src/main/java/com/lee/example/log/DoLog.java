/**
 * Project Name : console-log4j2 <br>
 * File Name : DoLog.java <br>
 * Package Name : com.lee.example.log <br>
 * Create Time : Sep 9, 2016 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.example.log;

import static org.fusesource.jansi.Ansi.Color.BLUE;
import static org.fusesource.jansi.Ansi.Color.CYAN;
import static org.fusesource.jansi.Ansi.Color.GREEN;
import static org.fusesource.jansi.Ansi.Color.MAGENTA;
import static org.fusesource.jansi.Ansi.Color.RED;
import static org.fusesource.jansi.Ansi.Color.WHITE;
import static org.fusesource.jansi.Ansi.Color.YELLOW;

import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.Ansi.Color;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        Logger log = LoggerFactory.getLogger(DoLog.class);
        ILoggerFactory lf = LoggerFactory.getILoggerFactory();
        log.info("Tt is logging colorful console log with {}", lf.getClass().getName());
        String msg = "this is a {} log and it should begin with {} color.";
        log.trace(msg, "debug", "Normal");
        log.debug(msg, "debug", "Normal");
        log.info(msg, "info", "Blue");
        log.warn(msg, "warn", "Red");
        log.error(msg, "error", "Bright red");
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            log.error("this is a exception stack trace", e);
        }
        log.info(c(BLUE, "this") + c(CYAN, " message") + c(GREEN, " is") + c(MAGENTA, " painted") + c(RED, " with") + c(WHITE, " different")
                + c(YELLOW, " color"));
    }

    private static String c(Color color, String message) {
        return Ansi.ansi().fgBright(color).a(message).reset().toString();
    }

}
