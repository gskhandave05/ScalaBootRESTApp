package scala.mvctest.config

import scala.mvctest.domain.Phone
import scala.mvctest.service.PhoneRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * Responsible for populating some initial data into the database..
 *
 * @author gauravkhandave
 */

@Component
class DbPopulator @Autowired() (val phoneRepository: PhoneRepository) extends CommandLineRunner {
  override def run(args: String*): Unit = {
    (1 to 10).foreach(i => {
      phoneRepository.save(new Phone(id = null, name = s"Phone $i", homeNumber = s"1234567890$i", cellPhone = s"0987654321$i"))
    })
  }
}
