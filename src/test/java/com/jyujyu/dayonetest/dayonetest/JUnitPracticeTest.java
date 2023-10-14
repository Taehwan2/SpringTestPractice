package com.jyujyu.dayonetest.dayonetest;

import org.junit.jupiter.api.*;

import java.util.List;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class JUnitPracticeTest {
    @Test
    @DisplayName("Assert Equals 메소드 테스트")
    public void assert_equals_test(){
        String expect = "Something";
        String acutal = "Something";

        Assertions.assertEquals(expect,acutal);
    }

    @Test
    public void assertNotEqualsTest(){
        String expect = "Something";
        String actual = "Hello";
        Assertions.assertNotEquals(expect,actual);
    }

    @Test
    public void assertTrueTest(){
        Integer a = 10;
        Integer b = 10;

        Assertions.assertTrue(a.equals(b));
    }

    @Test
    public void assertFalseTest(){
        Integer a = 10;
        Integer b =20;
        Assertions.assertFalse(a.equals(b));
    }

    @Test
    public void assertThrowsTest(){
        Assertions.assertThrows(RuntimeException.class,()->{
            throw new RuntimeException("asdf");
        });
    }

    @Test
    public void assertNullTest(){
        String value = null;
        Assertions.assertNull(value);
    }

    @Test
    public void assertIteralbeEquals(){
        List<Integer> list1 = List.of(1,2);
        List<Integer> list2 = List.of(1,2);
        Assertions.assertIterableEquals(list1,list2);
    }

    @Test
    public void assertAllTest(){
        String expect = "Something";
        String acutal = "Something";


        List<Integer> list1 = List.of(1,2);
        List<Integer> list2 = List.of(1,2);

        Assertions.assertAll("AssertAll",
                List.of(
                        ()->{Assertions.assertEquals(expect,acutal);},
                        ()->{ Assertions.assertIterableEquals(list1,list2);} ));
    }
}
