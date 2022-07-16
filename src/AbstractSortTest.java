

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

abstract class AbstractSortTest {

  protected Sorter<Integer> sorter;

  @Test
  void test1() {
    Integer[] items = new Integer[2];
    items[0] = 256;
    items[1] = 12;
    sorter.sort(items);
    assertEquals(12, items[0]);
  }

  @Test
  void test2() {
    Integer[] items = new Integer[6];
    items[0] = 256;
    items[1] = 15;
    items[2] = 500;
    items[3] = 325;
    items[4] = 255;
    items[5] = 125;
    sorter.sort(items);
    assertEquals(15, items[0]);
    assertEquals(125, items[1]);
    assertEquals(255, items[2]);
    assertEquals(256, items[3]);
    assertEquals(325, items[4]);
    assertEquals(500, items[5]);
  }

  @Test
  void test3() {
    Integer[] items = new Integer[7];
    items[0] = 10;
    items[1] = 5;
    items[2] = 8;
    items[3] = 5;
    items[4] = 11;
    items[5] = 3;
    items[6] = 1;
    sorter.sort(items);
    assertEquals(1, items[0]);
    assertEquals(3, items[1]);
    assertEquals(5, items[2]);
    assertEquals(5, items[3]);
    assertEquals(8, items[4]);
    assertEquals(10, items[5]);
    assertEquals(11, items[6]);
  }

  @Test
  void test4() {
    Integer[] items = new Integer[61];
    int j = 0;
    for (int i = 60; i >= 0; i--) {
      items[i] = j;
      j++;
    }
    sorter.sort(items);
    assertEquals(0, items[0]);
    assertEquals(10, items[10]);
    assertEquals(30, items[30]);
    assertEquals(60, items[60]);
    assertEquals(15, items[15]);
    assertEquals(31, items[31]);


  }

  @Test
  void test5() {
    Integer[] items = new Integer[15];
    items[0] = 5;
    items[1] = 8;
    items[2] = 12;
    items[3] = 3;
    items[4] = 11;
    items[5] = 2;
    items[6] = 15;
    items[7] = 9;
    items[8] = 20;
    items[9] = 4;
    items[10] = 5;
    items[11] = 10;
    items[12] = 24;
    items[13] = 14;
    items[14] = 13;
    sorter.sort(items);
    assertEquals(2, items[0]);
    assertEquals(3, items[1]);
    assertEquals(4, items[2]);
    assertEquals(5, items[3]);
    assertEquals(5, items[4]);
    assertEquals(8, items[5]);
    assertEquals(9, items[6]);
    assertEquals(10, items[7]);
    assertEquals(11, items[8]);
    assertEquals(12, items[9]);
    assertEquals(13, items[10]);
    assertEquals(14, items[11]);
    assertEquals(15, items[12]);
    assertEquals(20, items[13]);
    assertEquals(24, items[14]);
  }

  @Test
  void test6() {
    Integer[] items = new Integer[1000];
    int j = 0;
    for (int i = 999; i >= 0; i--) {
      items[i] = j;
      j++;
    }
    sorter.sort(items);
    assertEquals(999, items[999]);
    assertEquals(500, items[500]);
    assertEquals(832, items[832]);
    assertEquals(1, items[1]);
    assertEquals(0, items[0]);
    
    
  }

  @Test
  void test7() {
    Integer[] items = new Integer[20];
    items[10] = 100;
    items[9] = 95;
    items[11] = 90;
    items[8] = 85;
    items[12] = 80;
    items[7] = 75;
    items[13] = 70;
    items[6] = 65;
    items[14] = 60;
    items[15] = 15;
    items[16] = 13;
    items[17] = 55;
    items[18] = 1;
    items[19] = 3;
    items[5] = 56;
    items[4] = 54;
    items[3] = 32;
    items[2] = 12;
    items[1] = 6;
    items[0] = 8;
    sorter.sort(items);
    assertEquals(100, items[19]);
    assertEquals(90, items[17]);
    assertEquals(1, items[0]);
  }

  @Test
  void test8() {
    Integer[] items = new Integer[150];
    items[0] = 5;
    items[1] = 8;
    items[2] = 12;
    items[3] = 3;
    items[4] = 11;
    items[5] = 2;
    items[6] = 15;
    items[7] = 9;
    items[8] = 20;
    items[9] = 4;
    items[10] = 5;
    items[11] = 10;
    items[12] = 24;
    items[13] = 14;
    items[14] = 23;
    items[15] = 21;
    items[16] = 25;
    items[17] = 19;
    items[18] = 16;
    items[19] = 12;
    items[20] = 8;
    for (int i = 20; i <= 70; i++) {
      items[i] = i;
    }
    items[71] = 11;
    items[72] = 2;
    items[73] = 1;
    items[74] = 6;
    items[75] = 0;
    items[76] = 16;
    items[77] = 35;
    items[78] = 71;
    items[79] = 61;
    items[80] = 36;
    items[81] = 91;
    items[82] = 81;
    items[83] = 94;
    items[84] = 87;
    items[85] = 56;
    items[86] = 42;
    items[87] = 38;
    items[88] = 58;
    items[89] = 99;
    items[90] = 122;
    int j = 0;
    for (int i = 91; i <= 120; i++) {
      items[i] = j;
      j += 5;
    }
    j = 60;
    for (int i = 121; i < 150; i++) {
      items[i] = j;
      j--;
    }
    sorter.sort(items);
    assertEquals(145, items[149]);
  }

  @Test
  void test9() {

  }

}
