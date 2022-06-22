package contacts

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "CONTACT")
data class Contact(
    @Id
    @Column(name = "ID")
    var id: String = "",
    @Column(name = "FIRST_NAME")
    var firstName: String = "",
    @Column(name = "LAST_NAME")
    var lastName: String = ""
)