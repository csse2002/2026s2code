package week03;

interface Exhaustible {
    void rest();
    boolean isTired();
}

class Student implements Exhaustible {
    @Override
    public void rest() {}

    @Override
    public boolean isTired() {
        return true;
    }

    public void study() {}
}

class Lecturer implements Exhaustible {

    @Override
    public void rest() {}

    @Override
    public boolean isTired() {
        return true;
    }

    public void study() {}
}

public class Classroom {
    static void fixThem(Exhaustible exhaustible) {
        while (exhaustible.isTired()) {
            exhaustible.rest();
        }
    }

    public static void main(String[] args) {
        Exhaustible student = new Student();
        Exhaustible lecturer = new Lecturer();

        Student stu = (Student) lecturer;
        stu.study();
    }
}
