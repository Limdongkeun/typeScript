// any
// 특정 변수의 타입을 우리가 확실히 모를때
let anyVar: any = 10;
anyVar = "a"
anyVar = true
anyVar = {}
anyVar = []

let num: number = 10;
num = anyVar

//unknown
let unknownVar: unknown;
unknownVar = 10;
unknownVar = "a"
unknownVar = true
unknownVar = {}
unknownVar = []

//타입 정제
if(typeof unknownVar === "number"){
    num = unknownVar
}

//차이점
//any 는 아무거나 다 되는데 unknown은 안 됨