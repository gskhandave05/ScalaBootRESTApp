package scala.mvctest.service

import java.lang.Long

import scala.mvctest.domain.Phone

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * *
 * @author gauravkhandave
 */

@Repository("phoneRepo")
trait PhoneRepository extends CrudRepository[Phone, Long]