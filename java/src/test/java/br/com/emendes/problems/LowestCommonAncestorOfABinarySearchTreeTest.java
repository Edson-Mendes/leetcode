package br.com.emendes.problems;

import br.com.emendes.problems.util.TreeNode;
import br.com.emendes.problems.util.TreeNodeGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static java.lang.Integer.MIN_VALUE;
import static org.assertj.core.api.Assertions.assertThat;

class LowestCommonAncestorOfABinarySearchTreeTest {

  @ParameterizedTest
  @CsvSource({"2,8,6", "2,4,2", "7,8,8", "8,7,8", "3,5,4"})
  void test01(int pValue, int qValue, int expectedAnswer) {
    TreeNode treeNode = TreeNodeGenerator.generate(6, 2, 8, 0, 4, 7, 9, MIN_VALUE, MIN_VALUE, 3, 5, MIN_VALUE, MIN_VALUE, MIN_VALUE, MIN_VALUE);
    TreeNode p = TreeNodeGenerator.generate(pValue);
    TreeNode q = TreeNodeGenerator.generate(qValue);

    LowestCommonAncestorOfABinarySearchTree solution = new LowestCommonAncestorOfABinarySearchTree();
    TreeNode actualAnswer = solution.lowestCommonAncestor(treeNode, p, q);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(expectedAnswer);
  }

  @Test
  void test02() {
    TreeNode treeNode = TreeNodeGenerator.generate(2, 1, MIN_VALUE);
    TreeNode p = TreeNodeGenerator.generate(2);
    TreeNode q = TreeNodeGenerator.generate(1);

    LowestCommonAncestorOfABinarySearchTree solution = new LowestCommonAncestorOfABinarySearchTree();
    TreeNode actualAnswer = solution.lowestCommonAncestor(treeNode, p, q);

    assertThat(actualAnswer).isNotNull();
    assertThat(actualAnswer.val).isEqualTo(2);
  }

}