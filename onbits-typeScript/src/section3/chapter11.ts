/*
* 타입 추론
* 추론 기준은 초기값
*/
let a = 1;
let b = "hello";

let c = {
    id:1,
    name: "hello",
    profile: {
        age: 10,
        height: 100
    },
    url: ["http://",]
}

let {id, name, profile, url} = c;

let [one, two, three] = [1, "2", true];

function func(message = "helllo") {
    return message;
}

let d; //이럴 때는 일단 암묵적 any 타입 (추천x)
d = 1;
d = "hello";
d = true;
d = {};
d = [];
d = () => {};
d = null;
d = undefined;
// 위 아래는 다른거다
let t: any

const num = 10; // 상수이기 때문에 10 이라는 숫자리터럴 타입으로 들어감
const str = "hello";
const arr =[1, "hello", true];

