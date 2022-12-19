package com.example.privacypolicybackend.api.controller;

import com.example.privacypolicybackend.api.services.MainPrivacyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("privacy/api/v1/")
public class MainController {
    @Autowired
    private MainPrivacyServices mainPrivacyServices;

    @GetMapping("getPrivacyPolicy/{privacyPolicyName}")
    public String getAllPrivacyPolicy(@PathVariable("privacyPolicyName") String privacyPolicyName ){
        return mainPrivacyServices.getAllPrivacyPolicy(privacyPolicyName);
    }

}
