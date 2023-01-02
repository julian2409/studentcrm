package nt.jsa.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @Column(name = "course_name")
    lateinit var courseName: String

    @Column(name = "course_description")
    lateinit var courseDescription: String

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY)
    var students: List<Student> = listOf()
}
