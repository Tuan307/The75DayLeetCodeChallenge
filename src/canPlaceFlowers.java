public class canPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        if (flowerbed.length > 1) {
            for (int i = 0; i < flowerbed.length; i++) {
                if (i == 0) {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                        flowerbed[i] = 1;
                        n = n - 1;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n = n - 1;
                    }
                } else {
                    if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                        flowerbed[i] = 1;
                        n = n - 1;
                    }
                }
            }
            return !(n > 0);
        } else {
            if (flowerbed[0] == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[] { 1, 0, 0, 0, 1 }, 2));
    }
}
