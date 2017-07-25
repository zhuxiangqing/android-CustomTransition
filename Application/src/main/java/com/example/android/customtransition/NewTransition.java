package com.example.android.customtransition;

import android.animation.Animator;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.transition.Transition;
import android.support.transition.TransitionValues;
import android.view.ViewGroup;

/**
 * Created by zhu on 2017/7/20.
 */

public class NewTransition extends Transition {
    @Nullable
    @Override
    public Animator createAnimator(@NonNull ViewGroup sceneRoot, @Nullable TransitionValues startValues, @Nullable TransitionValues endValues) {
        return super.createAnimator(sceneRoot, startValues, endValues);
    }
    @Override
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
    }
    @Override
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
    }
}
