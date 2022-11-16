package javaDSA.examples;

// improvement over binary search. Best used for uniformly distributed data (eg increasing by 1)
// guesses where a value might be based on a calculated probe.
// if probe is incorrect, search area is narrowed and new probe calculated.
// O(log(log(n))) = average case        O(n) = worst case

public class InterpolationSearch {
    public static void main(String[] args) {
        int[] array = {1,2,4,8,16,32,64,128,256,512,1024};

        int index = interpolationSearch(array, 256);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length-1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low <= high) {

            int probe = low + (high - low) * (value - array[low]) /
                    (array[high] - array[low]);

            System.out.println("probe: " + probe);

            if(array[probe] == value) {
                return probe;
            } else if(array[probe] < value) {
                low = probe + 1;              // changing low boundary if value is greater than probe. disregard all values lower.
            } else {
                high = probe - 1;             // changing high boundary if value is less than probe.
            }
        }
        return -1;
    }
}
