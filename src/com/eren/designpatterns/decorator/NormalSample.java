package com.eren.designpatterns.decorator;

public class NormalSample {

    public static class Iphone11 {
        public String name() {
            return "Iphone 11";
        }

        public int getCameraCount() {
            return 2;
        }
    }

    public static class Iphone11Pro {
        public String name() {
            return "Iphone11 Pro";
        }

        int getCameraCount() {
            return 3;
        }
    }

    public static class Iphone11ProMax {
        public String name() {
            return "Iphone11 Pro Max";
        }

        int getCameraCount() {
            return 3;
        }
    }
}
