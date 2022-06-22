package contacts

import mu.KotlinLogging
import org.springframework.beans.factory.InitializingBean

private val logger = KotlinLogging.logger {}

class ContactService(private val contactRepository: ContactRepository): InitializingBean {
    override fun afterPropertiesSet() {
        val contacts = contactRepository.findAll()
        logger.error("Found ${contacts.size} contacts in the DB")
    }
}