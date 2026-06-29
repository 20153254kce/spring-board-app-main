package kr.co.sboard;

import kr.co.sboard.dto.AppInfoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public AppInfoDTO appInfo() {
        return new AppInfoDTO();
    }
}
