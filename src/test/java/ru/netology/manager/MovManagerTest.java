package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovManagerTest {

    @Test
    public void test() {
        MovesManager manager = new MovesManager();

        String[] expected = {};
        String[] actual = manager.allmoves();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovesManager manager = new MovesManager();

        manager.addMovie("aaa");

        String[] expected = {"aaa"};
        String[] actual = manager.allmoves();


        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        MovesManager manager = new MovesManager();

        manager.addMovie("aaa");
        manager.addMovie("bbb");
        manager.addMovie("ccc");
        manager.addMovie("ddd");
        manager.addMovie("eee");

        String[] expected = {"aaa", "bbb", "ccc", "ddd", "eee"};
        String[] actual = manager.allmoves();


        Assertions.assertArrayEquals(expected, actual);
    }

}
