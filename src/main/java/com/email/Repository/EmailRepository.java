package com.email.Repository;

import com.email.Model.Email;

public interface EmailRepository {
    String sendSimpleMail(Email email);
    String sendMailWithAttachment(Email details);
}
