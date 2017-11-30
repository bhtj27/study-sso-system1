package com.itao.study.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description :
 * @Author JunTao
 * @Date : 2017/11/30
 */
@WebFilter(filterName="filterTest",urlPatterns="/*")
public class FilterTest implements Filter {

    private static Logger logger = LoggerFactory.getLogger(FilterTest.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        logger.info("filterTest init method...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("filterTest doFilter method...");
    }

    @Override
    public void destroy() {
        logger.info("filterTest destroy method...");
    }
}
