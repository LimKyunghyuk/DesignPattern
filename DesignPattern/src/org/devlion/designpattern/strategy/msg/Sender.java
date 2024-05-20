package org.devlion.designpattern.strategy.msg;

public interface Sender {

    public void sendTo(Recipient recipient, Message message);
}
