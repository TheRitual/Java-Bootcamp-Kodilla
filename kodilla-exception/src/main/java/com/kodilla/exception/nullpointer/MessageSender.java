package com.kodilla.exception.nullpointer;

class MessageSender {
    void sendMessageTo(User user, String message) throws MessageNotSentException{
        if(user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        } else {
            throw new MessageNotSentException("Object User was null");
        }


    }
}