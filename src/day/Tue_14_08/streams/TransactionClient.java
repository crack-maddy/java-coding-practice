package day.Tue_14_08.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransactionClient {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2025-04-20", 100.50),
                new Transaction("2025-04-20", 200.75),
                new Transaction("2025-04-21", 150.00),
                new Transaction("2025-04-21", 50.25),
                new Transaction("2025-04-22", 300.00)
        );

        transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)))
                .entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey()+ "==>> "+entry.getValue()));
    }
}
