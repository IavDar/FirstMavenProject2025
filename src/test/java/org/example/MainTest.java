package org.example;

import org.example.Homework11.Task4;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

   /*     Задача

  Необходимо написать тесты для любого метода из подключенной библиотеки
  (можно использовать StringUtils) или можно написать свой метод
   и протестировать его. Тесты должны запускаться через TestNG.*/

    @Test
    public void testSub() {

        Assert.assertEquals(Task4.getSub(10, 5), 5);
        Assert.assertEquals(Task4.getSub(0, 0), 0);
        Assert.assertEquals(Task4.getSub(-20, -30), 10);
        Assert.assertEquals(Task4.getSub(-30, 5), -35);

    }

    @Test
    public void testSum() {

        Assert.assertEquals(Main.getSum(1, 1), 2);
        Assert.assertEquals(Main.getSum(0, 0), 0);
        Assert.assertEquals(Main.getSum(-10, -5), -15);
        Assert.assertEquals(Main.getSum(-10, 5), -5);




//        TestNG — это фреймворк для написания и выполнения тестов в Java. Он был создан для того,
//                чтобы улучшить функциональность и возможности по сравнению с
//        более старым фреймворком JUnit. TestNG предоставляет удобные возможности
//        для написания, организации и выполнения модульных тестов, интеграционных
//        тестов и других типов тестов.



//        Без фреймворка:
//        assert  Main.getSum(1, 1) == 2;
//        assert  Main.getSum(0, 0) == 0;
//        assert  Main.getSum(-10, -5) == -15;
//        assert  Main.getSum(-10, 5) == -5;


//        if (Main.getSum(0, 0) != 0) {
//            return false;
//        }
//        if (Main.getSum(-10, -5) != -15) {
//            return false;
//        }
//        if (Main.getSum(-10, 5) != -5) {
//            return false;
//        }
//
//        return true;

    }
}
