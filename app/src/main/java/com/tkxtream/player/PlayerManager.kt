package com.tkxtream.player

import android.content.Context
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.common.MediaItem

class PlayerManager(private val context: Context) {
    private var player: ExoPlayer? = null

    fun playStream(url: String): ExoPlayer {
        player = ExoPlayer.Builder(context).build().apply {
            setMediaItem(MediaItem.fromUri(url))
            prepare()
            playWhenReady = true
        }
        return player!!
    }

    fun release() {
        player?.release()
        player = null
    }
}
