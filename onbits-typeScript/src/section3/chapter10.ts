/*
* 대수 타입
* -> 여러개의 타입을 합성해서 새롭게 만들어낸 타입
* -> 합집합 타입과 교집합 타임이 존재
*/


/*
* 1. 합집합 -Union Type
*/
let a: string | number | boolean;
a = "a";
a = 1;
a = true;

let arr: (number | string | boolean)[] = [1, "hello", true];

type Dog = {
    name: string,
    color: string,
}

type Person = {
    name: string,
    age: number,
}

type Union1 = Dog | Person;

let union1: Union1 = {
    name: "",
    color: ""
};

let union2: Union1 = {name: "", age: 1};

let union3: Union1 = {name: "", color: "", age: 0};

/*
* 2. 교집합 타입 - Intersection Type
*/

let variable: number & string;

type Dog2 = {
    name: string,
    color: string,
}

type Person2 = {
    name: string,
    age: number,
}

type Intersection = Dog2 & Person2;

let intersection1: Intersection = {
    // 다 있어야만 사용 가능
    name: "",
    color: "",
    age: 0,
}