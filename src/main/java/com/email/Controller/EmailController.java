package com.email.Controller;

import com.email.Model.Email;
import com.email.Repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired private EmailRepository emailRepository;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Email email){
        String status = emailRepository.sendSimpleMail(email);
     return status;
    }

    @PostMapping("/sendAttachmentMail")
    public String sendAttachmentMail(@RequestBody Email email){
        String status = emailRepository.sendMailWithAttachment(email);
        return status;
    }

}
