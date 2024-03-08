//package hello.thymeleaf.exception.hello.exception;
//
//import hello.thymeleaf.exception.hello.exception.filter.LogFilter;
//import hello.thymeleaf.exception.hello.exception.typeconverter.converter.IpPortToStringConverter;
//import hello.thymeleaf.exception.hello.exception.typeconverter.converter.StringToIpPortConverter;
//import hello.thymeleaf.exception.hello.exception.typeconverter.formatter.MyNumberFormatter;
//import hello.thymeleaf.login.web.web.interceptor.LogInterceptor;
//import jakarta.servlet.DispatcherType;
//import jakarta.servlet.Filter;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.format.FormatterRegistry;
//import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//import java.util.List;
//
//@Configuration
//public class WebConfig implements WebMvcConfigurer {
//
//    //    @Override
////    public void addInterceptors(InterceptorRegistry registry) {
////        registry.addInterceptor(new LogInterceptor())
////                .order(1)
////                .addPathPatterns("/**")
////                .excludePathPatterns("/css/**", "*.ico", "/error", "/error-page/**");//오류 페이지 경로
////    }
////
//////    @Override
//////    public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
//////        resolvers.add(new MyHandlerExceptionResolver());
//////        resolvers.add(new UserHandlerExceptionResolver());
//////    }
////
////    //    @Bean
////    public FilterRegistrationBean logFilter() {
////        FilterRegistrationBean<Filter> filterRegistrationBean = new FilterRegistrationBean<>();
////        filterRegistrationBean.setFilter(new LogFilter());
////        filterRegistrationBean.setOrder(1);
////        filterRegistrationBean.addUrlPatterns("/*");
////        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.ERROR);
////        return filterRegistrationBean;
////    }
//    @Override
//    public void addFormatters(FormatterRegistry registry) {
//        //주석처리 우선순위
////        registry.addConverter(new StringToIntegerConverter());
////        registry.addConverter(new IntegerToStringConverter());
//        registry.addConverter(new StringToIpPortConverter());
//        registry.addConverter(new IpPortToStringConverter());
//
//        //추가
//        registry.addFormatter(new MyNumberFormatter());
//    }
//}
