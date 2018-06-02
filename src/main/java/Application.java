import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zhangsisi on 2018/6/2.
 */
@SpringBootApplication
@ComponentScan("com.blog.cn")
public class Application {
	public static void main(String[] args){
		SpringApplication.run(Application.class,args);
	}
}
