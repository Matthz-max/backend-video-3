package com.matheus.crud.back_video_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Diz que essa classe é uma configuração do Spring
public class WebConfig {

    @Bean // Spring vai criar e gerenciar esse objeto pra gente
    public WebMvcConfigurer corsConfig() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permite que a API aceite requisições de qualquer origem (Frontends diferentes podem chamar)
                registry.addMapping("/**") // Libera todos os endpoints da API
                        .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE") // Libera esses métodos HTTP
                        .allowedOrigins("*"); // Libera qualquer domínio (pode restringir se quiser)
            }
        };
    }
}
