import java.util.Arrays;

public class P17FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        image[sr][sc] = color;

        if (originalColor == color) {
            return image;
        }

        if (sr - 1 >= 0) {
            if (image[sr - 1][sc] == originalColor) {
                floodFill(image, sr - 1, sc, color);
            }
        }

        if (sr + 1 < image.length) {
            if (image[sr + 1][sc] == originalColor) {
                floodFill(image, sr + 1, sc, color);
            }
        }

        if (sc - 1 >= 0) {
            if (image[sr][sc - 1] == originalColor) {
                floodFill(image, sr, sc - 1, color);
            }
        }

        if (sc + 1 < image[0].length) {
            if (image[sr][sc + 1] == originalColor) {
                floodFill(image, sr, sc + 1, color);
            }
        }

        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        System.out.println(Arrays.deepToString(floodFill(image, 0, 0, 0)));
    }
}
