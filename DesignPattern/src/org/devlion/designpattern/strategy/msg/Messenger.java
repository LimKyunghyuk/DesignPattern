package org.devlion.designpattern.strategy.msg;

import org.devlion.designpattern.strategy.MailReceiver;

import java.util.List;

abstract public class Messenger {

    Message message;
    List<Recipient> recipientList;
    Sender sender;

    

    public void send(){

        for(Recipient recipient : recipientList){
            sender.sendTo(recipient, message);
        }

    }

    public void setReceiver(MailReceiver receiver) {

    }
}
