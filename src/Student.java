class Student{
     private int age;
     private int grade;

    public Student(int age, int grade) {
        setAge(age);
        setGrade(grade);
    }
    public Student(){
        this.age = 0;
        this.grade = 0;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18){
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("pedo");
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 50){
            this.grade = grade;
        }
        else{
            throw new IllegalArgumentException("loser");
        }
    }
}