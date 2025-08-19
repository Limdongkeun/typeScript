/*
* 기본 타입간의 호환성
*/
let num1: number = 1;
let num2: 10 = 10;

//업케스팅
num1 = num2;
//다운케스팅
// num2 = num1

/*
* 객체 타입간의 호환성
* 타입스크립트는 속성을 기준으로 상위 객체가 된다
* animal로 예를 들면 name, color이 있는데
* Dop에도 name, color이 있고 breed가 하나 더 있다
* 이런 경우에 Dog에 있는 속성은 animal로 다 처리 되니까 animal이 더 상위다
*/
type Animal = {
    name: string,
    color: string,
}

type Dog ={
    name: string,
    color: string,
    breed: string,
}

let animal: Animal = {
    name: "기린",
    color: "yellow"
}

let dog: Dog = {
    name: "돌돌이",
    color: "blue",
    breed: "진도"
}
//업케스팅
animal = dog;
//다운케스팅
// dog = animal

type Book = {
    name: string,
    price: number,
}

type PrgrammingBook = {
    name: string,
    price: number,
    author: string,
}

let book: Book;
let prgrammingBook: PrgrammingBook ={
    name: "aa",
    price: 100,
    author: "aa"
}

book = prgrammingBook;
/*
* 초과 프로퍼티 검사
*/
let book2 : Book = {
    name: "aa",
    price: 100,
    // author: "aa"
}
