package tw.idv.ires.web.patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import tw.idv.ires.web.patient.entity.Patient;
import tw.idv.ires.web.patient.service.PatientService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/patient")
public class PatientLogin {
    @Autowired
    private PatientService service;

    @PostMapping("/login")
    @ResponseBody
    public Patient login(@RequestBody Patient patient, HttpServletRequest request) {
        System.out.println(patient.getEmail());
        System.out.println(patient.getPassword());
        patient = service.login(patient);
        if (patient.isSuccessful()) {
            if (request.getSession(false) != null) {
                request.changeSessionId();
            }
            HttpSession session = request.getSession();
            session.setAttribute("loggedin", true);
            session.setAttribute("patient", patient);
            session.setAttribute("patientId", patient.getPatientId());
            System.out.println("🟢 登入成功，patientId 已寫入 session: " + patient.getPatientId());
        }
        return patient;
    }
}