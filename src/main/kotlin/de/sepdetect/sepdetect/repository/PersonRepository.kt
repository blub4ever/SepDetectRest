package de.sepdetect.sepdetect.repository

import de.sepdetect.sepdetect.model.Person
import org.springframework.data.jpa.repository.JpaRepository

/**
 * PersonRepository zur Verwaltung von Personen in der Datenbank.
 */
interface PersonRepository : JpaRepository<Person,Long> {
}
