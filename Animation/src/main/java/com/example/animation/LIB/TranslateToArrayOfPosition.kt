package com.example.animation.LIB
import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.view.View

class TranslateToArrayOfPosition(private val context: Context, private val view: View) {

    fun animate(coordinates: ArrayList<Pair<Long, Pair<Float, Float>>>) {
        val handler = Handler(Looper.getMainLooper())

        var delay = 0L // Initial delay

        for (i in 0 until coordinates.size) {
            val duration = coordinates[i].first
            val translationDistanceX = coordinates[i].second.first
            val translationDistanceY = coordinates[i].second.second

            // Create the ObjectAnimator for translation along the X-axis
            val animatorX = ObjectAnimator.ofFloat(
                view,
                View.TRANSLATION_X,
                translationDistanceX // End value (translation along X-axis)
            )

            // Create the ObjectAnimator for translation along the Y-axis
            val animatorY = ObjectAnimator.ofFloat(
                view,
                View.TRANSLATION_Y,
                translationDistanceY // End value (translation along Y-axis)
            )

            val animatorSet = AnimatorSet()
            animatorSet.playTogether(animatorX, animatorY)
            animatorSet.duration = duration

            // Set listener for the current animator set
            animatorSet.addListener(object : Animator.AnimatorListener {
                override fun onAnimationStart(animation: Animator) {

                }

                override fun onAnimationEnd(animation: Animator) {

                    if (i < coordinates.size - 1) {
                        // Start the next animation
                        val nextDuration = coordinates[i + 1].first
                        val nextTranslationX = coordinates[i + 1].second.first
                        val nextTranslationY = coordinates[i + 1].second.second

                        val nextAnimatorX = ObjectAnimator.ofFloat(
                            view,
                            View.TRANSLATION_X,
                            nextTranslationX // End value (translation along X-axis)
                        )

                        val nextAnimatorY = ObjectAnimator.ofFloat(
                            view,
                            View.TRANSLATION_Y,
                            nextTranslationY // End value (translation along Y-axis)
                        )

                        val nextAnimatorSet = AnimatorSet()
                        nextAnimatorSet.playTogether(nextAnimatorX, nextAnimatorY)
                        nextAnimatorSet.duration = nextDuration

                        nextAnimatorSet.start()
                    }



                }

                override fun onAnimationCancel(animation: Animator) {

                }

                override fun onAnimationRepeat(animation: Animator) {

                }

            })

            // Start the current animation after the delay
            handler.postDelayed({
                animatorSet.start()
            }, delay)

            // Update delay for the next animation
            delay += duration
        }
    }
}
