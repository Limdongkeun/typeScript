/*
* 클래스
*/

class Student {
    name: string;
    age: number;
    grade: string;

    //생성자
    constructor(name: string, age: number, grade: string) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    study() {
        console.log("studying");
    }

    introduce() {
        console.log(`${this.name} ${this.age} ${this.grade}`);
    }
}

class StudentDeveloper extends Student {

    skill: string;

    constructor(name: string, age: number, grade: string, skill: string) {
        super(name, age, grade);
        this.skill = skill;
    }

    programming() {
        console.log("programming");
    }
}

let peter = new Student("peter", 10, "A");
console.log(peter);

peter.introduce();
peter.study();

let john = new StudentDeveloper("john", 10, "A", "java");
john.introduce();
john.programming();
john.study();