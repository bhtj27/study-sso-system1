package com.itao.study.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import study.sso.example.client.filter.SsoFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description :
 * @Author JunTao
 * @Date : 2017/11/30
 */
@Component
public class FilterConfig {

    @Bean
    public FilterRegistrationBean  filterRegistrationBean() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        SsoFilter ssoFilter = new SsoFilter();
        registrationBean.setFilter(ssoFilter);
        List<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        registrationBean.setUrlPatterns(urlPatterns);
        return registrationBean;
    }
}
