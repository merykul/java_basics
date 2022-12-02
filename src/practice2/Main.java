package practice2;

import java.math.BigDecimal;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Account> accounts = Arrays.asList(
                new Account(1L, "Justin", "Butler", "justin.butler@gmail.com",
                        LocalDate.parse("2003-04-17"), Sex.MALE, LocalDate.parse("2016-06-13"), BigDecimal.valueOf(172966)),
                new Account(2L, "Olivia", "Cardenas", "cardenas@mail.com",
                        LocalDate.parse("1930-01-19"), Sex.FEMALE, LocalDate.parse("2014-06-21"), BigDecimal.valueOf(38029)),
                new Account(3L, "Nolan", "Donovan", "nolandonovan@gmail.com",
                        LocalDate.parse("1925-04-19"), Sex.MALE, LocalDate.parse("2011-03-10"), BigDecimal.valueOf(13889)),
                new Account(4L, "Lucas", "Lynn", "lucas.lynn@yahoo.com",
                        LocalDate.parse("1987-05-25"), Sex.MALE, LocalDate.parse("2009-03-05"), BigDecimal.valueOf(16980))

        );
    }

}
