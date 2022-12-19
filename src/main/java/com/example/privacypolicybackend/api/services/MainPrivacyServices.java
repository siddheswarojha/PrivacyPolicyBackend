package com.example.privacypolicybackend.api.services;

import com.example.privacypolicybackend.api.dao.PrivacyRepository;
import com.example.privacypolicybackend.api.model.PrivacyModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainPrivacyServices {

    @Autowired
    private PrivacyRepository privacyRepository;

    public String addAllPrivacyPolicy(PrivacyModel privacyModel) {
        PrivacyModel pModel = new PrivacyModel();
        pModel.setPrivacyPolicy(privacyModel.getPrivacyPolicy());
        pModel.setPrivacyPolicyName(privacyModel.getPrivacyPolicyName());
        privacyRepository.save(pModel);
        return "Success";
    }

    public String getAllPrivacyPolicy(String privacyPolicyName) {

        return privacyRepository.findAllByPrivacyPolicyName(privacyPolicyName).getPrivacyPolicy();
    }
}
