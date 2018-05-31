package app.fideliz;

import com.googlecode.objectify.ObjectifyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Filter;

@SpringBootApplication
@ServletComponentScan
public class FidelizApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidelizApplication.class, args);
	}
}
