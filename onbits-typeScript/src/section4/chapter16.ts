/*
* 함수 타입 표현식
*/

type Add = (a: number, b: number) => number;
// 함수의 타입을 이미 정해두는거
const add: Add = (a, b) => a + b;


type Operation = (a: number, b: number) => number;

const add2: Operation = (a, b) => a + b;
const sub: Operation = (a, b) => a - b;
const mul: Operation = (a, b) => a * b;
const div: Operation = (a, b) => a / b;

/*
* 호출 시그니처(콜 시크니처)
*/

type Operation2 = {
    (a: number, b: number): number,
}

const add3: Operation2 = (a, b) => a + b;
const sub2: Operation2 = (a, b) => a - b;
const mul2: Operation2 = (a, b) => a * b;
const div2: Operation2 = (a, b) => a / b;