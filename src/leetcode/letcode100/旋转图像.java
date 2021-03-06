package leetcode.letcode100;

import java.util.Arrays;

/**
 * @author zhangsy
 * @date 2020/9/11 20:51
 * <p>
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * <p>
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 */
public class 旋转图像 {

    public static void main(String[] args) {
        int[][] matrix = {{15,13, 2, 5},
                         {14, 3, 4, 1},
                         {12, 6, 8, 9},
                         {16, 7,10,11}};

        rotate(matrix);

    }

    public static void rotate(int[][] matrix) {
        int len = matrix.length;
        for (int k = 0; k < len; k++) {
            if (k >= len - k - 1) break;
            int start = k, end = len - k;
            for (int i = start, j = end - 1; i < end - 1 && j > start; i++, j--) {
                int angle1 = matrix[start][i];
                int angle2 = matrix[i][end - 1];
                int angle3 = matrix[end - 1][j];
                int angle4 = matrix[j][start];

                matrix[start][i] = angle4;
                matrix[i][end - 1] = angle1;
                matrix[end - 1][j] = angle2;
                matrix[j][start] = angle3;
            }
        }
    }
}
