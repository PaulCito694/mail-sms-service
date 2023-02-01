package mail.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class MailController {

    @PostMapping
    public ResponseEntity<Character> sendMessage() {
        return  ResponseEntity.ok('s');
    }
}
