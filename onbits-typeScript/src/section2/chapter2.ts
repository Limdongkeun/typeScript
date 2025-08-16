//배열
let numArr: number[] = [1, 2, 3, 4, 5];

let strArr: string[] = ['a', 'b', 'c'];


let boolArr: Array<boolean> = [true, false];


//배열에 들어가는 요소들의 타입이 다양할 경우
let anyArr: any[] = [1, 'a', true];

let multiArr: (number | string)[] = [1,'A']

//다차원 배열
let doubleArr:number[][] = [[1,2],[3,4]];

//튜플
//길이와 타입이 고정된 배열
let tupleArr: [number, string] = [1, 'a'];

const user:[number, string][] = [
    [1, 'a'],
    [2, 'b'],
    [3, 'c'],
]