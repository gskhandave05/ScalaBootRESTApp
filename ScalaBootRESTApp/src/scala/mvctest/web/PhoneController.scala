package scala.mvctest.web

import java.lang.Long
import javax.validation.Valid

import scala.mvctest.domain.Phone
import scala.mvctest.service.PhoneRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._
import org.springframework.http.HttpStatus
import org.springframework.beans.factory.annotation.Qualifier

/**
 * *
 * @author gauravkhandave
 */

@Controller
@RequestMapping(Array("/phones"))
class phoneController @Autowired() @Qualifier("phoneRepo") (private val phoneRepository: PhoneRepository) {

  @GetMapping
  @ResponseBody
  def list() = {
    val phones = phoneRepository.findAll()
    phones
  }

  @PostMapping(value = Array("/create"))
  @ResponseStatus(HttpStatus.CREATED)
  def create(@Valid @RequestBody phone: Phone) =
    {
      phoneRepository.save(phone)
    }

  @PostMapping(value = Array("/update"))
  @ResponseBody
  def update(@Valid @RequestBody phone: Phone) =
    {
      val ph = phoneRepository.save(phone)
      ph
    }

  @GetMapping(value = Array("/delete/{id}"))
  def delete(@PathVariable("id") id: Long) = {
    phoneRepository.delete(id)
  }

}