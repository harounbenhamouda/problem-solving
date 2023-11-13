package algo;


public class ProductOfAnArrayExceptItself {
    private static final boolean INCLUDE_ZEROS = true;
    private static final boolean EXCLUDE_ZEROS = false;

    public int calculateProduct(int[] tab, boolean includeZeros) {
        int product = 1;

        for (int num : tab) {
            product *= (num == 0 && !includeZeros) ? 1 : num;
        }

        return product;
    }

    public int[] productOfArray(int[] tab) {
        int[] result = new int[tab.length];

        int totalWithoutZeros = calculateProduct(tab, INCLUDE_ZEROS);
        int totalWithZeros = calculateProduct(tab, EXCLUDE_ZEROS);

        for (int i = 0; i < tab.length; i++) {
            result[i] = (tab[i] == 0) ? totalWithoutZeros : totalWithZeros / tab[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4};
        ProductOfAnArrayExceptItself test = new ProductOfAnArrayExceptItself();
        int[] result = test.productOfArray(tab);

        for (int i = 0; i < result.length; i++) {
            System.out.println("the total when i " + i + " is " + result[i]);
        }
    }
}
