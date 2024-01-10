package inaction.chap4.`object`.normal

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(o1: File, o2: File): Int = o1.path.compareTo(o2.path, ignoreCase = true)
}