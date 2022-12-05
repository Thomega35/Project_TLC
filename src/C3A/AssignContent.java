package C3A;

/**
 * Correspond to (*a)=b in C3A
 */
public class AssignContent {
  private Variable left;
  private ToAssign right;

  public AssignContent(Variable left, ToAssign right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public String toString() {
    return "*" + left + " = " + right;
  }
}