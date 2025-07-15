package tw.idv.ires.web.clinic.controller;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.support.SessionStatus;


@RestController
@RequestMapping("clinic/logout")

public class LogoutController {
    @DeleteMapping
    public void logout(HttpSession session) {
        session.invalidate();
    }

}
