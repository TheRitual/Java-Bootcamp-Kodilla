package com.kodilla.good.patterns.challenges.OrderServiceStuff;

public class EmailService implements AnnouncementService {

    @Override
    public boolean sendMessage(String emailAdress) {
        if(emailAdress.contains("@")) {
            System.out.println("AS: Sending email to " + emailAdress);
            return true;
        }else {
            return false;
        }
    }
}
