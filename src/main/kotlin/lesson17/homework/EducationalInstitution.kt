package com.daniilpuris.lesson17.homework

// Иерархия классов с расширением базовой сущности.

open class EducationalInstitutions (
    val educationLevel: String,
    val studentsNumber: Int
)

open class School (
    educationLevel: String,
    studentsNumber: Int,
    val classesNumber: Int
) : EducationalInstitutions(educationLevel, studentsNumber)

class Lyceum (
    educationLevel: String,
    studentsNumber: Int,
    classesNumber: Int,
    val advancedStudyPrograms: List<String>
) : School(educationLevel, studentsNumber, classesNumber)

open class VocationalSchools (
    educationLevel: String,
    studentsNumber: Int,
    val educationYearsNumber: Int
): EducationalInstitutions(educationLevel, studentsNumber)

class college (
    educationLevel: String,
    studentsNumber: Int,
    educationYearsNumber: Int,
    val secondarySpecializedPrograms: List<String>
) : VocationalSchools(educationLevel, studentsNumber, educationYearsNumber)

class technicalSchool (
    educationLevel: String,
    studentsNumber: Int,
    educationYearsNumber: Int,
    val practicalProgram: List<String>
) : VocationalSchools(educationLevel, studentsNumber, educationYearsNumber)