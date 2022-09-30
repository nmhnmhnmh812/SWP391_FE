package other;

import javax.mail.*;
import javax.mail.Authenticator;
import java.util.*;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Admin
 */
public class SendEmail {

    public SendEmail() {
    }


    //send email to the user email
    public void sendEmail(Email emai) throws Exception {

        // your host email smtp server details
        Properties pr = new Properties();
        pr.setProperty("mail.smtp.host", "smtp.gmail.com");
        pr.setProperty("mail.smtp.port", "587");
        pr.setProperty("mail.smtp.auth", "true");
        pr.setProperty("mail.smtp.starttls.enable", "true");

        //get session to authenticate the host email address and password
        Session session = Session.getInstance(pr, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(emai.getFrom(), emai.getFromPassword());
            }
        });
        try {

            //set email message details
            Message mess = new MimeMessage(session);

            //set from email address
            mess.setFrom(new InternetAddress(emai.getFrom()));
            //set to email address or destination email address
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(emai.getTo()));

            //set email subject
            mess.setSubject(emai.getSubject());

            //set message content
            mess.setContent(emai.getContent(), "text/html; charset=utf-8");
            //send the message
            Transport.send(mess);

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
