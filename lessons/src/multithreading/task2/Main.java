package multithreading.task2;

/*      Используя блокирующие очереди сосчитать топ слов
        как из предыдущего задания. Вариантом решения может быть:
        main создает потоки Worker, которые ждут строки
        из очереди на методе take().
        Далее main читает с диска и добавляет строки в
        очереди, последними строками будут стоп-строки.

        Worker'ы при получении стоп-строки добавляют свою
        внутреннюю мапу в следующую очередь и завершают свою работу.

        main же ждет мапы со всех воркеров на второй очереди
        и результат собирает в результирующую мапу.

        В итоге, не должно быть нигде явной синхронизации
        и использованы две блокирующие очереди*/

public class Main {
}
