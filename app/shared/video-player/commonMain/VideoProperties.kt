package me.him188.ani.app.videoplayer

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable

@Immutable
data class VideoProperties internal constructor(
    val title: String?,
    val heightPx: Int,
    val widthPx: Int,
    val videoBitrate: Int,
    val audioBitrate: Int,
    val frameRate: Float,
    val durationMillis: Long,
    val fileLengthBytes: Long,
    val fileHash: String? = null, // 16 bytes
) {
    companion object {
        @Stable
        val EMPTY = VideoProperties(
            title = null,
            heightPx = 0,
            widthPx = 0,
            videoBitrate = 0,
            audioBitrate = 0,
            frameRate = 0f,
            durationMillis = 0,
            fileLengthBytes = 0
        )
    }
}