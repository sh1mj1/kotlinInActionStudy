package inaction.chap8.highOrderFunction1

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }
data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/signup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID),
)

fun List<SiteVisit>.averageDurationFor1(os: OS) = filter { it.os == os }.map(SiteVisit::duration).average()

fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
    filter(predicate).map(SiteVisit::duration).average()