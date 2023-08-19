package javaSpring.B_containers_for_bean;

import javaSpring.C_beans.School;
import javaSpring.C_beans.University;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ConfigurationApp05 {
    @Bean(name = "school01")
    public School school01() {
        System.out.println("bean school01");
        return new School();
    }
    //contoh pembuatan set create bean atau DependsOn.
    @DependsOn(value = {"school01"})//ini artinya bean university01 akan dibuat setelah bean school01.
    @Bean(name = "university01")
    public University university01() {
        System.out.println("bean university01");
        return new University();
    }
}
