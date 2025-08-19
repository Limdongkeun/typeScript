/*
* 타입 단언
*/
type Person = {
    name: string,
    age: number,
};

let person = {} as Person;
person.name = "임동근";
person.age = 10;

type Dog = {
    name: string,
    color: string,
};

let dog = {
    name: "dd",
    color: "dd",
    breed: "진도"
} as Dog;

/*
* 타입 단언의 규칙
* 값 as 단언 -< 단언식
* A가 B의 슈퍼타입이거나
* A가 B의 서브타입이어야 함
*/

let num1 = 10 as never;

let num2 = 10 as unknown;

let num3 = 10 as unknown as string; //다중 단언

/*
* const 단언
*/
 let constNum = 10 as const;

 let cat = {
     name: "cat",
     color: "black",
 } as const; // 이렇게 하면 프로터티 다 readonly

/*
* Non Null 단언 => !
*/
 type Post = {
     title: string,
     author?: string,
 };

 let post: Post = {
     title: "aa",
     author: "aa",
 }
 const len: number = post.author!.length; //값이 있을거라고 맏게 하는거

