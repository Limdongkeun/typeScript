/*
* Unknown 타입
* unknown이 가장 크니까
* 다른 타입들은 업케스팅이 가능하다
*
* 업케스팅은 모든 상황에서 가능하지만
* 다운케스팅은 대부분 안 된다
*/

function unKnownExam() {
    let a: unknown = 1;
    let b: unknown = "a";
    let c: unknown = true;
    let d: unknown = {};
    let e: unknown = [];

    //다운케스팅
    // let unKnownVar: unknown;
    // let num: number = unKnownVar;
    //
}

/*
* Never 타입 -> 공집합
*/

function neverExam() {
    // 반환하는 값이 아무것도 없다
    function func(): never {
         while(true) {}
    }

    //업케스팅
    let num: number = func();
    let str: string = func();
    let bool: boolean = func();

    //다운케스팅
    // let never1: never = 1;
    // let never2: never = "ss";
    // let never3: never = true;
}

/*
* Void 타입
*/

function voidExam() {
    function func(): void {
        console.log("hello");
    }

    //업케스팅
    let voidVar: void = undefined;
}

/*
*  Any 타입 -> 치트키 타입 (타입 계층도를 무시한다) 모든 타입의 상위에도 있지만 하위에도 있다
*/

function anyExam() {
    let unknownVar: unknown;
    let anyVar: any;
    let undineVar: undefined;

    // any 타입은 다운케스팅 가능
    anyVar = unknownVar;
    unknownVar = anyVar;

    let naverVar: never;
    // never타입은 공집합이라 any도 안 된다
    // naverVar = anyVar;
}