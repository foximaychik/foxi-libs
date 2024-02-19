package com.foxi.Math;

import static java.lang.Math.*;

public class Math {
    //Constants
    public static final float PI = 3.141592653589793F;

    //Functions
    public static float sqred(float x) {
        x = x * x;
        return x;
    }

    public static float PythagoreanTheorem(float a, float b, float c) {
        c = (float) sqrt(sqred(a) + sqred(b));
        return c;
    }
    public static int random(int min, int max) {
        int range = max - min + 1;
        int rand = 0;
        for (int i = 0; i < 2; i++) {
            rand = (int)(java.lang.Math.random() * range) + min;
        }
        return rand;
    }
}
