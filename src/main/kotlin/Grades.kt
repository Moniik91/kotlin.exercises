fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here
    for (i in grades.indices){
        val grade = grades[i]
        if (grade >= 38) {
            val roundGrade = (grade / 5+1)*5
            if (roundGrade - grade < 3){
                grades[i] = roundGrade
            } else {
                grades
            }
        }
    }
    return (grades)
}



fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
