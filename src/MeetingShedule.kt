import data.Meeting // Make sure you have your Meeting data class defined

fun isMeetingOverlapping(meeting1: Meeting, meeting2: Meeting): Boolean {
    return meeting1.startTime < meeting2.endTime && meeting1.endTime > meeting2.startTime
}