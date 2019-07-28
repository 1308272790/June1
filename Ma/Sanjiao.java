package Ma;

public class Sanjiao {
	int[][] a;
    public int[][] yang(int n){
        a = new int[n][n];
        for(int i=0;i<n;i++){

                a[i][0]=1;
                a[i][i]=1;//第一行输出1，第二行输出1 1
            if(i>=2){//下面当行数大于2的时候开始计算第n行的第一位到最后一位之间的数据
            for(int j=1;j<i;j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];/*这之间的每个  
               数为上一行的同一列数和上遗憾的同一列数的前一列数之和，  
               这样二维数据就完整的记录了杨辉三角形。*/
            }
            }
        }
        //下面是实现打印二维数组，即打印杨辉三角形
        for(int i=0;i<n;i++) {//打印n行
            for (int j = 0; j <= i; j++) {//打印每一行的里面的数据
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        return a;
    }

    public static void main(String[] args) {
        new yanghuisanjiao().yang(10);
    }
}
