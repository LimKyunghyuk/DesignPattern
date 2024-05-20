package org.devlion.designpattern.strategy;

import org.devlion.designpattern.strategy.msg.Messenger;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Messenger mail = new Mail();

        mail.setReceiver(new MailReceiver());
//        mail.setSender(aaa);
//        mail.setContents();
//        mail.setTitle();
        mail.send();


        Messenger sms = new Mail();

        sms.setReceiver(new MailReceiver());
//        mail.setSender(aaa);
//        mail.setContents();
//        mail.setTitle();
        sms.send();


    }
}