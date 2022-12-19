package com.example.privacypolicybackend.api.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class PrivacyModel extends AbstractPersistable<Long> {
    String privacyPolicy;
    String privacyPolicyName;

}
