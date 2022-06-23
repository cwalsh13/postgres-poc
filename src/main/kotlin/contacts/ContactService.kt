package contacts

import mu.KotlinLogging
import org.springframework.beans.factory.InitializingBean

private val logger = KotlinLogging.logger {}

class ContactService(private val contactRepository: ContactRepository) {
    public fun getContactCount() : Int {
        val contacts = contactRepository.findAll()
        logger.error("Found ${contacts.size} contacts in the DB")
        return contacts.size
    }
}