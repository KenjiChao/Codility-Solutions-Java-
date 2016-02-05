/* *
 * TreeHeight:
 * Compute the height of a binary tree.
 *
 * Test score: 100%
 *
 * @see <a href="https://codility.com/programmers/task/tree_height/">https://codility.com/programmers/task/tree_height/</a>
 *
 * Warning: This snippet of code cannot be compiled.
 *          It should be compiled and tested on the above codility link.
 */
public class TreeHeight {
    public int solution(Tree T) {
        if (T == null) {
            return -1;
        }
        return getTreeHeight(T, -1);
    }

    private int getTreeHeight(Tree tree, int height) {
        if (tree == null) {
            return height;
        } else {
            return Math.max(getTreeHeight(tree.l, height + 1),
                getTreeHeight(tree.r, height + 1));
        }
    }
}
