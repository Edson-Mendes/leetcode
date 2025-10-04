package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class LowestCommonAncestorOfABinaryTreeTest {

  @ParameterizedTest
  @CsvSource({"5,1,3", "5,4,5", "7,4,2", "2,0,3", "8,0,1", "0,8,1"})
  void test01(int pValue, int qValue, int expectedAnswer) {
    TreeNode treeNode = TreeNodeGenerator.generate(3, 5, 1, 6, 2, 0, 8, MIN_VALUE, MIN_VALUE, 7, 4, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    TreeNode p = TreeNodeGenerator.generate(pValue);
    TreeNode q = TreeNodeGenerator.generate(qValue);

    LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
    TreeNode actualAnswer = solution.lowestCommonAncestor(treeNode, p, q);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(expectedAnswer);
  }

  @ParameterizedTest
  @CsvSource({"7,4,5", "4,7,5"})
  void test02(int pValue, int qValue, int expectedAnswer) {
    TreeNode treeNode = TreeNodeGenerator.generate(3, 2, 1, 6, 5, 0, 8, MIN_VALUE, MIN_VALUE, 7, 4, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    TreeNode p = TreeNodeGenerator.generate(pValue);
    TreeNode q = TreeNodeGenerator.generate(qValue);

    LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
    TreeNode actualAnswer = solution.lowestCommonAncestor(treeNode, p, q);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(expectedAnswer);
  }

}