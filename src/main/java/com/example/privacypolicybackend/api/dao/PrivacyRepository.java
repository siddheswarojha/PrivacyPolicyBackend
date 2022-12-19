package com.example.privacypolicybackend.api.dao;


import com.example.privacypolicybackend.api.model.PrivacyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrivacyRepository extends JpaRepository<PrivacyModel,Long> {
    PrivacyModel findAllByPrivacyPolicyName(String privacyPolicyName);
}
