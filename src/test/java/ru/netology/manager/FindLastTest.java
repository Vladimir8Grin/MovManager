package ru.netology.manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class FindLastTest {
    @Test
    public void test1() {
        MovesManager manager = new MovesManager();

        manager.addMovie("aaa");
        manager.addMovie("bbb");
        manager.addMovie("ccc");
        manager.addMovie("ddd");
        manager.addMovie("eee");

        String[] expected = {"eee", "ddd", "ccc", "bbb", "aaa"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovesManager manager = new MovesManager();

        manager.addMovie("aaa");
        manager.addMovie("bbb");


        String[] expected = {"bbb", "aaa"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovesManager manager = new MovesManager();

        manager.addMovie("aaa");


        String[] expected = {"aaa"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        MovesManager manager = new MovesManager(10);


        manager.addMovie("aaa");
        manager.addMovie("bbb");
        manager.addMovie("ccc");
        manager.addMovie("ddd");
        manager.addMovie("eee");
        manager.addMovie("fff");
        manager.addMovie("ggg");
        manager.addMovie("hhh");
        manager.addMovie("iii");
        manager.addMovie("jjj");


        String[] expected = {"jjj", "iii", "hhh", "ggg", "fff", "eee", "ddd", "ccc", "bbb", "aaa"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        MovesManager manager = new MovesManager();

        manager.addMovie("aaa");
        manager.addMovie("bbb");
        manager.addMovie("ccc");


        String[] expected = {"ccc", "bbb", "aaa"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        MovesManager manager = new MovesManager();

        manager.addMovie("");


        String[] expected = {""};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test7() {
        MovesManager manager = new MovesManager();

        String[] expected = {};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
