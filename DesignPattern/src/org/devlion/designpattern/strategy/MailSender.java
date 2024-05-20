package org.devlion.designpattern.strategy;

import strategy.msg.Message;
import strategy.msg.Recipient;
import strategy.msg.Sender;

public class MailSender implements Sender {


    @Override
    public void sendTo(Recipient recipient, Message message) {

        String address = recipient.getAddress();






    }
}
