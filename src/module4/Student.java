package module4;

public class Student {
    String name;
    String LastName;
    String surName;
    int group;
    int[] marks = new int[5];

    public Student(String name, String lastName, String surName, int group, int[] marks) {
        this.name = name;
        LastName = lastName;
        this.surName = surName;
        this.group = group;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void setMarks(int index, int el) {
        this.marks[index] = el;
    }

    public void infoStudents(int a) {
        if ((this.marks[0] > a) && (this.marks[1] > a) && (this.marks[2] > a) &&
                (this.marks[3] > a) && (this.marks[4] > a)) {
            System.out.printf("Имя:%s; отчество:%s; фамилия:%s; группа%d%n",
                    this.name, this.LastName, this.surName, this.group);
        }
    }
}

class RunnerStudent {
    public static void main(String[] args) {
        Student[] students = new Student[6];
        students[0] = new Student("Sergey", "Nikolaevich", "Naumenko",
                1, new int[]{9, 9, 9, 9, 10});
        students[1] = new Student("Dmitry", "Nikolaevich", "Kolyada",
                2, new int[]{9, 9, 8, 9, 10});
        students[2] = new Student("Aleksander", "Nikolaevich", "Torgan",
                3, new int[]{10, 10, 10, 10, 10});
        students[3] = new Student("Aleksandra", "Urevna", "Dikovitskaya",
                4, new int[]{8, 8, 8, 8, 8});
        students[4] = new Student("Valrntina", "Urevna", "Dikovitskaya",
                5, new int[]{7, 7, 7, 9, 10});
        students[5] = new Student("Aleksander", "Evgenevich", "Murasko",
                6, new int[]{5, 5, 6, 6, 7});

        for (Student student : students) {
            student.infoStudents(7);
        }

    }
}
