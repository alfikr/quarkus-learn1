package com.jasavast.learn1.util.datavalidation;

import io.quarkus.hibernate.validator.ValidatorFactoryCustomizer;
import org.hibernate.validator.BaseHibernateValidatorConfiguration;

public class CommunityValidator implements ValidatorFactoryCustomizer {

    @Override
    public void customize(BaseHibernateValidatorConfiguration<?> configuration) {

    }
}
