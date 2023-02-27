package shop.mtcoding.project.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // registry.addInterceptor(new CustomInterceptor())
        //         .addPathPatterns("/**") // 모든 URL에 대해 인터셉터를 수행하도록 설정합니다.
        //         .excludePathPatterns("/", "/user/join", "/user/check",
        //                 "/user/login", "/comp/join", "/user/resume/write",
        //                 "/comp/login", "/jobs/**", "/juso",
        //                 "/user/interest", "/help", "/jobs/info/search", "/comp/talent", "/user/scrap/insert",
        //                 "/user/scrap/delete"); // 인터셉터를 수행하지 않도록 설정합니다.
    }
}