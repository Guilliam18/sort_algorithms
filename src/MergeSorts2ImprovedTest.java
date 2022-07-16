

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeSorts2ImprovedTest extends AbstractSortTest {

  @BeforeEach
  void setUp() throws Exception {
    sorter = (items) -> MergeSortsImproved.mergeSort2(items);
  }

  @Test
  void test() {
    super.test1();
    super.test2();
    super.test3();
    super.test4();
    super.test5();
    super.test6();
    super.test7();
    super.test8();
    super.test9();
  }
}
