package contacts

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface ContactRepository : JpaRepository<Contact, String>, JpaSpecificationExecutor<Contact> {
    override fun findAll(): MutableList<Contact>
}