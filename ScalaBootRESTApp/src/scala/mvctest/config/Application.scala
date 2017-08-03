package scala.mvctest.config

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.boot.autoconfigure.domain.EntityScan
/**
 * *
 * @author gauravkhandave
 */
@SpringBootApplication
@EnableJpaRepositories(Array("scala.mvctest.service"))
@EntityScan(Array("scala.mvctest.domain"))
@ComponentScan(Array("scala.mvctest.service", "scala.mvctest.controller", "scala.mvctest.domain", "scala.mvctest.config"))
class Application

object Application extends App {
  SpringApplication.run(classOf[Application]);
}