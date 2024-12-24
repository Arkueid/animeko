package me.him188.ani.app.desktop

import dev.dirs.ProjectDirectories
import me.him188.ani.app.platform.AniBuildConfigDesktop
import java.io.File

class MyProjectDirectories {  // hack
    private val root = "./Arkueid/Him188/Ani"
    val dataDir = "$root/data"
    val cacheDir = "$root/cache"
}

val projectDirectories = MyProjectDirectories()

val MyProjectDirectories.torrentCacheDir get() = File(this.cacheDir).resolve("torrent-data")

//val projectDirectories: ProjectDirectories by lazy {
//    ProjectDirectories.from(
//        "me",
//        "Him188",
//        if (AniBuildConfigDesktop.isDebug) "Ani-debug" else "Ani",
//    )
//}

//val ProjectDirectories.torrentCacheDir: File
//    get() = File(cacheDir).resolve("torrent-data")