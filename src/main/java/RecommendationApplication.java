import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷题微服务启动类
 *
 * @author: ChickenWing
 * @date: 2023/10/1
 */
@SpringBootApplication
@ComponentScan("com.ikun")
@MapperScan("com.ikun.mapper")
public class RecommendationApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecommendationApplication.class);
    }

}
