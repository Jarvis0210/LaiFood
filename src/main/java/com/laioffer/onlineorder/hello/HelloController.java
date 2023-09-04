package com.laioffer.onlineorder.hello;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
//GetMapping读数据，PostMapping写数据
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController//如果只有这个没有GetMapping只能收到request，不知道该送给哪个mapping
public class HelloController {
    //前端发来request时候，需要这个annotation来接受
    @GetMapping("/hello") //http://localhost:8080/hello  GetMapping的hello改成别的是和网址里的hello对应的
    //localhost代表本机，8080代表application端口

    //实现的API，sayHello
    public Person sayHello(@RequestParam(required = false) String locale) {
        if (locale == null) {
            locale = "en_US";
        }
//        return "Hello world!";
        Faker faker = new Faker(new Locale(locale));
        String name = faker.name().fullName();
        String company = faker.company().name();
        String street = faker.address().streetAddress();
        String city = faker.address().city();
        String state = faker.address().state();
        String bookTitle = faker.book().title();
        String bookAuthor = faker.book().author();
        return new Person(name, company, new Address(street, city, state, null), new Book(bookTitle, bookAuthor));
//        String template = "This is %s\n" +
//                "I work at %s\n" +
//                "I live at %s in %s %s\n" +
//                "My favorite book is %s by %s\n";
//        return template.formatted(
//                name,
//                company,
//                street,
//                city,
//                state,
//                bookTitle,
//                bookAuthor
//        );
    }
}
