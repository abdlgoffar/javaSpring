package javaSpring.F_component;

import javaSpring.E_components.services.CategoryService;
import javaSpring.F_containers_for_component.Configuration01;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class L_getContainerComponent {
    //get container atau applicationContext compnent digunakan untuk mengetahui nama container atau applicationContext
    //sebuah component.
    //lihat di package F_components.service, class CategoryService.
    @Test
    public void getContainerComponent() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration01.class);
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        System.out.println(categoryService.getContainerName());
    }
}
