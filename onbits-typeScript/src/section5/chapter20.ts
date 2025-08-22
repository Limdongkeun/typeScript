/*
* 인터페이스
*/
interface Person {
    name: string,
    age: number,

    sayHi(): void,
}

const person: Person = {
    name: "asa",
    age: 10,
    sayHi: function () {
        console.log('hi')
    }
}

