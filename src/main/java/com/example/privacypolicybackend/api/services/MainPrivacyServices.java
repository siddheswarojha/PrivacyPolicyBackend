package com.example.privacypolicybackend.api.services;

import com.example.privacypolicybackend.api.dao.PrivacyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainPrivacyServices {

    @Autowired
    private PrivacyRepository privacyRepository;
    public String getAllPrivacyPolicy(String privacyPolicyName) {

        return privacyRepository.findAllByPrivacyPolicyName(privacyPolicyName).getPrivacyPolicy();
    }
}
