package Java_basics.Arrays.Array;

public class Creating_arrays {
    /**
     * Select four ways to create an array which can be successfully compiled.
     *
     * Keep in mind, the compilation stage is not the same as the running stage.
     *
     * This task may need some experiments with code.
     *
     *
     * char[] array = new char[0];
     *
     * char[] array = new char[10000000000000];
     *
     * char[] array = new char[1];
     *
     * char[] array = new char[-1];
     *
     * char[] array = { 'a', 'b', 'c', 'd' };
     */

    /*
    Correct:
    char[] array = new char[0];

    char[] array = new char[1];

    char[] array = new char[-1];

    char[] array = { 'a', 'b', 'c', 'd' };
     */

    /*
    我们只需要考虑对最基础的编译，而不是运行，我们只需要保证在编译阶段是正确的，是否可以正常运行，并不在我们考虑的范围之中，我们需要明白 数组的大小不能大于 Integer.MAX _ value。实际上，它甚至比这个值稍小，也就代表着不能大于2147483647
     */
}
