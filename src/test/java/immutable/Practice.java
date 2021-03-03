package immutable;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

class Practice {

    @Test
    void test1() {
        List<User> source = initData();

        source.stream()
                .sorted((u1, u2) -> u1.getId().compareTo(u2.getId()))
                .forEach(System.out::println);

        System.out.println(source);
        ;
    }

    @Test
    void test2() {
        List<User> source = initData();

        source.stream()
                .sorted((u1, u2) -> u2.getId().compareTo(u1.getId()))
                .forEach(System.out::println);

        System.out.println(source);
        ;
    }

    @Test
    void test3() {
        List<User> source = initData();

        source.stream()
                .filter(u -> u.getId() < 3)
                .forEach(System.out::println);

        System.out.println(source);
        ;
    }

    @Test
    void test4() {
        List<User> source = initData();

        source.stream()
                .filter(u -> u.getId() < 3)
                .peek(user -> user.setFirstName("************************"))
                .forEach(System.out::println);

        System.out.println(source);
        ;
    }

    private List<User> initData() {
        return List.of(
                new User(1L, "userFirstName1", "userLastName1"),
                new User(2L, "userFirstName2", "userLastName2"),
                new User(3L, "userFirstName3", "userLastName3"),
                new User(4L, "userFirstName4", "userLastName4"),
                new User(5L, "userFirstName5", "userLastName5"),
                new User(6L, "userFirstName6", "userLastName6")
        );
    }
}


class User {

    private Long id;
    private String firstName;
    private String lastName;

    public User(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", User.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("firstName='" + firstName + "'")
                .add("lastName='" + lastName + "'")
                .toString();
    }
}
